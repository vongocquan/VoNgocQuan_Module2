package CauTrucDuLieuVaGiaiThuatToan.CacPhuongThucCuaMyLinkeList;


public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data) {
        Node head = new Node(data);
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
    public void add(int index, E element ){
        Node temp = head;
        Node holder;

    }
}
