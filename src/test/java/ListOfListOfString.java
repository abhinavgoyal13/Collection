import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListOfListOfString {
@Test
    public void selectAutoSuggestive()
    {
        ArrayList<ArrayList<String>> ls = new ArrayList<ArrayList<String>>();
        ArrayList<String> as= new ArrayList<>();
        as.add("a");
        as.add("b");
        as.add("c");
ls.add(as);
        ArrayList<String> as1= new ArrayList<>();
        as1.add("1");
        as1.add("2");
        as1.add("3");

        ls.add(as1);

        for(ArrayList<String> ls1 : ls)
        {
for(String s:ls1)
{
    System.out.println(s);
}
        }





    }
}
