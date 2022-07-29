package composite1;

public class Sistema {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("A", 1300);
		Empregado e2 = new Empregado("B", 1100);

		Departamento vendas = new Departamento();
		vendas.add(e1);
		vendas.add(e2);

		Empregado chefe = new Empregado("Chefao", 7000);

		Departamento marketingEVendas = new Departamento();
		marketingEVendas.add(chefe);
		marketingEVendas.add(vendas);

		System.out.println(marketingEVendas.getSalario());
	}
}
