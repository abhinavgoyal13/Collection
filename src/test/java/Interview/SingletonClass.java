package Interview;

public class SingletonClass {

    private static SingletonClass sngletonClass= null;
    private SingletonClass(){

    }

    public static Interview.SingletonClass accessSingleTonClass()
    {
        if(sngletonClass== null)
        {
            synchronized (Interview.SingletonClass.class)
            {
                sngletonClass = new SingletonClass();
            }

        }

        return sngletonClass;
    }

}
