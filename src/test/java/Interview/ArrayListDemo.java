package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    private ArrayList<PinCodeUserInfo> asp;

    public ArrayListDemo() {
        asp = new ArrayList<>();
    }

    public void createPincode(PinCodeUserInfo dp) {
        asp.add(dp);

    }

    public void retreiveArrayList()
    {

    }


    public void updateArrayList()
    {

    }

    public void removeArrayList()
    {

    }

    public String convertArrayLitToString()
    {
        return(asp.toString());
    }

    public ArrayList<String> converStringToArrayList(String s)
    {
        ArrayList<String> as = new ArrayList<String>();
            String[] sar= s.split(",");
        as= (ArrayList<String>) Arrays.asList(sar);
        return as;
    }

    public boolean containsArraylist(String s)
    {
        return(asp.contains(s));
    }

    public int searchArrayList(String s)
    {
        return(asp.indexOf(s));
    }
    public static void main(String[] args) {
        PinCodeUserInfo dp = new PinCodeUserInfo("248140", "uk", "india", true);
        ArrayListDemo asc = new ArrayListDemo();
        asc.createPincode(dp);
        System.out.println(asc.searchArrayList("india"));
        System.out.println(asc.containsArraylist("248"));
        //System.out.println(asp);
        System.out.println(asc.convertArrayLitToString());
    }
}
