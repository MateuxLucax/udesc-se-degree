package observer3.estacao;

import observer3.ObserverEstacaoMeteorologica;
import observer3.sensores.SensorTemperatura;
import observer3.sensores.SensorUmidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstacaoMeteorologica {

	private final List<ObserverEstacaoMeteorologica> observadores = new ArrayList<>();

	private SensorTemperatura sensorTemp;
	private SensorUmidade sensorUmidade;

	public SensorTemperatura getSensorTemp() {
		return sensorTemp;
	}
	
	public void setSensorTemp(SensorTemperatura sensorTemp) {
		this.sensorTemp = sensorTemp;
	}
	
	public SensorUmidade getSensorUmidade() {
		return sensorUmidade;
	}
	
	public void setSensorUmidade(SensorUmidade sensorUmidade) {
		this.sensorUmidade = sensorUmidade;
	}

	public double getTemperatura() {
		return temp;
	}

	public double getUmidade() {
		return umid;
	}
	
	private double umid;
	private double temp;

	public void ligar() {
		new Thread(() -> {
			while (true) {
				temp = sensorTemp.getMedicao();
				umid = sensorUmidade.getMedicao();

				notificar();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void anexar(ObserverEstacaoMeteorologica observador) {
		observadores.add(observador);
	}


	public void notificar() {
		Map<TipoMedicao, Double> map = new HashMap<>();
		map.put(TipoMedicao.TEMPERATURA, temp);
		map.put(TipoMedicao.UMIDADE, umid);

		for (var observador : observadores) {
			observador.sensoresAtualizados(map);
		}
	}

}
