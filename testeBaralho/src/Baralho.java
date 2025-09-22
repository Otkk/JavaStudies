import java.util.ArrayList;
import java.util.List;




public class Baralho {
    private List<String> baralhoCartas = new ArrayList<>();

    public static List<String> gerarBaralho(){
        String[] arrayNaipes = new String[]
                {"espadas","copas","ouros","paus"};

        String[] arrayCartas = new String[]
                {"as","2","3","4","5","6","7","8","9","10","valete","dama","rei"};
        //List<String> cartasC = new ArrayList<>(Arrays.asList(arrayCartas));
        List<String> monteC = new ArrayList<>();
        for (String naipe : arrayNaipes){
            for (String carta : arrayCartas){
                monteC.add(carta + " de " + naipe);
            }

        }
        return monteC;
    }
    public static List<String> distribuirCartas(List<String> cEmbaralhadas,int qntCartas){
        int tamanho = cEmbaralhadas.size();
        List topoMonte = cEmbaralhadas.subList(tamanho - qntCartas,tamanho);
        List mao = new ArrayList(topoMonte);
        topoMonte.clear();
        return mao;

    }

}
