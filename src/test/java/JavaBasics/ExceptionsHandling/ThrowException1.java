package JavaBasics.ExceptionsHandling;

public class ThrowException1 {

    public void Exception1()
    { int age=17;
       if(age<18)
       {
           throw new ArithmeticException("Not eligible");
       }
       else
       {
           System.out.println("Is eligible");
       }
    }

    public static void main(String[] args)
    {
        ThrowException1 th1= new ThrowException1();
        try{
            th1.Exception1();
        }
        catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("code execution");
        }
    }
}
