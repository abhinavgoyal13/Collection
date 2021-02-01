package Interview;

import java.util.HashMap;
import java.util.List;

public class UserRegistration {

    // key would be something unique
    private HashMap<String, UserInfo> userInfoHashMap;
    private List<HashMap<String , UserInfo>> hashMapList;

    public UserRegistration() {
        userInfoHashMap = new HashMap<>();
    }

    public void registerUser(UserInfo userInfo) {
        this.userInfoHashMap.put(userInfo.getEmailId(), userInfo);
    }

    public UserInfo showDetail(String emailId) {
        return this.userInfoHashMap.get(emailId);
    }

    public void deleteDetails(String emailId) {
        this.userInfoHashMap.remove(emailId);
    }

    public static void main(String[] args) {
        UserInfo abhinavGoyal = new UserInfo("abhinavgoyal", "abhinav@gmail.com");
        UserInfo abhilashGoyal = new UserInfo("abhilashgoyal", "abhilash@gmail.com");
        UserInfo shanviGoyal = new UserInfo("abhilashgoyal", "abhilash@gmail.com",12232434);


        UserRegistration userRegistration = new UserRegistration();

        userRegistration.registerUser(abhinavGoyal);
        userRegistration.registerUser(abhilashGoyal);

        UserInfo x = userRegistration.showDetail("abhinav@gmail.com");
        System.out.println(x.getName() + "  " + x.getEmailId());


    }

}
