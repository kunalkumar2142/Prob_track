package LinkedList;

public class DoublyLinkedList {

    private Node head;

    private int size;

    public DoublyLinkedList(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
        size++;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.err.print(node.value + " <-> ");
            node = node.next;
        }
        System.out.println("End");
    }
    public void displayReverse(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }

        while(last != null){
            System.err.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.println("End");
    }

    private class Node{
        private Node prev;
        private int value;
        private Node next;

        Node(){
        }

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        Node(Node prev, int value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(40);
        list.insertFirst(70);
        list.insertFirst(110);
        list.display();
        list.displayReverse();
        // list.insertLast(99);
        // list.insertInBetween(100, 3);
        // list.display();
        // System.out.println();
        // System.out.println("deleted item: "+ list.deleteFirst());
        // list.display();
        // System.out.println("deleted item: "+ list.deleteLast());
        // list.display();
        // System.out.println("deleted item: "+ list.deleteAtIndex(2));
        // list.display();
    }
}
