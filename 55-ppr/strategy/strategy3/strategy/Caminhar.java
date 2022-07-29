package strategy3.strategy;

import strategy3.jogo.Mecha;

public class Caminhar implements Movimentacao {

    @Override
    public void mover(Mecha mecha) throws Exception {
        Thread.sleep(1000);
        System.out.println(String.format("Andando (%d, %d)", mecha.getX(), mecha.getY()));
    }

}
