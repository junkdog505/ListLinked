public class ListLinked<E> implements TDAList<E>{
    protected Node<E> first;
    private E[] array;
    private int length;

    public ListLinked() {
        this.first = null;
        this.length = 0;
    }
    public boolean isEmpty() {return this.first == null;}
    public boolean search(E x){
        Node<E> aux = this.first;
        for(; aux != null; aux = aux.getNext())
            if(aux.getData().equals(x))
                return true;
        return false;
    }
    @Override
    public void destroyList() {
        this.first = null;
    }
    public int length(){
        return this.length;
    }
    public void insertFirst(E x){
        Node<E> p = new Node <E>(x,this.first);
        this.first=p;
        length++;    
    }
    public void insertLast(E x) {
        Node<E> p = new Node( x);
        if (this.first == null) {
            this.first = p;
        } else {
            Node<E> actual = first;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(p);
        }
        length++;
    }
    public void remove(E x) {
        if(this.first.getData().equals(x))   //eliminación del primer nodo.
            this.first = this.first.getNext();
        else{
            Node<E> aux = this.first;
            while(aux.getNext() != null && !aux.getNext().getData().equals(x))
                aux = aux.getNext();
            if(aux.getNext() != null)
                aux.setNext(aux.getNext().getNext());
        }
    }
    public void removeNode(E x){
        if(this.first.getData().equals(x))
            this.first=this.first.getNext();
        else{
            Node<E> aux = this.first;
            while(aux.getNext()!=null && !aux.getNext().getData().equals(x))
                aux=aux.getNext();
            if(aux.getNext()!=null)
                aux.setNext(aux.getNext().getNext());
        }
    }
    public String toString() {
        String str = "[ ";
        for(Node<E> aux = this.first; aux != null; aux = aux.getNext()){
            str += aux.toString() + ", ";
        }
        return str+ " ]";
        
    }
}