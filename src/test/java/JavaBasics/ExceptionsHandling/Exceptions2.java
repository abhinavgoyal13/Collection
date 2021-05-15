package JavaBasics.ExceptionsHandling;

public class Exceptions2 {


        public static int myMethod()
        {
            try {
                //try block
                return 0;
            }
            finally {
                //finally
                System.out.println("Inside Finally block");
                return 10;

            }
        }
        public static void main(String args[])
        {
            System.out.println(Exceptions2.myMethod());
        }
    }
