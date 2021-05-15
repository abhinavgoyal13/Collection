package JavaBasics.OutputQuestions;

public class StringOutput {

    public void coding(String s)
    {
        System.out.println(s);
    }

    public void coding(Float f)
    {
        System.out.println(f);
    }

    public void coding(Object ob)
    {
        System.out.println(ob);
    }


    public static void main(String[] args)
    {
       //System.out.println( null);
        System.out.println((String) null);
        System.out.println("\\n");
        System.out.println("//n");
        System.out.println(2);

        StringOutput so= new StringOutput();
      so.coding(1);
       // so.coding(null);

        String s1="abhinav";
        String s2="abhinav";
        String s3="abhinav";
        String s4= new String("abhinav");
        String s5= new String("abhinav");
        String s6= new String("abhinav");


        System.out.println(s1==s6); //false
        System.out.println(s4==s6);//false
        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s6)); //true


        StringBuffer s= new StringBuffer("Abhinav");
        StringBuffer s11= new StringBuffer("Abhinav");

        System.out.println(s==s11);//false
        System.out.println(s.equals(s11));//false

    }
}
