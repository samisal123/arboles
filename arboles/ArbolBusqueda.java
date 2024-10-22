package arboles;
public class ArbolBusqueda extends ArbolBin{

    public ArbolBusqueda(Nodo raiz) {
        super(raiz);
    }

    @Override
    public void add(Nodo padre, Nodo hijo, int lado){
        //Inutilizamos
    }

    public void add(Nodo added){
        Nodo raiz = getRoot();
        while(raiz.getValor() != added.getValor()){
            if(added.getValor() > raiz.getValor()){
                if(raiz.getDer() == null){
                    raiz.setDer(added);
                    break;
                }else{
                    raiz = raiz.getDer();
                }
            }else if(added.getValor() < raiz.getValor()){
                if(raiz.getIzq() == null){
                    raiz.setIzq(added);
                    break;
                }else{
                    raiz = raiz.getIzq();
                }
            }
        }
        
        
    }

    @Override
    public void eliminarNodo(Nodo aEliminar){
        if(esHoja(aEliminar)){
            aEliminar = null;
        }else{
            Nodo aux = hijoDisponible(aEliminar); //Aux se convierte en el hijo disponible con preferencia al hijo izquierdo
            if(esHijoIzquierdo(aux)){
                while(aux.getDer() != null)
                aux = aux.getDer();
            }else{
                //Aqui es debido a que aux es hijo derecho
                while(aux.getIzq() != null)
                aux = aux.getIzq();
            }
            aEliminar.setValor(aux.getValor());
            //Va a haber un hijo con el valor repetido
            aux = null;
            // Se elimina el hijo
        }
        //Hasta aquí, se modifica el auxiliar
    }
}