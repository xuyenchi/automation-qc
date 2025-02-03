package finanOS.login.owner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import finanOS.base.BasePage;
import utilities.common.Log;


/**
 * Author: Chaule
 * Created date: 16Jun2023
 */


public class LoginPage extends BasePage {
    // Left Page
    private static final String LeftPagePath = "#root > main > div > header";
    @FindBy(css = LeftPagePath + " > div > div > button")
    private WebElement LEFT_LOGO;
    @FindBy(css = LeftPagePath + "")
    private WebElement LEFT_IMAGE;
    @FindBy(css = LeftPagePath + "")
    private WebElement LEFT_SCROLLABLE;
    @FindBy(css = LeftPagePath + "")
    private WebElement LEFT_FOOTER;

    // Right Page
    private static final String RightPagePath = "#__next > div > div > div";
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_FINAN_LOGO;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_PAGE_TITLE;
    /** ----------------------- RIGHT_QR_TAB --------------------------- */
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_QR_TAB;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_QR_DESC;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_QR_CODE;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_QR_HELP_BUTTON;
    /** ----------------------- RIGHT_PHONE_TAB --------------------------- */
    @FindBy(css = RightPagePath + " > div > div > div:nth-child(2) > div > a > div")
    private WebElement RIGHT_PHONE_TAB;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_PHONE_LABEL;
    @FindBy(css = RightPagePath + " > div > div > div:nth-child(2) div > form > div > div > div > div > input")
    private WebElement RIGHT_PHONE_TEXTBOX;
    @FindBy(css = RightPagePath + " > div > div > div:nth-child(2) > div > form > div > button")
    private WebElement CONTINUE_BUTTON;
    /** ----------------------- RIGHT_EMAIL_TAB --------------------------- */
    @FindBy(css = RightPagePath + " > div > div > div:nth-child(2) > div > a:nth-child(2) > div")
    private WebElement RIGHT_EMAIL_TAB;
    /** ----------------------- PASSWORD --------------------------- */
    @FindBy (css = RightPagePath + "")
    private WebElement PWD_BACK_ICON;
    @FindBy (css = RightPagePath + "")
    private WebElement PWD_TITLE;
    @FindBy (css = RightPagePath + "")
    private WebElement PWD_DESCRIPTION;
    @FindBy (css = RightPagePath + "")
    private WebElement PASSWORD_LABEL;
    @FindBy (css = RightPagePath + " > div > div > div:nth-child(2) > div > form > div > div > div > div > input")
    private WebElement PASSWORD_TEXT_BOX;
    @FindBy (css = RightPagePath + "")
    private WebElement FORGOT_PASSWORD;
    @FindBy(css = RightPagePath + " > div > div > div:nth-child(2) > div > form > div > button")
    private WebElement LOGIN_BUTTON;
    @FindBy (css = RightPagePath + " > div > div > div:nth-child(3) > span:nth-child(2)")
    private WebElement SIGN_UP_HYPERLINK;
    /** ----------------------- RIGHT_SOCIALS_TITLE --------------------------- */
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_SOCIALS_TITLE;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_FB_BUTTON;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_GOOGLE_BUTTON;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_ZALO_BUTTON;
    @FindBy(css = RightPagePath + "")
    private WebElement RIGHT_FOOTER;

    // ----------------------------------------
    private static final String Popup = "div.rs-modal-dialog > div";
//    @FindBy(css = Popup)
//    private WebElement OTP_POPUP;
//    @FindBy(css = Popup + " > div.rs-modal-header > h4")
//    private WebElement OTP_POPUP_TITLE;
//    @FindBy(css = Popup + " > div.rs-modal-header > p")
//    private WebElement OTP_POPUP_DESC;
//    @FindBy(css =  Popup + " > div.rs-modal-body > div.otp > input")
//    private WebElement OTP_POPUP_VALUE;
//    @FindBy(css = Popup + " > div.rs-modal-body > div.fl-text-center.fl-mt-5")
//    private WebElement OTP_POPUP_COUNTDOWN;
    @FindBy(css = Popup)
    private WebElement ERROR_MESSAGE_POPUP;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: Phone tab
     */
    public boolean isDisplayPhoneTab() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_PHONE_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Tab - " + e.getMessage());
        }
        return isDisplay;
    }
    public String getPhoneTabText() {
        String text = "";
        try {
            text = RIGHT_PHONE_TAB.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Tab");
        }
        return text;
    }
    public void clickOnPhoneTab() {
        try {
            RIGHT_PHONE_TAB.click();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Tab");
        }
    }

    /**
     * Object: Phone Label
     */
    public boolean isDisplayPhoneLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_PHONE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Label");
        }
        return isDisplay;
    }
    public String getPhoneLabel() {
        String text = "";
        try {
            text = RIGHT_PHONE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Label");
        }
        return text;
    }

    /**
     * Object: Phone Text Box
     */
    public boolean isDisplayPhoneTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_PHONE_TEXTBOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box");
        }
        return isDisplay;
    }
    public String getPhoneTextBoxValue() {
        String text = "";
        try {
            text = RIGHT_PHONE_TEXTBOX.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box");
        }
        return text;
    }
    public void clearPhoneTextBox() {
        try {
            RIGHT_PHONE_TEXTBOX.clear();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box");
        }
    }
    public void setPhoneTextBox(String phoneNumber){
        try {
            RIGHT_PHONE_TEXTBOX.sendKeys(phoneNumber);
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box");
        }
    }

    /**
     * Object: Email tab
     */
    public boolean isDisplayEmailTab() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_EMAIL_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Email Tab");
        }
        return isDisplay;
    }
    public String getEmailTabText() {
        String text = "";
        try {
            text = RIGHT_EMAIL_TAB.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Email Tab");
        }
        return text;
    }
    public void clickOnEmailTab() {
        try {
            RIGHT_EMAIL_TAB.click();
        } catch (Exception e) {
            Log.addLog("cssSelector of Email Tab");
        }
    }

    /**
     * Object: Email Label
     */
    public boolean isDisplayEmailLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_PHONE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Label (Email use the same css)");
        }
        return isDisplay;
    }
    public String getEmailLabel() {
        String text = "";
        try {
            text = RIGHT_PHONE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Label (Email use the same css)");
        }
        return text;
    }

    /**
     * Object: Email Text Box
     */
    public boolean isDisplayEmailTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_PHONE_TEXTBOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box (Email use the same css)");
        }
        return isDisplay;
    }
    public String getEmailTextBoxValue() {
        String text = "";
        try {
            text = RIGHT_PHONE_TEXTBOX.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box (Email use the same css)");
        }
        return text;
    }
    public void clearEmailTextBox() {
        try {
            RIGHT_PHONE_TEXTBOX.clear();
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box (Email use the same css)");
        }
    }
    public void setEmailTextBox(String email){
        try {
            RIGHT_PHONE_TEXTBOX.sendKeys(email);
        } catch (Exception e) {
            Log.addLog("cssSelector of Phone Text Box (Email use the same css)");
        }
    }

    /**
     * Object: QR tab
     */
    public boolean isDisplayQRTab() {
        boolean isDisplay = false;
        try {
            isDisplay = RIGHT_QR_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of QR Tab");
        }
        return isDisplay;
    }
    public String getQRTabText() {
        String text = "";
        try {
            text = RIGHT_QR_TAB.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of QR Tab");
        }
        return text;
    }
    public void clickOnQRTab() {
        try {
            RIGHT_QR_TAB.click();
        } catch (Exception e) {
            Log.addLog("cssSelector of QR Tab");
        }
    }

    /**
     * Object: CONTINUE_BUTTON
     */
    public boolean isDisplayContinueButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTINUE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of CONTINUE_BUTTON");
        }
        return isDisplay;
    }
    public String getContinueButtonText() {
        String text = "";
        try {
            text = CONTINUE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of CONTINUE_BUTTON");
        }
        return text;
    }
    public void clickOnContinueButton() {
        String text = "";
        try {
            CONTINUE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("cssSelector of CONTINUE_BUTTON");
        }
    }

//    /**
//     * Object: OTP Popup
//     */
//    public boolean isDisplayOtpPopup(){
//        boolean isDisplay = false;
//        try{
//            isDisplay = OTP_POPUP.isDisplayed();
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup");
//        }
//        return isDisplay;
//    }
//
//    /**
//     * Object: OTP Popup - Title
//     */
//    public boolean isDisplayOTPPopupTitle(){
//        boolean isDisplay = false;
//        try{
//            isDisplay = OTP_POPUP_TITLE.isDisplayed();
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup Title");
//        }
//        return isDisplay;
//    }
//    public String getDisplayOTPPopupTitle(){
//        String text = "";
//        try{
//            text = OTP_POPUP_TITLE.getText();
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup Title");
//        }
//        return text;
//    }
//
//    /**
//     * Object: OTP Popup - Desc
//     */
//    public boolean isDisplayOTPPopupDesc(){
//        boolean isDisplay = false;
//        try{
//            isDisplay = OTP_POPUP_DESC.isDisplayed();
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup Desc");
//        }
//        return isDisplay;
//    }
//    public String getDisplayOTPPopupDesc(){
//        String text = "";
//        try{
//            text = OTP_POPUP_DESC.getText();
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup Desc");
//        }
//        return text;
//    }
//
//    /**
//     * Object: OTP Popup - Value
//     */
//    public boolean isDisplayOTPPopupValue(){
//        boolean isDisplay = false;
//        try{
//            isDisplay = OTP_POPUP_VALUE.isDisplayed();
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup Value");
//        }
//        return isDisplay;
//    }
//    public void setOTP(String otp){
//        try{
//            OTP_POPUP_VALUE.sendKeys(otp);
//        } catch (Exception e){
//            Log.addLog("cssSelector of OTP Popup Value");
//        }
//    }

    /**
     * Object: Password Label
     */
    public boolean isDisplayPasswordTitle(){
        boolean isDisplay = false;
        try{
            isDisplay = PASSWORD_LABEL.isDisplayed();
        } catch (Exception e){
            Log.addLog("cssSelector of Password Label");
        }
        return isDisplay;
    }
    public String getPassWordTitle(){
        String text = "";
        try{
            text = PASSWORD_LABEL.getText();
        } catch (Exception e){
            Log.addLog("cssSelector of Password Label");
        }
        return text;
    }

    /**
     * Object: Password Textbox
     */
    public boolean isDisplayPwdTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = PASSWORD_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("cssSelector of Password Text Box");
        }
        return isDisplay;
    }
    public String getPwdTextBoxValue() {
        String text = "";
        try {
            text = PASSWORD_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("cssSelector of Password Text Box");
        }
        return text;
    }
    public void clearPwdTextBox() {
        try {
            PASSWORD_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("cssSelector of Password Text Box");
        }
    }
    public void setPwdTextBox(String phoneNumber){
        try {
            PASSWORD_TEXT_BOX.sendKeys(phoneNumber);
        } catch (Exception e) {
            Log.addLog("cssSelector of Password Text Box");
        }
    }

    /**
     * Object: Error Message
     */
    public boolean isDisplayErrorMessagePopup(){
        boolean isDisplay = false;
        try {
            isDisplay = ERROR_MESSAGE_POPUP.isDisplayed();
        } catch (Exception e){
            Log.addLog("cssSelector of Error Message");
        }
        return isDisplay;
    }
    public String getErrorMessage(){
        String text = "";
        try {
            text = ERROR_MESSAGE_POPUP.getText();
        } catch (Exception e){
            Log.addLog("cssSelector of Error Message");
        }
        return text;
    }

    /**
     * Object: Forgot Pwd
     */
    public boolean isDisplayForgotPwdLink(){
        boolean isDisplay = false;
        try {
            isDisplay = FORGOT_PASSWORD.isDisplayed();
        } catch (Exception e){
            Log.addLog("cssSelector of Forgot Pwd");
        }
        return isDisplay;
    }
    public String getForgotPwdText(){
        String text = "";
        try {
            text = FORGOT_PASSWORD.getText();
        } catch (Exception e){
            Log.addLog("cssSelector of Forgot Pwd");
        }
        return text;
    }
    public void clickOnForgotPwdLink(){
        try {
            FORGOT_PASSWORD.click();
        } catch (Exception e){
            Log.addLog("cssSelector of Forgot Pwd");
        }
    }

    /**
     * Object: LOGIN_BUTTON
     */
    public boolean isDisplayLoginButton(){
        boolean isDisplay = false;
        try {
            isDisplay = LOGIN_BUTTON.isDisplayed();
        } catch (Exception e){
            Log.addLog("cssSelector of LOGIN_BUTTON");
        }
        return isDisplay;
    }
    public String getLoginButton(){
        String text = "";
        try {
            text = LOGIN_BUTTON.getText();
        } catch (Exception e){
            Log.addLog("cssSelector of LOGIN_BUTTON");
        }
        return text;
    }
    public void clickOnLoginButton(){
        try {
            LOGIN_BUTTON.click();
        } catch (Exception e){
            Log.addLog("cssSelector of LOGIN_BUTTON");
        }
    }

    /**
     * Object: Signup Hyperlink
     */
    public boolean isDisplaySignUpLink(){
        boolean isDisplay = false;
        try {
            isDisplay = SIGN_UP_HYPERLINK.isDisplayed();
        } catch (Exception e){
            Log.addLog("cssSelector of Signup Hyperlink");
        }
        return isDisplay;
    }
    public String getSignUpLinkText(){
        String text = "";
        try {
            text = SIGN_UP_HYPERLINK.getText();
        } catch (Exception e){
            Log.addLog("cssSelector of Signup Hyperlink");
        }
        return text;
    }
    public void clickOnSignUpLink(){
        try {
            SIGN_UP_HYPERLINK.click();
        } catch (Exception e){
            Log.addLog("cssSelector of Signup Hyperlink");
        }
    }

    /**
     * Object: Facebook icon
     */

    /**
     * Object: Google icon
     */

    /**
     * Object: Zalo icon
     */

    /**
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPhoneTab() && isDisplayContinueButton();
    }
}


