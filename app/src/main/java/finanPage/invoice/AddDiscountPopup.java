package finanPage.invoice;

import config.Configs;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Log;

public class AddDiscountPopup extends CreateInvoicePage {
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
    private WebElement AND_POPUP_CLOSE_ICON;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DISCOUNT_TYPE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PERCENT_DISCOUNT_OPTION;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_FIX_DISCOUNT_OPTION;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DISCOUNT_AMOUNT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DISCOUNT_AMOUNT_BOX;

    /**
     * [Android] footer
     */
    @FindBy(xpath = AndFooter + "")
    private WebElement AND_DELETE_BUTTON;
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
    private WebElement IOS_POPUP_CLOSE_ICON;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DISCOUNT_TYPE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PERCENT_DISCOUNT_OPTION;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_FIX_DISCOUNT_OPTION;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DISCOUNT_AMOUNT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DISCOUNT_AMOUNT_BOX;

    /**
     * [IOS] footer
     */
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_DELETE_BUTTON;
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public AddDiscountPopup(AppiumDriver driver) {
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
     * Object: POPUP_CLOSE_ICON
     */
    public boolean isDisplayClosePopupIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_POPUP_CLOSE_ICON.isDisplayed();
            } else {
                isDisplay = IOS_POPUP_CLOSE_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of POPUP_CLOSE_ICON");
        }
        return isDisplay;
    }

    public void clickOnClosePopupIcon() {
        try {
            if (Configs.isAndroid) {
                AND_POPUP_CLOSE_ICON.click();
            } else {
                IOS_POPUP_CLOSE_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of POPUP_CLOSE_ICON");
        }
    }

    /**
     * Object: DISCOUNT_TYPE_LABEL
     */
    public boolean isDisplayDiscountTypeLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DISCOUNT_TYPE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_DISCOUNT_TYPE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_TYPE_LABEL");
        }
        return isDisplay;
    }

    public String getDiscountTypeLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DISCOUNT_TYPE_LABEL.getText();
            } else {
                text = IOS_DISCOUNT_TYPE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_TYPE_LABEL");
        }
        return text;
    }

    /**
     * Object: PERCENT_DISCOUNT_OPTION
     */
    public boolean isDisplayPercentDiscountOption() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PERCENT_DISCOUNT_OPTION.isDisplayed();
            } else {
                isDisplay = IOS_PERCENT_DISCOUNT_OPTION.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PERCENT_DISCOUNT_OPTION");
        }
        return isDisplay;
    }

    public String getPercentDiscountOption() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PERCENT_DISCOUNT_OPTION.getText();
            } else {
                text = IOS_PERCENT_DISCOUNT_OPTION.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PERCENT_DISCOUNT_OPTION");
        }
        return text;
    }

    public void clickOnPercentDiscountOption() {
        try {
            if (Configs.isAndroid) {
                AND_PERCENT_DISCOUNT_OPTION.click();
            } else {
                IOS_PERCENT_DISCOUNT_OPTION.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PERCENT_DISCOUNT_OPTION");
        }
    }

    /**
     * Object: FIX_DISCOUNT_OPTION
     */
    public boolean isDisplayFixDiscountOption() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_FIX_DISCOUNT_OPTION.isDisplayed();
            } else {
                isDisplay = IOS_FIX_DISCOUNT_OPTION.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FIX_DISCOUNT_OPTION");
        }
        return isDisplay;
    }

    public String getFixDiscountOption() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_FIX_DISCOUNT_OPTION.getText();
            } else {
                text = IOS_FIX_DISCOUNT_OPTION.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FIX_DISCOUNT_OPTION");
        }
        return text;
    }

    public void clickOnFixDiscountOption() {
        try {
            if (Configs.isAndroid) {
                AND_FIX_DISCOUNT_OPTION.click();
            } else {
                IOS_FIX_DISCOUNT_OPTION.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FIX_DISCOUNT_OPTION");
        }
    }

    /**
     * Object: DISCOUNT_AMOUNT_LABEL
     */
    public boolean isDisplayDiscountAmountLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DISCOUNT_AMOUNT_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_DISCOUNT_AMOUNT_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getDiscountAmountLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DISCOUNT_AMOUNT_LABEL.getText();
            } else {
                text = IOS_DISCOUNT_AMOUNT_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: DISCOUNT_AMOUNT_BOX
     */
    public boolean isDisplayDiscountAmountBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DISCOUNT_AMOUNT_BOX.isDisplayed();
            } else {
                isDisplay = IOS_DISCOUNT_AMOUNT_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_AMOUNT_BOX");
        }
        return isDisplay;
    }

    public String getDiscountAmountValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DISCOUNT_AMOUNT_BOX.getText();
            } else {
                text = IOS_DISCOUNT_AMOUNT_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_AMOUNT_BOX");
        }
        return text;
    }

    public void clearDiscountAmountBox() {
        try {
            if (Configs.isAndroid) {
                AND_DISCOUNT_AMOUNT_BOX.clear();
            } else {
                IOS_DISCOUNT_AMOUNT_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_AMOUNT_BOX");
        }
    }

    public void setDiscountAmountBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_DISCOUNT_AMOUNT_BOX.sendKeys(text);
            } else {
                IOS_DISCOUNT_AMOUNT_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_AMOUNT_BOX");
        }
    }

    /**
     * Object: DELETE_BUTTON
     */
    public boolean isDisplayDeleteButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DELETE_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_DELETE_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DELETE_BUTTON");
        }
        return isDisplay;
    }

    public String getDeleteButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DELETE_BUTTON.getText();
            } else {
                text = IOS_DELETE_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DELETE_BUTTON");
        }
        return text;
    }

    public void clickOnDeleteButton() {
        try {
            if (Configs.isAndroid) {
                AND_DELETE_BUTTON.click();
            } else {
                IOS_DELETE_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DELETE_BUTTON");
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

    public String geConfirmButtonText() {
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
        return isDisplayPopupTitle() && getPopupTitle().toLowerCase().equals("thêm giảm giá");
    }
}
