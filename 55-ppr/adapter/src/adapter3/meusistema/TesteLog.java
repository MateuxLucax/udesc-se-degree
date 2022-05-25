package adapter3.meusistema;

import adapter3.adapter.LogTextAdapter;
import adapter3.adapter.WinLogAdapter;
import adapter3.logger.Logger;

public class TesteLog {

	private final Logger logger;

	public TesteLog(Logger logger) {
		this.logger = logger;
	}
	
	public void imprimir(String texto) {
		this.logger.log(texto);
	}

	public static void main(String[] args) {

		TesteLog teste1 = new TesteLog(new WinLogAdapter());
		teste1.imprimir("123");

		TesteLog teste2 = new TesteLog(new LogTextAdapter());
		teste2.imprimir("123");

	}

}
