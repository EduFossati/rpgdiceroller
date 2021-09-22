/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgroundDados;


import java.util.Random;

/**
 *
 * @author user
 */
public class Dados {
    
    Random rolar = new Random();
    
    private int dQuatro,dSeis,dOito,dDez,dDoze,dVinte,dCem,quantidade,modificador,dadoCustom,valorCustom;
    private String condicaoModificador;
    
    public int getdQuatro() {
        return dQuatro;
    }

    public void setdQuatro(int dQuatro) {
        this.dQuatro = dQuatro;
    }

    public int getdSeis() {
        return dSeis;
    }

    public void setdSeis(int dSeis) {
        this.dSeis = dSeis;
    }

    public int getdOito() {
        return dOito;
    }

    public void setdOito(int dOito) {
        this.dOito = dOito;
    }

    public int getdDez() {
        return dDez;
    }

    public void setdDez(int dDez) {
        this.dDez = dDez;
    }

    public int getdDoze() {
        return dDoze;
    }

    public void setdDoze(int dDoze) {
        this.dDoze = dDoze;
    }

    public int getdVinte() {
        return dVinte;
    }

    public void setdVinte(int dVinte) {
        this.dVinte = dVinte;
    }

    public int getdCem() {
        return dCem;
    }

    public void setdCem(int dCem) {
        this.dCem = dCem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }

    public int getDadoCustom() {
        return dadoCustom;
    }

    public void setDadoCustom(int dadoCustom) {
        this.dadoCustom = dadoCustom;
    }

    public int getValorCustom() {
        return valorCustom;
    }

    public void setValorCustom(int valorCustom) {
        this.valorCustom = valorCustom;
    }

    
    
    
    
    public int rolarDquatro(){
        int soma=0;
        
        for(int i=0;i<this.quantidade;i++){
            dQuatro = 1+rolar.nextInt(4);
            soma = soma+dQuatro;      
        }
        
        return soma+this.modificador;
    }
    
    public int rolarDseis(){
        int soma=0;
        
        for(int i=0;i<this.quantidade;i++){
            dSeis = 1+rolar.nextInt(6);
            soma = soma+dSeis;        
        }
        
        return soma+this.modificador;
    }
    
    public int rolarDoito(){
        int soma=0;
        
        for(int i=0;i<quantidade;i++){
            dOito = 1+rolar.nextInt(8);
            soma = soma+dOito;
        }
        
        return soma+this.modificador;
    }
    
    public int rolarDdez(){
        int soma=0;
        
        for(int i=0;i<quantidade;i++){
            dDez = 1+rolar.nextInt(10);
            soma = soma+dDez;   
        }
        
        return soma+this.modificador;
    }
    
    public int rolarDdoze(){
        int soma=0;
        
        for(int i=0;i<quantidade;i++){
            dDoze = 1+rolar.nextInt(12);
            soma = soma+dDoze;
            System.out.println(dDoze);
            
        }
        
       return soma+this.modificador;
    }
    
    public int rolarDvinte(){
        int soma=0;
        
        for(int i=0;i<quantidade;i++){
            dVinte = 1+rolar.nextInt(20);
            soma = soma+dVinte;     
        }
        
        return soma+this.modificador;
    }
    
    public int rolarDcem(){
        int soma=0;
        
        for(int i=0;i<quantidade;i++){
            dCem = 1+rolar.nextInt(100);
            soma = soma+dCem; 
        }
        
        return soma+this.modificador;
    }
    
    public int rolarDadoCustom(){
        int soma =0;
        
        for(int i=0;i<quantidade;i++){
            dadoCustom = 1+rolar.nextInt(valorCustom);
            soma=soma+dadoCustom;
        }
        return soma+this.modificador;
    }
}
