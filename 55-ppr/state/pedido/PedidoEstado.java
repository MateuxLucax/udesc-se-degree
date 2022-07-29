package state4.pedido;

public abstract class PedidoEstado {
	public void analisar() throws Exception {
		throw new Exception("analisar não suportado");
	};
	
	public void suspender() throws Exception {
		throw new Exception("suspender não suportado");
	};
	
	public void retomar() throws Exception {
		throw new Exception("retomar não suportado");
	};
	
	public void cancelar() throws Exception {
		throw new Exception("cancelar não suportado");
	};
	
	public void aprovar() throws Exception {
		throw new Exception("aprovar não suportado");
	};
	
	public void atender() throws Exception {
		throw new Exception("atender não suportado");
	};
}
