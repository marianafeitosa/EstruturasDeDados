/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeadalivros;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Lista {
    private Livro cabeca;
    private Livro anterior;
   
   // Construtor
   public Lista() {
       this.cabeca = null;
       this.anterior = null;
   }
   // Método para adicionar um livro à lista (no início)
   public void adiciona(Livro livro) {
       if (anterior == null){
           anterior = livro;
       }else{
           anterior = livro;
           anterior.setAnterior(anterior);
           anterior = anterior;
       }
   }
   
   // Método para remover o livro do topo da lista
   public void remove() {
       cabeca = cabeca.getAnterior();
       anterior = cabeca;
   }
   
   // Método para obter a cabeça da lista
   public Livro getCabeca() {
       return cabeca;
   }
   // Método para listar todos os livros da lista encadeada
   public void listarLivros() {
       Livro atual = cabeca;
       while (atual != null) {
           atual.exibirLivro();
           atual = atual.getAnterior();
       }
   }
}