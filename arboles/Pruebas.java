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
import recorridos.*;

public class Pruebas {
    
    public static void main(String args[]){
        ArbolBin arbol;
        
        Nodo n7 = new Nodo(7);
        Nodo n9 = new Nodo(9);
        Nodo n1 = new Nodo(1,n7,n9);
        //Nodo n1 = new Nodo(1);
        Nodo n15 = new Nodo(15);
        Nodo n8 = new Nodo(8);
        Nodo n4 = new Nodo(4);
        Nodo n2 = new Nodo(2);
        Nodo n16 = new Nodo(16);
        Nodo n3 = new Nodo(3);
        
        arbol = new ArbolBin(n1);
        arbol.add(n7,n15,0);
        arbol.add(n7,n8,1);
        arbol.add(n9,n4,0);
        arbol.add(n9,n2,1);
        arbol.add(n15,n16,1);
        arbol.add(n8,n3,0);
        Nodo hoja = Recorridos.getHoja(arbol.getRoot());
        System.out.println(hoja.getValor());

        //Arbol binario de busqueda
        /*ArbolBusqueda busqueda = new ArbolBusqueda(n7);
        busqueda.add(n3);
        busqueda.add(n1);
        busqueda.add(n15);
        busqueda.add(n9);
        busqueda.breadthFrist();
        Recorridos.recoridoPostOrden(busqueda.getRoot());
        System.out.println("Aquí termina el busqueda");
        ya funciona*/ 

        //arbol.breadthFrist();
        //Pruebas de eliminación:
        //arbol.eliminarNodo(n8);
        //System.out.println("Arbol con eliminación de nodo: ");
        //arbol.breadthFrist();

        /*Recorridos.recorridoPreOrden(arbol.getRoot());
        System.out.println();
        Recorridos.recorridoInOrden(arbol.getRoot());
        System.out.println();
        Recorridos.recoridoPostOrden(arbol.getRoot());     */
    }

    
}
