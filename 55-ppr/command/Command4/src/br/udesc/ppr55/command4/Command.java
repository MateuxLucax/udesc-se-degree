package br.udesc.ppr55.command4;

import java.awt.Color;
import java.util.List;

public abstract class Command {
	
	protected List<String> desenhos;
	protected int[] dados;
	protected Color[] cores;

	public Command(List<String> desenhos, int[] dados, Color[] cores) {
		this.desenhos = desenhos;
		this.dados = dados;
		this.cores = cores;
	}
	
	public abstract void execute();
	
	public abstract void undo();
	
	public abstract void redo();

}
