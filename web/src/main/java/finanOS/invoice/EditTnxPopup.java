package finanOS.invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.common.Log;

import java.util.List;

public class EditTnxPopup extends InvoiceDetailPage {
    private static final String Body = "";
    /**
     * ------------------------- Edit transaction popup -------------------------
     */
    @FindBy(css = Body + "")
    private WebElement EDIT_TRANSACTION_POPUP;
    @FindBy(css = Body + "")
    private WebElement POPUP_TITLE;
    @FindBy(css = Body + "")
    private WebElement CLOSE_ICON;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_BOX;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_BOX;
    @FindBy(css = Body + "")
    private WebElement DATE_PICKER;
    @FindBy(css = Body + "")
    private WebElement ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement ACCOUNT_VALUE;
    @FindBy(css = Body + "")
    private List<WebElement> ACCOUNT_DROPDOWN_LIST;
    @FindBy(css = Body + "")
    private WebElement TYPE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TYPE_VALUE;
    @FindBy(css = Body + "")
    private List<WebElement> TYPE_DROPDOWN_LIST;
    @FindBy(css = Body + "")
    private WebElement NOTE_LABEL;
    @FindBy(css = Body + "")
    private WebElement NOTE_VALUE;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_VALUE;
    @FindBy(css = Body + "")
    private WebElement DELETE_BUTTON;
    @FindBy(css = Body + "")
    private WebElement UPDATE_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public EditTnxPopup(WebDriver driver) {
        super(driver);
    }

    /**
     * Object: EDIT_TRANSACTION_POPUP
     */
    private WebElement getEditTransactionPopupElement() {
        WebElement element = null;
        try {
            element = EDIT_TRANSACTION_POPUP;
        } catch (Exception e) {
            Log.addLog("css of EDIT_TRANSACTION_POPUP");
        }
        return element;
    }
    public boolean isDisplayEditTransactionPopup(){
        return isDisplayPopupTitle() && getPopupTitle().toLowerCase().equals("chi tiết khoản thu") && isDisplayUpdateButton();
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
     * Object: AMOUNT_BOX
     */
    public boolean isDisplayAmountBox() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_BOX");
        }
        return isDisplay;
    }

    public String getAmountValue() {
        String text = "";
        try {
            text = AMOUNT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_BOX");
        }
        return text;
    }

    public void clearAmountBox() {
        try {
            AMOUNT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_BOX");
        }
    }

    public void setAmountValue(int amount) {
        try {
            AMOUNT_BOX.sendKeys(String.valueOf(amount));
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_BOX");
        }
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
     * Object: CREATED_DATE_BOX
     */
    public boolean isDisplayCreatedDateBox() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_DATE_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_BOX");
        }
        return isDisplay;
    }

    public String getCreatedDateBox() {
        String text = "";
        try {
            text = CREATED_DATE_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_BOX");
        }
        return text;
    }

    public void clickOnCreatedDateBox() {
        try {
            CREATED_DATE_BOX.click();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_BOX");
        }
    }

    /**
     * Object: DATE_PICKER
     */
    public boolean isDisplayDatePicker() {
        boolean isDisplay = false;
        try {
            isDisplay = DATE_PICKER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DATE_PICKER");
        }
        return isDisplay;
    }

    public void setDatePicker(String yyyy, String mm, String dd) {
        WebElement element = null;
        try {
            element = DATE_PICKER;
        } catch (Exception e) {
            Log.addLog("css of DATE_PICKER");
        }
        if (element != null) {
            setDatePicker(DATE_PICKER, yyyy, mm, dd);
        }
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
    public boolean isDisplayAccountBox() {
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

    public void clickOnAccountBox() {
        try {
            ACCOUNT_VALUE.click();
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_VALUE");
        }
    }

    /**
     * Object: ACCOUNT_DROPDOWN_LIST
     */
    private WebElement getAccountElement(int pos) {
        WebElement element = null;
        try {
            element = ACCOUNT_DROPDOWN_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_DROPDOWN_LIST at " + pos);
        }
        return element;
    }

    public int getTotalAccount() {
        int total = 0;
        try {
            total = ACCOUNT_DROPDOWN_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of ACCOUNT_DROPDOWN_LIST");
        }
        return total;
    }

    public String getAccount(int pos) {
        WebElement element = getAccountElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector("")).getText();
            } catch (Exception e) {
                Log.addLog("css of ''");
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnAccount(int pos) {
        WebElement element = getAccountElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector("")).click();
            } catch (Exception e) {
                Log.addLog("css of ''");
            }
        }
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
    public boolean isDisplayTypeBox() {
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

    public void clickOnTypeBox() {
        try {
            TYPE_VALUE.click();
        } catch (Exception e) {
            Log.addLog("css of TYPE_VALUE");
        }
    }

    /**
     * Object: TYPE_DROPDOWN_LIST
     */
    private WebElement getTypeElement(int pos) {
        WebElement element = null;
        try {
            element = TYPE_DROPDOWN_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of TYPE_DROPDOWN_LIST at " + pos);
        }
        return element;
    }

    public int getTotalType() {
        int total = 0;
        try {
            total = TYPE_DROPDOWN_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of TYPE_DROPDOWN_LIST");
        }
        return total;
    }

    public String getType(int pos) {
        WebElement element = getTypeElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector("")).getText();
            } catch (Exception e) {
                Log.addLog("css of ''");
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnType(int pos) {
        WebElement element = getTypeElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector("")).click();
            } catch (Exception e) {
                Log.addLog("css of ''");
            }
        }
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
    public boolean isDisplayNoteBox() {
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

    public void clearNoteBox() {
        try {
            NOTE_VALUE.clear();
        } catch (Exception e) {
            Log.addLog("css of NOTE_VALUE");
        }
    }

    public void setNoteValue(String note) {
        try {
            NOTE_VALUE.sendKeys(note);
        } catch (Exception e) {
            Log.addLog("css of NOTE_VALUE");
        }
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

    /**
     * Object: DELETE_BUTTON
     */
    public boolean isDisplayDeleteButton() {
        boolean isDisplay = false;
        try {
            isDisplay = DELETE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DELETE_BUTTON");
        }
        return isDisplay;
    }

    public String getDeleteButtonText() {
        String text = "";
        try {
            text = DELETE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of DELETE_BUTTON");
        }
        return text;
    }

    public void clickOnDeleteButton() {
        try {
            DELETE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of DELETE_BUTTON");
        }
    }

    /**
     * Object: UPDATE_BUTTON
     */
    public boolean isDisplayUpdateButton() {
        boolean isDisplay = false;
        try {
            isDisplay = UPDATE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UPDATE_BUTTON");
        }
        return isDisplay;
    }

    public String getUpdateButtonText() {
        String text = "";
        try {
            text = UPDATE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of UPDATE_BUTTON");
        }
        return text;
    }

    public void clickOnUpdateButton() {
        try {
            UPDATE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of UPDATE_BUTTON");
        }
    }
}
