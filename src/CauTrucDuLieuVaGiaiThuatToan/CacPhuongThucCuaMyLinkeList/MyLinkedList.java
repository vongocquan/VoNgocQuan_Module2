package CauTrucDuLieuVaGiaiThuatToan.CacPhuongThucCuaMyLinkeList;

import java.util.SplittableRandom;

public class MyLinkedList<E> {

        private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private static class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public boolean add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 & temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next =new Node(element);
        temp.next.next = holder;
        numNodes++;
        return true;

    }
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        Node holder;
        for (int i = 0; i < numNodes - 1; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next.next = new Node(e);
        numNodes++;

    }
    public E remove(int index){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        E a = (E) temp.next.data;

        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
        return a;
    }
    public boolean remove(Object o){
        Node temp = head;
        Node holder;
        if (temp.data.equals(o)){

            for (int i = 0; i < numNodes - 1; i++){
                head = temp.next;
                numNodes--;

            }
            return true;
        }
        else {
            for (int i = 0; i < numNodes ; i++) {

                temp = temp.next;
                if (temp.data.equals(o)) {
                    temp = head;
                    for (int j = 0; j < i; j++){
                        temp = temp.next;
                    }
                    holder = temp.next.next;
                    temp.next = holder;
                    numNodes--;

                    return true;

                }
            }
        }
        return false;
    }
    public int size(){
        return numNodes;
    }
    public boolean contains(E o){
        Node temp = head;
        if (temp.data.equals(o)){
            return true;
        }else {
            for (int i = 0; i < numNodes; i++){
                temp = temp.next;
                if (temp.data.equals(o)){
                    return true;
                }

            }
        }return false;
    }
    public int indexOf(E e){
        Node temp = head;
        if (temp.data.equals(e)){
            return 0;
        }else for (int i = 0; i < numNodes; i++){
            temp = temp.next;
            if (temp.data.equals(e)){
                return i + 1;
            }
        }return -1;
    }
    public E get(int i) {
        Node temp = head;
        if (i < 0 | i > numNodes - 1) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        } else {
            for (int j = 0; j < numNodes; j++) {
                Node b = temp;
                temp = temp.next;
                if (i == j) {
                    return (E) b.data;
                }
            }
        }
        return null;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public E getFirst(){
        Node temp = head;
        return (E) temp.data;
    }
    public E getLast(){
        Node temp = head;
        for (int i = 0; i < numNodes; i++){
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public void clear(){
        head =null;
        Node temp = head;
        numNodes = 0;
        }




    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>("d");


        list.add(1, "a");
        list.add(2,"b");
        list.add(2,"c");
        list.addFirst("e");
        list.addLast("r");
        list.printList();
        System.out.println(list.remove("r"));
        list.printList();
        System.out.println(list.contains("r"));
        System.out.println(list.indexOf("d"));
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        list.printList();



    }
}
