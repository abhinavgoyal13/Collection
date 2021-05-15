package JavaBasics.ExceptionsHandling;

import java.io.IOException;

public class ExceptionProgramStackTracing1 {

    public void a() throws IOException
    {
       throw new java.io.IOException("ioexecption occured");
    }
/*
    public void a()
    {
        int data=50/0;
    }*/
    public void b() throws IOException
    {//System.out.println("b");
        a();
       // System.out.println("b");

    }
    public void c()
    {
        try {
            b();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println("checked exception handled");
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        ExceptionProgramStackTracing1 e1= new ExceptionProgramStackTracing1();
        e1.c();
    }
}
