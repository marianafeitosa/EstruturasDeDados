
package com.mycompany.exerciciofila;

package fila;
 
public class Fila {
    private Object[] objetos = new Object[10];
    private int inicio = 0; // indice do primeiro elemento
    private int fim = 0;    // indice do próximo local para inserir
    private int totalDeObjetos = 0;
 
    // enfileirando um objeto na fila
    public void enfileira(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            // se a fila estiver cheia, vai deslocar os elementos pra frente
            for (int i = 0; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            fim = totalDeObjetos - 1; // atualiza o fim após o deslocamento
        }
        objetos[fim] = objeto;
        fim = (fim + 1) % objetos.length;  // atualiza o índice do fim
        totalDeObjetos++;
    }
 
    // desenfileira um objeto da fila
    public void desenfileira() {
        if (totalDeObjetos > 0) {                              
            objetos[inicio] = null; // removendo primeiro elemento
            inicio = (inicio + 1) % objetos.length; // Atualiza o índice do início
            totalDeObjetos--;
        } else {
            System.out.println("Fila vazia!");
        }
    }
 
    // retorna o primeiro elemento da fila sem removê-lo
    public Object primeiro() {
        if (totalDeObjetos > 0) {
            return objetos[inicio];
        } else {
            return null;
        }
    }
 
    // retornanoo último elemento da fila sem removê-lo
    public Object ultimo() {
        if (totalDeObjetos > 0) {
            int ultimoIndice = (fim - 1 + objetos.length) % objetos.length;
            return objetos[ultimoIndice];
        } else {
            return null;
        }
    }
    // Retorna o número de elementos na fila
    public int tamanho() {
        return totalDeObjetos;
    }

    // Verifica se a fila está vazia
    public boolean vazia() {
        return totalDeObjetos == 0;
    }
}

 