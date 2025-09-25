package mrgrana;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Corrida {
    private static int proximoId = 1;
    private int idCorrida;
    private HashMap<Integer, Integer> resultados;
    private int cavaloVencedor;

    public Corrida() {
        this.idCorrida = proximoId++;
        this.resultados = new HashMap<>();
        simularCorrida(); 
    }

    private void simularCorrida() {
        Random random = new Random();
        resultados.put(1, random.nextInt(101));
        resultados.put(2, random.nextInt(101));
        resultados.put(3, random.nextInt(101));
        resultados.put(4, random.nextInt(101));
        resultados.put(5, random.nextInt(101));

        int maiorPontuacao = Collections.max(resultados.values());
        for (Map.Entry<Integer, Integer> cavalo : resultados.entrySet()) {
            if (cavalo.getValue() == maiorPontuacao) {
                this.cavaloVencedor = cavalo.getKey();
                break;
            }
        }
    }

    public int getIdCorrida() {
        return idCorrida;
    }

    public int getCavaloVencedor() {
        return cavaloVencedor;
    }

    public HashMap<Integer, Integer> getResultados() {
        return resultados;
    }
}
