package mrgrana;

public class Aposta {
    private static int proximoId = 1;
    private int idAposta;
    private double valorAposta;
    private String palpiteCavalo; // Adicione um palpite para o cavalo
    private int idCorrida;

    public Aposta(double valorAposta, String palpiteCavalo, int idCorrida) {
        this.idAposta = proximoId++;
        this.valorAposta = valorAposta;
        this.palpiteCavalo = palpiteCavalo;
        this.idCorrida = idCorrida;
    }

    public int getIdAposta() {
        return idAposta;
    }

    public double getValorAposta() {
        return valorAposta;
    }

    public String getPalpiteCavalo() {
        return palpiteCavalo;
    }

    public int getIdCorrida() {
        return idCorrida;
    }
}