import java.util.List;

public class Jogador {
    private String nome;
    private List<String> maoJogador;

    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMao(List<String> mao){
        this.maoJogador = mao;
    }

    public List getMao(){
        return maoJogador;
    }
}
