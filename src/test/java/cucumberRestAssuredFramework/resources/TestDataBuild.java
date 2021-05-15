package cucumberRestAssuredFramework.resources;

import pojo.AddPlace;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public AddPlace AddPlacePayLoad()
    {
        List<String> myTypes= new ArrayList<>();
        myTypes.add("Shoe Park");
        myTypes.add("Shoe");
        AddPlace ap= new AddPlace();
        ap.setAccuracy(50);
        ap.setAddress("29, side layout, cohen 09");
        ap.setName("Frontline house");
        ap.setPhone_number("(+91) 983 893 3937");
        ap.setTypes(myTypes);
        ap.setLanguage("French-IN");
        ap.setWebsite("http://google.com");

        Location ls1= new Location();
        ls1.setLat(-38.383494);
        ls1.setLng(33.427362);
        ap.setLs(ls1);
        return ap;
    }
}
