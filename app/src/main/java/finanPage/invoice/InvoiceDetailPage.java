package finanPage.invoice;

import actions.Direction;
import config.Configs;
import finanCommon.FinanBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Log;

import java.io.StringReader;
import java.util.List;

public class InvoiceDetailPage extends FinanBase {
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
    private WebElement AND_EDIT_ICON;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CUSTOMER_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_STATUS;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_AMOUNT;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_INVOICE_ACTION_LIST;
    private static final String AndActionName = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_TOTAL_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_TOTAL_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_CODE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_CODE_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_AT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_AT_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DUE_DATE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DUE_DATE_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ATTACHMENT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ATTACHMENT_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_BY_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_BY_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PAYMENT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PAYMENT_UNLINK_OBJECT;
    private static final String AndLinkAccount = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PAYMENT_LINKED_OBJECT;
    private static final String AndPaymentLink = "";
    private static final String AndPaymentAccountName = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_REMINDER_BOOK_LABEL;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_REMINDER_LIST;
    private static final String AndReminderContent = "";
    private static final String AndReminderDate = "";
    private static final String AndReminderRemoveAction = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SCROLLABLE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_DETAIL_OBJECT;
    /** ---------------------- DETAIL LATER ---------------------- */

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
    private WebElement IOS_EDIT_ICON;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CUSTOMER_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_STATUS;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_AMOUNT;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_INVOICE_ACTION_LIST;
    private static final String IOSActionName = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_TOTAL_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_TOTAL_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_CODE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_CODE_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_AT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_AT_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DUE_DATE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DUE_DATE_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ATTACHMENT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ATTACHMENT_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_BY_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_BY_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PAYMENT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PAYMENT_UNLINK_OBJECT;
    private static final String IOSLinkAccount = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PAYMENT_LINKED_OBJECT;
    private static final String IOSPaymentLink = "";
    private static final String IOSPaymentAccountName = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_REMINDER_BOOK_LABEL;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_REMINDER_LIST;
    private static final String IOSReminderContent = "";
    private static final String IOSReminderDate = "";
    private static final String IOSReminderRemoveAction = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SCROLLABLE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_DETAIL_OBJECT;
    /** ---------------------- DETAIL LATER ---------------------- */

    /**
     * [IOS] footer
     */

    /**
     * ==============================================================================================================
     * Constructor
     */
    public InvoiceDetailPage(AppiumDriver driver) {
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
     * Object: EDIT_ICON
     */
    public boolean isDisplayEditIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EDIT_ICON.isDisplayed();
            } else {
                isDisplay = IOS_EDIT_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EDIT_ICON");
        }
        return isDisplay;
    }
    public void clickOnEditIcon() {
        try {
            if (Configs.isAndroid) {
                AND_EDIT_ICON.click();
            } else {
                IOS_EDIT_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EDIT_ICON");
        }
    }

    /**
     * Object: CUSTOMER_LABEL
     */
    public boolean isDisplayCustomerLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CUSTOMER_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_CUSTOMER_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CUSTOMER_LABEL");
        }
        return isDisplay;
    }
    public String getCustomerLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CUSTOMER_LABEL.getText();
            } else {
                text = IOS_CUSTOMER_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CUSTOMER_LABEL");
        }
        return text;
    }

    /**
     * Object: INVOICE_STATUS
     */
    public boolean isDisplayInvoiceStatus() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_STATUS.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_STATUS.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_STATUS");
        }
        return isDisplay;
    }
    public String getInvoiceStatus() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_STATUS.getText();
            } else {
                text = IOS_INVOICE_STATUS.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_STATUS");
        }
        return text;
    }

    /**
     * Object: INVOICE_AMOUNT
     */
    public boolean isDisplayInvoiceAmount() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_AMOUNT.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_AMOUNT.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_AMOUNT");
        }
        return isDisplay;
    }
    public String getInvoiceAmount() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_AMOUNT.getText();
            } else {
                text = IOS_INVOICE_AMOUNT.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_AMOUNT");
        }
        return text;
    }

    /**
     * Object: INVOICE_ACTION_LIST
     */
    private WebElement getInvoiceActionElement(int pos){
        WebElement element = null;
        try {
            if(Configs.isAndroid){
                element = AND_INVOICE_ACTION_LIST.get(pos);
            } else {
                element = IOS_INVOICE_ACTION_LIST.get(pos);
            }
        } catch (Exception e){
            Log.addLog("xPath of INVOICE_ACTION_LIST at " + pos);
        }
        return element;
    }
    public int getTotalInvoiceAction(){
        int total = 0;
        try {
            if(Configs.isAndroid){
                total = AND_INVOICE_ACTION_LIST.size();
            } else {
                total = IOS_INVOICE_ACTION_LIST.size();
            }
        } catch (Exception e){
            Log.addLog("xPath of INVOICE_ACTION_LIST");
        }
        return total;
    }
    public String getInvoiceActionByPosition(int pos){
        WebElement element = getInvoiceActionElement(pos);
        if(element != null){
            String text = "";
            try {
                if(Configs.isAndroid){
                    text = element.findElement(By.xpath(AndActionName)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSActionName)).getText();
                }
            } catch (Exception e){
                Log.addLog("xPath of ActionName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnInvoiceActionByPosition(int pos){
        WebElement element = getInvoiceActionElement(pos);
        if(element != null){
            try {
                if(Configs.isAndroid){
                    element.findElement(By.xpath(AndActionName)).click();
                } else {
                    element.findElement(By.xpath(IOSActionName)).click();
                }
            } catch (Exception e){
                Log.addLog("xPath of ActionName at " + pos);
            }
        }
    }

    /**
     * Object: INVOICE_TOTAL_LABEL
     */
    public boolean isDisplayInvoiceTotalLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_TOTAL_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_TOTAL_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_TOTAL_LABEL");
        }
        return isDisplay;
    }
    public String getInvoiceTotalLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_TOTAL_LABEL.getText();
            } else {
                text = IOS_INVOICE_TOTAL_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_TOTAL_LABEL");
        }
        return text;
    }

    /**
     * Object: INVOICE_TOTAL_VALUE
     */
    public boolean isDisplayInvoiceTotalValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_TOTAL_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_TOTAL_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_TOTAL_VALUE");
        }
        return isDisplay;
    }
    public String getInvoiceTotalValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_TOTAL_VALUE.getText();
            } else {
                text = IOS_INVOICE_TOTAL_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_TOTAL_VALUE");
        }
        return text;
    }

    /**
     * Object: INVOICE_CODE_LABEL
     */
    public boolean isDisplayInvoiceCodeLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_CODE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_CODE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_LABEL");
        }
        return isDisplay;
    }
    public String getInvoiceCodeLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_CODE_LABEL.getText();
            } else {
                text = IOS_INVOICE_CODE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_LABEL");
        }
        return text;
    }

    /**
     * Object: INVOICE_CODE_VALUE
     */
    public boolean isDisplayInvoiceCodeValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_CODE_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_CODE_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_VALUE");
        }
        return isDisplay;
    }
    public String getInvoiceCodeValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_CODE_VALUE.getText();
            } else {
                text = IOS_INVOICE_CODE_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_VALUE");
        }
        return text;
    }

    /**
     * Object: CREATED_AT_LABEL
     */
    public boolean isDisplayCreatedAtLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_AT_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_AT_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_LABEL");
        }
        return isDisplay;
    }
    public String getCreatedAtLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_AT_LABEL.getText();
            } else {
                text = IOS_CREATED_AT_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_AT_VALUE
     */
    public boolean isDisplayCreatedAtValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_AT_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_AT_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_VALUE");
        }
        return isDisplay;
    }
    public String getCreatedAtValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_AT_VALUE.getText();
            } else {
                text = IOS_CREATED_AT_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_VALUE");
        }
        return text;
    }

    /**
     * Object: DUE_DATE_LABEL
     */
    public boolean isDisplayDueDateLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DUE_DATE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_DUE_DATE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_LABEL");
        }
        return isDisplay;
    }
    public String getDueDateLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DUE_DATE_LABEL.getText();
            } else {
                text = IOS_DUE_DATE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: DUE_DATE_VALUE
     */
    public boolean isDisplayDueDateValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DUE_DATE_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_DUE_DATE_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_VALUE");
        }
        return isDisplay;
    }
    public String getDueDateValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DUE_DATE_VALUE.getText();
            } else {
                text = IOS_DUE_DATE_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_VALUE");
        }
        return text;
    }

    /**
     * Object: ATTACHMENT_LABEL
     */
    public boolean isDisplayAttachmentLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ATTACHMENT_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_ATTACHMENT_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_LABEL");
        }
        return isDisplay;
    }
    public String getAttachmentLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_ATTACHMENT_LABEL.getText();
            } else {
                text = IOS_ATTACHMENT_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_LABEL");
        }
        return text;
    }

    /**
     * Object: ATTACHMENT_VALUE
     */
    public boolean isDisplayAttachmentValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ATTACHMENT_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_ATTACHMENT_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_VALUE");
        }
        return isDisplay;
    }
    public String getAttachmentValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_ATTACHMENT_VALUE.getText();
            } else {
                text = IOS_ATTACHMENT_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_VALUE");
        }
        return text;
    }

    /**
     * Object: CREATED_BY_LABEL
     */
    public boolean isDisplayCreatedByLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_BY_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_BY_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_BY_LABEL");
        }
        return isDisplay;
    }
    public String getCreatedByLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_BY_LABEL.getText();
            } else {
                text = IOS_CREATED_BY_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_BY_LABEL");
        }
        return text;
    }

    /**
     * Object: CREATED_BY_VALUE
     */
    public boolean isDisplayCreatedByValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_BY_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_BY_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_BY_VALUE");
        }
        return isDisplay;
    }
    public String getCreatedByValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_BY_VALUE.getText();
            } else {
                text = IOS_CREATED_BY_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_BY_VALUE");
        }
        return text;
    }

    /**
     * Object: PAYMENT_LABEL
     */
    public boolean isDisplayPaymentLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PAYMENT_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_PAYMENT_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_LABEL");
        }
        return isDisplay;
    }
    public String getPaymentLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PAYMENT_LABEL.getText();
            } else {
                text = IOS_PAYMENT_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_LABEL");
        }
        return text;
    }

    /**
     * Object: PAYMENT_UNLINK_OBJECT
     */
    private WebElement getPaymentUnlinkObject(){
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_PAYMENT_UNLINK_OBJECT;
            } else {
                element = IOS_PAYMENT_UNLINK_OBJECT;
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_UNLINK_OBJECT");
        }
        return element;
    }
    public boolean isDisplayPaymentUnlinkObject() {
        WebElement element = getPaymentUnlinkObject();
        if(element != null){
            return element.isDisplayed();
        } else {
            return false;
        }
    }
    public boolean isDisplayLinkAccountInPaymentObject(){
        WebElement element = getPaymentUnlinkObject();
        if(element != null){
            boolean isDisplay = false;
            try {
                if(Configs.isAndroid){
                    isDisplay = element.findElement(By.xpath(AndLinkAccount)).isDisplayed();
                } else {
                    isDisplay = element.findElement(By.xpath(IOSLinkAccount)).isDisplayed();
                }
            } catch (Exception e){
                Log.addLog("xPath of LinkAccount");
            }
            return isDisplay;
        } else {
            return false;
        }
    }
    public String getLinkAccountTextInPaymentObject(){
        WebElement element = getPaymentUnlinkObject();
        if(element != null){
            String text = "";
            try {
                if(Configs.isAndroid){
                    text = element.findElement(By.xpath(AndLinkAccount)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSLinkAccount)).getText();
                }
            } catch (Exception e){
                Log.addLog("xPath of LinkAccount");
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnLinkAccountInPaymentObject(){
        WebElement element = getPaymentUnlinkObject();
        if(element != null){
            try {
                if(Configs.isAndroid){
                    element.findElement(By.xpath(AndLinkAccount)).click();
                } else {
                    element.findElement(By.xpath(IOSLinkAccount)).click();
                }
            } catch (Exception e){
                Log.addLog("xPath of LinkAccount");
            }
        }
    }

    /**
     * Object: PAYMENT_LINKED_OBJECT
     */
    private WebElement getPaymentLinkedObject(){
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_PAYMENT_LINKED_OBJECT;
            } else {
                element = IOS_PAYMENT_LINKED_OBJECT;
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_LINKED_OBJECT");
        }
        return element;
    }
    public boolean isDisplayPaymentLinkedObject() {
        WebElement element = getPaymentLinkedObject();
        if(element != null){
            return element.isDisplayed();
        } else {
            return false;
        }
    }
    public boolean isDisplayPaymentLinkInPaymentLinkedObject(){
        WebElement element = getPaymentLinkedObject();
        if(element != null){
            boolean isDisplay = false;
            try {
                if(Configs.isAndroid){
                    isDisplay = element.findElement(By.xpath(AndPaymentLink)).isDisplayed();
                } else {
                    isDisplay = element.findElement(By.xpath(IOSPaymentLink)).isDisplayed();
                }
            } catch (Exception e){
                Log.addLog("xPath of PaymentLink");
            }
            return isDisplay;
        } else {
            return false;
        }
    }
    public String getPaymentLinkInPaymentLinkedObject(){
        WebElement element = getPaymentLinkedObject();
        if(element != null){
            String text = "";
            try {
                if(Configs.isAndroid){
                    text = element.findElement(By.xpath(AndPaymentLink)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSPaymentLink)).getText();
                }
            } catch (Exception e){
                Log.addLog("xPath of PaymentLink");
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnPaymentLinkInPaymentLinkedObject(){
        WebElement element = getPaymentLinkedObject();
        if(element != null){
            try {
                if(Configs.isAndroid){
                    element.findElement(By.xpath(AndPaymentLink)).click();
                } else {
                    element.findElement(By.xpath(IOSPaymentLink)).click();
                }
            } catch (Exception e){
                Log.addLog("xPath of PaymentLink");
            }
        }
    }
    public String getAccountNameInPaymentLinkedObject(){
        WebElement element = getPaymentLinkedObject();
        if(element != null){
            String text = "";
            try {
                if(Configs.isAndroid){
                    text = element.findElement(By.xpath(AndPaymentAccountName)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSPaymentAccountName)).getText();
                }
            } catch (Exception e){
                Log.addLog("xPath of PaymentAccountName");
            }
            return text;
        } else {
            return "";
        }
    }

    /**
     * Object: REMINDER_BOOK_LABEL
     */
    public boolean isDisplayReminderBookLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_REMINDER_BOOK_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_REMINDER_BOOK_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of REMINDER_BOOK_LABEL");
        }
        return isDisplay;
    }
    public String getReminderBookLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_REMINDER_BOOK_LABEL.getText();
            } else {
                text = IOS_REMINDER_BOOK_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of REMINDER_BOOK_LABEL");
        }
        return text;
    }

    /**
     * Object: REMINDER_LIST
     */
    private WebElement getReminderElement(int pos){
        WebElement element = null;
        try {
            if(Configs.isAndroid){
                element = AND_REMINDER_LIST.get(pos);
            } else {
                element = IOS_REMINDER_LIST.get(pos);
            }
        } catch (Exception e){
            Log.addLog("xPath of REMINDER_LIST at " + pos);
        }
        return element;
    }
    public int getTotalReminder(){
        int total = 0;
        try {
            if(Configs.isAndroid){
                total = AND_REMINDER_LIST.size();
            } else {
                total = IOS_REMINDER_LIST.size();
            }
        } catch (Exception e){
            Log.addLog("xPath of REMINDER_LIST");
        }
        return total;
    }
    public String getReminderContentByPosition(int pos){
        WebElement element = getReminderElement(pos);
        if(element != null){
            String text = "";
            try {
                if(Configs.isAndroid){
                    text = element.findElement(By.xpath(AndReminderContent)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSReminderContent)).getText();
                }
            } catch (Exception e){
                Log.addLog("xPath of ReminderContent at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getReminderDateByPosition(int pos){
        WebElement element = getReminderElement(pos);
        if(element != null){
            String text = "";
            try {
                if(Configs.isAndroid){
                    text = element.findElement(By.xpath(AndReminderDate)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSReminderDate)).getText();
                }
            } catch (Exception e){
                Log.addLog("xPath of ReminderDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnReminderDateByPosition(int pos){
        WebElement element = getReminderElement(pos);
        if(element != null){
            try {
                if(Configs.isAndroid){
                    element.findElement(By.xpath(AndReminderRemoveAction)).click();
                } else {
                    element.findElement(By.xpath(IOSReminderRemoveAction)).click();
                }
            } catch (Exception e){
                Log.addLog("xPath of ReminderRemoveAction at " + pos);
            }
        }
    }

    /**
     * Object: SCROLLABLE
     */
    public void scrollPage(Direction direction){
        WebElement element = null;
        try {
            if(Configs.isAndroid){
                element = AND_SCROLLABLE;
            } else {
                element = IOS_SCROLLABLE;
            }
        } catch (Exception e){
            Log.addLog("xPath of SCROLLABLE");
        }

        if(element != null){
            scrollInElements(element,direction,0.8,0.2);
        }
    }

    /**
     * Object: INVOICE_DETAIL_OBJECT
     * Note: will define(/implement) detail if needed
     */
    public boolean isDisplayInvoiceDetailObject() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_DETAIL_OBJECT.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_DETAIL_OBJECT.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_DETAIL_OBJECT");
        }
        return isDisplay;
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayBackIcon() && isDisplayPageTitle() && getPageTitle().toLowerCase().contains("hoá đơn #hd");
    }
}
