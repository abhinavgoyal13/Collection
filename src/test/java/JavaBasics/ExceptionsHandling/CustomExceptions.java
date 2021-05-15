package JavaBasics.ExceptionsHandling;

public class CustomExceptions {


    public void customExcep(int age) throws InvalidMyNameExecption
    {
        if(age <18)
        {
            throw new InvalidMyNameExecption("invalid age");
        }
        else
        {
            System.out.println("valid age");
        }
    }
    public static void main(String[] args) throws InvalidMyNameExecption
    {
        CustomExceptions cs = new CustomExceptions();
        try
        {
            cs.customExcep(17);
        }
       catch(InvalidMyNameExecption e)
        {
            System.out.println(e);
        }
    }
}
