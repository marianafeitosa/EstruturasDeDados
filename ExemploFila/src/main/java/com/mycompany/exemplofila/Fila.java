/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplofila;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fila {
    //atributos da ila
    private Object vetor[];
    private int inicio,fim;
    
    //criando uma fila vazia
    public Fila(){
        this.vetor=new Object[1000];//1000 posições no vetor
        this.inicio=0;
        this.fim = this.inicio;
        
    }
    
    public Fila(int maxTam){//cria uma fila vazia
        this.vetor = new Object[maxTam];
        this.inicio=0;
        this.fim=this.inicio;
    }
    
    public void enfileira(Object valor)throws Exception{
        if((this.fim +1)> this.vetor.length){
            throw new Exception("Erro: A fila está cheia");
            
        }
        this.vetor[this.fim]=valor;
        this.fim = (this.fim +1);
        
    }
    public Object desenfileira()throws Exception{
        if(this.vazia()){
            throw new Exception ("Erro: a fila está vazia");
        }
        Object valor = this.vetor[this.inicio];
        this.inicio = (this.inicio +1)% this.vetor.length;
        return valor;
    }
    
   public boolean vazia(){
       return (this.inicio == this.fim);
   }
   
   public void imprime(){
       for (int i = this.inicio; i!=this.fim; i=(i+1)%this.vetor.length){
           System.out.println(this.vetor[i].toString() + "|");
       }
   }
}
