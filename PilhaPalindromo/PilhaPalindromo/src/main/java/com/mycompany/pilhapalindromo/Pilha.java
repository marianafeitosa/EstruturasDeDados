    package com.mycompany.pilhapalindromo;

    class Pilha{
          int inicio;
    int topo;
    int qtdeElementos;
    int tamanho;
    char p[];
 
    //método construtor
    public Pilha() {
        inicio = -1;
        topo = -1;
        tamanho = 10;
        p = new char[tamanho];
        qtdeElementos = 0;
    }
 
    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }
 
    public boolean estaCheia(){
        if(qtdeElementos == tamanho){
            return true;
        }
        return false;
    }
 
    public void empilha(char e){
        if (!estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            topo++;
            p[topo] = e;
            qtdeElementos++;
 
        }
    }
 
    public char desempilha(){
        char x=' ';
        if(!estaVazia()){
            x = p[topo];
            topo--;
            qtdeElementos --;
 
        }
        return x;
    } 
    public char topo(){
        return p[topo];
    }
    public int tamanho (){
        return qtdeElementos;
    }
 
    public String mostrar(){
        String elementos_da_pilha = "";
        for(int i=topo;i>=0;i--){
            elementos_da_pilha += p[i] + " | ";
        }
        return elementos_da_pilha;
    }
        }