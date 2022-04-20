package observer3.sensores;
import java.util.Random;

public interface Sensor {

	Random random = new Random();

	double getMedicao();
}
