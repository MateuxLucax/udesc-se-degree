package br.udesc.ppr55.command4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import br.udesc.pp55.command3.command.Command;
import br.udesc.pp55.command3.command.CommandInvoker;

@SuppressWarnings("serial")
public class PaintFixo extends JFrame implements ActionListener {

	private JPanel canvas;
	private JToolBar toolbar;
	private CommandInvoker ci = new CommandInvoker();
	

	private List<String> desenhos = new ArrayList<>();
	private Random sorteio = new Random();
	private CommandFactory factory = new CommandFactory();
	
	public PaintFixo() {
		
		setTitle("Paint Fixo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		toolbar = new JToolBar("Comandos");
		toolbar.setFloatable(false);
		criarBotoes();
		add(toolbar, BorderLayout.NORTH);
		
		canvas = new JPanel() {
		  public void paintComponent(Graphics g) {
			  	super.paintComponent(g);
			   

			    for (String desenho:desenhos) {
			    	String[] d = desenho.split(",");
		    		int x = Integer.parseInt(d[1]);
		    		int y = Integer.parseInt(d[2]);
		    		
		    		g.setColor(new Color(Integer.parseInt(d[3])));
			    	if (d[0].equals("quad")) {
					    g.fillRect(x, y, 50, 50);
			    	} else {
			    		g.fillOval(x, y, 50, 50);
			    	}
			    }
			  
			  }

		};
		
		add(canvas, BorderLayout.CENTER);
		
		pack();

		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void criarBotoes() {
		
		toolbar.add(criarBotao("undo", "desfazer", "Desfazer"));
		toolbar.add(criarBotao("redo", "refazer", "Refazer"));
		toolbar.addSeparator();
		toolbar.add(criarBotao("quad", "quadrado", "Desenhar quadrado"));
		toolbar.add(criarBotao("circ", "circulo", "Desenhar círculo"));
	}

	private JButton criarBotao(String nomeImage, String actionCommand, String tooltip) {

		String imgLocation = "imagens/" + nomeImage + ".gif";
		URL imageURL = PaintFixo.class.getResource(imgLocation);

		JButton button = new JButton();
		button.setActionCommand(actionCommand);
		button.addActionListener(this);
		button.setToolTipText(tooltip);
		button.setIcon(new ImageIcon(imageURL));

		return button;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {	
				new PaintFixo();
			}
		});
	}
	
	private Color[] cores = new Color[]{Color.BLACK,Color.BLUE,Color.YELLOW,Color.GREEN, Color.RED, Color.WHITE};

	@Override
	public void actionPerformed(ActionEvent event) {
		String action = event.getActionCommand();
		int[] dados = {getWidth(), getHeight()};
		
		try {
			if (action.equals("quadrado")) {
				//desenhos.add("quad,"+sorteio.nextInt(getWidth()-100)+","+sorteio.nextInt(getHeight()-100)+","+cores[sorteio.nextInt(cores.length)].getRGB());
				Command comm = factory.getCommand(action, desenhos, dados, cores);
			    ci.execute(comm);
			 	
			} else 
				if (action.equals("circulo")) {
					desenhos.add("circ,"+sorteio.nextInt(getWidth()-100)+","+sorteio.nextInt(getHeight()-100)+","+cores[sorteio.nextInt(cores.length)].getRGB());
					
					Command comm = factory.getCommand(action, desenhos, dados, cores);
				    ci.execute(comm);
				} else 
					if (action.equals("undo")) {
						ci.undo();
					} else 
						if (action.equals("redo")) {
							ci.redo();
						}
			canvas.repaint();
		} catch(Exception ex) {
			
		}
		
	}
	

}