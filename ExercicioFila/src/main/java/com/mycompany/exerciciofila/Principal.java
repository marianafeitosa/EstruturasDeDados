package com.mycompany.exerciciofila;

public class Principal {
     public static void main(String[] args) {
        Fila fila = new Fila();

        // enfileiramento
        fila.enfileira("Julia");
        fila.enfileira("Alice");
        fila.enfileira("Marina");

        System.out.println("Primeiro da fila: " + fila.primeiro()); // vai imprimir julia
        System.out.println("Último da fila: " + fila.ultimo()); // vai imprimir marina

        //  testando desenfileiramento
        fila.desenfileira();
        System.out.println("Novo primeiro da fila: " + fila.primeiro()); // vai imprimir alice

        //testando tamanho e estado da fila
        System.out.println("Tamanho da fila: " + fila.tamanho()); // vai imprimir 2
        System.out.println("Fila está vazia? " + fila.vazia()); // vai imprimir false

        //testando até esvaziar a fila
        fila.desenfileira();
        fila.desenfileira();
        System.out.println("Fila está vazia? " + fila.vazia()); // vai imprimir true

        //testando enfileirar após esvaziar
        fila.enfileira("Duda");
        System.out.println("Primeiro da fila: " + fila.primeiro()); // vai imprimir duda
    }
    
}
