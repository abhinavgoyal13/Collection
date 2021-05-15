package JavaBasics.constructo;

public class ConstructorChaining {

private int a;
private String b;
private boolean c;
    ConstructorChaining()
    {
        this(10);
    }
    ConstructorChaining(int a)
    {
        this(a,"Abhinav");
    }

    ConstructorChaining(int a, String b)
    {
this(a,b,true);
    }


    ConstructorChaining(int a,String b, boolean c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void display()
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args)
    {
        ConstructorChaining ob = new ConstructorChaining();
        ob.display();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);

    }
}
