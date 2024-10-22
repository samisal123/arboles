package arboles;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import recorridos.Recorridos;

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

    public ArrayList<Nodo> recorrido(){
        ArrayList<Nodo> nodos = new ArrayList<>();
        Nodo r = root;
	    Queue<Nodo> queue = new LinkedList();
	    if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();
		nodos.add(r);
		if(r.izq!=null)
                    queue.add(r.izq);
		if(r.der!=null)
		queue.add(r.der);
            }
	}
    return nodos;
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
            eliminarHoja(aEliminar);
            System.out.println("Estás eliminando una hoja");
            
        }else{
            if(aEliminar.getIzq() == null || aEliminar.getDer() == null){ //Caso de que tiene un hijo
                System.out.println("Estás eliminando un nodo con un hijo");
                Nodo padre = auxiliar.getPadre(); //Falta aquí considerar si la raíz tiene un solo hijo
                if(esHijoIzquierdo(aEliminar)){
                    padre.setIzq(hijoDisponible(auxiliar));
                    aEliminar = null;
                }else{
                    padre.setDer(hijoDisponible(auxiliar));
                    aEliminar = null;
                }
            }else{ // Caso donde tiene 2 hijos
                System.out.println("Estás eliminando un nodo con 2 hijos...");
                //while hijodisponible(nuevo) == null
                auxiliar = getHoja(aEliminar); // Se obtiene algún nodo hoja iniciando desde el nodo a eliminar (que tiene 2 hijos)
                //Hacer lo de los padres
                aEliminar.setValor(auxiliar.getValor());
                eliminarHoja(auxiliar);

            }
        }
    }

    protected void eliminarHoja(Nodo hoja){
        Nodo padre = hoja.getPadre();
        if(esHijoIzquierdo(hoja)){
            padre.setIzq(null);
            }else padre.setDer(null);
        hoja = null; // Se elimina la hoja finalmente
    }
    
    public String notacionPrefija(){
        StringBuilder prefija = new StringBuilder();
        Recorridos.recorridoInOrden(root, prefija);
        return prefija.toString().trim();
    }

    public String notacionInfija(){
        StringBuilder prefija = new StringBuilder();
        Recorridos.recorridoInOrden(root, prefija);
        return prefija.toString().trim();
    }

    public String notacionPostfija(){
        StringBuilder prefija = new StringBuilder();
        Recorridos.recorridoPostOrden(root, prefija);
        return prefija.toString().trim();
    }

    public static Nodo getHoja(Nodo nodo){
        Nodo hoja = null;
        if(nodo!= null){
            if(esHoja(nodo)){
                System.out.println("Nodo " + nodo.getValor());
                return nodo;
            }
            hoja = getHoja(nodo.getIzq());
            if(hoja != null) return hoja;
            hoja = getHoja(nodo.getDer());
            if(hoja != null) return hoja;

        }
        return hoja;
    }

    protected static boolean esHoja(Nodo nodo){
        if(nodo.getDer() == null && nodo.getIzq() == null){
            return true;
        }else return false;
    }

}
