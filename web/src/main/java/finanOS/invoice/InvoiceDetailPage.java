package finanOS.invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import finanOS.base.Sidebar;
import utilities.common.Log;

import java.util.List;

public class InvoiceDetailPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement BACK_ICON;
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement INVOICE_INFO_WIDGET;
    @FindBy(css = Body + "")
    private WebElement INVOICE_STATUS;
    @FindBy(css = Body + "")
    private WebElement EDIT_INVOICE_BUTTON;
    @FindBy(css = Body + "")
    private WebElement INVOICE_CODE_LABEL;
    @FindBy(css = Body + "")
    private WebElement INVOICE_CODE_VALUE;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement EXPIRED_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement EXPIRED_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_LABEL;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_VALUE;
    @FindBy(css = Body + "")
    private WebElement PHONE_NUMBER_LABEL;
    @FindBy(css = Body + "")
    private WebElement PHONE_NUMBER_VALUE;
    @FindBy(css = Body + "")
    private WebElement EMAIL_LABEL;
    @FindBy(css = Body + "")
    private WebElement EMAIL_VALUE;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_VALUE;
    @FindBy(css = Body + "")
    private WebElement CREATED_BY_LABEL;
    @FindBy(css = Body + "")
    private WebElement CREATED_BY_VALUE;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_WIDGET;
    @FindBy(css = Body + "")
    private WebElement ADD_PAYMENT_BUTTON;
    @FindBy(css = Body + "")
    private WebElement TOTAL_INVOICE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TOTAL_INVOICE_VALUE;
    @FindBy(css = Body + "")
    private WebElement UNPAID_LABEL;
    @FindBy(css = Body + "")
    private WebElement UNPAID_VALUE;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_N_RECONCILE_LABEL;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_HYPERLINK_LABEL;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_HYPERLINK_VALUE;
    @FindBy(css = Body + "")
    private WebElement RECEIVED_ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement RECEIVED_ACCOUNT_NAME;
    @FindBy(css = Body + "")
    private WebElement RECEIVED_ACCOUNT_NUMBER;
    @FindBy(css = Body + "")
    private WebElement TRANSACTION_LIST_LABEL;
    @FindBy(css = Body + "")
    private List<WebElement> TRANSACTION_LIST_VALUE;
    private static final String TnxDate = "";
    private static final String TnxTime = "";
    private static final String TnxTitle = "";
    private static final String TnxDesc = "";
    private static final String TnxActDetail = "";
    private static final String TnxActEdit = "";
    private static final String TnxActDelete = "";


    /**
     * ------------------------- Delete transaction popup -------------------------
     */
    @FindBy(css = Body + "")
    private WebElement DELETE_POPUP_TITLE;
    @FindBy(css = Body + "")
    private WebElement DELETE_POPUP_DESCRIPTION;
    @FindBy(css = Body + "")
    private WebElement DELETE_POPUP_ACCEPT;
    @FindBy(css = Body + "")
    private WebElement SEND_INVOICE_DENY;
    @FindBy(css = Body + "")
    private WebElement SEND_INVOICE_LABEL;
    @FindBy(css = Body + "")
    private WebElement SEND_INVOICE_BUTTON;
    @FindBy(css = Body + "")
    private List<WebElement> REMINDER_INVOICE_LIST;
    private static final String ReminderContent = "";
    private static final String ReminderDescription = "";
    private static final String ReminderStatusOrIcon = "";
    @FindBy(css = Body + "")
    private WebElement ADD_REMINDER_INVOICE;
    /**
     * ------------------------- DatePicker popup -------------------------
     */
    @FindBy(css = Body + "")
    private WebElement SCROLLABLE;
    @FindBy(css = Body + "")
    private WebElement INVOICE_WIDGET;
    @FindBy(css = Body + "")
    private WebElement COMPANY_NAME;
    @FindBy(css = Body + "")
    private WebElement BILL_TO_LABEL;
    @FindBy(css = Body + "")
    private WebElement BILL_TO_NAME;
    @FindBy(css = Body + "")
    private WebElement BILL_TO_PHONE;
    @FindBy(css = Body + "")
    private WebElement BILL_TO_ADDRESS;
    @FindBy(css = Body + "")
    private WebElement FROM_LABEL;
    @FindBy(css = Body + "")
    private WebElement FROM_NAME;
    @FindBy(css = Body + "")
    private WebElement FROM_PHONE;
    @FindBy(css = Body + "")
    private WebElement FROM_ADDRESS;
    /**
     * -----------------------------------------------------
     */
    @FindBy(css = Body + "")
    private WebElement NO_TITLE;
    @FindBy(css = Body + "")
    private WebElement PRODUCT_TITLE;
    @FindBy(css = Body + "")
    private WebElement PRICE_TITLE;
    @FindBy(css = Body + "")
    private WebElement QUANTITY_TITLE;
    @FindBy(css = Body + "")
    private WebElement DISCOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement TAX_TITLE;
    @FindBy(css = Body + "")
    private WebElement SUBTOTAL_TITLE;
    @FindBy(css = Body + "")
    private List<WebElement> PRODUCT_LIST;
    private static final String RecordNo = "";
    private static final String RecordProduct = "";
    private static final String RecordPrice = "";
    private static final String RecordQuantity = "";
    private static final String RecordDiscount = "";
    private static final String RecordTax = "";
    private static final String RecordSubtotal = "";
    @FindBy(css = Body + "")
    private WebElement SUBTOTAL_FINAL;
    @FindBy(css = Body + "")
    private WebElement DISCOUNT_FINAL;
    @FindBy(css = Body + "")
    private WebElement TAX_FINAL;
    @FindBy(css = Body + "")
    private WebElement TOTAL_FINAL;
    @FindBy(css = Body + "")
    private WebElement PAID_AMOUNT_FINAL;
    @FindBy(css = Body + "")
    private WebElement UNPAID_FINAL;

    /**
     * Footer
     */
    @FindBy(css = Footer + "")
    private WebElement FOOTER_ELEMENT_NAME;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public InvoiceDetailPage(WebDriver driver) {
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
     * Object: INVOICE_INFO_WIDGET
     */
    public boolean isDisplayInvoiceInfoWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_INFO_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_WIDGET");
        }
        return isDisplay;
    }

    public String getInvoiceInfoWidget() {
        String text = "";
        try {
            text = INVOICE_INFO_WIDGET.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_WIDGET");
        }
        return text;
    }

    /**
     * Object: INVOICE_STATUS
     */
    public boolean isDisplayInvoiceStatus() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_STATUS.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_STATUS");
        }
        return isDisplay;
    }

    public String getInvoiceStatus() {
        String text = "";
        try {
            text = INVOICE_STATUS.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_STATUS");
        }
        return text;
    }

    /**
     * Object: EDIT_INVOICE_BUTTON
     */
    public boolean isDisplayEditInvoiceButton() {
        boolean isDisplay = false;
        try {
            isDisplay = EDIT_INVOICE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EDIT_INVOICE_BUTTON");
        }
        return isDisplay;
    }

    public String getEditInvoiceButton() {
        String text = "";
        try {
            text = EDIT_INVOICE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of EDIT_INVOICE_BUTTON");
        }
        return text;
    }

    public void clickOnEditInvoiceButton() {
        try {
            EDIT_INVOICE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of EDIT_INVOICE_BUTTON");
        }
    }

    /**
     * Object: INVOICE_CODE_LABEL
     */
    public boolean isDisplayInvoiceCodeLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_CODE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_CODE_LABEL");
        }
        return isDisplay;
    }

    public String getInvoiceCodeLabel() {
        String text = "";
        try {
            text = INVOICE_CODE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_CODE_LABEL");
        }
        return text;
    }

    /**
     * Object: INVOICE_CODE_VALUE
     */
    public boolean isDisplayInvoiceCodeValue() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_CODE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_CODE_VALUE");
        }
        return isDisplay;
    }

    public String getInvoiceCodeValue() {
        String text = "";
        try {
            text = INVOICE_CODE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_CODE_VALUE");
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
     * Object: EXPIRED_DATE_LABEL
     */
    public boolean isDisplayExpiredDateLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = EXPIRED_DATE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EXPIRED_DATE_LABEL");
        }
        return isDisplay;
    }

    public String getExpiredDateLabel() {
        String text = "";
        try {
            text = EXPIRED_DATE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of EXPIRED_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: EXPIRED_DATE_VALUE
     */
    public boolean isDisplayExpiredDateValue() {
        boolean isDisplay = false;
        try {
            isDisplay = EXPIRED_DATE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EXPIRED_DATE_VALUE");
        }
        return isDisplay;
    }

    public String getExpiredDateValue() {
        String text = "";
        try {
            text = EXPIRED_DATE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of EXPIRED_DATE_VALUE");
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
     * Object: PHONE_NUMBER_LABEL
     */
    public boolean isDisplayPhoneNumberLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PHONE_NUMBER_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PHONE_NUMBER_LABEL");
        }
        return isDisplay;
    }

    public String getPhoneNumberLabel() {
        String text = "";
        try {
            text = PHONE_NUMBER_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PHONE_NUMBER_LABEL");
        }
        return text;
    }

    /**
     * Object: PHONE_NUMBER_VALUE
     */
    public boolean isDisplayPhoneNumberValue() {
        boolean isDisplay = false;
        try {
            isDisplay = PHONE_NUMBER_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PHONE_NUMBER_VALUE");
        }
        return isDisplay;
    }

    public String getPhoneNumberValue() {
        String text = "";
        try {
            text = PHONE_NUMBER_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of PHONE_NUMBER_VALUE");
        }
        return text;
    }

    /**
     * Object: EMAIL_LABEL
     */
    public boolean isDisplayEmailLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = EMAIL_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_LABEL");
        }
        return isDisplay;
    }

    public String getEmailLabel() {
        String text = "";
        try {
            text = EMAIL_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_LABEL");
        }
        return text;
    }

    /**
     * Object: EMAIL_VALUE
     */
    public boolean isDisplayEmailValue() {
        boolean isDisplay = false;
        try {
            isDisplay = EMAIL_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_VALUE");
        }
        return isDisplay;
    }

    public String getEmailValue() {
        String text = "";
        try {
            text = EMAIL_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_VALUE");
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

    public void clickOnAttachment() {
        try {
            ATTACHMENT_VALUE.click();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_VALUE");
        }
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
     * Object: PAYMENT_WIDGET
     */
    public boolean isDisplayPaymentWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_WIDGET");
        }
        return isDisplay;
    }

    public String getPaymentWidget() {
        String text = "";
        try {
            text = PAYMENT_WIDGET.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_WIDGET");
        }
        return text;
    }

    /**
     * Object: ADD_PAYMENT_BUTTON
     */
    public boolean isDisplayAddPaymentButton() {
        boolean isDisplay = false;
        try {
            isDisplay = ADD_PAYMENT_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ADD_PAYMENT_BUTTON");
        }
        return isDisplay;
    }

    public String getAddPaymentButtonText() {
        String text = "";
        try {
            text = ADD_PAYMENT_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of ADD_PAYMENT_BUTTON");
        }
        return text;
    }

    public void clickOnAddPaymentButton() {
        try {
            ADD_PAYMENT_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of ADD_PAYMENT_BUTTON");
        }
    }

    /**
     * Object: TOTAL_INVOICE_LABEL
     */
    public boolean isDisplayTotalInvoiceLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_INVOICE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_INVOICE_LABEL");
        }
        return isDisplay;
    }

    public String getTotalInvoiceLabel() {
        String text = "";
        try {
            text = TOTAL_INVOICE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_INVOICE_LABEL");
        }
        return text;
    }

    /**
     * Object: TOTAL_INVOICE_VALUE
     */
    public boolean isDisplayTotalInvoiceValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_INVOICE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_INVOICE_VALUE");
        }
        return isDisplay;
    }

    public String getTotalInvoiceValue() {
        String text = "";
        try {
            text = TOTAL_INVOICE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_INVOICE_VALUE");
        }
        return text;
    }

    /**
     * Object: UNPAID_LABEL
     */
    public boolean isDisplayUnpaidLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_LABEL");
        }
        return isDisplay;
    }

    public String getUnpaidLabel() {
        String text = "";
        try {
            text = UNPAID_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_LABEL");
        }
        return text;
    }

    /**
     * Object: UNPAID_VALUE
     */
    public boolean isDisplayUnpaidValue() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_VALUE");
        }
        return isDisplay;
    }

    public String getUnpaidValue() {
        String text = "";
        try {
            text = UNPAID_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_VALUE");
        }
        return text;
    }

    /**
     * Object: PAYMENT_N_RECONCILE_LABEL
     */
    public boolean isDisplayPaymentNReconcileLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_N_RECONCILE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_N_RECONCILE_LABEL");
        }
        return isDisplay;
    }

    public String getPaymentNReconcileLabel() {
        String text = "";
        try {
            text = PAYMENT_N_RECONCILE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_N_RECONCILE_LABEL");
        }
        return text;
    }

    /**
     * Object: PAYMENT_HYPERLINK_LABEL
     */
    public boolean isDisplayPaymentLinkLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_HYPERLINK_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_HYPERLINK_LABEL");
        }
        return isDisplay;
    }

    public String getPaymentLinkLabel() {
        String text = "";
        try {
            text = PAYMENT_HYPERLINK_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_HYPERLINK_LABEL");
        }
        return text;
    }

    /**
     * Object: PAYMENT_HYPERLINK_VALUE
     */
    public boolean isDisplayPaymentLinkValue() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_HYPERLINK_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_HYPERLINK_VALUE");
        }
        return isDisplay;
    }

    public String getPaymentLinkValue() {
        String text = "";
        try {
            text = PAYMENT_HYPERLINK_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_HYPERLINK_VALUE");
        }
        return text;
    }

    public void clickOnPaymentLinkValue() {
        try {
            PAYMENT_HYPERLINK_VALUE.click();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_HYPERLINK_VALUE");
        }
    }

    /**
     * Object: RECEIVED_ACCOUNT_LABEL
     */
    public boolean isDisplayReceivedAccountLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVED_ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVED_ACCOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getReceivedAccountLabel() {
        String text = "";
        try {
            text = RECEIVED_ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVED_ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: RECEIVED_ACCOUNT_NAME
     */
    public boolean isDisplayReceivedAccountName() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVED_ACCOUNT_NAME.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVED_ACCOUNT_NAME");
        }
        return isDisplay;
    }

    public String getReceivedAccountName() {
        String text = "";
        try {
            text = RECEIVED_ACCOUNT_NAME.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVED_ACCOUNT_NAME");
        }
        return text;
    }

    /**
     * Object: RECEIVED_ACCOUNT_NUMBER
     */
    public boolean isDisplayReceivedAccountNumber() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVED_ACCOUNT_NUMBER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVED_ACCOUNT_NUMBER");
        }
        return isDisplay;
    }

    public String getReceivedAccountNumber() {
        String text = "";
        try {
            text = RECEIVED_ACCOUNT_NUMBER.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVED_ACCOUNT_NUMBER");
        }
        return text;
    }

    /**
     * Object: TRANSACTION_LIST_LABEL
     */
    public boolean isDisplayTransactionListLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TRANSACTION_LIST_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TRANSACTION_LIST_LABEL");
        }
        return isDisplay;
    }

    public String getTransactionListLabel() {
        String text = "";
        try {
            text = TRANSACTION_LIST_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TRANSACTION_LIST_LABEL");
        }
        return text;
    }

    /**
     * Object: TRANSACTION_LIST_VALUE
     */
    private WebElement getTransactionElement(int pos) {
        WebElement element = null;
        try {
            element = TRANSACTION_LIST_VALUE.get(pos);
        } catch (Exception e) {
            Log.addLog("css of TRANSACTION_LIST_VALUE at " + pos);
        }
        return element;
    }

    public int getTotalTransaction() {
        int total = 0;
        try {
            total = TRANSACTION_LIST_VALUE.size();
        } catch (Exception e) {
            Log.addLog("css of TRANSACTION_LIST_VALUE");
        }
        return total;
    }

    public String getTnxDateByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxDate)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTnxTimeByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxTime)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxTime at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTnxTitleByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxTitle)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxTitle at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTnxDescriptionByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxDesc)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxDesc at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTnxActDetailByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxActDetail)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxActDetail at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnTnxActDetailByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TnxActDetail)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxActDetail at " + pos);
            }
        }
    }

    public String getTnxActEditByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxActEdit)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxActEdit at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnTnxActEditByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TnxActEdit)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxActEdit at " + pos);
            }
        }
    }

    public String getTnxActDeleteByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxActDelete)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxActDelete at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnTnxActDeleteByPosition(int pos) {
        WebElement element = getTransactionElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TnxActDelete)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxActDelete at " + pos);
            }
        }
    }

    /**
     * ------------------------- Delete transaction popup -------------------------
     * Object: DELETE_POPUP
     */

    /**
     * Object: SEND_INVOICE_LABEL
     */
    public boolean isDisplaySendInvoiceLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = SEND_INVOICE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEND_INVOICE_LABEL");
        }
        return isDisplay;
    }

    public String getSendInvoiceLabel() {
        String text = "";
        try {
            text = SEND_INVOICE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of SEND_INVOICE_LABEL");
        }
        return text;
    }

    /**
     * Object: SEND_INVOICE_BUTTON
     */
    public boolean isDisplaySendInvoiceButton() {
        boolean isDisplay = false;
        try {
            isDisplay = SEND_INVOICE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEND_INVOICE_BUTTON");
        }
        return isDisplay;
    }

    public String getSendInvoiceButton() {
        String text = "";
        try {
            text = SEND_INVOICE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of SEND_INVOICE_BUTTON");
        }
        return text;
    }

    public void clickOnSendInvoiceButton() {
        try {
            SEND_INVOICE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of SEND_INVOICE_BUTTON");
        }
    }

    /**
     * Object: REMINDER_INVOICE_LIST
     */
    private WebElement getReminderInvoiceElement(int pos) {
        WebElement element = null;
        try {
            element = REMINDER_INVOICE_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of REMINDER_INVOICE_LIST at " + pos);
        }
        return element;
    }

    public int getTotalReminder() {
        int total = 0;
        try {
            total = REMINDER_INVOICE_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of REMINDER_INVOICE_LIST");
        }
        return total;
    }

    public String getReminderContentByPosition(int pos) {
        WebElement element = getReminderInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(ReminderContent)).getText();
            } catch (Exception e) {
                Log.addLog("css of ReminderInvoiceTitle at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getReminderDescriptionByPosition(int pos) {
        WebElement element = getReminderInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(ReminderDescription)).getText();
            } catch (Exception e) {
                Log.addLog("css of ReminderDescription at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnReminderStatusOrIconByPosition(int pos) {
        WebElement element = getReminderInvoiceElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(ReminderStatusOrIcon)).click();
            } catch (Exception e) {
                Log.addLog("css of ReminderStatusOrIcon at " + pos);
            }
        }
    }

    /**
     * Object: ADD_REMINDER_INVOICE
     */
    public boolean isDisplayAddReminder() {
        boolean isDisplay = false;
        try {
            isDisplay = ADD_REMINDER_INVOICE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ADD_REMINDER_INVOICE");
        }
        return isDisplay;
    }

    public String getAddReminderText() {
        String text = "";
        try {
            text = ADD_REMINDER_INVOICE.getText();
        } catch (Exception e) {
            Log.addLog("css of ADD_REMINDER_INVOICE");
        }
        return text;
    }

    public void clickOnAddReminder() {
        try {
            ADD_REMINDER_INVOICE.click();
        } catch (Exception e) {
            Log.addLog("css of ADD_REMINDER_INVOICE");
        }
    }

    /**
     * Object: SCROLLABLE
     */

    /**
     * Object: INVOICE_WIDGET
     */
    public boolean isDisplayInvoiceWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_WIDGET");
        }
        return isDisplay;
    }

    public String getInvoiceWidget() {
        String text = "";
        try {
            text = INVOICE_WIDGET.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_WIDGET");
        }
        return text;
    }

    /**
     * Object: COMPANY_NAME
     */
    public boolean isDisplayCompanyName() {
        boolean isDisplay = false;
        try {
            isDisplay = COMPANY_NAME.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of COMPANY_NAME");
        }
        return isDisplay;
    }

    public String getCompanyName() {
        String text = "";
        try {
            text = COMPANY_NAME.getText();
        } catch (Exception e) {
            Log.addLog("css of COMPANY_NAME");
        }
        return text;
    }

    /**
     * Object: BILL_TO_LABEL
     */
    public boolean isDisplayBillToLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = BILL_TO_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_LABEL");
        }
        return isDisplay;
    }

    public String getBillToLabel() {
        String text = "";
        try {
            text = BILL_TO_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_LABEL");
        }
        return text;
    }

    /**
     * Object: BILL_TO_NAME
     */
    public boolean isDisplayBillToName() {
        boolean isDisplay = false;
        try {
            isDisplay = BILL_TO_NAME.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_NAME");
        }
        return isDisplay;
    }

    public String getBillToName() {
        String text = "";
        try {
            text = BILL_TO_NAME.getText();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_NAME");
        }
        return text;
    }

    /**
     * Object: BILL_TO_PHONE
     */
    public boolean isDisplayBillToPhone() {
        boolean isDisplay = false;
        try {
            isDisplay = BILL_TO_PHONE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_PHONE");
        }
        return isDisplay;
    }

    public String getBillToPhone() {
        String text = "";
        try {
            text = BILL_TO_PHONE.getText();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_PHONE");
        }
        return text;
    }

    /**
     * Object: BILL_TO_ADDRESS
     */
    public boolean isDisplayBillToAddress() {
        boolean isDisplay = false;
        try {
            isDisplay = BILL_TO_ADDRESS.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_ADDRESS");
        }
        return isDisplay;
    }

    public String getBillToAddress() {
        String text = "";
        try {
            text = BILL_TO_ADDRESS.getText();
        } catch (Exception e) {
            Log.addLog("css of BILL_TO_ADDRESS");
        }
        return text;
    }

    /**
     * Object: FROM_LABEL
     */
    public boolean isDisplayFromLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_LABEL");
        }
        return isDisplay;
    }

    public String getFromLabel() {
        String text = "";
        try {
            text = FROM_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_LABEL");
        }
        return text;
    }

    /**
     * Object: FROM_NAME
     */
    public boolean isDisplayFromName() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_NAME.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_NAME");
        }
        return isDisplay;
    }

    public String getFromName() {
        String text = "";
        try {
            text = FROM_NAME.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_NAME");
        }
        return text;
    }

    /**
     * Object: FROM_PHONE
     */
    public boolean isDisplayFromPhone() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_PHONE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_PHONE");
        }
        return isDisplay;
    }

    public String getFromPhone() {
        String text = "";
        try {
            text = FROM_PHONE.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_PHONE");
        }
        return text;
    }

    /**
     * Object: FROM_ADDRESS
     */
    public boolean isDisplayFromAddress() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_ADDRESS.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_ADDRESS");
        }
        return isDisplay;
    }

    public String getFromAddress() {
        String text = "";
        try {
            text = FROM_ADDRESS.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_ADDRESS");
        }
        return text;
    }

    /**
     * Object: NO_TITLE
     */
    public boolean isDisplayProductNumberTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = NO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NO_TITLE");
        }
        return isDisplay;
    }

    public String getProductNumberTitle() {
        String text = "";
        try {
            text = NO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of NO_TITLE");
        }
        return text;
    }

    /**
     * Object: PRODUCT_TITLE
     */
    public boolean isDisplayProductNameTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = PRODUCT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_TITLE");
        }
        return isDisplay;
    }

    public String getProductNameTitle() {
        String text = "";
        try {
            text = PRODUCT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_TITLE");
        }
        return text;
    }

    /**
     * Object: PRICE_TITLE
     */
    public boolean isDisplayProductPriceTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = PRICE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRICE_TITLE");
        }
        return isDisplay;
    }

    public String getProductPriceTitle() {
        String text = "";
        try {
            text = PRICE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PRICE_TITLE");
        }
        return text;
    }

    /**
     * Object: QUANTITY_TITLE
     */
    public boolean isDisplayProductQuantityTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = QUANTITY_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of QUANTITY_TITLE");
        }
        return isDisplay;
    }

    public String getProductQuantityTitle() {
        String text = "";
        try {
            text = QUANTITY_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of QUANTITY_TITLE");
        }
        return text;
    }

    /**
     * Object: DISCOUNT_TITLE
     */
    public boolean isDisplayDiscountTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = DISCOUNT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DISCOUNT_TITLE");
        }
        return isDisplay;
    }

    public String getDiscountTitle() {
        String text = "";
        try {
            text = DISCOUNT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DISCOUNT_TITLE");
        }
        return text;
    }

    /**
     * Object: TAX_TITLE
     */
    public boolean isDisplayTaxTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_TITLE");
        }
        return isDisplay;
    }

    public String getTaxTitle() {
        String text = "";
        try {
            text = TAX_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_TITLE");
        }
        return text;
    }

    /**
     * Object: SUBTOTAL_TITLE
     */
    public boolean isDisplaySubtotalTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = SUBTOTAL_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SUBTOTAL_TITLE");
        }
        return isDisplay;
    }

    public String getSubtotalTitle() {
        String text = "";
        try {
            text = SUBTOTAL_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of SUBTOTAL_TITLE");
        }
        return text;
    }

    /**
     * Object: PRODUCT_LIST
     */
    private WebElement getProductElement(int pos) {
        WebElement element = null;
        try {
            element = PRODUCT_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_LIST at " + pos);
        }
        return element;
    }

    public int getTotalProduct() {
        int total = 0;
        try {
            total = PRODUCT_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_LIST");
        }
        return total;
    }

    public String getProductNumberByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordNo)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordNo at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getProductNameByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordProduct)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordProduct at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getProductPriceByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordPrice)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordPrice at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getProductQuantityByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordQuantity)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordQuantity at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getDiscountByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordDiscount)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordDiscount at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTaxByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordTax)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordTax at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getSubtotalByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RecordSubtotal)).getText();
            } catch (Exception e) {
                Log.addLog("css of RecordSubtotal at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    /**
     * Object: SUBTOTAL_FINAL
     */
    public boolean isDisplaySubtotalFinal() {
        boolean isDisplay = false;
        try {
            isDisplay = SUBTOTAL_FINAL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SUBTOTAL_FINAL");
        }
        return isDisplay;
    }

    public String getSubtotalFinal() {
        String text = "";
        try {
            text = SUBTOTAL_FINAL.getText();
        } catch (Exception e) {
            Log.addLog("css of SUBTOTAL_FINAL");
        }
        return text;
    }

    /**
     * Object: DISCOUNT_FINAL
     */
    public boolean isDisplayDiscountFinal() {
        boolean isDisplay = false;
        try {
            isDisplay = DISCOUNT_FINAL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DISCOUNT_FINAL");
        }
        return isDisplay;
    }

    public String getDiscountFinal() {
        String text = "";
        try {
            text = DISCOUNT_FINAL.getText();
        } catch (Exception e) {
            Log.addLog("css of DISCOUNT_FINAL");
        }
        return text;
    }

    /**
     * Object: TAX_FINAL
     */
    public boolean isDisplayTaxFinal() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_FINAL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_FINAL");
        }
        return isDisplay;
    }

    public String getTaxFinal() {
        String text = "";
        try {
            text = TAX_FINAL.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_FINAL");
        }
        return text;
    }

    /**
     * Object: TOTAL_FINAL
     */
    public boolean isDisplayTotalFinal() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_FINAL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_FINAL");
        }
        return isDisplay;
    }

    public String getTotalFinal() {
        String text = "";
        try {
            text = TOTAL_FINAL.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_FINAL");
        }
        return text;
    }

    /**
     * Object: PAID_AMOUNT_FINAL
     */
    public boolean isDisplayPaidAmountFinal() {
        boolean isDisplay = false;
        try {
            isDisplay = PAID_AMOUNT_FINAL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAID_AMOUNT_FINAL");
        }
        return isDisplay;
    }

    public String getPaidAmountFinal() {
        String text = "";
        try {
            text = PAID_AMOUNT_FINAL.getText();
        } catch (Exception e) {
            Log.addLog("css of PAID_AMOUNT_FINAL");
        }
        return text;
    }

    /**
     * Object: UNPAID_FINAL
     */
    public boolean isDisplayUnpaidFinal() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_FINAL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_FINAL");
        }
        return isDisplay;
    }

    public String getUnpaidFinal() {
        String text = "";
        try {
            text = UNPAID_FINAL.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_FINAL");
        }
        return text;
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("chi tiết hoá đơn");
    }
}
