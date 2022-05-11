public class ListOrderAsc<E extends Comparable<E>> extends ListLinked<E>{
    public ListOrderAsc(){super();}
    public void insertOrder(E x){
        if(this.first == null || (this.first != null && this.first .getData().compareTo(x) > 0))
            insertFirst(x);
        else{
            Node<E> ant = this.first;
            while(ant.getNext() != null && ant.getNext().getData().compareTo(x) <= 0)
                ant= ant.getNext();
            ant.setNext(new Node<E>(x, ant.getNext()));
        }
    }
    public boolean search(E x){
        //modificar para que busque en una lista ordenada
        Node<E> aux = this.first;
        for(; aux != null; aux = aux.getNext())
            if(aux.getData().equals(x))
                return true;
        return false;
    }
    public void remove(E x) {
        //modificar par que elimine en una lista ordenada
        if(this.first.getData().equals(x))
            this.first = this.first.getNext();
        else{
            Node<E> aux = this.first;
            while(aux.getNext() != null && !aux.getNext().getData().equals(x))
                aux = aux.getNext();
            if(aux.getNext() != null)
                aux.setNext(aux.getNext().getNext());
        }
    }
}