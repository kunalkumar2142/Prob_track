package LinkedList;

// By using tail and size.
public class SinglylinkedList {

    private Node head;
    private Node tail;
           // or both same work.
    // private Node head = null;
    // private Node tail = null;

    private int size;

    public SinglylinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;         // head always point to the startiing node!!

        if(tail == null){
            tail = head;      // if only single element added then tail and head are same.
        }
        size +=1;
    }

    public int deleteFirst(){
        if (head == null) {
            return -1;
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return val;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size +=1;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // find by value.
    public Node findNode(int val){   
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // this get function is used to point the reference node by index.
    public Node get(int index){   
        Node node = head;
        for (int i=0;i<index; i++){
            node = node.next;
        }
        return node;
    }

    public void insertInBetween(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node curr = head;
        for(int i=1;i<index;i++){
            curr = curr.next;
        }

        Node node = new Node(value, curr.next);
        curr.next = node;
        size++;
    }

    public int deleteAtIndex(int index){
        if(index==0) return deleteFirst();
        if(index == size-1) return deleteLast();

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void deleteNode(Node node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("End");
    }
    
    private class Node{
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
    }


    public static void main(String[] args) {
        SinglylinkedList list = new SinglylinkedList();
        list.insertFirst(10);
        list.insertFirst(40);
        list.insertFirst(70);
        list.insertFirst(110);
        list.insertLast(99);
        list.insertInBetween(100, 3);
        list.display();
        System.out.println();
        System.out.println("deleted item: "+ list.deleteFirst());
        list.display();
        System.out.println("deleted item: "+ list.deleteLast());
        list.display();
        System.out.println("deleted item: "+ list.deleteAtIndex(2));
        list.display();
    }
}
