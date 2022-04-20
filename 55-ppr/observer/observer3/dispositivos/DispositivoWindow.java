package observer3.dispositivos;

import observer3.ObserverEstacaoMeteorologica;
import observer3.estacao.EstacaoMeteorologica;
import observer3.estacao.TipoMedicao;
import observer3.sensores.SensorTemperatura;
import observer3.sensores.SensorUmidade;

import javax.swing.*;
import java.io.Serial;
import java.util.Map;

public class DispositivoWindow extends JFrame implements ObserverEstacaoMeteorologica {

	@Serial
	private static final long serialVersionUID = 1L;

	private final JLabel jlTemp;
	private final JLabel jlUmidade;

	public DispositivoWindow()  {
	
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jlTemp = new JLabel("Temp:");
		getContentPane().add(jlTemp, "North");

		jlUmidade = new JLabel("Umidade:");
		getContentPane().add(jlUmidade, "South");

		EstacaoMeteorologica estacao = new EstacaoMeteorologica();
		estacao.anexar(this);
		estacao.setSensorTemp(new SensorTemperatura());
		estacao.setSensorUmidade(new SensorUmidade());
		estacao.ligar();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void sensoresAtualizados(Map<TipoMedicao, Double> valores) {
		jlTemp.setText("Temp:" + valores.getOrDefault(TipoMedicao.TEMPERATURA, 0.0));
		jlUmidade.setText("Temp:" + valores.getOrDefault(TipoMedicao.UMIDADE, 0.0));
	}
}
