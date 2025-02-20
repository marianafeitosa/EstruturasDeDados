/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.minhaprimeiraed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class MinhaPrimeiraED {

    /**tem uma variavel totalDeObjetos que é 0 
     //meu carrinho de compras é do tipo ED tem um vetor com 5 posições
     * qdo coloca a pizza no carrinho chama o metodo adiciona e adiciona no vetor 
     * @param args the command line arguments
     */
   
    private Object[] objetos = new Object[10];              
    public int totalDeObjetos = 0;
    
      // adiciona um objeto em uma posição específica
    public void adiciona(int posicao, Object objeto) { //criando uma função com os parametros da posicao e o objeto q se quer add no vetor
        if (posicao < 0 || posicao > totalDeObjetos) {// detectando se posicao é menor que 0 ou se posicao é maior que o totalDeObjetos
            System.out.println("Posição inválida!");
            return;
        }
        if (vetorCheio()) { //compara o totalDeObjetos com o tamanho maximo do vetor, se for iguais o vetor esta cheio
            dobraTamanho();
        }
        for (int i = totalDeObjetos; i > posicao; i--) { //for tem 3 campos de preenchimento 
            objetos[i] = objetos[i - 1];//desloca os outros objetos p direita
        }
        objetos[posicao] = objeto; //adiciona o objeto no vetor
        totalDeObjetos++;//add mais 1
    }
    
    // adiciona um objeto no final do vetor
    public void adiciona(Object objeto) {
        if (vetorCheio()) {
            dobraTamanho();
        }
        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;
    }
    
     // método para verificar se uma posição está ocupada
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos && objetos[posicao] != null;
    }

 // método para verificar se uma posição é válida
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }
    
     // método para remover um objeto de uma posição específica
    public void remove(int posicao) {
        if (!posicaoValida(posicao)) {
            System.out.println("Posição inválida!");
            return;
        }
        for (int i = posicao; i < totalDeObjetos - 1; i++) { //enquanto i for menor que o totalDeObjetos 
            objetos[i] = objetos[i + 1];
        }
        totalDeObjetos--;//decrementa o totalDeObjetos dando como condição valida 
        objetos[totalDeObjetos] = null;
    }
    
    // método para verificar se um objeto está no vetor
    public boolean contem(Object objeto) {
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                return true;
            }
        }
        return false;
    }
    
       // método para obter um objeto de uma posição específica
    public Object getObjeto(int posicao) {
        if (!posicaoValida(posicao)) {
            System.out.println("Posição inválida!");
            return null;
        }
        return objetos[posicao];
    }


    // método que retorna o número de elementos armazenados
    public int tamanho() {
        return totalDeObjetos; //totalDeObjetos é o tamanho da estrutura de dados
    }
    
    // método para verificar se o vetor está cheio
    private boolean vetorCheio() {
        return totalDeObjetos == objetos.length;
    }

    // método para dobrar o tamanho do vetor
    private void dobraTamanho() {
       // se o total de objetos for igual ao tamanho do vetor objetos
        // então declarar um novo vetor com o dobro de tamanho
        // transferir os dados do vetor objetos para o novo vetor
        if (totalDeObjetos == objetos.length) {
            Object[] novo_vetor = new Object[totalDeObjetos * 2];
            //Object[] novo_vetor = new Object[objetos.length * 2];
            for(int i=0; i< objetos.length; i++) {
                novo_vetor[i] = objetos[i];
            }
            objetos = novo_vetor;           
        }
    }

    // método para exibir todos os elementos da lista
    public void exibirLista() {
        System.out.print("[ ");
        for (int i = 0; i < totalDeObjetos; i++) {
            System.out.print(objetos[i] + " ");
        }
        System.out.println("]");
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
