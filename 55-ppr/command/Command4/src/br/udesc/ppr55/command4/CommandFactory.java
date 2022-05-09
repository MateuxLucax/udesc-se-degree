package br.udesc.ppr55.command4;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandFactory {

	private Map<String, Class<? extends Command>> comandos = new HashMap<>();
	private Observer observer;

	public CommandFactory() {

		comandos.put("new", QuadradoCommand.class);
		/*	
		comandos.put("delete", DeleteCommand.class);*/
	}

	public Command getCommand(String comando, List<String> desenhos, int[] dados, Color[] cor) throws Exception {
	
		Class<? extends Command> commClass = comandos.get(comando);
		
		Class<?>[] params;
		params = new Class<?>[] {List.class, int[].class, Color[].class};
		
		Constructor<? extends Command> constr = commClass.getConstructor(params );
		
		Command comm;
		comm = constr.newInstance(desenhos, dados, cor);

		return comm;
	}
}
