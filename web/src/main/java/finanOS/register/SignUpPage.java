package finanOS.register;

import finanOS.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class SignUpPage extends BasePage {
    private static final String Header = "#__next > div > div > div > div > div > div";
    private static final String Body = "#__next > div > div > div > div > div > div:nth-child(2) > div > div";

    /**
     * Header
     */
    @FindBy(css = Header + " > div > svg")
    private WebElement BACK_ICON;
    @FindBy(css = Header + " > div:nth-child(2)")
    private WebElement PAGE_TITLE;

    /**
     * Body
     */
    @FindBy(css = Body + " > div > a > div")
    private WebElement PHONE_TAB;
    @FindBy(css = Body + " > div > a:nth-child(2) > div")
    private WebElement EMAIL_TAB;
    @FindBy(css = Body + " > form > div > div > div > div > input")
    private WebElement TEXT_BOX;
    @FindBy(css = Body + " > form > div > div > div > p")
    private WebElement ERROR_MESSAGE;
    @FindBy(css = Body + " > form > div > button")
    private WebElement CONTINUE_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public SignUpPage(WebDriver driver) {
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
     * Object: PHONE_TAB
     */
    public boolean isDisplayPhoneTab() {
        boolean isDisplay = false;
        try {
            isDisplay = PHONE_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PHONE_TAB");
        }
        return isDisplay;
    }
    public String getPhoneTabText() {
        String text = "";
        try {
            text = PHONE_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of PHONE_TAB");
        }
        return text;
    }
    public void clickOnPhoneTab() {
        try {
            PHONE_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of PHONE_TAB");
        }
    }

    /**
     * Object: EMAIL_TAB
     */
    public boolean isDisplayEmailTab() {
        boolean isDisplay = false;
        try {
            isDisplay = EMAIL_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TAB");
        }
        return isDisplay;
    }
    public String getEmailTabText() {
        String text = "";
        try {
            text = EMAIL_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TAB");
        }
        return text;
    }
    public void clickOnEmailTab() {
        try {
            EMAIL_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TAB");
        }
    }

    /**
     * Object: TEXT_BOX
     */
    public boolean isDisplayTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TEXT_BOX");
        }
        return isDisplay;
    }
    public String getTextBox() {
        String text = "";
        try {
            text = TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of TEXT_BOX");
        }
        return text;
    }
    public void clearTextBox() {
        try {
            TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of TEXT_BOX");
        }
    }
    public void setTextBox(String text) {
        try {
            TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of TEXT_BOX");
        }
    }

    /**
     * Object: ERROR_MESSAGE
     */
    public boolean isDisplayErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getErrorMessage() {
        String text = "";
        try {
            text = ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of ERROR_MESSAGE");
        }
        return text;
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
    public boolean isEnableContinueButton(){
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
    public void clickOnContinueButton() {
        try {
            CONTINUE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CONTINUE_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        // should handle better after applying language
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("đăng ký");
    }
}
