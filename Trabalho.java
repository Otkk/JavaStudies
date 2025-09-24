package logistica;

/**
 *
 * @author alunolab11
 */
public class Sistema {
    public static void main(String[] args) {
        Estoque stq = new Estoque();
        Produto p1 = new Produto(1,"Calsa",1,23,4,5);
        Produto p2 = new Produto(2,"Camisa",2,53,0,5);
        
        stq.inserirProd(p1);
        stq.inserirProd(p2);
        
        stq.exibirEstoque();
        
        
    }
    
}


package logistica;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    
    public Estoque(){
        this.produtos = new ArrayList<>();
    }
    
    public void inserirProd(Produto prod){ 
        boolean produtoExistente = false;
        
        for(Produto produto : produtos){
            if(produto.codigo == prod.codigo){
                System.out.println("Já existe um produto com esse código");
                produtoExistente = true;
                break;
            }
        }
        if (!produtoExistente && prod.getPreco() <= 0) {
            System.out.println("Preco de "+ prod.nome + " invalido");
        } else
        if (!produtoExistente && prod.getPreco() > 0) {
                this.produtos.add(prod);
                System.out.println("O produto " + prod.nome + " foi adicionado");
            }
            
    }

  
    public void exibirEstoque(){
        System.out.println("- Estoque atual -");
        for(Produto produto : produtos){
            System.out.println(produto.nome);
        }
    }
}


package logistica;


public class Produto {
    public int codigo;
    public String nome;
    private int quantEstoque;
    public float precoCusto;
    private float precoVenda;
    public int quantVendida;
    
    public Produto(int codigo,String nome,int quantEstoque, float precoCusto,float precoVenda, int quantVendida){
        this.codigo = codigo;
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantVendida = quantVendida;
    }
    
    public float getPreco(){
        return precoVenda;
    }
    
    public int quantEstoque(){
        return quantEstoque;
    }
}

