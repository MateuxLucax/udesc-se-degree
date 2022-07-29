package decorator3;

public class Cripto extends TextoDecorator {

	public Cripto(Texto texto) {
		super(texto);
	}

	@Override
	public String getTexto() {
		String texto = super.getTexto();
		String novoTexto = "";
		char[] charString = new char[texto.length()];
		
		for (int i = 0; i < charString.length; i++) {
			char c = texto.charAt(i);
			charString[i] = (char) (c - 5);
		}
		
		
		return String.valueOf(charString);
	}
}
