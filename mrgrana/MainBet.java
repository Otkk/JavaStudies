package mrgrana;

public class MainBet {
    public static void main(String[] args) {
        // 1. Cria a corrida primeiro

        Corrida corrida1 = new Corrida();
        Aposta aposta1 = new Aposta(500.0, "Cavalo 2", corrida1.getIdCorrida());
        System.out.println("Aposta criada:");


        System.out.println("Corrida " + corrida1.getIdCorrida() + " finalizada!");
        System.out.println("Resultados: " + corrida1.getResultados());
        System.out.println("Vencedor da corrida: " + corrida1.getCavaloVencedor());
        System.out.println("--------------------");


        System.out.println("ID da Aposta: " + aposta1.getIdAposta());
        System.out.println("ID da Corrida: " + aposta1.getIdCorrida());
        System.out.println("Valor apostado: " + aposta1.getValorAposta());
        System.out.println("Palpite: " + aposta1.getPalpiteCavalo());

        if (aposta1.getPalpiteCavalo().equals(corrida1.getCavaloVencedor())) {
            System.out.println("Parabéns, você acertou o vencedor da corrida " + corrida1.getIdCorrida() + "!");
        } else {
            System.out.println("Que pena, você errou. O vencedor foi o " + corrida1.getCavaloVencedor() + ".");
        }
    }
}
