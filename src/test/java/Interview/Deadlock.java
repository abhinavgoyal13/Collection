package Interview;

public class Deadlock {
    public static void main(String[] args)
    {
        final String s1="ABhinav";
        final String s2="Ashu";

        Thread t1= new Thread()
        {
            public void run()
            {
                synchronized(s1)
                {
                    System.out.println(s1);
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized(s2)
                {
                    System.out.println(s2);
                }

            }

        };

        Thread t2= new Thread()
        {
            public void run()
            {
                synchronized (s2)
                {
                    System.out.println(s2);
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s1)
                {
                    System.out.println(s1);
                }
            }
        };

        t1.start();
        t2.start();

    }
}
