package finanPage.invoice;

import config.Configs;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Log;

public class FilterPopup extends InvoiceListPage {
    /**
     * ==============================================================================================================
     * Android
     */
    private static final String AndHeader = "";
    private static final String AndBody = "";

    /**
     * [Android] header
     */
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_POPUP_TITLE;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_FROM_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_FROM_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DATE_PICKER;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_TO_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_TO_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DEADLINE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DEADLINE_FROM_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DEADLINE_FROM_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DEADLINE_TO_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DEADLINE_TO_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_STATUS_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DRAFT_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_UNSENT_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SENT_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PARTIAL_PAY_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EXPIRED_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PAID_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_RESET_BUTTON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_APPLY_BUTTON;

    /**
     * ==============================================================================================================
     * IOS
     */
    private static final String IOSHeader = "";
    private static final String IOSBody = "";

    /**
     * [IOS] header
     */
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_POPUP_TITLE;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_FROM_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_FROM_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DATE_PICKER;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_TO_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_TO_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DEADLINE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DEADLINE_FROM_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DEADLINE_FROM_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DEADLINE_TO_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DEADLINE_TO_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_STATUS_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DRAFT_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_UNSENT_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SENT_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PARTIAL_PAY_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EXPIRED_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PAID_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_RESET_BUTTON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_APPLY_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public FilterPopup(AppiumDriver driver) {
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
     * Object: CREATED_LABEL
     */
    public boolean isDisplayCreatedLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_LABEL");
        }
        return isDisplay;
    }

    public String getCreatedLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_LABEL.getText();
            } else {
                text = IOS_CREATED_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_FROM_LABEL
     */
    public boolean isDisplayCreatedFromLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_FROM_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_FROM_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_FROM_LABEL");
        }
        return isDisplay;
    }

    public String getCreatedFromLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_FROM_LABEL.getText();
            } else {
                text = IOS_CREATED_FROM_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_FROM_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_FROM_BOX
     */
    public boolean isDisplayCreatedFromBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_FROM_BOX.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_FROM_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_FROM_BOX");
        }
        return isDisplay;
    }

    public void clickOnCreatedFromBox() {
        try {
            if (Configs.isAndroid) {
                AND_CREATED_FROM_BOX.click();
            } else {
                IOS_CREATED_FROM_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_FROM_BOX");
        }
    }

    /**
     * Object: DATE_PICKER
     */

    /**
     * Object: CREATED_TO_LABEL
     */
    public boolean isDisplayCreatedToLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_TO_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_TO_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_TO_LABEL");
        }
        return isDisplay;
    }

    public String getCreatedToLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_TO_LABEL.getText();
            } else {
                text = IOS_CREATED_TO_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_TO_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_TO_BOX
     */
    public boolean isDisplayCreatedToBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_TO_BOX.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_TO_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_TO_BOX");
        }
        return isDisplay;
    }

    public void clickOnCreatedToBox() {
        try {
            if (Configs.isAndroid) {
                AND_CREATED_TO_BOX.click();
            } else {
                IOS_CREATED_TO_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_TO_BOX");
        }
    }

    /**
     * Object: DEADLINE_LABEL
     */
    public boolean isDisplayDeadlineLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DEADLINE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_DEADLINE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_LABEL");
        }
        return isDisplay;
    }

    public String getDeadlineLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DEADLINE_LABEL.getText();
            } else {
                text = IOS_DEADLINE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_LABEL");
        }
        return text;
    }

    /**
     * Object: DEADLINE_FROM_LABEL
     */
    public boolean isDisplayDeadlineFromLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DEADLINE_FROM_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_DEADLINE_FROM_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_FROM_LABEL");
        }
        return isDisplay;
    }

    public String getDeadlineFromLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DEADLINE_FROM_LABEL.getText();
            } else {
                text = IOS_DEADLINE_FROM_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_FROM_LABEL");
        }
        return text;
    }

    /**
     * Object: DEADLINE_FROM_BOX
     */
    public boolean isDisplayDeadlineFromBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DEADLINE_FROM_BOX.isDisplayed();
            } else {
                isDisplay = IOS_DEADLINE_FROM_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_FROM_BOX");
        }
        return isDisplay;
    }

    public void clickOnDeadlineFromBox() {
        try {
            if (Configs.isAndroid) {
                AND_DEADLINE_FROM_BOX.click();
            } else {
                IOS_DEADLINE_FROM_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_FROM_BOX");
        }
    }

    /**
     * Object: DEADLINE_TO_LABEL
     */
    public boolean isDisplayDeadlineToLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DEADLINE_TO_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_DEADLINE_TO_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_TO_LABEL");
        }
        return isDisplay;
    }

    public String getDeadlineToLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DEADLINE_TO_LABEL.getText();
            } else {
                text = IOS_DEADLINE_TO_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_TO_LABEL");
        }
        return text;
    }

    /**
     * Object: DEADLINE_TO_BOX
     */
    public boolean isDisplayDeadlineToBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DEADLINE_TO_BOX.isDisplayed();
            } else {
                isDisplay = IOS_DEADLINE_TO_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_TO_BOX");
        }
        return isDisplay;
    }

    public void clickOnDeadlineToBox() {
        try {
            if (Configs.isAndroid) {
                AND_DEADLINE_TO_BOX.click();
            } else {
                IOS_DEADLINE_TO_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DEADLINE_TO_BOX");
        }
    }

    /**
     * Object: STATUS_LABEL
     */
    public boolean isDisplayStatusLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_STATUS_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_STATUS_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of STATUS_LABEL");
        }
        return isDisplay;
    }

    public String getStatusLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_STATUS_LABEL.getText();
            } else {
                text = IOS_STATUS_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of STATUS_LABEL");
        }
        return text;
    }

    /**
     * Object: DRAFT_STATUS
     */
    public boolean isDisplayDraftStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DRAFT_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_DRAFT_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DRAFT_STATUS");
        }
        return isDisplay;
    }

    public String getDraftStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DRAFT_STATUS.getText();
            } else {
                text = IOS_DRAFT_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DRAFT_STATUS");
        }
        return text;
    }

    public void clickOnDraftStatus() {
        try {
            if (Configs.isAndroid) {
                AND_DRAFT_STATUS.click();
            } else {
                IOS_DRAFT_STATUS.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DRAFT_STATUS");
        }
    }

    /**
     * Object: UNSENT_STATUS
     */
    public boolean isDisplayUnsentStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_UNSENT_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_UNSENT_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of UNSENT_STATUS");
        }
        return isDisplay;
    }

    public String getUnsentStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_UNSENT_STATUS.getText();
            } else {
                text = IOS_UNSENT_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of UNSENT_STATUS");
        }
        return text;
    }

    public void clickOnUnsentStatus() {
        try {
            if (Configs.isAndroid) {
                AND_UNSENT_STATUS.click();
            } else {
                IOS_UNSENT_STATUS.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of UNSENT_STATUS");
        }
    }

    /**
     * Object: SENT_STATUS
     */
    public boolean isDisplaySentStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SENT_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_SENT_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SENT_STATUS");
        }
        return isDisplay;
    }

    public String getSentStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SENT_STATUS.getText();
            } else {
                text = IOS_SENT_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SENT_STATUS");
        }
        return text;
    }

    public void clickOnSentStatus() {
        try {
            if (Configs.isAndroid) {
                AND_SENT_STATUS.click();
            } else {
                IOS_SENT_STATUS.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SENT_STATUS");
        }
    }

    /**
     * Object: PARTIAL_PAY_STATUS
     */
    public boolean isDisplayPartialPayStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PARTIAL_PAY_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_PARTIAL_PAY_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PARTIAL_PAY_STATUS");
        }
        return isDisplay;
    }

    public String getPartialPayStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PARTIAL_PAY_STATUS.getText();
            } else {
                text = IOS_PARTIAL_PAY_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PARTIAL_PAY_STATUS");
        }
        return text;
    }

    public void clickOnPartialPayStatus() {
        try {
            if (Configs.isAndroid) {
                AND_PARTIAL_PAY_STATUS.click();
            } else {
                IOS_PARTIAL_PAY_STATUS.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PARTIAL_PAY_STATUS");
        }
    }

    /**
     * Object: EXPIRED_STATUS
     */
    public boolean isDisplayExpiredStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EXPIRED_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_EXPIRED_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_STATUS");
        }
        return isDisplay;
    }

    public String getExpiredStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EXPIRED_STATUS.getText();
            } else {
                text = IOS_EXPIRED_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_STATUS");
        }
        return text;
    }

    public void clickOnExpiredStatus() {
        try {
            if (Configs.isAndroid) {
                AND_EXPIRED_STATUS.click();
            } else {
                IOS_EXPIRED_STATUS.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_STATUS");
        }
    }

    /**
     * Object: PAID_STATUS
     */
    public boolean isDisplayPaidStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PAID_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_PAID_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAID_STATUS");
        }
        return isDisplay;
    }

    public String getPaidStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PAID_STATUS.getText();
            } else {
                text = IOS_PAID_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAID_STATUS");
        }
        return text;
    }

    public void clickOnPaidStatus() {
        try {
            if (Configs.isAndroid) {
                AND_PAID_STATUS.click();
            } else {
                IOS_PAID_STATUS.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAID_STATUS");
        }
    }

    /**
     * Object: RESET_BUTTON
     */
    public boolean isDisplayResetButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_RESET_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_RESET_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of RESET_BUTTON");
        }
        return isDisplay;
    }

    public String getResetButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_RESET_BUTTON.getText();
            } else {
                text = IOS_RESET_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of RESET_BUTTON");
        }
        return text;
    }

    public void clickOnResetButton() {
        try {
            if (Configs.isAndroid) {
                AND_RESET_BUTTON.click();
            } else {
                IOS_RESET_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of RESET_BUTTON");
        }
    }

    /**
     * Object: APPLY_BUTTON
     */
    public boolean isDisplayApplyButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_APPLY_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_APPLY_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of APPLY_BUTTON");
        }
        return isDisplay;
    }

    public String getApplyButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_APPLY_BUTTON.getText();
            } else {
                text = IOS_APPLY_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of APPLY_BUTTON");
        }
        return text;
    }

    public void clickOnApplyButton() {
        try {
            if (Configs.isAndroid) {
                AND_APPLY_BUTTON.click();
            } else {
                IOS_APPLY_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of APPLY_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplaySearchIcon() && isDisplayPopupTitle() && getPopupTitle().toLowerCase().contains("bộ lọc");
    }
}
