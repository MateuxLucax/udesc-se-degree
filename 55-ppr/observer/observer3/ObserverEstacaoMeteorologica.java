package observer3;

import observer3.estacao.TipoMedicao;
import java.util.Map;

public interface ObserverEstacaoMeteorologica {

    void sensoresAtualizados(Map<TipoMedicao, Double> valores);

}
