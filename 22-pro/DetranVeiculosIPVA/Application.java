public class Application {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Gol");
        carro1.setAno(1985);
        carro1.setPlaca("ZZZ-1234");
        carro1.setValor(5500);
        carro1.setPortas(2);
        carro1.setAlugado(true);
//        System.out.println(carro1);

        Moto moto1 = new Moto();
        moto1.setModelo("Yamaha DT");
        moto1.setAno(1995);
        moto1.setPlaca("KKK-5678");
        moto1.setValor(4780);
        moto1.setCilindradas(180);
//        System.out.println(moto1);

        Detran detranSC = new Detran("SC");
        detranSC.addVeiculo(carro1);
        detranSC.addVeiculo(moto1);
        System.out.println(detranSC);
    }
}
