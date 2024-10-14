package arboles;
public class ArbolBusqueda extends ArbolBin{

    public ArbolBusqueda(Nodo raiz) {
        super(raiz);
    }

    public void add(Nodo added) {
        System.out.println("Nodo a asignar " + added.getValor());
        Nodo aux = getRoot();
        while (ArbolBin.hijoDisponible(aux) != null) { //Se puede igual que while(aux.getDer()!= null || aux.getIzq() != null), hay error acá xdddd
            if(added.getValor() == aux.getValor() ){
                System.out.println("Clave repetida. El árbol no admite claves duplicadas");
                break;
            }
            if(added.getValor() < aux.getValor()){
                aux = aux.getIzq();
                System.out.println("recorriendo izquierda");
            }
            if(added.getValor() > aux.getValor()){
                aux = aux.getDer();
                System.out.println("recorriendo derecha");
            }
            System.out.println("Recorrido " + aux.getValor());
        }
        //Ya acabó el ciclo y nos encontramos en el nodo donde vamos a insertar
        if(added.getValor() > aux.getValor()){
            add(aux, added, 1); // Se agrega del lado derecho
            System.out.println("Se agregó a la derecha de " + added.getPadre().getValor());
        }
        if(added.getValor() < aux.getValor()){
            add(aux, added, 0); // Se añade a la izquierda cff
            System.out.println("Se agregó a la izquierda de " + added.getPadre().getValor());
        }
    }
}