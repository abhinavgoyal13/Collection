package JavaBasics.constructo;

public class ChildClass extends ParentClass{
    public ChildClass()
    {//super();
        System.out.println("In child class");

    }

    public void ChildClass()
    {
        System.out.println("Method name = same name as class name");
    }

    public void Any()
    {
        System.out.println("Parent -child class relstionship");
    }

    public static void main(String[] args)
    {
        ParentClass c= new ParentClass();
        ParentClass c1= new ChildClass();
        ChildClass c2= new ChildClass();
        c2.ChildClass();
       // c1.ChildClass();


    }
}
