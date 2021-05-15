package JavaBasics.constructo;

public class Const1
{
    int x;
    String str;

    public Const1()
    {
        System.out.println("deafult constructor");
    }

    public Const1(int x)
    {  // this.x=x;
        System.out.println(x);
    }

    public Const1(String str)
    {this.str=str;
        System.out.println(str);
    }


    public void info()
    {
        System.out.println(x + " " + str);
    }
    public static void main(String[] args)
    {
         new Const1();
        Const1 c2= new Const1(12);
        Const1 c3= new Const1("Abhinav");
        System.out.println(c2.x);
        System.out.println(c3.x);
        c2.info();
        c3.info();


    }


}