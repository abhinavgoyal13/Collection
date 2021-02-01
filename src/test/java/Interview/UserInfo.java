package Interview;

/**
 * POJO :
 */
public class UserInfo {
    private String name;
    private String emailId;
    private int phoneNumber;

    /**
     * class initialisation
     *
     * @param name
     * @param emailId
     */
    public UserInfo(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = 0;
    }

    public UserInfo(String name, String emailId, int phoneNumber) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
