package mrgrana;

import java.time.LocalDate;

public class Jogador {
    private int idJogador;
    private String nome;
    private String sobrenome;
    private String apelido;
    private String cpf;
    private String nacionalidade;
    private LocalDate nascimento;

    public Jogador(int idJogador,String nome, String sobrenome, String apelido, String cpf, String nacionalidade, LocalDate nascimento){
        this. idJogador = idJogador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;

    }
}
