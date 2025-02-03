package finanPage.login;

import config.Configs;
import finanCommon.FinanBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Log;

public class InputPhoneOrEmailPage extends FinanBase {
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
    private WebElement AND_PAGE_TITLE;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EMAIL_OR_PHONE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EMAIL_OR_PHONE_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EMAIL_OR_PHONE_ERROR_MESSAGE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SWITCH_EMAIL_OR_PHONE_HYPERLINK;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CONTINUE_BUTTON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SIGNUP_HYPERLINK;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SOCIAL_LOGIN_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_FB_ICON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_GOOGLE_ICON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ZALO_ICON;

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
    private WebElement IOS_PAGE_TITLE;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EMAIL_OR_PHONE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EMAIL_OR_PHONE_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EMAIL_OR_PHONE_ERROR_MESSAGE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SWITCH_EMAIL_OR_PHONE_HYPERLINK;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CONTINUE_BUTTON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SIGNUP_HYPERLINK;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SOCIAL_LOGIN_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_FB_ICON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_GOOGLE_ICON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ZALO_ICON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public InputPhoneOrEmailPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: PAGE_TITLE
     */
    public boolean isDisplayPageTitle() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PAGE_TITLE.isDisplayed();
            } else {
                isDisplay = IOS_PAGE_TITLE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAGE_TITLE");
        }
        return isDisplay;
    }

    public String getPageTitle() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PAGE_TITLE.getText();
            } else {
                text = IOS_PAGE_TITLE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAGE_TITLE");
        }
        return text;
    }

    /**
     * Object: EMAIL_OR_PHONE_LABEL
     */
    public boolean isDisplayEmailOrPhoneLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EMAIL_OR_PHONE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_EMAIL_OR_PHONE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_LABEL");
        }
        return isDisplay;
    }

    public String getEmailOrPhoneLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EMAIL_OR_PHONE_LABEL.getText();
            } else {
                text = IOS_EMAIL_OR_PHONE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_LABEL");
        }
        return text;
    }

    /**
     * Object: EMAIL_OR_PHONE_BOX
     */
    public boolean isDisplayEmailOrPhoneBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EMAIL_OR_PHONE_BOX.isDisplayed();
            } else {
                isDisplay = IOS_EMAIL_OR_PHONE_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_BOX");
        }
        return isDisplay;
    }

    public String getEmailOrPhoneBox() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EMAIL_OR_PHONE_BOX.getText();
            } else {
                text = IOS_EMAIL_OR_PHONE_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_BOX");
        }
        return text;
    }

    public void setEmailOrPhoneBox(String emailOrPhone) {
        try {
            if (Configs.isAndroid) {
                AND_EMAIL_OR_PHONE_BOX.sendKeys(emailOrPhone);
            } else {
                IOS_EMAIL_OR_PHONE_BOX.sendKeys(emailOrPhone);
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_BOX");
        }
    }

    public void clearEmailOrPhoneBox() {
        try {
            if (Configs.isAndroid) {
                AND_EMAIL_OR_PHONE_BOX.clear();
            } else {
                IOS_EMAIL_OR_PHONE_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_BOX");
        }
    }

    /**
     * Object: EMAIL_OR_PHONE_ERROR_MESSAGE
     */
    public boolean isDisplayEmailOrPhoneErrorMessage() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EMAIL_OR_PHONE_ERROR_MESSAGE.isDisplayed();
            } else {
                isDisplay = IOS_EMAIL_OR_PHONE_ERROR_MESSAGE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getEmailOrPhoneErrorMessage() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EMAIL_OR_PHONE_ERROR_MESSAGE.getText();
            } else {
                text = IOS_EMAIL_OR_PHONE_ERROR_MESSAGE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMAIL_OR_PHONE_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: SWITCH_EMAIL_OR_PHONE_HYPERLINK
     */
    public boolean isDisplaySwitchEmailOrPhoneHyperLink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SWITCH_EMAIL_OR_PHONE_HYPERLINK.isDisplayed();
            } else {
                isDisplay = IOS_SWITCH_EMAIL_OR_PHONE_HYPERLINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SWITCH_EMAIL_OR_PHONE_HYPERLINK");
        }
        return isDisplay;
    }

    public String getSwitchEmailOrPhoneHyperLink() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SWITCH_EMAIL_OR_PHONE_HYPERLINK.getText();
            } else {
                text = IOS_SWITCH_EMAIL_OR_PHONE_HYPERLINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SWITCH_EMAIL_OR_PHONE_HYPERLINK");
        }
        return text;
    }

    public void clickOnSwitchEmailOrPhoneHyperLink() {
        try {
            if (Configs.isAndroid) {
                AND_SWITCH_EMAIL_OR_PHONE_HYPERLINK.click();
            } else {
                IOS_SWITCH_EMAIL_OR_PHONE_HYPERLINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SWITCH_EMAIL_OR_PHONE_HYPERLINK");
        }
    }

    /**
     * Object: CONTINUE_BUTTON
     */
    public boolean isDisplayContinueButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CONTINUE_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_CONTINUE_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONTINUE_BUTTON");
        }
        return isDisplay;
    }

    public String getContinueButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CONTINUE_BUTTON.getText();
            } else {
                text = IOS_CONTINUE_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONTINUE_BUTTON");
        }
        return text;
    }

    public void clickOnContinueButton() {
        try {
            if (Configs.isAndroid) {
                AND_CONTINUE_BUTTON.click();
            } else {
                IOS_CONTINUE_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONTINUE_BUTTON");
        }
    }

    /**
     * Object: SIGNUP_HYPERLINK
     */
    public boolean isDisplaySignUpHyperlink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SIGNUP_HYPERLINK.isDisplayed();
            } else {
                isDisplay = IOS_SIGNUP_HYPERLINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SIGNUP_HYPERLINK");
        }
        return isDisplay;
    }

    public String getSignUpHyperlink() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SIGNUP_HYPERLINK.getText();
            } else {
                text = IOS_SIGNUP_HYPERLINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SIGNUP_HYPERLINK");
        }
        return text;
    }

    public void clickOnSignUpHyperlink() {
        try {
            if (Configs.isAndroid) {
                AND_SIGNUP_HYPERLINK.click();
            } else {
                IOS_SIGNUP_HYPERLINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SIGNUP_HYPERLINK");
        }
    }

    /**
     * Object: SOCIAL_LOGIN_LABEL
     */
    public boolean isDisplaySocialLoginLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SOCIAL_LOGIN_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_SOCIAL_LOGIN_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SOCIAL_LOGIN_LABEL");
        }
        return isDisplay;
    }

    public String getSocialLoginLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SOCIAL_LOGIN_LABEL.getText();
            } else {
                text = IOS_SOCIAL_LOGIN_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SOCIAL_LOGIN_LABEL");
        }
        return text;
    }

    /**
     * Object: FB_ICON
     */
    public boolean isDisplayFacebookIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_FB_ICON.isDisplayed();
            } else {
                isDisplay = IOS_FB_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FB_ICON");
        }
        return isDisplay;
    }

    public void clickOnFacebookIcon() {
        try {
            if (Configs.isAndroid) {
                AND_FB_ICON.click();
            } else {
                IOS_FB_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FB_ICON");
        }
    }

    /**
     * Object: GOOGLE_ICON
     */
    public boolean isDisplayGoogleIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_GOOGLE_ICON.isDisplayed();
            } else {
                isDisplay = IOS_GOOGLE_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of GOOGLE_ICON");
        }
        return isDisplay;
    }

    public void clickOnGoogleIcon() {
        try {
            if (Configs.isAndroid) {
                AND_GOOGLE_ICON.click();
            } else {
                IOS_GOOGLE_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of GOOGLE_ICON");
        }
    }

    /**
     * Object: ZALO_ICON
     */
    public boolean isDisplayZaloIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ZALO_ICON.isDisplayed();
            } else {
                isDisplay = IOS_ZALO_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ZALO_ICON");
        }
        return isDisplay;
    }

    public void clickOnZaloIcon() {
        try {
            if (Configs.isAndroid) {
                AND_ZALO_ICON.click();
            } else {
                IOS_ZALO_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ZALO_ICON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay(boolean isEmail) {
        if(isEmail){
            return isDisplayPageTitle() && isDisplayEmailOrPhoneLabel() && getEmailOrPhoneLabel().toLowerCase().equals("email");
        } else {
            return isDisplayPageTitle() && isDisplayEmailOrPhoneLabel() && getEmailOrPhoneLabel().toLowerCase().contains("điện thoại");
        }
    }
}
