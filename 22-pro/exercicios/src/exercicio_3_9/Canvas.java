package exercicio_3_9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Canvas é uma classe para permitir um simples desenho gráfico em uma tela.
 * Esta é uma modificação do Canvas de uso geral, especialmente feito para o
 * exemplo "shapes" do BlueJ.
 *
 * @author: Bruce Quig
 * @author: Michael Kölling (mik)
 *
 * @version: 1.6 (shapes)
 */
public class Canvas {
    // Nota: A implementação desta classe (especificamente a manipulação de
    // identidade e cores) é um pouco mais complexo do que o necessário. Isto
    // é feito de propósito para manter a interface e atributos dos objetos de shape
    // simples,
    // para fins educacionais.
    private static Canvas canvasSingleton;

    /**
     * Método Factory para obter a instância única deste objeto.
     */
    public static Canvas getCanvas() {
        if (canvasSingleton == null) {
            canvasSingleton = new Canvas("Lar Doce Lar", 300, 300, Color.white);
        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    // ----- atributos da instância -----

    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColour;
    private Image canvasImage;
    private List<Object> objects;
    private HashMap<Object, ShapeDescription> shapes;

    /**
     * Cria um Canvas.
     *
     * @param title   o título que aparece no Frame (janela) do Canvas
     * @param width   a largura desejada do canvas
     * @param height  a altura desejada do canvas
     * @param bgClour a cor de fundo desejada do canvas
     */
    private Canvas(String title, int width, int height, Color bgColour) {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        canvas.setPreferredSize(new Dimension(width, height));
        backgroundColour = bgColour;
        frame.pack();
        objects = new ArrayList<Object>();
        shapes = new HashMap<Object, ShapeDescription>();
    }

    /**
     * Define a visibilidade do canvas e traz a janela para a frente da tela quando
     * ela se tornar visível. Esse método também pode ser usado para trazer uma tela
     * já visível para a frente de outras janelas.
     *
     * @param visible valor booleano representando a visibilidade desejada do canvas
     *                (verdadeiro ou falso)
     */
    public void setVisible(boolean visible) {
        if (graphic == null) {
            // na primeira vez: instanciar a imagem fora da tela e
            // preenchê-la com a cor de fundo
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
            graphic = (Graphics2D) canvasImage.getGraphics();
            graphic.setColor(backgroundColour);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(visible);
    }

    /**
     * Desenha um determinado shape no canvas.
     *
     * @param referenceObject um objeto para definir a identifidade do shape
     * @param color           a cor do shape
     * @param shape           o objeto shape a ser desenhado no canvas
     */
    // Nota: esta é uma maneira levemente obsoleta para se manter os objetos shape.
    // É cuidadosamente projetada para manter interface de visualização dos shapes
    // simples, para fins educacionais
    public void draw(Object referenceObject, String color, Shape shape) {
        objects.remove(referenceObject); // remove apenas no caso de já estar lá
        objects.add(referenceObject); // adiciona no fim
        shapes.put(referenceObject, new ShapeDescription(shape, color));
        redraw();
    }

    /**
     * Apaga um dado shape da tela.
     *
     * @param referenceObject o objeto shape a ser apagado.
     */
    public void erase(Object referenceObject) {
        objects.remove(referenceObject); // remove apenas no caso de já estar lá
        shapes.remove(referenceObject);
        redraw();
    }

    /**
     * Define a cor de frente do Canvas.
     *
     * @param newColour a nova cor de frente do Canvas
     */
    public void setForegroundColor(String colorString) {
        if (colorString == null){
            graphic.setColor(new Color(255,255,255,0));
        }else{
            switch (colorString){
                case "red": {
                    graphic.setColor(Color.red);
                    break;
                }
                case "yellow": {
                    graphic.setColor(Color.yellow);
                    break;
                }
                case "blue": {
                    graphic.setColor(Color.blue);
                    break;
                }
                case "green": {
                    graphic.setColor(Color.green);
                    break;
                }
                case "magenta": {
                    graphic.setColor(Color.magenta);
                    break;
                }
                case "black": {
                    graphic.setColor(Color.black);
                    break;
                }
                default:{
                    graphic.setColor(new Color(255,255,255,0));

                }
            }
        }
    }

    /**
     * Aguarde um determinado número de milissegundos antes de terminar. Isso
     * fornece uma maneira fácil de especificar um pequeno atraso que pode ser usado
     * ao produzir animações.
     *
     * @param milissegundos o número de milisecundos
     */
    public void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            // i    gnorar exceções no momento
        }
    }

    /**
     * Redesenha todos os shapes que estão atualmente no Canvas.
     */
    private void redraw() {
        erase();
        for (Iterator i = objects.iterator(); i.hasNext();) {
            ((ShapeDescription) shapes.get(i.next())).draw(graphic);
        }
        canvas.repaint();
    }

    /**
     * Apaga todo o canvas. (Não redesenha)
     */
    private void erase() {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColour);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
    }

    /************************************************************************
     * Classe interna CanvasPane - é o componente de tela real contido no frame do
     * Canvas. Este é essencialmente um JPanel com capacidade adicional para
     * atualizar a imagem desenhada nele.
     */
    private class CanvasPane extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }

    /************************************************************************
     * Classe interna CanvasPane - é o componente de tela real contido no frame do
     * Canvas. Este é essencialmente um JPanel com capacidade adicional para
     * atualizar a imagem desenhada nele.
     */
    private class ShapeDescription {
        private Shape shape;
        private String colorString;

        public ShapeDescription(Shape shape, String color) {
            this.shape = shape;
            colorString = color;
        }

        public void draw(Graphics2D graphic) {
            setForegroundColor(colorString);
            graphic.fill(shape);
        }
    }

}
