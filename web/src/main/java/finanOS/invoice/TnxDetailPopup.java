package finanOS.invoice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.common.Log;

public class TnxDetailPopup extends InvoiceDetailPage {
    private static final String Body = "";
    /**
     * ------------------------- Transaction detail popup -------------------------
     */
    @FindBy(css = Body + "")
    private WebElement TRANSACTION_DETAIL_POPUP;
    @FindBy(css = Body + "")
    private WebElement POPUP_TITLE;
    @FindBy(css = Body + "")
    private WebElement CLOSE_ICON;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement TNX_TYPE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TNX_TYPE_VALUE;
    @FindBy(css = Body + "")
    private WebElement CODE_LABEL;
    @FindBy(css = Body + "")
    private WebElement CODE_VALUE;
    @FindBy(css = Body + "")
    private WebElement ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement ACCOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement TYPE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TYPE_VALUE;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement UPDATED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement UPDATED_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement NOTE_LABEL;
    @FindBy(css = Body + "")
    private WebElement NOTE_VALUE;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_VALUE;

    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public TnxDetailPopup(WebDriver driver) {
        super(driver);
    }

    /**
     * Object: TRANSACTION_DETAIL_POPUP
     */
    private WebElement getTransactionDetailPopupElement() {
        WebElement element = null;
        try {
            element = TRANSACTION_DETAIL_POPUP;
        } catch (Exception e) {
            Log.addLog("css of TRANSACTION_DETAIL_POPUP");
        }
        return element;
    }

    public boolean isDisplayTransactionDetailPopup() {
        return isDisplayPageTitle() && getPopupTitle().toLowerCase().equals("chi tiết khoản thu") && isDisplayCreatedByLabel();
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
     * Object: CLOSE_ICON
     */
    public boolean isDisplayClosePopupIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = CLOSE_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
        }
        return isDisplay;
    }

    public void clickOnClosePopupIcon() {
        try {
            CLOSE_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
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
     * Object: AMOUNT_VALUE
     */
    public boolean isDisplayAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getAmountValue() {
        String text = "";
        try {
            text = AMOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: TNX_TYPE_LABEL
     */
    public boolean isDisplayTnxTypeLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_TYPE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_TYPE_LABEL");
        }
        return isDisplay;
    }

    String text = "";

    public String getTnxTypeLabel() {
        try {
            text = TNX_TYPE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_TYPE_LABEL");
        }
        return text;
    }

    /**
     * Object: TNX_TYPE_VALUE
     */
    public boolean isDisplayTnxTypeValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_TYPE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_TYPE_VALUE");
        }
        return isDisplay;
    }

    public String getTnxTypeValue() {
        String text = "";
        try {
            text = TNX_TYPE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_TYPE_VALUE");
        }
        return text;
    }

    /**
     * Object: CODE_LABEL
     */
    public boolean isDisplayCodeLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CODE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CODE_LABEL");
        }
        return isDisplay;
    }

    public String getCodeLabel() {
        String text = "";
        try {
            text = CODE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CODE_LABEL");
        }
        return text;
    }

    /**
     * Object: CODE_VALUE
     */
    public boolean isDisplayCodeValue() {
        boolean isDisplay = false;
        try {
            isDisplay = CODE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CODE_VALUE");
        }
        return isDisplay;
    }

    public String getCodeValue() {
        String text = "";
        try {
            text = CODE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of CODE_VALUE");
        }
        return text;
    }

    /**
     * Object: ACCOUNT_LABEL
     */
    public boolean isDisplayAccountLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getAccountLabel() {
        String text = "";
        try {
            text = ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: ACCOUNT_VALUE
     */
    public boolean isDisplayAccountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = ACCOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getAccountValue() {
        String text = "";
        try {
            text = ACCOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: TYPE_LABEL
     */
    public boolean isDisplayTypeLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TYPE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TYPE_LABEL");
        }
        return isDisplay;
    }

    public String getTypeLabel() {
        String text = "";
        try {
            text = TYPE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TYPE_LABEL");
        }
        return text;
    }

    /**
     * Object: TYPE_VALUE
     */
    public boolean isDisplayTypeValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TYPE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TYPE_VALUE");
        }
        return isDisplay;
    }

    public String getTypeValue() {
        String text = "";
        try {
            text = TYPE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TYPE_VALUE");
        }
        return text;
    }

    /**
     * Object: CREATED_DATE_LABEL
     */
    public boolean isDisplayCreatedDateLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_DATE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_LABEL");
        }
        return isDisplay;
    }

    public String getCreatedDateLabel() {
        String text = "";
        try {
            text = CREATED_DATE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_DATE_VALUE
     */
    public boolean isDisplayCreatedDateValue() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_DATE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_VALUE");
        }
        return isDisplay;
    }

    public String getCreatedDateValue() {
        String text = "";
        try {
            text = CREATED_DATE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_VALUE");
        }
        return text;
    }

    /**
     * Object: UPDATED_DATE_LABEL
     */
    public boolean isDisplayUpdatedDateLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = UPDATED_DATE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UPDATED_DATE_LABEL");
        }
        return isDisplay;
    }

    public String getUpdatedDateLabel() {
        String text = "";
        try {
            text = UPDATED_DATE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of UPDATED_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: UPDATED_DATE_VALUE
     */
    public boolean isDisplayUpdatedDateValue() {
        boolean isDisplay = false;
        try {
            isDisplay = UPDATED_DATE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UPDATED_DATE_VALUE");
        }
        return isDisplay;
    }

    public String getUpdatedDateValue() {
        String text = "";
        try {
            text = UPDATED_DATE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of UPDATED_DATE_VALUE");
        }
        return text;
    }

    /**
     * Object: NOTE_LABEL
     */
    public boolean isDisplayNoteLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = NOTE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NOTE_LABEL");
        }
        return isDisplay;
    }

    public String getNoteLabel() {
        String text = "";
        try {
            text = NOTE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of NOTE_LABEL");
        }
        return text;
    }

    /**
     * Object: NOTE_VALUE
     */
    public boolean isDisplayNoteValue() {
        boolean isDisplay = false;
        try {
            isDisplay = NOTE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NOTE_VALUE");
        }
        return isDisplay;
    }

    public String getNoteValue() {
        String text = "";
        try {
            text = NOTE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of NOTE_VALUE");
        }
        return text;
    }

    /**
     * Object: ATTACHMENT_LABEL
     */
    public boolean isDisplayAttachmentLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = ATTACHMENT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_LABEL");
        }
        return isDisplay;
    }

    public String getAttachmentLabel() {
        String text = "";
        try {
            text = ATTACHMENT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_LABEL");
        }
        return text;
    }

    /**
     * Object: ATTACHMENT_VALUE
     */
    public boolean isDisplayAttachmentValue() {
        boolean isDisplay = false;
        try {
            isDisplay = ATTACHMENT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_VALUE");
        }
        return isDisplay;
    }

    public String getAttachmentValue() {
        String text = "";
        try {
            text = ATTACHMENT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_VALUE");
        }
        return text;
    }
}
