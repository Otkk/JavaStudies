package mrgrana;

public class Aposta {
    private static int proximoId = 1;
    private int idAposta;
    private double valorAposta;
    private int palpiteCavalo; 
    //private int idCorrida;
    private Corrida c;

    public Aposta(double valorAposta, int palpiteCavalo) {
        this.idAposta = proximoId++;
        this.valorAposta = valorAposta;
        this.palpiteCavalo = palpiteCavalo;
        //this.idCorrida = idCorrida;
    }
    
    public Corrida getCorrida(){
        return c;
    }

    public int getIdAposta() {
        return idAposta;
    }

    public double getValorAposta() {
        return valorAposta;
    }

    public int getPalpiteCavalo() {
        return palpiteCavalo;
    }

}
