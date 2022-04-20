public class DesenharObraDeArte {
       public static void main(String[] args) {
             /*
              * Grama
              */     
             Triangulo grama;
             grama = new Triangulo();
       
             grama.altura = 150;
             grama.base = 300;
             grama.cor = "green";
             grama.x = 150;
             grama.y = 100;
             
             grama.desenhar();
             
             /*
              *  DesenharObraDeArte
              */
             Quadrado parede;
             parede = new Quadrado();
             
             parede.cor = "red";
             parede.lado = 125;
             parede.x = 75;
             parede.y = 100;
             
             parede.desenhar();
             
             Quadrado janela;
             janela = new Quadrado();
             
             janela.cor = "black";
             janela.lado = 40;
             janela.x = 100;
             janela.y = 115;
             
             janela.desenhar();
             
             Triangulo telhado;
             telhado = new Triangulo();
       
             telhado.altura = 50;
             telhado.base = 175;
             telhado.cor = "blue";
             telhado.x = 140;
             telhado.y = 50;
             
             telhado.desenhar();
             
             /*
              * Sol
              */
             Circulo sol;
             sol = new Circulo();
             
             sol.diametro = 40;
             sol.cor = "yellow";
             sol.x = 225;
             sol.y = 25;
             
             sol.desenhar();
       }
}
