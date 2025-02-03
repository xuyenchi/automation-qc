package finanOS.transaction;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

import java.util.List;

public class CreateTransactionPopup extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement POPUP_TITLE;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_BOX;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_ERROR_MESSAGE;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_BOX;
    @FindBy(css = Body + "")
    private WebElement DATE_PICKER;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_BOX;
    @FindBy(css = Body + "")
    private List<WebElement> PAYMENT_LIST;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_ERROR_MESSAGE;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_LABEL;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_BOX;
    @FindBy(css = Body + "")
    private List<WebElement> CATEGORY_LIST;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_ERROR_MESSAGE;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_LABEL;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_BOX;
    @FindBy(css = Body + "")
    private List<WebElement> CUSTOMER_LIST;
    @FindBy(css = Body + "")
    private WebElement NOTE_LABEL;
    @FindBy(css = Body + "")
    private WebElement NOTE_BOX;
    @FindBy(css = Body + "")
    private WebElement UPLOAD_FILE_WIDGET;
    private static final String UploadFileDescription = "";
    private static final String UploadFileButton = "";
    @FindBy(css = Body + "")
    private List<WebElement> LIST_FILES;
    private static final String FileName = "";
    private static final String FileViewAction = "";
    private static final String FileDeleteAction = "";

    /**
     * Footer
     */
    @FindBy(css = Footer + "")
    private WebElement SETTING_ICON;
    @FindBy(css = Footer + "")
    private WebElement CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public CreateTransactionPopup(WebDriver driver) {
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
    public String getAmountBoxValue() {
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
    public void setAmountBox(String text) {
        try {
            AMOUNT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_BOX");
        }
    }

    /**
     * Object: AMOUNT_ERROR_MESSAGE
     */
    public boolean isDisplayAmountErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getAmountErrorMessage() {
        String text = "";
        try {
            text = AMOUNT_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_ERROR_MESSAGE");
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
    public String getCreatedDateBoxValue() {
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
    public void setTnxDate(String yyyy, String mm, String dd){
        WebElement element = null;
        try {
            element = DATE_PICKER;
        } catch (Exception e){
            Log.addLog("css of DATE_PICKER");
        }

        if(element != null) {
            setDatePicker(DATE_PICKER, yyyy, mm, dd);
        }
    }

    /**
     * Object: PAYMENT_LABEL
     */
    public boolean isDisplayPaymentLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_LABEL");
        }
        return isDisplay;
    }
    public String getPaymentLabel() {
        String text = "";
        try {
            text = PAYMENT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_LABEL");
        }
        return text;
    }

    /**
     * Object: PAYMENT_BOX
     */
    public boolean isDisplayPaymentBox() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_BOX");
        }
        return isDisplay;
    }
    public String getPaymentBoxText() {
        String text = "";
        try {
            text = PAYMENT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_BOX");
        }
        return text;
    }
    public void clickOnPaymentBox() {
        try {
            PAYMENT_BOX.click();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_BOX");
        }
    }

    /**
     * Object: PAYMENT_LIST
     */
    private WebElement getPaymentElement(int pos) {
        WebElement element = null;
        try {
            element = PAYMENT_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_LIST at " + pos);
        }
        return element;
    }
    public int getTotalPayment() {
        int total = 0;
        try {
            total = PAYMENT_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_LIST");
        }
        return total;
    }
    public void clickOnPaymentByPosition(int pos) {
        WebElement element = getPaymentElement(pos);
        if (element != null) {
            element.click();
        }
    }

    /**
     * Object: PAYMENT_ERROR_MESSAGE
     */
    public boolean isDisplayPaymentErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getPaymentErrorMessage() {
        String text = "";
        try {
            text = PAYMENT_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: CATEGORY_LABEL
     */
    public boolean isDisplayCategoryLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_LABEL");
        }
        return isDisplay;
    }
    public String getCategoryLabel() {
        String text = "";
        try {
            text = CATEGORY_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_LABEL");
        }
        return text;
    }

    /**
     * Object: CATEGORY_BOX
     */
    public boolean isDisplayCategoryBox() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_BOX");
        }
        return isDisplay;
    }
    public String getCategoryBoxText() {
        String text = "";
        try {
            text = CATEGORY_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_BOX");
        }
        return text;
    }
    public void clickOnCategoryBox() {
        try {
            CATEGORY_BOX.click();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_BOX");
        }
    }

    /**
     * Object: CATEGORY_LIST
     */
    private WebElement getCategoryElement(int pos) {
        WebElement element = null;
        try {
            element = CATEGORY_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_LIST at " + pos);
        }
        return element;
    }
    public int getTotalCategory() {
        int total = 0;
        try {
            total = CATEGORY_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_LIST");
        }
        return total;
    }
    public void clickOnCategoryByPosition(int pos) {
        WebElement element = getCategoryElement(pos);
        if (element != null) {
            element.click();
        }
    }

    /**
     * Object: CATEGORY_ERROR_MESSAGE
     */
    public boolean isDisplayCategoryErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getCategoryErrorMessage() {
        String text = "";
        try {
            text = CATEGORY_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: CUSTOMER_LABEL
     */
    public boolean isDisplayCustomerLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CUSTOMER_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_LABEL");
        }
        return isDisplay;
    }
    public String getCustomerLabel() {
        String text = "";
        try {
            text = CUSTOMER_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_LABEL");
        }
        return text;
    }

    /**
     * Object: CUSTOMER_BOX
     */
    public boolean isDisplayCustomerBox() {
        boolean isDisplay = false;
        try {
            isDisplay = CUSTOMER_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_BOX");
        }
        return isDisplay;
    }
    public String getCustomerBoxText() {
        String text = "";
        try {
            text = CUSTOMER_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_BOX");
        }
        return text;
    }
    public void clickOnCustomerBox() {
        try {
            CUSTOMER_BOX.click();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_BOX");
        }
    }

    /**
     * Object: CUSTOMER_LIST
     */
    private WebElement getCustomerElement(int pos) {
        WebElement element = null;
        try {
            element = CUSTOMER_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_LIST at " + pos);
        }
        return element;
    }
    public int getTotalCustomer() {
        int total = 0;
        try {
            total = CUSTOMER_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_LIST");
        }
        return total;
    }
    public void clickOnCustomerByPosition(int pos) {
        WebElement element = getCustomerElement(pos);
        if (element != null) {
            element.click();
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
     * Object: NOTE_BOX
     */
    public boolean isDisplayNoteBox() {
        boolean isDisplay = false;
        try {
            isDisplay = NOTE_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NOTE_BOX");
        }
        return isDisplay;
    }
    public String getNoteBoxValue() {
        String text = "";
        try {
            text = NOTE_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of NOTE_BOX");
        }
        return text;
    }
    public void clearNoteBox() {
        try {
            NOTE_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of NOTE_BOX");
        }
    }
    public void setNoteBox(String text) {
        try {
            NOTE_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of NOTE_BOX");
        }
    }

    /**
     * Object: UPLOAD_FILE_WIDGET
     */
    public boolean isDisplayUploadFileWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = UPLOAD_FILE_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UPLOAD_FILE_WIDGET");
        }
        return isDisplay;
    }
    public String getUploadFileDescription() {
        String text = "";
        try {
            text = UPLOAD_FILE_WIDGET.findElement(By.cssSelector(UploadFileDescription)).getText();
        } catch (Exception e) {
            Log.addLog("css of UploadFileDescription");
        }
        return text;
    }
    public String getUploadFileButtonText() {
        String text = "";
        try {
            text = UPLOAD_FILE_WIDGET.findElement(By.cssSelector(UploadFileButton)).getText();
        } catch (Exception e) {
            Log.addLog("css of UploadFileButton");
        }
        return text;
    }
    public void clickOnUploadFileButton() {
        try {
            UPLOAD_FILE_WIDGET.findElement(By.cssSelector(UploadFileButton)).click();
        } catch (Exception e) {
            Log.addLog("css of UploadFileButton");
        }
    }

    /**
     * Object: LIST_FILES
     */
    private WebElement getFileElement(int pos) {
        WebElement element = null;
        try {
            element = LIST_FILES.get(pos);
        } catch (Exception e) {
            Log.addLog("css of LIST_FILES at " + pos);
        }
        return element;
    }
    public int getTotalFile() {
        int total = 0;
        try {
            total = LIST_FILES.size();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_LIST");
        }
        return total;
    }
    public String getFileNameByPosition(int pos) {
        WebElement element = getFileElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(FileName)).getText();
            } catch (Exception e) {
                Log.addLog("css of FileName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getFileViewActionByPosition(int pos) {
        WebElement element = getFileElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(FileViewAction)).getText();
            } catch (Exception e) {
                Log.addLog("css of FileViewAction at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnFileViewActionByPosition(int pos) {
        WebElement element = getFileElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(FileViewAction)).click();
            } catch (Exception e) {
                Log.addLog("css of FileViewAction at " + pos);
            }
        }
    }
    public String getFileDeleteActionByPosition(int pos) {
        WebElement element = getFileElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(FileDeleteAction)).getText();
            } catch (Exception e) {
                Log.addLog("css of FileDeleteAction at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnFileDeleteActionByPosition(int pos) {
        WebElement element = getFileElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(FileDeleteAction)).click();
            } catch (Exception e) {
                Log.addLog("css of FileDeleteAction at " + pos);
            }
        }
    }

    /**
     * Object: SETTING_ICON
     */
    public boolean isDisplaySettingIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = SETTING_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SETTING_ICON");
        }
        return isDisplay;
    }
    public void clickOnSettingIcon() {
        try {
            SETTING_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of SETTING_ICON");
        }
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
        return isDisplayPopupTitle() && getPopupTitle().toLowerCase().contains("tạo khoản thu");
    }
}
