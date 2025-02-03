package finanOS.invoice;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

import java.util.List;

public class RecurringInvoiceListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement CREATE_BUTTON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_FILTER;
    @FindBy(css = Body + "")
    private WebElement STATUS_FILTER;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_TITLE;
    @FindBy(css = Body + "")
    private WebElement REPEAT_TITLE;
    @FindBy(css = Body + "")
    private WebElement NEXT_INVOICE_TITLE;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement STATUS_TITLE;
    @FindBy(css = Body + "")
    private WebElement MORE_ACTIONS_ICON;
    @FindBy(css = Body + "")
    private List<WebElement> RECORD_LIST;
    private static final String CustomerName = "";
    private static final String CustomerEmail = "";
    private static final String RepeatDate = "";
    private static final String RepeatDescription = "";
    private static final String NextInvoiceDate = "";
    private static final String InvoiceAmount = "";
    private static final String InvoiceStatus = "";
    private static final String MoreAction = "";

    /**
     * Footer
     * - currently, don't care pagination
     */

    /**
     * ==============================================================================================================
     * Constructor
     */
    public RecurringInvoiceListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
     * Object: CREATE_BUTTON
     */
    public boolean isDisplayCreateButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
        return isDisplay;
    }
    public String getCreateButtonText() {
        String text = "";
        try {
            text = CREATE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
        return text;
    }
    public void clickOnCreateButton() {
        try {
            CREATE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
    }

    /**
     * Object: SEARCH_BOX
     */
    public boolean isDisplaySearchBox() {
        boolean isDisplay = false;
        try {
            isDisplay = SEARCH_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
        return isDisplay;
    }
    public String getSearchBoxText() {
        String text = "";
        try {
            text = SEARCH_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
        return text;
    }
    public void clearSearchBox() {
        try {
            SEARCH_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
    }
    public void setSearchBox(String text) {
        try {
            SEARCH_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
    }

    /**
     * Object: CUSTOMER_FILTER
     */
    public boolean isDisplayCustomerFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = CUSTOMER_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_FILTER");
        }
        return isDisplay;
    }
    public String getCustomerFilterValue() {
        String text = "";
        try {
            text = CUSTOMER_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_FILTER");
        }
        return text;
    }
    public void clickOnCustomerFilter() {
        try {
            CUSTOMER_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_FILTER");
        }
    }
    /** ------------------------- CUSTOMER_FILTER popup ------------------------- */

    /**
     * Object: STATUS_FILTER
     */
    public boolean isDisplayStatusFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = STATUS_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STATUS_FILTER");
        }
        return isDisplay;
    }
    public String getStatusFilterValue() {
        String text = "";
        try {
            text = STATUS_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of STATUS_FILTER");
        }
        return text;
    }
    public void clickOnStatusFilter() {
        try {
            STATUS_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of STATUS_FILTER");
        }
    }
    /** ------------------------- STATUS_FILTER popup ------------------------- */

    /**
     * Object: CUSTOMER_TITLE
     */
    public boolean isDisplayCustomerTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = CUSTOMER_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_TITLE");
        }
        return isDisplay;
    }
    public String getCustomerTitle() {
        String text = "";
        try {
            text = CUSTOMER_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of CUSTOMER_TITLE");
        }
        return text;
    }

    /**
     * Object: REPEAT_TITLE
     */
    public boolean isDisplayRepeatTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = REPEAT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of REPEAT_TITLE");
        }
        return isDisplay;
    }
    public String getRepeatTitle() {
        String text = "";
        try {
            text = REPEAT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of REPEAT_TITLE");
        }
        return text;
    }

    /**
     * Object: NEXT_INVOICE_TITLE
     */
    public boolean isDisplayNextInvoiceTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = NEXT_INVOICE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NEXT_INVOICE_TITLE");
        }
        return isDisplay;
    }
    public String getNextInvoiceTitle() {
        String text = "";
        try {
            text = NEXT_INVOICE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of NEXT_INVOICE_TITLE");
        }
        return text;
    }

    /**
     * Object: AMOUNT_TITLE
     */
    public boolean isDisplayAmountTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_TITLE");
        }
        return isDisplay;
    }
    public String getAmountTitle() {
        String text = "";
        try {
            text = AMOUNT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_TITLE");
        }
        return text;
    }

    /**
     * Object: STATUS_TITLE
     */
    public boolean isDisplayStatusTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = STATUS_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STATUS_TITLE");
        }
        return isDisplay;
    }
    public String getStatusTitle() {
        String text = "";
        try {
            text = STATUS_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of STATUS_TITLE");
        }
        return text;
    }

    /**
     * Object: MORE_ACTIONS_ICON
     */
    public boolean isDisplayMoreActionIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = MORE_ACTIONS_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTIONS_ICON");
        }
        return isDisplay;
    }

    /**
     * Object: RECORD_LIST
     */
    private WebElement getRecordElement(int pos) {
        WebElement element = null;
        try {
            element = RECORD_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of RECORD_LIST at " + pos);
        }
        return element;
    }
    public int getTotalRecordTable() {
        int total = 0;
        try {
            total = RECORD_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of RECORD_LIST");
        }
        return total;
    }
    public void clickOnRecordByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            element.click();
        }
    }
    public String getCustomerNameByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(CustomerName)).getText();
            } catch (Exception e) {
                Log.addLog("css of CustomerName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getCustomerEmailByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(CustomerEmail)).getText();
            } catch (Exception e) {
                Log.addLog("css of CustomerEmail at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getRepeatDateByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RepeatDate)).getText();
            } catch (Exception e) {
                Log.addLog("css of RepeatDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getRepeatDescriptionByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RepeatDescription)).getText();
            } catch (Exception e) {
                Log.addLog("css of RepeatDescription at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getNextInvoiceDateByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(NextInvoiceDate)).getText();
            } catch (Exception e) {
                Log.addLog("css of NextInvoiceDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getInvoiceAmountByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(InvoiceAmount)).getText();
            } catch (Exception e) {
                Log.addLog("css of InvoiceAmount at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getInvoiceStatusByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(InvoiceStatus)).getText();
            } catch (Exception e) {
                Log.addLog("css of InvoiceStatus at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnMoreActionByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(MoreAction)).click();
            } catch (Exception e) {
                Log.addLog("css of MoreAction at " + pos);
            }
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("hoá đơn định kỳ");
    }
}
