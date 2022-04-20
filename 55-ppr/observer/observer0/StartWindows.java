package observer0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class StartWindows extends JDialog {

	private static final Random sorteio = new Random();
	private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	

	static class JDInc extends JDialog implements ObserverIncrementar {

		private JLabel jl;
 		
		@Override
		public void pack() {
			setResizable(false);
			int x = sorteio.nextInt(screenSize.width -100);
			int y = sorteio.nextInt(screenSize.height-100);
			setLocation(x, y);
			
			final Incrementar inc = Incrementar.getInstancia();
			inc.anexar(this);
			jl = new JLabel(inc.getConta()+"");
			JButton jb = new JButton("Add");
			jb.addActionListener(arg0 -> {
				inc.inc();
				jl.setText(String.valueOf(inc.getConta()));
			});
			

			getContentPane().add(jl, "North");
			getContentPane().add(jb, "South");
			
			super.pack();
			setVisible(true);
		}


		@Override
		public void incrementado(int valor) {
			jl.setText(String.valueOf(valor));
		}
	};

	public StartWindows() {
		setResizable(false);
		setTitle("Teste");
		
		 addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent evt) {
	                System.exit(0);
	            }
	     });
		
		JButton jb = new JButton("Abrir");
		
		ActionListener action = arg -> {

			new JDInc().pack();
			new JDInc2().pack();

		};
		jb.addActionListener(action);
		
		getContentPane().add(jb);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public static void main(String[] args) {

		new StartWindows(); 

	}

	
	static class JDInc2 extends JDialog implements ObserverIncrementar {

		private JTextArea campo;

		@Override
		public void pack() {
			setPreferredSize(new Dimension(50, 300));
			setResizable(false);
			
			int x = sorteio.nextInt(screenSize.width -50);
			int y = sorteio.nextInt(screenSize.height-300);
			setLocation(x, y);

			final Incrementar inc = Incrementar.getInstancia();
			inc.anexar(this);
			campo = new JTextArea();
			campo.setEditable(false);

			JScrollPane scroll = new JScrollPane(campo);
			getContentPane().add(scroll);
			super.pack();
			setVisible(true);
		}

		@Override
		public void incrementado(int valor) {
			campo.append(String.valueOf(valor));
		}
	}
}
