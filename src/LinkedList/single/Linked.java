package LinkedList.single;

import java.util.HashMap;

public class Linked {

    Node head;

    public Linked() {
        head = null;
    }


    public void add(int data) {

        Node num = new Node(data);
        if (head == null) {
            head = num;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = num;
        }
    }


    void count() {
        if (head == null) {
            System.out.println(0);
        } else {
            int count = 1;
            Node current = head;
            while (current.next != null) {
                count++;
                current = current.next;
            }
            System.out.println("Size is " + count);
        }

    }

    void indexOf(int num) {
        Node current = head;
        int count = 0;
        if (head == null) {
            System.out.println("0 elements");
            return;
        }
        while (current != null) {
            count++;
            if (current.data == num) {
                System.out.println(count - 1);
                return;
            }
            current = current.next;
        }
    }

    void clear() {
        head = null;
    }

    void print() {
        Node current = head;
        if (current == null) {
            System.out.println("EMPTY");
        } else {
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println(); // Print newline after the list
        }

    }

    void deleteFirst() {
        Node current = head;
        head = current.next;
    }

    void deleteLast() {
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    void deleteAt(int n) {
        Node current = head;
        if (n == 0) {
            head = current.next;
        } else {
            while (n > 1 && current.next != null) {
                current = current.next;
                n--;
            }
            current.next = current.next.next;
        }
    }

    void sumOfNodes() {
        Node current = head;
        int size = 0;
        if (head == null) {
            System.out.println("EMPTY");

        } else {
            while (current != null) {
                size += current.data;
                current = current.next;
            }
        }
        System.out.println(size);
    }

    void sumofevenodd() {
        int pos = 1;
        int even = 0;
        int odd = 0;


        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node current = head;

        while (current != null) {
            if (pos % 2 == 0) {
                even += current.data;
            } else {
                odd += current.data;
                ;
            }
            pos++;

            current = current.next;
        }

        System.out.println("Even sum : " + even);
        System.out.println("Odd sum : " + odd);
    }

    void FromEnd(Node h, int n) {

        Node dummy = new Node(0);
        dummy.next = h;
        Node slow = dummy;
        Node fast = h;

        if(n==6){
            h = h.next;
            while (h != null) {
                System.out.println(h.data);
                h = h.next;
            }
            return;
        }
        for (int i = 1; i < n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }

    public void Reverse(){
        Node curr =head;
        Node forprint = head;
        Node prev= null;
        Node nextnew= null ;

        while(curr != null){
            nextnew = curr.next;
            curr.next= prev;
            prev= curr;
            curr =nextnew;
        }
        while(prev!=null){
            System.out.print(prev.data + " ->");
            prev =prev.next;
        }
    }
public static boolean cycle(Node head){
    HashMap<Node, Integer> map = new HashMap<>();
    Node temp =head;
    while(temp != null){
        if(map.containsValue(temp)){
            return false;
        }
        else if(temp.next == null){
            return false;
        }
        map.put(temp, temp.data);
        temp= temp.next;
    }
    return true;
}

public static Node Remove_Duplicates(Node head){


        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;

        while(temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return temp;
}

public  void reverse(int k){

        for(int i= 0; i<k; i++) {
            Node slow = head;
            Node fast = head;


            while (fast.next != null) {
                fast = fast.next;
            }
            while (slow.next != fast) {
                slow = slow.next;
            }

            fast.next = head;
            slow.next = null;
            head = fast;
        }
}
}

