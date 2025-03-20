/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplofila;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {
    public static void main(String args []) throws Exception{
        //criando uma fila
        Fila fila = new Fila();
         fila.enfileira("A");
         fila.enfileira("B");
         fila.enfileira("C");
         fila.enfileira("D");
           

        // Exibir fila
        System.out.println("Fila:");
       fila.imprime();

        // Removendo um elemento da fila
      fila.desenfileira();
        
        // Exibir a fila novamente após remoção
        System.out.println("\nFila após remoção:");
        fila.imprime();
    }
    
}
