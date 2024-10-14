package recorridos;
import arboles.Nodo;
public class Recorridos{
    public static void recorridoPreOrden(Nodo raiz) {
        //Examinar nodo
        //Recorrer subarbol izquierdo
        //Recorrer subarbol derecho
        if(raiz != null){
            System.out.println("Nodo: " + raiz.getValor());
            recorridoPreOrden(raiz.getIzq());
            recorridoPreOrden(raiz.getDer());
        }
    }
    
    public static void recorridoInOrden(Nodo raiz){
        if(raiz != null){
            recorridoInOrden(raiz.getIzq());
            System.out.println("Nodo: " + raiz.getValor());
            recorridoInOrden(raiz.getDer());
        }
    }

    public static void recoridoPostOrden(Nodo raiz){
        if(raiz!= null){
            recoridoPostOrden(raiz.getIzq());
            recoridoPostOrden(raiz.getDer());
            System.out.println("Nodo: " + raiz.getValor());
        }

    }
}

