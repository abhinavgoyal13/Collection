package JavaBasics.OutputQuestions;

public class Exceptions {
    public void returnee(String a)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("try");
        }
        catch(Exception e)
        {
            System.out.println("catch");
        }
        finally
        {
            System.out.println("finally");
        }
    }
}
