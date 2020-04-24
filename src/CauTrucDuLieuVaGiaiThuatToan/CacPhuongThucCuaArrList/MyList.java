package CauTrucDuLieuVaGiaiThuatToan.CacPhuongThucCuaArrList;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capaccity){
        elements = new Object[capaccity];
    }
    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }
    private void giam(){
        int newSize = elements.length - 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element){
        ensureCapa();
        if (elements.length - index >= 0)
            System.arraycopy(elements, index, elements, index + 1, elements.length - index);
        elements[index] = element;
    }
    public E remove(int index){
        if (index >= size | index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }else {
            E a = (E) elements[index];
            if (elements.length - 1 - index >= 0)
                System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
            giam();
            return (E) a;
        }
    }
    public int size(){
        return elements.length;
    }
    public boolean contains(E o){
        int cont = 0;
        for (Object element : elements) {
            if (element == o) {
                cont++;
            }
        }
        return cont != 0;
    }
    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }return -1;
    }
    public boolean add(E o) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = o;
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity > DEFAULT_CAPACITY){
            elements = new Object[minCapacity];
        }
    }
    public E get(int i){
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public void clear(){
        elements = Arrays.copyOf(elements,0);
    }
    public Object clone(){

        return Arrays.copyOf(elements, elements.length-1);
    }

    public static void main(String[] args) {
        MyList<Integer> arr = new MyList<>(1);
        arr.add(1);
        arr.add(4);
        arr.add(7);
        arr.add(98);
        arr.add(34);
        arr.add(12);
        arr.add(65);
        arr.add(56);
        System.out.println(arr.get(3));
        arr.remove(3);
        System.out.println(arr.get(3));
        System.out.println(arr.size());
        System.out.println(arr.contains(6));
        System.out.println(arr.contains(7));
        System.out.println(arr.indexOf(7));
        System.out.println(arr.indexOf(46));
        arr.clear();
        System.out.println(arr.size());
    }

}
