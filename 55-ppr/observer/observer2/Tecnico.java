package observer2;

public class Tecnico implements Observador {

	private final String sistema;
	private final String nome;

	public Tecnico(String nome, String sistema) {
		this.nome = nome;
		this.sistema = sistema;
	}

	@Override
	public String receberMensagem(String mensagem) {
		if (mensagem.contains(sistema)) {
			return "Resposta do "+nome+ ": Ligar para 41 736354";
		}
		return null;
	}

}
