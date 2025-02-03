package config;

/**
 * Create By: chaule
 * Create At: 20Jun2023
 * Notes:
 */
public enum Accounts {
    //
    CHAULE("", "","", "", "", "", ""),
    FINAN_STG_1("0907470430", "1207","21112007", "", "", "", ""),
    ;

    private String phone;
    public String getPhone() {
        return phone;
    }
    private String otp;
    public String getOtp() {
        return otp;
    }
    private String password;
    public String getPassword(){
        return password;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    private String city;
    public String getCity() {
        return city;
    }
    private String district;
    public String getDistrict() {
        return district;
    }
    private String address;
    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setOtp(String otp) {
        this.otp = otp;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    private Accounts(String phone, String otp, String pwd, String email, String city, String district, String address) {
        this.phone = phone;
        this.otp = otp;
        this.password = pwd;
        this.email = email;
        this.city = city;
        this.district = district;
        this.address = address;
    }
}
