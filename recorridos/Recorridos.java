package recorridos;
import arboles.Nodo;
public class Recorridos{
    public static void recorridoPreOrden(Nodo raiz, StringBuilder notacion) {
        //Examinar nodo
        //Recorrer subarbol izquierdo
        //Recorrer subarbol derecho
        if(raiz != null){
            notacion.append(raiz.getValor()).append(" ");
            recorridoPreOrden(raiz.getIzq(), notacion);
            recorridoPreOrden(raiz.getDer(), notacion);
        }
    }
    
    public static void recorridoInOrden(Nodo raiz, StringBuilder notacion){
        if(raiz != null){
            recorridoInOrden(raiz.getIzq(), notacion);
            notacion.append(raiz.getValor()).append(" ");
            recorridoInOrden(raiz.getDer(), notacion);
        }
    }

    public static void recorridoPostOrden(Nodo raiz, StringBuilder notacion){
        if(raiz!= null){
            recorridoPostOrden(raiz.getIzq(), notacion);
            recorridoPostOrden(raiz.getDer(), notacion);
            notacion.append(raiz.getValor()).append(" ");
        }

    }
}
