public interface TDAList<E> {
    boolean isEmpty();
    int length();
    void destroyList();
    boolean search(E x);
    void insertFirst(E x);
    void insertLast(E x);
    void removeNode(E x);
}
