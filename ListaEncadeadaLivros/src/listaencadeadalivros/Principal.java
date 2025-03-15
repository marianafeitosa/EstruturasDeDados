/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeadalivros;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {
    public static void main(String[] args) {
        // Criando uma lista encadeada de livros
        Lista lista = new Lista();
        // Adicionando livros à lista
        lista.adiciona(new Livro("É assim que acaba", 2015, 49.90));
        lista.adiciona(new Livro("Táticas do amor", 2017, 59.90));
        lista.adiciona(new Livro("Mulheres enrraizadas", 2021, 45.50));

        // Exibir os livros da lista
        System.out.println("Lista de livros:");
        lista.listarLivros();

        // Removendo um livro da lista
        lista.remove();
        
        // Exibir os livros novamente após remoção
        System.out.println("\nLista após remoção:");
        lista.listarLivros();
    }
}