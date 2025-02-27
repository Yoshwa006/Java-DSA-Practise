package Testing_Garbages;

public class CDL {
    public static void main(String[] args) {
        functions list = new functions();
        list.insert(4);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.print();
    }

    public static class functions{
        node1 head, tail;

        void insert(int data){
            node1 newNode = new node1(data);

            if(head == null){
                head = tail = newNode;
            }
            else{
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
                tail.next =  head;
                head.prev = tail;
            }
        }
        void print(){
            node1 current = head;
            while(current.next != head){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
    }
}
