/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minhaprimeiraed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Pizza {
    private String sabor;
    private double preco;
    
    Pizza(String sabor, double preco){
    this.sabor = sabor;
    this.preco= preco;  
    }
    
    public double getPreco(){
     return preco;
    }
        
    public String getSabor(){
    return sabor; 
    }
}
