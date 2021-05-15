package RandomQuestions;

public class emphaseEnergy {
    public void stringfunc()
    {
        String str="abcdefg";
        int len = str.length();
        System.out.println(str.charAt(0));
        System.out.println(len-2);
        System.out.println(str.charAt(len-1));
                 System.out.println(str.charAt(0) + " " + (str.length()-2) + " "+str.charAt(len-1));
    }
    public static void main(String[] args)
    {
        System.out.println("yes");
        emphaseEnergy x= new emphaseEnergy();
        x.stringfunc();
      //  x.Replace0with5();
    }

    public void Replace0with5()
    {
        int x=1020;
        int digitPlace=1;
        int newSum=0;
        int temp=x;
        while(x!=0)
        {
            if((x%10)==0)
            {
                newSum=newSum+ 5*digitPlace;
            }

            x=x/10;
            digitPlace=digitPlace*10;
        }
        System.out.println(temp+newSum);
    }
}
