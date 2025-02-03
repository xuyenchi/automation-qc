package finanOS.register;

import finanOS.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class SignUpInformationPage extends BasePage {
    private static final String Header = "#__next > div > div > div > div > div";
    private static final String Body = "#__next > div > div > div > div > div > div:nth-child(2) > div > form > div";
    /**
     * Header
     */
    @FindBy(css = Header + " > div > div > svg")
    private WebElement BACK_ICON;
    @FindBy(css = Header + " > div > div:nth-child(2)")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + " > div:nth-child(2) > div > form > p")
    private WebElement PAGE_DESCRIPTION;

    /**
     * Body
     */
    @FindBy(css = Body + " > div:nth-child(1) > div > label")
    private WebElement PASSWORD_LABEL;
    @FindBy(css = Body + " > div:nth-child(1) > div > div > input")
    private WebElement PASSWORD_TEXT_BOX;
    @FindBy(css = Body + " > div:nth-child(1) > div > p")
    private WebElement PASSWORD_ERROR_MESSAGE;
    @FindBy(css = Body + " > div:nth-child(2) > div > label")
    private WebElement CONFIRM_PWD_LABEL;
    @FindBy(css = Body + " > div:nth-child(2) > div > div > input")
    private WebElement CONFIRM_PWD_TEXT_BOX;
    @FindBy(css = Body + " > div:nth-child(2) > div > p")
    private WebElement CONFIRM_PWD_ERROR_MESSAGE;
    @FindBy(css = Body + " > div:nth-child(3) > div > label")
    private WebElement BUSINESS_LABEL;
    @FindBy(css = Body + " > div:nth-child(3) > div > div > input")
    private WebElement BUSINESS_TEXT_BOX;
    @FindBy(css = Body + " > div:nth-child(3) > div > p")
    private WebElement BUSINESS_ERROR_MESSAGE;
    @FindBy(css = Body + " > div:nth-child(4) > div > label")
    private WebElement USERNAME_LABEL;
    @FindBy(css = Body + " > div:nth-child(4) > div > div > input")
    private WebElement USERNAME_TEXT_BOX;
    @FindBy(css = Body + " > div:nth-child(4) > div > p")
    private WebElement USERNAME_ERROR_MESSAGE;
    @FindBy(css = Body + " > div:nth-child(5) > span:nth-child(1)")
    private WebElement REFER_LABEL;
    @FindBy(css = Body + " > div:nth-child(5) > span:nth-child(2)")
    private WebElement REFER_HYPERLINK;
    @FindBy(css = Body + " > button")
    private WebElement CONTINUE_BUTTON;

    /** -------------------------------- OTP POPUP ------------------------------- */
    @FindBy(css = "div.rs-modal-header > h4")
    private WebElement POPUP_TITLE;
    @FindBy(css = "div.rs-modal-header > span > svg")
    private WebElement POPUP_CLOSE_ICON;
    @FindBy(css = "div.rs-modal-header > p")
    private WebElement POPUP_DESCRIPTION;
    @FindBy(css = "div.rs-modal-body > div.otp > input[type=number]")
    private WebElement POPUP_OTP;
    @FindBy(css = "div.rs-modal-body > div > div")
    private WebElement POPUP_TIMEOUT;
    /**
     * ==============================================================================================================
     * Constructor
     */
    public SignUpInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: BACK_ICON
     */
    public boolean isDisplayBackIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = BACK_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BACK_ICON");
        }
        return isDisplay;
    }
    public void clickOnBackIcon() {
        try {
            BACK_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of BACK_ICON");
        }
    }

    /**
     * Object: PAGE_TITLE
     */
    public boolean isDisplayPageTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = PAGE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAGE_TITLE");
        }
        return isDisplay;
    }
    public String getPageTitle() {
        String text = "";
        try {
            text = PAGE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAGE_TITLE");
        }
        return text;
    }

    /**
     * Object: PAGE_DESCRIPTION
     */
    public boolean isDisplayPageDescription() {
        boolean isDisplay = false;
        try {
            isDisplay = PAGE_DESCRIPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAGE_DESCRIPTION");
        }
        return isDisplay;
    }
    public String getPageDescription() {
        String text = "";
        try {
            text = PAGE_DESCRIPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of PAGE_DESCRIPTION");
        }
        return text;
    }

    /**
     * Object: PASSWORD_LABEL
     */
    public boolean isDisplayPasswordLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PASSWORD_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_LABEL");
        }
        return isDisplay;
    }
    public String getPasswordLabel() {
        String text = "";
        try {
            text = PASSWORD_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_LABEL");
        }
        return text;
    }

    /**
     * Object: PASSWORD_TEXT_BOX
     */
    public boolean isDisplayPasswordTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = PASSWORD_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_TEXT_BOX");
        }
        return isDisplay;
    }
    public String getPasswordTextBox() {
        String text = "";
        try {
            text = PASSWORD_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_TEXT_BOX");
        }
        return text;
    }
    public void clearPasswordTextBox() {
        try {
            PASSWORD_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_TEXT_BOX");
        }
    }
    public void setPasswordTextBox(String text) {
        try {
            PASSWORD_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_TEXT_BOX");
        }
    }

    /**
     * Object: PASSWORD_ERROR_MESSAGE
     */
    public boolean isDisplayPasswordErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = PASSWORD_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getPasswordErrorMessage() {
        String text = "";
        try {
            text = PASSWORD_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of PASSWORD_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: CONFIRM_PWD_LABEL
     */
    public boolean isDisplayConfirmPwdLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CONFIRM_PWD_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_LABEL");
        }
        return isDisplay;
    }
    public String getConfirmPwdLabel() {
        String text = "";
        try {
            text = CONFIRM_PWD_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_LABEL");
        }
        return text;
    }

    /**
     * Object: CONFIRM_PWD_TEXT_BOX
     */
    public boolean isDisplayConfirmPwdTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = CONFIRM_PWD_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_TEXT_BOX");
        }
        return isDisplay;
    }
    public String getConfirmPwdTextBox() {
        String text = "";
        try {
            text = CONFIRM_PWD_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_TEXT_BOX");
        }
        return text;
    }
    public void clearConfirmPwdTextBox() {
        try {
            CONFIRM_PWD_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_TEXT_BOX");
        }
    }
    public void setConfirmPwdTextBox(String text) {
        try {
            CONFIRM_PWD_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_TEXT_BOX");
        }
    }

    /**
     * Object: CONFIRM_PWD_ERROR_MESSAGE
     */
    public boolean isDisplayConfirmPwdErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = CONFIRM_PWD_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getConfirmPwdErrorMessage() {
        String text = "";
        try {
            text = CONFIRM_PWD_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_PWD_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: BUSINESS_LABEL
     */
    public boolean isDisplayBusinessLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = BUSINESS_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_LABEL");
        }
        return isDisplay;
    }
    public String getBusinessLabel() {
        String text = "";
        try {
            text = BUSINESS_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_LABEL");
        }
        return text;
    }

    /**
     * Object: BUSINESS_TEXT_BOX
     */
    public boolean isDisplayBusinessTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = BUSINESS_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_TEXT_BOX");
        }
        return isDisplay;
    }
    public String getBusinessTextBox() {
        String text = "";
        try {
            text = BUSINESS_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_TEXT_BOX");
        }
        return text;
    }
    public void clearBusinessTextBox() {
        try {
            BUSINESS_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_TEXT_BOX");
        }
    }
    public void setBusinessTextBox(String text) {
        try {
            BUSINESS_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_TEXT_BOX");
        }
    }

    /**
     * Object: BUSINESS_ERROR_MESSAGE
     */
    public boolean isDisplayBusinessErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = BUSINESS_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getBusinessErrorMessage() {
        String text = "";
        try {
            text = BUSINESS_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: USERNAME_LABEL
     */
    public boolean isDisplayUsernameLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = USERNAME_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_LABEL");
        }
        return isDisplay;
    }
    public String getUsernameLabel() {
        String text = "";
        try {
            text = USERNAME_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_LABEL");
        }
        return text;
    }

    /**
     * Object: USERNAME_TEXT_BOX
     */
    public boolean isDisplayUsernameTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = USERNAME_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_TEXT_BOX");
        }
        return isDisplay;
    }
    public String getUsernameTextBox() {
        String text = "";
        try {
            text = USERNAME_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_TEXT_BOX");
        }
        return text;
    }
    public void clearUsernameTextBox() {
        try {
            USERNAME_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_TEXT_BOX");
        }
    }
    public void setUsernameTextBox(String text) {
        try {
            USERNAME_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of USERNAME_TEXT_BOX");
        }
    }

    /**
     * Object: USERNAME_ERROR_MESSAGE
     */
    public boolean isDisplayUsernameErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = USERNAME_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getUsernameErrorMessage() {
        String text = "";
        try {
            text = USERNAME_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of USERNAME_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: REFER_LABEL
     */
    public boolean isDisplayReferLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = REFER_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of REFER_LABEL");
        }
        return isDisplay;
    }
    public String getReferLabel() {
        String text = "";
        try {
            text = REFER_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of REFER_LABEL");
        }
        return text;
    }

    /**
     * Object: REFER_HYPERLINK
     */
    public boolean isDisplayReferHyperlink() {
        boolean isDisplay = false;
        try {
            isDisplay = REFER_HYPERLINK.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of REFER_HYPERLINK");
        }
        return isDisplay;
    }
    public String getReferHyperlink() {
        String text = "";
        try {
            text = REFER_HYPERLINK.getText();
        } catch (Exception e) {
            Log.addLog("css of REFER_HYPERLINK");
        }
        return text;
    }
    public void clickOnReferHyperlink(){
        try {
            REFER_HYPERLINK.click();
        } catch (Exception e) {
            Log.addLog("css of REFER_HYPERLINK");
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
            Log.addLog("css of CONTINUE_BUTTON");
        }
        return isDisplay;
    }
    public boolean isEnableContinueButton() {
        boolean isEnable = false;
        try {
            isEnable = CONTINUE_BUTTON.isEnabled();
        } catch (Exception e) {
            Log.addLog("css of CONTINUE_BUTTON");
        }
        return isEnable;
    }
    public String getContinueButtonText() {
        String text = "";
        try {
            text = CONTINUE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTINUE_BUTTON");
        }
        return text;
    }
    public void clickOnContinueButton(){
        try {
            CONTINUE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CONTINUE_BUTTON");
        }
    }

    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_TITLE");
        }
        return isDisplay;
    }
    public String getPopupTitle() {
        String text = "";
        try {
            text = POPUP_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_TITLE");
        }
        return text;
    }

    /**
     * Object: POPUP_CLOSE_ICON
     */
    public boolean isDisplayPopupCloseIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_CLOSE_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_CLOSE_ICON");
        }
        return isDisplay;
    }
    public void clickOnPopupCloseIcon(){
        try {
            POPUP_CLOSE_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of POPUP_CLOSE_ICON");
        }
    }

    /**
     * Object: POPUP_DESCRIPTION
     */
    public boolean isDisplayPopupDescription() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_DESCRIPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_DESCRIPTION");
        }
        return isDisplay;
    }
    public String getPopupDescription() {
        String text = "";
        try {
            text = POPUP_DESCRIPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_DESCRIPTION");
        }
        return text;
    }

    /**
     * Object: POPUP_OTP
     */
    public boolean isDisplayPopupInputOTP() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_OTP.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_OTP");
        }
        return isDisplay;
    }
    public void setPopupInputOTP(String otp) {
        try {
            POPUP_OTP.sendKeys(otp);
        } catch (Exception e) {
            Log.addLog("css of POPUP_OTP");
        }
    }

    /**
     * Object: POPUP_TIMEOUT
     */
    public boolean isDisplayPopupTimeout() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_TIMEOUT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_TIMEOUT");
        }
        return isDisplay;
    }
    public String getPopupTimeout() {
        String text = "";
        try {
            text = POPUP_TIMEOUT.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_TIMEOUT");
        }
        return text;
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("thông tin đăng ký");
    }
    public void signUp(String pwd, String businessName, String username){
        if(!getPasswordTextBox().equals("")){
            clearPasswordTextBox();
        }
        setPasswordTextBox(pwd);

        if(!getConfirmPwdTextBox().equals("")){
            clearConfirmPwdTextBox();
        }
        setConfirmPwdTextBox(pwd);

        if(!getBusinessTextBox().equals("")){
            clearBusinessTextBox();
        }
        setBusinessTextBox(businessName);

        if(!getUsernameTextBox().equals("")){
            clearUsernameTextBox();
        }
        setUsernameTextBox(username);

        clickOnContinueButton();
    }
    public boolean isDisplayOTPPopup(){
        return isDisplayPopupTitle() && getPopupTitle().toLowerCase().contains("nhập mã xác thực");
    }
}
