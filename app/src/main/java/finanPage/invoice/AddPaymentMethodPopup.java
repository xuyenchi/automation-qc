package finanPage.invoice;

import config.Configs;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Log;

import java.util.List;

public class AddPaymentMethodPopup extends CreateInvoicePage{
    /**
     * ==============================================================================================================
     * Android
     */
    private static final String AndHeader = "";
    private static final String AndBody = "";
    private static final String AndFooter = "";

    /**
     * [Android] header
     */
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_POPUP_TITLE;
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_CLOSE_POPUP_ICON;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_PAYMENT_LIST;
    private static final String AndCheckpointIcon = "";
    private static final String AndPaymentName = "";

    /**
     * [Android] footer
     */
    @FindBy(xpath = AndFooter + "")
    private WebElement AND_CANCEL_BUTTON;
    @FindBy(xpath = AndFooter + "")
    private WebElement AND_CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * iOS
     */
    private static final String IOSHeader = "";
    private static final String IOSBody = "";
    private static final String IOSFooter = "";

    /**
     * [IOS] header
     */
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_POPUP_TITLE;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_CLOSE_POPUP_ICON;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_PAYMENT_LIST;
    private static final String IOSCheckpointIcon = "";
    private static final String IOSPaymentName = "";

    /**
     * [IOS] footer
     */
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_CANCEL_BUTTON;
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_CONFIRM_BUTTON;
    
    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public AddPaymentMethodPopup(AppiumDriver driver) {
        super(driver);
    }

    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_POPUP_TITLE.isDisplayed();
            } else {
                isDisplay = IOS_POPUP_TITLE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of POPUP_TITLE");
        }
        return isDisplay;
    }

    public String getPopupTitle() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_POPUP_TITLE.getText();
            } else {
                text = IOS_POPUP_TITLE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of POPUP_TITLE");
        }
        return text;
    }

    /**
     * Object: CLOSE_POPUP_ICON
     */
    public boolean isDisplayClosePopupIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CLOSE_POPUP_ICON.isDisplayed();
            } else {
                isDisplay = IOS_CLOSE_POPUP_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CLOSE_POPUP_ICON");
        }
        return isDisplay;
    }
    public void clickOnClosePopupIcon() {
        try {
            if (Configs.isAndroid) {
                AND_CLOSE_POPUP_ICON.click();
            } else {
                IOS_CLOSE_POPUP_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CLOSE_POPUP_ICON");
        }
    }

    /**
     * Object:
     */
    public void clearElementName() {
        try {
            if (Configs.isAndroid) {
                AND_HEADER_ELEMENT_NAME.clear();
            } else {
                IOS_HEADER_ELEMENT_NAME.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ELEMENT_NAME");
        }
    }

    public void setElementName(String text) {
        try {
            if (Configs.isAndroid) {
                AND_HEADER_ELEMENT_NAME.sendKeys(text);
            } else {
                IOS_HEADER_ELEMENT_NAME.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of ELEMENT_NAME");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayElementName();
    }
}
