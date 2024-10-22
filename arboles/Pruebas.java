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

public class Pruebas {
    
    public static void main(String args[]){
        ArbolBin arbol;
        
        Nodo n7 = new Nodo(7);
        Nodo n9 = new Nodo(9);
        //Nodo n1 = new Nodo(1,n7,n9); para raíz del arbol bin
        Nodo n1 = new Nodo(1);
        Nodo n15 = new Nodo(15);
        Nodo n8 = new Nodo(8);
        Nodo n4 = new Nodo(4);
        Nodo n2 = new Nodo(2);
        Nodo n16 = new Nodo(16);
        Nodo n3 = new Nodo(3);

        Nodo n14 = new Nodo(14);
        Nodo n13 = new Nodo(13);
        Nodo n12 = new Nodo(12);
        Nodo n11 = new Nodo(11);
        Nodo n10 = new Nodo(10);
        Nodo n20 = new Nodo(20);
         /*arbol = new ArbolBin(n1);
        arbol.add(n7,n15,0);
        arbol.add(n7,n8,1);
        arbol.add(n9,n4,0);
        arbol.add(n9,n2,1);
        arbol.add(n15,n16,1);
        arbol.add(n8,n3,0);
        arbol.breadthFrist();
        arbol.eliminarNodo(n16);
        System.out.println("Nodo eliminado");
        arbol.breadthFrist();*/

        //Arbol binario de busqueda
        ArbolBusqueda busqueda = new ArbolBusqueda(n7);
        busqueda.add(n3);
        busqueda.add(n1);
        busqueda.add(n15);
        busqueda.add(n9);
        busqueda.add(n8);
        busqueda.add(n4);
        busqueda.add(n2);
        busqueda.add(n16);
        busqueda.add(n14);
        busqueda.add(n13);
        busqueda.add(n12);
        busqueda.add(n11);
        busqueda.add(n10);
        busqueda.add(n20);
        //busqueda.breadthFrist();
        System.out.println(busqueda.notacionPrefija());
        System.out.println("Aquí termina el busqueda");
        busqueda.eliminarNodo(n8);
        busqueda.eliminarNodo(n15);
        busqueda.eliminarNodo(n9);
        System.out.println(busqueda.notacionPrefija());
        busqueda.breadthFrist();
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
