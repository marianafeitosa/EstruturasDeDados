/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeadalivros;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Livro {
    private String nome;
    private int ano;
    private double preco;
    private Livro anterior;
    
   // Construtor
   public Livro(String nome, int ano, double preco) {
       this.nome = nome;
       this.ano = ano;
       this.preco = preco;
       this.anterior = null;
   }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the anterior
     */
    public Livro getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }

    private void setValor(Livro anterior) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Método para exibir informações do livro
   public void exibirLivro() {
       System.out.println("Nome: " + nome + " | Ano: " + ano + " | Preço: R$ " + preco);
   }

}
