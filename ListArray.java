public class ListArray<T> implements TDAList<T> {
    private static String Espacio = "";
    private T array[];
    private int contador;
    private final int CONTADOR_ARRAY;

    public ListArray(int n) {
        this.CONTADOR_ARRAY = n;
        this.contador = 0;
        this.array = (T[]) new Object[CONTADOR_ARRAY];
    }

    private boolean isFullList() {
        return contador == CONTADOR_ARRAY;
    }

    @Override
    public boolean isEmpty() {
        return contador == 0;
    }

    @Override
    public int length() {return contador;}

    @Override
    public  void destroyList(){
        int i =0;
        for(; i < array.length; i++){array[i] = null;}
        contador =  0;
    }
    @Override
    public boolean search(T x) {
        int i = 0;
        for (; i < contador; i++) {
            if (array[i].equals(x)) {return true;}
        }
        return false;
    }

    @Override
    public void insertFirst(T x) {
        if (isFullList()) {
            System.out.println("El arreglo se encuentra completo");
            return;
        } else if (isEmpty()) {
            array[0] = x;
        } else {
            for (int i = contador; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = x;
        }
        contador++;
    }

    @Override
    public void insertLast(T x) {
        if (isFullList()) {
            System.out.println("El arreglo se encuentra completo");
            return;
        }
        array[contador++] = x;
    }

    public void removeIndex(int posicion) {
        // TODO Auto-generated method stub
        for (int i = posicion; i < contador - 1; i++) {
			array[i] = array[i + 1];
		}
		array[contador - 1] = null;
		contador--;
    }

    @Override
    public void removeNode(T x) {
        // TODO Auto-generated method stub
        int i = 0;
        for (; i < contador; i++) {
            if (array[i].equals(x)) {removeIndex(i);
                break;
            }
        }
    }
}
