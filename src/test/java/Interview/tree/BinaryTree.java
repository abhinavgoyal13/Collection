package Interview.tree;

public class BinaryTree {
    public Node root;

    public void preOrderTraversal(Node root1)
    {

        if(root1==null)
            return;

            System.out.println(root1.data);
            preOrderTraversal(root1.l);
            preOrderTraversal(root1.r);


    }
    public void InOrderTraversal(Node root1)
    {

        if(root1==null)
            return;
        InOrderTraversal(root1.l);
            System.out.println(root1.data);

        InOrderTraversal(root1.r);


    }

    public int maxDepth(Node root) {

        if(root==null)
            return 0;

        int left =maxDepth(root.l);
        // System.out.println(left);
        int right=maxDepth(root.r);

        // System.out.println(right);

        return (Math.max(left,right)+1);

    }
    public void postOrderTraversal(Node root1)
    {

        if(root1==null)
            return;
        postOrderTraversal(root1.l);
        postOrderTraversal(root1.r);
            System.out.println(root1.data);

    }
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();
        bt.root= new Node(10);
        bt.root.l= new Node(20);
        bt.root.r= new Node(30);
        bt.root.l.l= new Node(40);
        bt.root.l.r= new Node(50);
       bt.root.r.l= new Node(60);

        System.out.println("preorder");
        bt.preOrderTraversal(bt.root);
        System.out.println("INorder");
        bt.InOrderTraversal(bt.root);
        System.out.println("POSTorder");
        bt.postOrderTraversal(bt.root);

        System.out.println("maximum depth of tree");
        bt.maxDepth(bt.root);



    }
}
