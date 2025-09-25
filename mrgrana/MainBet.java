package mrgrana;

public class MainBet {
    public static void main(String[] args) {
        

        Corrida corrida1 = new Corrida();
        Aposta aposta1 = new Aposta(500.0, 2);
        System.out.println("Aposta criada:");

       
        System.out.println("Corrida " + corrida1.getIdCorrida() + " finalizada!");
        System.out.println("Resultados: " + corrida1.getResultados());
        System.out.println("Vencedor da corrida: " + corrida1.getCavaloVencedor());
        System.out.println("--------------------");


        System.out.println("ID da Aposta: " + aposta1.getIdAposta());
        System.out.println("ID da Corrida: " + aposta1.getCorrida().getIdCorrida());
        System.out.println("Valor apostado: " + aposta1.getValorAposta());
        System.out.println("Palpite: " + aposta1.getPalpiteCavalo());

        if (aposta1.getPalpiteCavalo() == (corrida1.getCavaloVencedor())) {
            System.out.println("Parabéns, você acertou o cavalo vencedor da corrida " + corrida1.getIdCorrida() + "!");
        } else {
            System.out.println("Que pena, você errou. O vencedor foi o cavalo " + corrida1.getCavaloVencedor() + ".");
        }
    }
}
