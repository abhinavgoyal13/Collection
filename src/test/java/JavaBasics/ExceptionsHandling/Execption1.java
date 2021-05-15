package JavaBasics.ExceptionsHandling;

public class Execption1 {
    public static void main(String[] args)
    {


        try
        {
            int x= 10/1;
        }

        catch(ArithmeticException ae)
        {
            System.out.println("Exception occured");
            System.out.println(ae.getMessage());
        }

        finally
        {
            System.out.println("finally block");
        }
    }
}
