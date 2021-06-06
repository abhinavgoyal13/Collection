package Interview.innerclasses;
class InnerClaasses{
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        InnerClaasses obj = new InnerClaasses();
        InnerClaasses.Inner in = obj.new Inner();
        in.msg();
    }
}
