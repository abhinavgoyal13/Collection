package Interview.innerclasses;
class localInnerClaasses {
    private int data=30;
    public void a()
    {
        class Inner{
            void msg(){System.out.println("data is "+data);}
        }
        Inner i= new Inner();
        i.msg();


    }

    public static void main(String args[]){
        localInnerClaasses l= new localInnerClaasses();
        l.a();
    }
}
