package Interview;

public class PinCodeUserInfo {

    private String pinCode;

    private String state;
    private String country;
    private boolean isDeliverable;

    public PinCodeUserInfo(String pinCode, String state, String country, boolean isDeliverable) {
        this.pinCode = pinCode;

        this.state = state;
        this.country = country;
        this.isDeliverable = isDeliverable;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDeliverable() {
        return isDeliverable;
    }

    public void setDeliverable(boolean deliverable) {
        isDeliverable = deliverable;
    }


}
