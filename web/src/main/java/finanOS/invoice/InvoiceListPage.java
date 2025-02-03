package finanOS.invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import finanOS.base.Sidebar;
import utilities.common.Generator;
import utilities.common.Log;

import java.util.List;

public class InvoiceListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement EXPORT_BUTTON;
    @FindBy(css = Header + "")
    private WebElement IMPORT_BUTTON;
    @FindBy(css = Header + "")
    private WebElement CREATE_BUTTON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement TOTAL_RECEIVABLE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TOTAL_RECEIVABLE_VALUE;
    @FindBy(css = Body + "")
    private WebElement UNPAID_OVERDUE_LABEL;
    @FindBy(css = Body + "")
    private WebElement UNPAID_OVERDUE_VALUE;
    @FindBy(css = Body + "")
    private WebElement UNPAID_DUE_LABEL;
    @FindBy(css = Body + "")
    private WebElement UNPAID_DUE_VALUE;
    @FindBy(css = Body + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Body + "")
    private WebElement STATUS_FILTER;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE;
    @FindBy(css = Body + "")
    private WebElement DUE_DATE;
    @FindBy(css = Body + "")
    private WebElement OVERDUE_TAB;
    @FindBy(css = Body + "")
    private WebElement DRAFT_TAB;
    @FindBy(css = Body + "")
    private WebElement ALL_TAB;
    @FindBy(css = Body + "")
    private List<WebElement> FILTER_BLOCK;
    private static final String FilterName = "";
    private static final String FilterRemove = "";
    @FindBy(css = Body + "")
    private WebElement DELETE_FILTER_ICON;
    @FindBy(css = Body + "")
    private WebElement EMPTY_STATEMENT;
    @FindBy(css = Body + "")
    private WebElement MULTI_CHECKPOINT_TITLE;
    @FindBy(css = Body + "")
    private WebElement INVOICE_NUMBER_TITLE;
    @FindBy(css = Body + "")
    private WebElement STATUS_TITLE;
    @FindBy(css = Body + "")
    private WebElement CUSTOMER_TITLE;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement DUE_DATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement TOTAL_AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement RECEIVABLE_TITLE;
    @FindBy(css = Body + "")
    private WebElement ACTION_TITLE;
    @FindBy(css = Body + "")
    private List<WebElement> RECORD_LIST;
    private static final String Checkpoint = "";
    private static final String InvoiceNumber = "";
    private static final String Status = "";
    private static final String Customer = "";
    private static final String CreatedDate = "";
    private static final String DueDate = "";
    private static final String Total = "";
    private static final String Receivable = "";
    private static final String Action = "";
    private static final String MoreActionIcon = "";

    /**
     * Footer
     * - currently, don't care pagination
     */

    /**
     * ==============================================================================================================
     * Constructor
     */
    public InvoiceListPage(WebDriver driver) {
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
     * Object: TOTAL_RECEIVABLE_LABEL
     */
    public boolean isDisplayTotalReceivableLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_RECEIVABLE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_RECEIVABLE_LABEL");
        }
        return isDisplay;
    }
    public String getTotalReceivableLabel() {
        String text = "";
        try {
            text = TOTAL_RECEIVABLE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_RECEIVABLE_LABEL");
        }
        return text;
    }

    /**
     * Object: TOTAL_RECEIVABLE_VALUE
     */
    public boolean isDisplayTotalReceivableValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_RECEIVABLE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_RECEIVABLE_VALUE");
        }
        return isDisplay;
    }
    public String getTotalReceivableValue() {
        String text = "";
        try {
            text = TOTAL_RECEIVABLE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_RECEIVABLE_VALUE");
        }
        return text;
    }

    /**
     * Object: UNPAID_OVERDUE_LABEL
     */
    public boolean isDisplayUnpaidOverdueLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_OVERDUE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_OVERDUE_LABEL");
        }
        return isDisplay;
    }
    public String getUnpaidOverdueLabel() {
        String text = "";
        try {
            text = UNPAID_OVERDUE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_OVERDUE_LABEL");
        }
        return text;
    }

    /**
     * Object: UNPAID_OVERDUE_VALUE
     */
    public boolean isDisplayUnpaidOverdueValue() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_OVERDUE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_OVERDUE_VALUE");
        }
        return isDisplay;
    }
    public String getUnpaidOverdueValue() {
        String text = "";
        try {
            text = UNPAID_OVERDUE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_OVERDUE_VALUE");
        }
        return text;
    }

    /**
     * Object: UNPAID_DUE_LABEL
     */
    public boolean isDisplayUnpaidDueLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_DUE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_DUE_LABEL");
        }
        return isDisplay;
    }
    public String getUnpaidDueLabel() {
        String text = "";
        try {
            text = UNPAID_DUE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_DUE_LABEL");
        }
        return text;
    }

    /**
     * Object: UNPAID_DUE_VALUE
     */
    public boolean isDisplayUnpaidDueValue() {
        boolean isDisplay = false;
        try {
            isDisplay = UNPAID_DUE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_DUE_VALUE");
        }
        return isDisplay;
    }
    public String getUnpaidDueValue() {
        String text = "";
        try {
            text = UNPAID_DUE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of UNPAID_DUE_VALUE");
        }
        return text;
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
    public String getStatusFilter() {
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
     * Object: CREATED_DATE
     * lib: https://rsuitejs.com/components/date-picker/
     */
    public boolean isDisplayCreatedDate() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_DATE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE");
        }
        return isDisplay;
    }
    public String getCreatedDate() {
        String text = "";
        try {
            text = CREATED_DATE.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE");
        }
        return text;
    }
    public void clickOnCreatedDate() {
        try {
            CREATED_DATE.click();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE");
        }
    }
    public void setCreatedDate(String yyyy, String mm, String dd) {
        if (Generator.convertStringToInt(mm) < 10 && mm.length() == 1) {
            mm = "0".concat(mm);
        }
        if (Generator.convertStringToInt(dd) < 10 && dd.length() == 1) {
            dd = "0".concat(dd);
        }
        String text = yyyy.concat(mm).concat(dd);
        try {
            CREATED_DATE.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE");
        }
    }
    /** ------------------------- CREATED_DATE popup ------------------------- */

    /**
     * Object: DUE_DATE
     * lib: https://rsuitejs.com/components/date-picker/
     */
    public boolean isDisplayDueDate() {
        boolean isDisplay = false;
        try {
            isDisplay = DUE_DATE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DUE_DATE");
        }
        return isDisplay;
    }
    public String getDueDate() {
        String text = "";
        try {
            text = DUE_DATE.getText();
        } catch (Exception e) {
            Log.addLog("css of DUE_DATE");
        }
        return text;
    }
    public void clickOnDueDate() {
        try {
            DUE_DATE.click();
        } catch (Exception e) {
            Log.addLog("css of DUE_DATE");
        }
    }
    public void setDueDate(String yyyy, String mm, String dd) {
        if (Generator.convertStringToInt(mm) < 10 && mm.length() == 1) {
            mm = "0".concat(mm);
        }
        if (Generator.convertStringToInt(dd) < 10 && dd.length() == 1) {
            dd = "0".concat(dd);
        }
        String text = yyyy.concat(mm).concat(dd);
        try {
            DUE_DATE.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of DUE_DATE");
        }
    }
    /** ------------------------- DUE_DATE popup ------------------------- */

    /**
     * Object: OVERDUE_TAB
     */
    public boolean isDisplayOverdueTab() {
        boolean isDisplay = false;
        try {
            isDisplay = OVERDUE_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of OVERDUE_TAB");
        }
        return isDisplay;
    }
    public String getOverdueTab() {
        String text = "";
        try {
            text = OVERDUE_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of OVERDUE_TAB");
        }
        return text;
    }
    public void clickOnOverdueTab() {
        try {
            OVERDUE_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of OVERDUE_TAB");
        }
    }

    /**
     * Object: DRAFT_TAB
     */
    public boolean isDisplayDraftTab() {
        boolean isDisplay = false;
        try {
            isDisplay = DRAFT_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DRAFT_TAB");
        }
        return isDisplay;
    }
    public String getDraftTab() {
        String text = "";
        try {
            text = DRAFT_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of DRAFT_TAB");
        }
        return text;
    }
    public void clickOnDraftTab() {
        try {
            DRAFT_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of DRAFT_TAB");
        }
    }

    /**
     * Object: ALL_TAB
     */
    public boolean isDisplayAllTab() {
        boolean isDisplay = false;
        try {
            isDisplay = ALL_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ALL_TAB");
        }
        return isDisplay;
    }
    public String getAllTab() {
        String text = "";
        try {
            text = ALL_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of ALL_TAB");
        }
        return text;
    }
    public void clickOnAllTab() {
        try {
            ALL_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of ALL_TAB");
        }
    }

    /**
     * Object: FILTER_BLOCK
     */
    private WebElement getFilterElement(int pos) {
        WebElement element = null;
        try {
            element = FILTER_BLOCK.get(pos);
        } catch (Exception e) {
            Log.addLog("css of FILTER_BLOCK at " + pos);
        }
        return element;
    }
    public int getTotalFilterElement() {
        int total = 0;
        try {
            total = FILTER_BLOCK.size();
        } catch (Exception e) {
            Log.addLog("css of FILTER_BLOCK");
        }
        return total;
    }
    public boolean isDisplayFilterBlock() {
        return getFilterElement(0).isDisplayed();
    }
    public boolean isDisplayFilterBlockByPosition(int pos) {
        return getFilterElement(pos).isDisplayed();
    }
    public String getFilterByPosition(int pos) {
        WebElement element = getFilterElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(FilterName)).getText();
            } catch (Exception e) {
                Log.addLog("css of FilterName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnRemoveFilterByPosition(int pos) {
        WebElement element = getFilterElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(FilterRemove)).click();
            } catch (Exception e) {
                Log.addLog("css of FilterRemove at " + pos);
            }
        }
    }

    /**
     * Object: DELETE_FILTER_ICON
     */
    public boolean isDisplayDeleteFilterIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = DELETE_FILTER_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DELETE_FILTER_ICON");
        }
        return isDisplay;
    }
    public String getDeleteFilterIcon() {
        String text = "";
        try {
            text = DELETE_FILTER_ICON.getText();
        } catch (Exception e) {
            Log.addLog("css of DELETE_FILTER_ICON");
        }
        return text;
    }
    public void clickOnDeleteFilterIcon() {
        try {
            DELETE_FILTER_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of DELETE_FILTER_ICON");
        }
    }

    /**
     * Object: EMPTY_STATEMENT
     */
    public boolean isDisplayTableEmptyStatement() {
        boolean isDisplay = false;
        try {
            isDisplay = EMPTY_STATEMENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMPTY_STATEMENT");
        }
        return isDisplay;
    }
    public String getTableEmptyStatement() {
        String text = "";
        try {
            text = EMPTY_STATEMENT.getText();
        } catch (Exception e) {
            Log.addLog("css of EMPTY_STATEMENT");
        }
        return text;
    }

    /**
     * ------------------------------ Table --------------------------------
     * Object: INVOICE_NUMBER_TITLE
     */
    public boolean isDisplayInvoiceNumberTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_NUMBER_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_NUMBER_TITLE");
        }
        return isDisplay;
    }
    public String getInvoiceNumberTitle() {
        String text = "";
        try {
            text = INVOICE_NUMBER_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_NUMBER_TITLE");
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
     * Object: CREATED_DATE_TITLE
     */
    public boolean isDisplayCreatedDateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATED_DATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_TITLE");
        }
        return isDisplay;
    }
    public String getCreatedDateTitle() {
        String text = "";
        try {
            text = CREATED_DATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_TITLE");
        }
        return text;
    }

    /**
     * Object: DUE_DATE_TITLE
     */
    public boolean isDisplayDueDateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = DUE_DATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DUE_DATE_TITLE");
        }
        return isDisplay;
    }
    public String getDueDateTitle() {
        String text = "";
        try {
            text = DUE_DATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DUE_DATE_TITLE");
        }
        return text;
    }

    /**
     * Object: TOTAL_AMOUNT_TITLE
     */
    public boolean isDisplayTotalAmountTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_AMOUNT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_AMOUNT_TITLE");
        }
        return isDisplay;
    }
    public String getTotalAmountTitle() {
        String text = "";
        try {
            text = TOTAL_AMOUNT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_AMOUNT_TITLE");
        }
        return text;
    }

    /**
     * Object: RECEIVABLE_TITLE
     */
    public boolean isDisplayReceivableTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVABLE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVABLE_TITLE");
        }
        return isDisplay;
    }
    public String getReceivableTitle() {
        String text = "";
        try {
            text = RECEIVABLE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVABLE_TITLE");
        }
        return text;
    }

    /**
     * Object: ACTION_TITLE
     */
    public boolean isDisplayActionTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = ACTION_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ACTION_TITLE");
        }
        return isDisplay;
    }
    public String getActionTitle() {
        String text = "";
        try {
            text = ACTION_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of ACTION_TITLE");
        }
        return text;
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
    public String getInvoiceNumberByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(InvoiceNumber)).getText();
            } catch (Exception e) {
                Log.addLog("css of InvoiceNumber at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnRecordByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                clickOnRecordByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
    }
    public String getInvoiceStatusByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Status)).getText();
            } catch (Exception e) {
                Log.addLog("css of Status at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getInvoiceStatusByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getInvoiceStatusByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public String getInvoiceCustomerByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Customer)).getText();
            } catch (Exception e) {
                Log.addLog("css of Customer at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getInvoiceCustomerByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getInvoiceCustomerByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public String getCreatedAtByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(CreatedDate)).getText();
            } catch (Exception e) {
                Log.addLog("css of CreatedDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getCreatedAtByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getCreatedAtByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public String getExpiredDateByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(DueDate)).getText();
            } catch (Exception e) {
                Log.addLog("css of ExpiredDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getExpiredDateByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getExpiredDateByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public String getTotalByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Total)).getText();
            } catch (Exception e) {
                Log.addLog("css of Total at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getTotalByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getTotalByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public String getReceivableByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Receivable)).getText();
            } catch (Exception e) {
                Log.addLog("css of Receivable at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getReceivableByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getReceivableByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public String getActionByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Action)).getText();
            } catch (Exception e) {
                Log.addLog("css of Action at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getActionByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                text = getActionByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
        return text;
    }
    public void clickOnMoreActionByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(MoreActionIcon)).click();
            } catch (Exception e) {
                Log.addLog("css of MoreActionIcon at " + pos);
            }
        }
    }
    public void clickOnMoreActionByInvoiceNumber(String invoiceNumber) {
        boolean isFound = false;
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getInvoiceNumberByPosition(i).toLowerCase().equals(invoiceNumber.toLowerCase())) {
                isFound = true;
                clickOnMoreActionByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have invoiceNumber is " + invoiceNumber);
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("hoá đơn phải thu");
    }
}
