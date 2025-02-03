package finanOS.transaction;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class TransactionDetailPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement BACK_ICON;
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement EDIT_BUTTON;
    @FindBy(css = Header + "")
    private WebElement SEND_MAIL_BUTTON;
    @FindBy(css = Header + "")
    private WebElement MORE_ACTION_BUTTON;
    @FindBy(css = Header + "")
    private WebElement MORE_ACTION_POPUP;
    private static final String DuplicateOption = "";
    private static final String AttachmentOption = "";
    private static final String DeleteOption = "";

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement TNX_INFO_TITLE;
    @FindBy(css = Body + "")
    private WebElement RECONCILE_ICON;
    @FindBy(css = Body + "")
    private WebElement RECONCILE_TOOLTIP;
    @FindBy(css = Body + "")
    private WebElement PAID_AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement PAID_AMOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_ACCOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_LABEL;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_VALUE;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_LABEL;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_VALUE;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement CREATED_BY_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_BY_VALUE;
    @FindBy(css = Body + "")
    private WebElement TNX_CODE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TNX_CODE_VALUE;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_VALUE;
    @FindBy(css = Body + "")
    private WebElement NOTE_LABEL;
    @FindBy(css = Body + "")
    private WebElement NOTE_VALUE;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public TransactionDetailPage(WebDriver driver) {
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
     * Object: EDIT_BUTTON
     */
    public boolean isDisplayEditButton() {
        boolean isDisplay = false;
        try {
            isDisplay = EDIT_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EDIT_BUTTON");
        }
        return isDisplay;
    }
    public String getEditButtonText() {
        String text = "";
        try {
            text = EDIT_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of EDIT_BUTTON");
        }
        return text;
    }
    public void clickOnEditButton() {
        try {
            EDIT_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of EDIT_BUTTON");
        }
    }

    /**
     * Object: SEND_MAIL_BUTTON
     */
    public boolean isDisplaySendMailButton() {
        boolean isDisplay = false;
        try {
            isDisplay = SEND_MAIL_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEND_MAIL_BUTTON");
        }
        return isDisplay;
    }
    public String getSendMailButtonText() {
        String text = "";
        try {
            text = SEND_MAIL_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of SEND_MAIL_BUTTON");
        }
        return text;
    }
    public void clickOnSendMailButton() {
        try {
            SEND_MAIL_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of SEND_MAIL_BUTTON");
        }
    }

    /**
     * Object: MORE_ACTION_BUTTON
     */
    public boolean isDisplayMoreActionButton() {
        boolean isDisplay = false;
        try {
            isDisplay = MORE_ACTION_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTION_BUTTON");
        }
        return isDisplay;
    }
    public String getMoreActionButtonText() {
        String text = "";
        try {
            text = MORE_ACTION_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTION_BUTTON");
        }
        return text;
    }
    public void clickOnMoreActionButton() {
        try {
            MORE_ACTION_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTION_BUTTON");
        }
    }

    /**
     * Object: MORE_ACTION_POPUP
     * Note: các action nên handle dạng element tĩnh
     */
    public boolean isDisplayMoreActionPopup() {
        boolean isDisplay = false;
        try {
            isDisplay = MORE_ACTION_POPUP.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTION_POPUP");
        }
        return isDisplay;
    }
    public String getDuplicateOptionText() {
        String text = "";
        try {
            text = MORE_ACTION_POPUP.findElement(By.cssSelector(DuplicateOption)).getText();
        } catch (Exception e) {
            Log.addLog("css of DuplicateOption");
        }
        return text;
    }
    public void clickOnDuplicateOption() {
        try {
            MORE_ACTION_POPUP.findElement(By.cssSelector(DuplicateOption)).click();
        } catch (Exception e) {
            Log.addLog("css of DuplicateOption");
        }
    }
    public String getAttachmentOptionText() {
        String text = "";
        try {
            text = MORE_ACTION_POPUP.findElement(By.cssSelector(AttachmentOption)).getText();
        } catch (Exception e) {
            Log.addLog("css of AttachmentOption");
        }
        return text;
    }
    public void clickOnAttachmentOption() {
        try {
            MORE_ACTION_POPUP.findElement(By.cssSelector(AttachmentOption)).click();
        } catch (Exception e) {
            Log.addLog("css of AttachmentOption");
        }
    }
    public String getDeleteOptionText() {
        String text = "";
        try {
            text = MORE_ACTION_POPUP.findElement(By.cssSelector(DeleteOption)).getText();
        } catch (Exception e) {
            Log.addLog("css of DeleteOption");
        }
        return text;
    }
    public void clickOnDeleteOption() {
        try {
            MORE_ACTION_POPUP.findElement(By.cssSelector(DeleteOption)).click();
        } catch (Exception e) {
            Log.addLog("css of DeleteOption");
        }
    }

    /**
     * Object: TNX_INFO_TITLE
     */
    public boolean isDisplayTnxInfoTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_INFO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_INFO_TITLE");
        }
        return isDisplay;
    }
    public String getTnxInfoTitle() {
        String text = "";
        try {
            text = TNX_INFO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_INFO_TITLE");
        }
        return text;
    }

    /**
     * Object: RECONCILE_ICON
     */
    public boolean isDisplayReconcileIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = RECONCILE_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_ICON");
        }
        return isDisplay;
    }
    public void mouseHoverOnReconcileIcon(){
        WebElement element = null;
        try {
            element = RECONCILE_ICON;
        } catch (Exception e){
            Log.addLog("css of RECONCILE_ICON");
        }

        if(element != null) {
            mouseHover(RECONCILE_ICON);
        }
    }
    public void clickOnReconcileIcon() {
        try {
            RECONCILE_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_ICON");
        }
    }

    /**
     * Object: RECONCILE_TOOLTIP
     */
    public boolean isDisplayReconcileTooltip() {
        boolean isDisplay = false;
        try {
            isDisplay = RECONCILE_TOOLTIP.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_TOOLTIP");
        }
        return isDisplay;
    }
    public String getReconcileTooltip() {
        String text = "";
        try {
            text = RECONCILE_TOOLTIP.getText();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_TOOLTIP");
        }
        return text;
    }

    /**
     * Object: PAID_AMOUNT_LABEL
     */
    public boolean isDisplayPaidAmountLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PAID_AMOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAID_AMOUNT_LABEL");
        }
        return isDisplay;
    }
    public String getPaidAmountLabel() {
        String text = "";
        try {
            text = PAID_AMOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PAID_AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: PAID_AMOUNT_VALUE
     */
    public boolean isDisplayPaidAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = PAID_AMOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAID_AMOUNT_VALUE");
        }
        return isDisplay;
    }
    public String getPaidAmountValue() {
        String text = "";
        try {
            text = PAID_AMOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAID_AMOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: PAYMENT_ACCOUNT_LABEL
     */
    public boolean isDisplayPaymentAccountLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_ACCOUNT_LABEL");
        }
        return isDisplay;
    }
    public String getPaymentAccountLabel() {
        String text = "";
        try {
            text = PAYMENT_ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: PAYMENT_ACCOUNT_VALUE
     */
    public boolean isDisplayPaymentAccountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_ACCOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_ACCOUNT_VALUE");
        }
        return isDisplay;
    }
    public String getPaymentAccountValue() {
        String text = "";
        try {
            text = PAYMENT_ACCOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_ACCOUNT_VALUE");
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
     * Object: CATEGORY_VALUE
     */
    public boolean isDisplayCategoryValue() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_VALUE");
        }
        return isDisplay;
    }
    public String getCategoryValue() {
        String text = "";
        try {
            text = CATEGORY_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_VALUE");
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
     * Object: CUSTOMER_VALUE
     */
    public boolean isDisplayCustomerValue() {
        boolean isDisplay = false;
        try {
            isDisplay = CUSTOMER_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_VALUE");
        }
        return isDisplay;
    }
    public String getCustomerValue() {
        String text = "";
        try {
            text = CUSTOMER_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_VALUE");
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
     * Object: CREATED_BY_LABEL
     */
    public boolean isDisplayCreatedByLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_BY_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_BY_LABEL");
        }
        return isDisplay;
    }
    public String getCreatedByLabel() {
        String text = "";
        try {
            text = CREATED_BY_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_BY_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_BY_VALUE
     */
    public boolean isDisplayCreatedByValue() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_BY_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_BY_VALUE");
        }
        return isDisplay;
    }
    public String getCreatedByValue() {
        String text = "";
        try {
            text = CREATED_BY_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_BY_VALUE");
        }
        return text;
    }

    /**
     * Object: TNX_CODE_LABEL
     */
    public boolean isDisplayTransactionCodeLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_CODE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_CODE_LABEL");
        }
        return isDisplay;
    }
    public String getTransactionCodeLabel() {
        String text = "";
        try {
            text = TNX_CODE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_CODE_LABEL");
        }
        return text;
    }

    /**
     * Object: TNX_CODE_VALUE
     */
    public boolean isDisplayTransactionCodeValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_CODE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_CODE_VALUE");
        }
        return isDisplay;
    }
    public String getTransactionCodeValue() {
        String text = "";
        try {
            text = TNX_CODE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_CODE_VALUE");
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
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("chi tiết khoản thu");
    }
}
