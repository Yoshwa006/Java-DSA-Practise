package LinkedList.Doubly;

public class Main {
    public static void main(String[] args) {
        Linked list = new Linked();
        Linked list2 = new Linked();


        list.insertAtEnd(1);
        list.insertAtBeginning(3);
        list.insertAtEnd(5);
        list2.insertAtEnd(2);
        list2.insertAtEnd(4);
        list2.insertAtEnd(6);
        Node merge = list.merge(list.getHead(),list2.getHead());
        list.displaywithhead(merge);

    }

}
