package arboles;
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class ArbolBin {
    Nodo root;
    
    public ArbolBin(){
        root=null;
    }
    
    public ArbolBin(int val){
        root=new Nodo(val);
    }
    
    public ArbolBin(Nodo root){
        this.root=root;
    }
    
    public void add(Nodo padre, Nodo hijo, int lado){
	if(lado==0){
        padre.setIzq(hijo);
    }
	else{
        padre.setDer(hijo);
    }
    hijo.setPadre(padre);
    }
    public Nodo getRoot(){
        return root;
    }
    
    protected void visit(Nodo n){
        System.out.println(n.valor+" ");
    }	
    
    public void breadthFrist(){
        Nodo r = root;
	Queue<Nodo> queue = new LinkedList();
	if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();
		visit(r);
		if(r.izq!=null)
                    queue.add(r.izq);
		if(r.der!=null)
		queue.add(r.der);
            }
	}
    }

    public static Nodo hijoDisponible(Nodo padre){
        if(padre.getIzq() == null){
            return padre.getDer();
        }else{
            return padre.getIzq();
        }
    }
    public boolean esHijoIzquierdo(Nodo hijo){
        Nodo padre = hijo.getPadre();
        if(padre.getIzq() == hijo){
            return true;
        }else{
            return false;
        }
    }

    public void eliminarNodo(Nodo aEliminar){
        Nodo auxiliar = aEliminar;
        if(aEliminar.getDer() == null && aEliminar.getIzq() == null){ //Caso de nodo Hoja
            aEliminar = null;
            
        }else{
            if(aEliminar.getIzq() == null || aEliminar.getDer() == null){ //Caso de que tiene un hijo
                Nodo padre = auxiliar.getPadre();
                if(esHijoIzquierdo(aEliminar)){
                    padre.setIzq(hijoDisponible(auxiliar));
                    aEliminar = null;
                }else{
                    padre.setDer(hijoDisponible(auxiliar));
                    aEliminar = null;
                }
            }else{ // Caso donde tiene 2 hijos
                //while hijodisponible(nuevo) == null
            }
        }

    }

}
