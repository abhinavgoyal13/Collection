package JavaBasics.constructo;

public class CopyConstructor {
private String a;
    public CopyConstructor(String a)
    {       this.a=a;

    }

    public CopyConstructor(CopyConstructor ab)
    {       this.a=ab.a;

    }

    public void display()
    {
        System.out.println(this.a);
    }



    public static void main(String[] args)
    {
        CopyConstructor cc= new CopyConstructor("Abhinav");
        CopyConstructor cc1= new CopyConstructor(cc);
        cc.display();
        cc1.display();
    }
}
