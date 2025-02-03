package finanOS.onlPayment;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Generator;
import utilities.common.Log;

import java.util.List;

public class OnlPaymentListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String FilterName = "";
    private static final String FilterRemove = "";
    private static final String Checkpoint = "";
    private static final String Status = "";
    private static final String Action = "";
    private static final String MoreActionIcon = "";
    private static final String TnxNumber = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement EXPORT_BUTTON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Body + "")
    private WebElement DATE_FILTER;
    @FindBy(css = Body + "")
    private WebElement CREATED_DATE;
    @FindBy(css = Body + "")
    private WebElement DUE_DATE;
    @FindBy(css = Body + "")
    private WebElement STATUS_FILTER;
    @FindBy(css = Body + "")
    private WebElement RECEIVE_PAYMENT_FILTER;
    @FindBy(css = Body + "")
    private WebElement WAITING_PAYMENT_FILTER;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_FILTER;
    @FindBy(css = Body + "")
    private List < WebElement > FILTER_BLOCK;
    @FindBy(css = Body + "")
    private WebElement DELETE_FILTER_ICON;
    @FindBy(css = Body + "")
    private WebElement EMPTY_STATEMENT;
    @FindBy(css = Body + "")
    private WebElement MULTI_CHECKPOINT_TITLE;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_TITLE;
    @FindBy(css = Body + "")
    private WebElement TNX_CODE_TITLE;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_METHOD_TITLE;
    @FindBy(css = Body + "")
    private WebElement TNX_DATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement STATUS_TITLE;
    @FindBy(css = Body + "")
    private WebElement TOTAL_AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement FEE_AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement RECEIVE_AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement ACTION_TITLE;
    @FindBy(css = Body + "")
    private List < WebElement > RECORD_LIST;
    @FindBy(css = Body + "")
    private WebElement TNX_TAB;
    @FindBy(css = Body + "")
    private WebElement WITHDRAWTH_TAB;
    @FindBy(css = Body + "")
    private WebElement SETTLEMENT_TAB;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public OnlPaymentListPage(WebDriver driver) {
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
     * Object: RECEIVE_PAYMENT_FILTER
     */
    public boolean isDisplayReceivePaymentFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVE_PAYMENT_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_PAYMENT_FILTER");
        }
        return isDisplay;
    }

    public String getReceivePaymentFilter() {
        String text = "";
        try {
            text = RECEIVE_PAYMENT_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_PAYMENT_FILTER");
        }
        return text;
    }

    public void clickOnReceivePaymentFilter() {
        try {
            RECEIVE_PAYMENT_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_PAYMENT_FILTER");
        }
    }

    /**
     * Object: WAITING_PAYMENT_FILTER
     */
    public boolean isDisplayWaitingPaymentFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = WAITING_PAYMENT_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WAITING_PAYMENT_FILTER");
        }
        return isDisplay;
    }

    public String getWaitingPaymentFilter() {
        String text = "";
        try {
            text = WAITING_PAYMENT_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of WAITING_PAYMENT_FILTER");
        }
        return text;
    }

    public void clickOnWaitingPaymentFilter() {
        try {
            STATUS_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of WAITING_PAYMENT_FILTER");
        }
    }
    /** ------------------------- End STATUS_FILTER popup ------------------------- */

    /**
     * Object: DATE_FILTER
     */
    public boolean isDisplayDateFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = DATE_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DATE_FILTER");
        }
        return isDisplay;
    }

    public String getDateFilterValue() {
        String text = "";
        try {
            text = DATE_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of DATE_FILTER");
        }
        return text;
    }

    public void clickOnDateFilter() {
        try {
            DATE_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of DATE_FILTER");
        }
    }
    /** ------------------------- DATE_FILTER popup ------------------------- */

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
    /** ------------------------- End DUE_DATE popup ------------------------- */

    /**
     * Object: PAYMENT_FILTER
     */
    public boolean isDisplayPaymentFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_FILTER");
        }
        return isDisplay;
    }

    public String getPaymentFilterValue() {
        String text = "";
        try {
            text = PAYMENT_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_FILTER");
        }
        return text;
    }

    public void clickOnPaymentFilter() {
        try {
            PAYMENT_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_FILTER");
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
     * Object: TNX_TAB
     */
    public boolean isDisplayTnxTab() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_TAB");
        }
        return isDisplay;
    }

    public String getTnxTab() {
        String text = "";
        try {
            text = TNX_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_TAB");
        }
        return text;
    }

    public void clickOnTnxTab() {
        try {
            TNX_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of TNX_TAB");
        }
    }

    /**
     * Object: WITHDRAWTH_TAB
     */
    public boolean isDisplayWithdrawthTab() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWTH_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWTH_TAB");
        }
        return isDisplay;
    }

    public String getWithdrawthTab() {
        String text = "";
        try {
            text = WITHDRAWTH_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWTH_TAB");
        }
        return text;
    }

    public void clickOnWithdrawthTab() {
        try {
            WITHDRAWTH_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWTH_TAB");
        }
    }

    /**
     * Object: SETTLEMENT_TAB
     */
    public boolean isDisplaySettlementTab() {
        boolean isDisplay = false;
        try {
            isDisplay = SETTLEMENT_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_TAB");
        }
        return isDisplay;
    }

    public String getSettlementTab() {
        String text = "";
        try {
            text = SETTLEMENT_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_TAB");
        }
        return text;
    }

    public void clickOnSettlementTab() {
        try {
            SETTLEMENT_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_TAB");
        }
    }

    /**
     * ------------------------------ Table --------------------------------
     * /**
     * Object: PAYMENT_TITLE
     */
    public boolean isDisplayPaymentTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_TITLE");
        }
        return isDisplay;
    }

    public String getPaymentTitle() {
        String text = "";
        try {
            text = PAYMENT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_TITLE");
        }
        return text;
    }

    /**
     * Object: TNX_CODE_TITLE
     */
    public boolean isDisplayTnxCodeTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_CODE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_CODE_TITLE");
        }
        return isDisplay;
    }

    public String getTnxCodeTitle() {
        String text = "";
        try {
            text = TNX_CODE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_CODE_TITLE");
        }
        return text;
    }

    /**
     * Object: PAYMENT_METHOD_TITLE
     */
    public boolean isDisplayPaymentMethodTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = PAYMENT_METHOD_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_METHOD_TITLE");
        }
        return isDisplay;
    }

    public String getPaymentMethodTitle() {
        String text = "";
        try {
            text = PAYMENT_METHOD_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAYMENT_METHOD_TITLE");
        }
        return text;
    }

    /**
     * Object: TNX_DATE_TITLE
     */
    public boolean isDisplayTnxDateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_DATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_DATE_TITLE");
        }
        return isDisplay;
    }

    public String getTnxDateTitle() {
        String text = "";
        try {
            text = TNX_DATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_DATE_TITLE");
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
     * Object: FEE_AMOUNT_TITLE
     */
    public boolean isDisplayFeeAmountTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = FEE_AMOUNT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FEE_AMOUNT_TITLE");
        }
        return isDisplay;
    }

    public String getFeeAmountTitle() {
        String text = "";
        try {
            text = FEE_AMOUNT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of FEE_AMOUNT_TITLE");
        }
        return text;
    }

    /**
     * Object: RECEIVE_AMOUNT_TITLE
     */
    public boolean isDisplayReceiveAmountTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVE_AMOUNT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_AMOUNT_TITLE");
        }
        return isDisplay;
    }

    public String getReceiveAmountTitle() {
        String text = "";
        try {
            text = RECEIVE_AMOUNT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_AMOUNT_TITLE");
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

    public String getTnxNumberByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxNumber)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxNumber at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnRecordByTnxNumber(String tnxNumber) {
        boolean isFound = false;
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxNumberByPosition(i).toLowerCase().equals(tnxNumber.toLowerCase())) {
                isFound = true;
                clickOnRecordByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxNumber is " + tnxNumber);
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

    public String getInvoiceStatusByTnxNumber(String tnxNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxNumberByPosition(i).toLowerCase().equals(tnxNumber.toLowerCase())) {
                isFound = true;
                text = getInvoiceStatusByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxNumber is " + tnxNumber);
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

    public String getActionByTnxNumber(String tnxNumber) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxNumberByPosition(i).toLowerCase().equals(tnxNumber.toLowerCase())) {
                isFound = true;
                text = getActionByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxNumber is " + tnxNumber);
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

    public void clickOnMoreActionByTnxNumber(String tnxNumber) {
        boolean isFound = false;
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxNumberByPosition(i).toLowerCase().equals(tnxNumber.toLowerCase())) {
                isFound = true;
                clickOnMoreActionByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxNumber is " + tnxNumber);
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("giao dịch finanpay");
    }
}