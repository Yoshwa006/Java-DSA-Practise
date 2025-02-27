package packLL;

public class LL {
    Node head;

    Node Two_sum(Node head1, Node head2){
        Node dummy = new Node(0);
        Node ret = dummy;
        int carry =0;
        while(head1!= null || head2 != null || carry != 0){
            int sum = carry;

            if(head1 != null){
                sum += head1.data;
                head1= head1.next;
            }

            if(head2 != null){
                sum+= head2.data;
                head2= head2.next;
            }
            dummy.next =  new Node(sum%10);
            carry = sum /10;
        }

        return ret.next;
    }
}
