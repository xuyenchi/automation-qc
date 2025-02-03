package finanPage.login;

import config.Configs;
import finanCommon.FinanBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Log;

public class InputPasswordPage extends FinanBase {
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
    private WebElement AND_BACK_ICON;
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_PAGE_TITLE;
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_PAGE_DESCRIPTION;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PASSWORD_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PWD_ERROR_MESSAGE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_FORGOT_PWD_HYPERLINK;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CONFIRM_BUTTON;

    /**
     * [Android] footer
     */

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
    private WebElement IOS_BACK_ICON;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_PAGE_TITLE;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_PAGE_DESCRIPTION;

    /**
     * [Android] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PASSWORD_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PWD_ERROR_MESSAGE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_FORGOT_PWD_HYPERLINK;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CONFIRM_BUTTON;

    /**
     * [IOS] footer
     */

    /**
     * ==============================================================================================================
     * Constructor
     */
    public InputPasswordPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: BACK_ICON
     */
    public boolean isDisplayBackIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_BACK_ICON.isDisplayed();
            } else {
                isDisplay = IOS_BACK_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of BACK_ICON");
        }
        return isDisplay;
    }

    public void clickOnBackIcon() {
        try {
            if (Configs.isAndroid) {
                AND_BACK_ICON.click();
            } else {
                IOS_BACK_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of BACK_ICON");
        }
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
     * Object: PAGE_DESCRIPTION
     */
    public boolean isDisplayPageDescription() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PAGE_DESCRIPTION.isDisplayed();
            } else {
                isDisplay = IOS_PAGE_DESCRIPTION.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAGE_DESCRIPTION");
        }
        return isDisplay;
    }

    public String getPageDescription() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PAGE_DESCRIPTION.getText();
            } else {
                text = IOS_PAGE_DESCRIPTION.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAGE_DESCRIPTION");
        }
        return text;
    }

    /**
     * Object: PASSWORD_BOX
     */
    public boolean isDisplayPasswordBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PASSWORD_BOX.isDisplayed();
            } else {
                isDisplay = IOS_PASSWORD_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PASSWORD_BOX");
        }
        return isDisplay;
    }

    public String getPasswordValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PASSWORD_BOX.getText();
            } else {
                text = IOS_PASSWORD_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PASSWORD_BOX");
        }
        return text;
    }

    public void clearPasswordBox() {
        try {
            if (Configs.isAndroid) {
                AND_PASSWORD_BOX.clear();
            } else {
                IOS_PASSWORD_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PASSWORD_BOX");
        }
    }

    public void setPasswordBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_PASSWORD_BOX.sendKeys(text);
            } else {
                IOS_PASSWORD_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of PASSWORD_BOX");
        }
    }

    /**
     * Object: PWD_ERROR_MESSAGE
     */
    public boolean isDisplayPasswordErrorMessage() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PWD_ERROR_MESSAGE.isDisplayed();
            } else {
                isDisplay = IOS_PWD_ERROR_MESSAGE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PWD_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getPasswordErrorMessage() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PWD_ERROR_MESSAGE.getText();
            } else {
                text = IOS_PWD_ERROR_MESSAGE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PWD_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: FORGOT_PWD_HYPERLINK
     */
    public boolean isDisplayForgotPasswordHyperlink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_FORGOT_PWD_HYPERLINK.isDisplayed();
            } else {
                isDisplay = IOS_FORGOT_PWD_HYPERLINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FORGOT_PWD_HYPERLINK");
        }
        return isDisplay;
    }

    public String getForgotPasswordHyperlink() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_FORGOT_PWD_HYPERLINK.getText();
            } else {
                text = IOS_FORGOT_PWD_HYPERLINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FORGOT_PWD_HYPERLINK");
        }
        return text;
    }

    public void clickOnForgotPasswordHyperlink() {
        try {
            if (Configs.isAndroid) {
                AND_FORGOT_PWD_HYPERLINK.click();
            } else {
                IOS_FORGOT_PWD_HYPERLINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FORGOT_PWD_HYPERLINK");
        }
    }

    /**
     * Object: CONFIRM_BUTTON
     */
    public boolean isDisplayConfirmButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CONFIRM_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_CONFIRM_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONFIRM_BUTTON");
        }
        return isDisplay;
    }

    public String getConfirmButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CONFIRM_BUTTON.getText();
            } else {
                text = IOS_CONFIRM_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONFIRM_BUTTON");
        }
        return text;
    }

    public void clickOnConfirmButton() {
        try {
            if (Configs.isAndroid) {
                AND_CONFIRM_BUTTON.click();
            } else {
                IOS_CONFIRM_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONFIRM_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayBackIcon() && isDisplayConfirmButton() && getPageTitle().toLowerCase().contains("mật khẩu");
    }
}
