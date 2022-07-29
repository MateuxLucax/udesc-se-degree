package state4.pedido;

public class Pedido {
	private PedidoEstado estado;
	
	public void setEstado(PedidoEstado estado) {
		this.estado = estado;
	}
	
	public Pedido() {
		this.estado = new Registrado(this);
	}
	
	public void analisar() throws Exception  {
		estado.analisar();
	}
	
	public void suspender() throws Exception  {
		estado.suspender();
	}
	
	public void retomar() throws Exception  {
		estado.retomar();
	}
	
	public void cancelar() throws Exception  {
		estado.cancelar();
	}
	
	public void aprovar() throws Exception  {
		estado.aprovar();
	}
	
	public void atender() throws Exception  {
		estado.atender();
	}
}
