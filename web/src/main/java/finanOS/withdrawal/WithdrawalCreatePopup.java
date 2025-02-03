/* (C)2024 */
package finanOS.withdrawal;

import finanOS.base.Sidebar;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class WithdrawalCreatePopup extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement POPUP_TITLE;
    @FindBy(css = Header + "")
    private WebElement CLOSE_ICON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement FROM_ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private List<WebElement> FROM_ACCOUNT_LIST;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_ERROR_MESSAGE;
    @FindBy(css = Body + "")
    private WebElement TO_ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement TO_ACCOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement CONTENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement CONTENT_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement CONTENT_ERROR_MESSAGE;

    /**
     * Footer
     */
    @FindBy(css = Footer + "")
    private WebElement CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public WithdrawalCreatePopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAGE_TITLE");
        }
        return isDisplay;
    }

    public String getPopupTitle() {
        String text = "";
        try {
            text = POPUP_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAGE_TITLE");
        }
        return text;
    }

    /**
     * Object: CLOSE_ICON
     */
    public boolean isDisplayCloseButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CLOSE_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
        }
        return isDisplay;
    }

    public String getCloseButtonText() {
        String text = "";
        try {
            text = CLOSE_ICON.getText();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
        }
        return text;
    }

    public void clickOnCloseButton() {
        try {
            CLOSE_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
        }
    }

    /**
     * Object: FROM_ACCOUNT_LABEL
     */
    public boolean isDisplayFromAccountLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getFromAccountLabel() {
        String text = "";
        try {
            text = FROM_ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: FROM_ACCOUNT_LIST
     */
    private WebElement getFromAccountElement(int pos) {
        WebElement element = null;
        try {
            element = FROM_ACCOUNT_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_LIST at " + pos);
        }
        return element;
    }

    public int getTotalFromAccountList() {
        int total = 0;
        try {
            total = FROM_ACCOUNT_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_LIST");
        }
        return total;
    }

    public void clickOnFromAccountByPosition(int pos) {
        WebElement element = getFromAccountElement(pos);
        if (element != null) {
            element.click();
        }
    }

    /**
     * Object: AMOUNT_LABEL
     */
    public boolean isDisplayAmountLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getAmountLabel() {
        String text = "";
        try {
            text = AMOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: AMOUNT_TEXT_BOX
     */
    public boolean isDisplayAmountTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getAmountTextBox() {
        String text = "";
        try {
            text = AMOUNT_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_TEXT_BOX");
        }
        return text;
    }

    public void setAmountTextBox(String text) {
        try {
            AMOUNT_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_TEXT_BOX");
        }
    }

    public void clearAmountTextBox() {
        try {
            AMOUNT_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_TEXT_BOX");
        }
    }

    /**
     * Object: AMOUNT_ERROR_MESSAGE
     */
    public boolean isDisplayAmountErrorMsg() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getAmountErrorMsg() {
        String text = "";
        try {
            text = AMOUNT_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: TO_ACCOUNT_LABEL
     */
    public boolean isDisplayToAccountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = TO_ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getToAccountLbl() {
        String text = "";
        try {
            text = TO_ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: TO_ACCOUNT_VALUE
     */
    public boolean isDisplayToAccountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TO_ACCOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getToAccountValue() {
        String text = "";
        try {
            text = TO_ACCOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: CONTENT_LABEL
     */
    public boolean isDisplayContentLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTENT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_LABEL");
        }
        return isDisplay;
    }

    public String getContentLabel() {
        String text = "";
        try {
            text = CONTENT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_LABEL");
        }
        return text;
    }

    /**
     * Object: CONTENT_TEXT_BOX
     */
    public boolean isDisplayContentTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTENT_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getContentTextBox() {
        String text = "";
        try {
            text = CONTENT_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_TEXT_BOX");
        }
        return text;
    }

    public void setContentTextBox(String text) {
        try {
            CONTENT_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of CONTENT_TEXT_BOX");
        }
    }

    public void clearContentTextBox() {
        try {
            CONTENT_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_TEXT_BOX");
        }
    }

    /**
     * Object: CONTENT_ERROR_MESSAGE
     */
    public boolean isDisplayContentErrorMsg() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTENT_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getContentErrorMsg() {
        String text = "";
        try {
            text = CONTENT_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: CONFIRM_BUTTON
     */
    public boolean isDisplayConfirmButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CONFIRM_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_BUTTON");
        }
        return isDisplay;
    }

    public String getConfirmButtonText() {
        String text = "";
        try {
            text = CONFIRM_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_BUTTON");
        }
        return text;
    }

    public void clickOnConfirmButton() {
        try {
            CONFIRM_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPopupTitle() && getPopupTitle().toLowerCase().contains("yêu cầu rút tiền");
    }
}
