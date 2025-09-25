package mrgrana;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Corrida {
    private static int proximoId = 1;
    private int idCorrida;
    private HashMap<String, Integer> resultados;
    private String cavaloVencedor;

    public Corrida() {
        this.idCorrida = proximoId++;
        this.resultados = new HashMap<>();
        simularCorrida(); // A corrida é simulada assim que o objeto é criado
    }

    private void simularCorrida() {
        Random random = new Random();
        resultados.put("Cavalo 1", random.nextInt(101));
        resultados.put("Cavalo 2", random.nextInt(101));
        resultados.put("Cavalo 3", random.nextInt(101));
        resultados.put("Cavalo 4", random.nextInt(101));
        resultados.put("Cavalo 5", random.nextInt(101));

        int maiorPontuacao = Collections.max(resultados.values());
        for (Map.Entry<String, Integer> cavalo : resultados.entrySet()) {
            if (cavalo.getValue() == maiorPontuacao) {
                this.cavaloVencedor = cavalo.getKey();
                break;
            }
        }
    }

    public int getIdCorrida() {
        return idCorrida;
    }

    public String getCavaloVencedor() {
        return cavaloVencedor;
    }

    public HashMap<String, Integer> getResultados() {
        return resultados;
    }
}