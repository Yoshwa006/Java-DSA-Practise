package LinkedList.circular;

public class Linked {
    Node head;
    Node tail;


    public Linked(){
        head =null;                                                    //circular
        tail =null;
    }

    void insertAtEnd(int data){
        Node num = new Node(data);

        if(head == null){
            head = num;
            tail =num;
            num.next = head;
        }
        else{
            tail.next = num;
            tail =num;
            tail.next = head;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (true) {
            System.out.println(current.data);
            current = current.next;
            if (current == head) { // Break the loop when we come back to the head
                break;
            }
        }
    }
     void insertAtBeginning(int data){
        Node newNode= new Node(data);
        if(head == null){
            head= newNode;
            tail=newNode;
            newNode.next =head;
        }
        else{
            newNode.next = head;  // Link new node to current head
            head = newNode;       // Update head to new node
            tail.next = head;
        }
    }
}
