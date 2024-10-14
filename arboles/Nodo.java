/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
package arboles;
public class Nodo {
    
    int valor;
    Nodo izq = null;
    Nodo der = null;
    Nodo padre;
    
    public Nodo(){
        izq=der=padre=null;
    }
    public Nodo(int data){
        this(data,null,null);
    }
    public Nodo(int data, Nodo lt, Nodo rt){
        valor=data;
        izq = lt;
        der = rt;
    }   

    
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
    
    public void setDer(Nodo der) {
        this.der = der;
    }

    public void setPadre(Nodo padre){
        this.padre = padre;
    }

    public Nodo getIzq(){
        return izq;
    }
    
    public Nodo getDer(){
        return der;
    }

    public int getValor(){
        return valor;
    }

    public Nodo getPadre(){
        return padre;
    }
    
}
