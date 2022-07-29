package state4.pedido;

public abstract class PedidoEstado {
	public void analisar() throws Exception {
		throw new Exception("analisar n�o suportado");
	};
	
	public void suspender() throws Exception {
		throw new Exception("suspender n�o suportado");
	};
	
	public void retomar() throws Exception {
		throw new Exception("retomar n�o suportado");
	};
	
	public void cancelar() throws Exception {
		throw new Exception("cancelar n�o suportado");
	};
	
	public void aprovar() throws Exception {
		throw new Exception("aprovar n�o suportado");
	};
	
	public void atender() throws Exception {
		throw new Exception("atender n�o suportado");
	};
}
