package Interview;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args)
    {
       Node1 n1 = new Node1(1,"String1");
        Node1 n2 = new Node1(2,"String2");
        Node1 n3 = new Node1(3,"String3");
        Node1 n4 = new Node1(4,"String4");
        Node1 n5 = new Node1(5,"String5");
        Node1 n6 = new Node1(6,"String6");

        System.out.println(n1.data);
        System.out.println(n1.s);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        System.out.println(countNodes(n1));
    }

    public static int countNodes(Node1 n1)
    {
        int count=0;
        Node1 current = n1;
        while(current.next!=null)
        {
            current= current.next;
            count=count+1;

        }
        return count;
    }
}
