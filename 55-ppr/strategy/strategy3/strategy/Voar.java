package strategy3.strategy;

import strategy3.jogo.Mecha;

public class Voar implements Movimentacao {

    @Override
    public void mover(Mecha mecha) throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("Andando (%d, %d)", mecha.getX(), mecha.getY()));
    }

}
