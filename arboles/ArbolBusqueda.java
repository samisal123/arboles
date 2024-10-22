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
        if()
    }
}