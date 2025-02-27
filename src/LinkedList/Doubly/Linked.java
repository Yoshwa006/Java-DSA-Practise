package LinkedList.Doubly;

public class Linked {

    Node head;
    Node tail;


    public Linked() {
        head = null;
        tail = null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    void display() {
        if (head == null) {
            System.out.println("Empty list !");
        } else {
            Node current = tail;
            while (current != null) {
                System.out.println(current.data);
                current = current.prev;
            }
        }
    }

    int count() {
        Node current = head;
        int count = 1;
        if (head == null) {
            return 0;
        } else {
            while (current.next != null) {
                count++;
                current = current.next;
            }
        }
        return count;
    }

    boolean testsearch(int target) {

        Node h = head;
        Node t = tail;
        if (head == null) {
            System.out.println("EMPTY !");
        } else {
            int n = count();
            while (n < n / 2) {
                if (h.data == target || t.data == target) {
                }
            }
        }
        return false;
    }

    Node merge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;

        if(head1 == null && head2 == null){
            System.out.println("Empty List !");
            return null;
        }
        while(head1 != null && head2!= null){

            if(head1.data < head2.data){
                current.next = head1;
                head1 = head1.next;
            }
            else{
                current.next = head2;
                head2 = head2.next;
            }
            current =current.next;
        }
        return dummy.next;
    }
    Node getHead(){
        return this.head;
    }
    void displaywithhead(Node head){
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
