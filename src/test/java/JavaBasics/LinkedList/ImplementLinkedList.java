package JavaBasics.LinkedList;

public class ImplementLinkedList {

    public static void main(String[] args)
    {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node head= a;
        a.next=b;
        b.next=c;
        c.next= null;

        while(head!=null)
        {
            System.out.println(head.data);
            head= head.next;
        }
   //     System.out.println(head.data);

    }
}
