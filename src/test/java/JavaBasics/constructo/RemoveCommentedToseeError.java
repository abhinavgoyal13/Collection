package JavaBasics.constructo;

class RemoveCommentedToseeError
{
    private int var;
    /*
    public Class2(int num)
    {
        var=num;
    }*/
    public int getValue()
    {
        return var;
    }
    public static void main(String args[])
    {
        RemoveCommentedToseeError myobj = new RemoveCommentedToseeError();
        System.out.println("value of var is: "+myobj.getValue());
    }
}
