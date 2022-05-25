package adapter2.brasileiro;


public class CorreiosValidador {

	public void 	validar(String cep, String estado) throws Exception {
		if (cep.trim().length() != 8)
			throw new Exception("CEP Inválido");

		if (estado.trim().length() != 2)
			throw new Exception("UF Inválido");

	}
		
}
