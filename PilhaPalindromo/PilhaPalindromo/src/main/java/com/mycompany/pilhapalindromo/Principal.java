
    package com.mycompany.pilhapalindromo;

    public class Principal {
     public static void main(String[] args) {
        Pilha p1 = new Pilha();
        Pilha auxiliar = new Pilha();
        Pilha p2 = new Pilha();
 
        System.out.println("Pilha está vazia? " + p1.estaVazia());//true
 
        //Empilhando elementos na pilha
        System.out.println("\nEMPILHANDO NA PILHA ORIGINAL...");
        p1.empilha('K');
        p1.empilha('A');
        p1.empilha('I');
        p1.empilha('A');
        p1.empilha('K');
 
        // Copia os elementos para a pilha auxiliar
        for (int i = 0; i <= p1.topo; i++) {
            auxiliar.empilha(p1.p[i]);
        }
 
        // Desempilha da auxiliar e empilha na p2 (invertido)
        while (!auxiliar.estaVazia()) {
            p2.empilha(auxiliar.desempilha());
        }
 
        // Verificação do palíndromo
        boolean verificaPalindromo = true;
        for (int i = 0; i <= p1.topo; i++) {
            if (p1.p[i] != p2.p[i]) {
                verificaPalindromo = false;
                break;
            }
        }
 
        System.out.println("\nPilha 1: " + p1.mostrar());
        System.out.println("Pilha 2: " + p2.mostrar());
 
        if (verificaPalindromo) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
     }
}