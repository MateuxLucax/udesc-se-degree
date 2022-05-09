package br.udesc.ppr55.command4;

import java.util.List;
import java.util.Random;

public class QuadradoCommand extends Command {
	private Random sorteio = new Random();
	
	public QuadradoCommand(List<String> desenhos, int[] dados) {
		super(desenhos, dados);
	}

	private int id;
	
	
	@Override
	public void execute() {
		desenhos.add("quad,"+sorteio.nextInt(dados[0]-100)+","+sorteio.nextInt(dados[1]-100)+","+cores[sorteio.nextInt(cores.length)].getRGB());
		
	}

	@Override
	public void undo() {
		// Esse Command nao precisa de undo
	}

	@Override
	public void redo() {
		// Esse Command nao precisa de redo
	}
}
