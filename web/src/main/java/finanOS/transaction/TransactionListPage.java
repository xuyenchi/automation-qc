package finanOS.transaction;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

import java.util.List;

public class TransactionListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement EXPORT_FILE_BUTTON;
    @FindBy(css = Header + "")
    private WebElement IMPORT_FILE_BUTTON;
    @FindBy(css = Header + "")
    private WebElement CREATE_BUTTON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Body + "")
    private WebElement DATE_FILTER;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_FILTER;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_FILER;
    @FindBy(css = Body + "")
    private WebElement FILTER_ICON;
    @FindBy(css = Body + "")
    private WebElement TOTAL_INCOME_WIDGET;
    private static final String TotalIncomeLabel = "";
    private static final String TotalIncomeValue = "";
    @FindBy(css = Body + "")
    private WebElement TOTAL_EXPENSE_WIDGET;
    private static final String TotalExpenseLabel = "";
    private static final String TotalExpenseValue = "";
    @FindBy(css = Body + "")
    private WebElement UN_CATEGORY_WIDGET;
    private static final String UnCategoryLabel = "";
    private static final String UnCategoryValue = "";
    @FindBy(css = Body + "")
    private WebElement UN_RECONCILE_WIDGET;
    private static final String UnReconcileLabel = "";
    private static final String UnReconcileValue = "";

    @FindBy(css = Body + "")
    private WebElement CHECKPOINT_TITLE;
    @FindBy(css = Body + "")
    private WebElement DATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement PAYMENT_TITLE;
    @FindBy(css = Body + "")
    private WebElement CATEGORY_TITLE;
    @FindBy(css = Body + "")
    private WebElement NOTE_TITLE;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement ATTACHMENT_TITLE;
    @FindBy(css = Body + "")
    private WebElement RECONCILE_TITLE;
    @FindBy(css = Body + "")
    private WebElement MORE_ACTION_ICON;
    /** -------------------- More Action Popup -------------------- */
    /** -------------------- More Action Popup -------------------- */
    @FindBy(css = Body + "")
    private WebElement CATEGORY_BUTTON;
    @FindBy(css = Body + "")
    private WebElement RECONCILE_BUTTON;
    @FindBy(css = Body + "")
    private WebElement PRINT_BUTTON;
    @FindBy(css = Body + "")
    private WebElement EXPORT_BUTTON;
    @FindBy(css = Body + "")
    private WebElement DELETE_BUTTON;
    @FindBy(css = Body + "")
    private List<WebElement> RECORD_LIST;
    private static final String TnxCheckpoint = "";
    private static final String TnxDate = "";
    private static final String TnxPayment = "";
    private static final String TnxCategory = "";
    private static final String TnxNote = "";
    private static final String TnxAmount = "";
    private static final String TnxAttach = "";
    private static final String TnxReconcileIcon = "";
    private static final String TnxMoreActionIcon = "";

    /**
     * ==============================================================================================================
     * Constructor
     */
    public TransactionListPage(WebDriver driver) {
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
     * Object: EXPORT_FILE_BUTTON
     */
    public boolean isDisplayExportFileButton() {
        boolean isDisplay = false;
        try {
            isDisplay = EXPORT_FILE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_FILE_BUTTON");
        }
        return isDisplay;
    }
    public String getExportFileButtonText() {
        String text = "";
        try {
            text = EXPORT_FILE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_FILE_BUTTON");
        }
        return text;
    }
    public void clickOnExportFileButton() {
        try {
            EXPORT_FILE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_FILE_BUTTON");
        }
    }

    /**
     * Object: IMPORT_FILE_BUTTON
     */
    public boolean isDisplayImportFileButton() {
        boolean isDisplay = false;
        try {
            isDisplay = IMPORT_FILE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of IMPORT_FILE_BUTTON");
        }
        return isDisplay;
    }
    public String getImportFileButtonText() {
        String text = "";
        try {
            text = IMPORT_FILE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of IMPORT_FILE_BUTTON");
        }
        return text;
    }
    public void clickOnImportFileButton() {
        try {
            IMPORT_FILE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of IMPORT_FILE_BUTTON");
        }
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
    public String getSearchBoxValue() {
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
     * Object: CATEGORY_FILER
     */
    public boolean isDisplayCategoryFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_FILER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_FILER");
        }
        return isDisplay;
    }
    public String getCategoryFilterValue() {
        String text = "";
        try {
            text = CATEGORY_FILER.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_FILER");
        }
        return text;
    }
    public void clickOnCategoryFilter() {
        try {
            CATEGORY_FILER.click();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_FILER");
        }
    }

    /**
     * Object: FILTER_ICON
     */
    public boolean isDisplayFilterIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = FILTER_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FILTER_ICON");
        }
        return isDisplay;
    }
    public void clickOnFilterIcon() {
        try {
            FILTER_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of FILTER_ICON");
        }
    }

    /**
     * --------------------------------------------------------------
     * Object: TOTAL_INCOME_WIDGET
     */
    public boolean isDisplayTotalIncomeWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_INCOME_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_INCOME_WIDGET");
        }
        return isDisplay;
    }
    public void clickOnTotalIncomeWidget() {
        try {
            TOTAL_INCOME_WIDGET.click();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_INCOME_WIDGET");
        }
    }

    /**
     * Object: TotalIncomeLabel
     */
    public String getTotalIncomeLabel() {
        String text = "";
        try {
            text = TOTAL_INCOME_WIDGET.findElement(By.cssSelector(TotalIncomeLabel)).getText();
        } catch (Exception e) {
            Log.addLog("css of TotalIncomeLabel");
        }
        return text;
    }

    /**
     * Object: TotalIncomeValue
     */
    public String getTotalIncomeValue() {
        String text = "";
        try {
            text = TOTAL_INCOME_WIDGET.findElement(By.cssSelector(TotalIncomeValue)).getText();
        } catch (Exception e) {
            Log.addLog("css of TotalIncomeValue");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: TOTAL_EXPENSE_WIDGET
     */
    public boolean isDisplayTotalExpenseWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_EXPENSE_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_EXPENSE_WIDGET");
        }
        return isDisplay;
    }
    public void clickOnTotalExpenseWidget() {
        try {
            TOTAL_EXPENSE_WIDGET.click();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_EXPENSE_WIDGET");
        }
    }

    /**
     * Object: TotalExpenseLabel
     */
    public String getTotalExpenseLabel() {
        String text = "";
        try {
            text = TOTAL_EXPENSE_WIDGET.findElement(By.cssSelector(TotalExpenseLabel)).getText();
        } catch (Exception e) {
            Log.addLog("css of TotalIncomeLabel");
        }
        return text;
    }

    /**
     * Object: TotalExpenseValue
     */
    public String getTotalExpenseValue() {
        String text = "";
        try {
            text = TOTAL_EXPENSE_WIDGET.findElement(By.cssSelector(TotalExpenseValue)).getText();
        } catch (Exception e) {
            Log.addLog("css of TotalIncomeValue");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: UN_CATEGORY_WIDGET
     */
    public boolean isDisplayUnCategoryWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = UN_CATEGORY_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UN_CATEGORY_WIDGET");
        }
        return isDisplay;
    }
    public void clickOnUnCategoryWidget() {
        try {
            UN_CATEGORY_WIDGET.click();
        } catch (Exception e) {
            Log.addLog("css of UN_CATEGORY_WIDGET");
        }
    }

    /**
     * Object: UnCategoryLabel
     */
    public String getUnCategoryLabel() {
        String text = "";
        try {
            text = UN_CATEGORY_WIDGET.findElement(By.cssSelector(UnCategoryLabel)).getText();
        } catch (Exception e) {
            Log.addLog("css of UnCategoryLabel");
        }
        return text;
    }

    /**
     * Object: UnCategoryValue
     */
    public String getUnCategoryValue() {
        String text = "";
        try {
            text = UN_CATEGORY_WIDGET.findElement(By.cssSelector(UnCategoryValue)).getText();
        } catch (Exception e) {
            Log.addLog("css of UnCategoryValue");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: UN_RECONCILE_WIDGET
     */
    public boolean isDisplayUnReconcileWidget() {
        boolean isDisplay = false;
        try {
            isDisplay = UN_RECONCILE_WIDGET.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of UN_RECONCILE_WIDGET");
        }
        return isDisplay;
    }
    public void clickOnUnReconcileWidget() {
        try {
            UN_RECONCILE_WIDGET.click();
        } catch (Exception e) {
            Log.addLog("css of UN_RECONCILE_WIDGET");
        }
    }

    /**
     * Object: UnReconcileLabel
     */
    public String getUnReconcileLabel() {
        String text = "";
        try {
            text = UN_RECONCILE_WIDGET.findElement(By.cssSelector(UnReconcileLabel)).getText();
        } catch (Exception e) {
            Log.addLog("css of UnReconcileLabel");
        }
        return text;
    }

    /**
     * Object: UnReconcileValue
     */
    public String getUnReconcileValue() {
        String text = "";
        try {
            text = UN_RECONCILE_WIDGET.findElement(By.cssSelector(UnReconcileValue)).getText();
        } catch (Exception e) {
            Log.addLog("css of UnReconcileValue");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: Table - CHECKPOINT_TITLE
     */
    public boolean isDisplayCheckpointTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = CHECKPOINT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CHECKPOINT_TITLE");
        }
        return isDisplay;
    }
    public void clickOnCheckpointTitle() {
        try {
            CHECKPOINT_TITLE.click();
        } catch (Exception e) {
            Log.addLog("css of CHECKPOINT_TITLE");
        }
    }

    /**
     * Object: DATE_TITLE
     */
    public boolean isDisplayDateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = DATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DATE_TITLE");
        }
        return isDisplay;
    }
    public String getDateTitle() {
        String text = "";
        try {
            text = DATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DATE_TITLE");
        }
        return text;
    }

    /**
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
     * Object: CATEGORY_TITLE
     */
    public boolean isDisplayCategoryTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_TITLE");
        }
        return isDisplay;
    }
    public String getCategoryTitle() {
        String text = "";
        try {
            text = CATEGORY_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_TITLE");
        }
        return text;
    }

    /**
     * Object: NOTE_TITLE
     */
    public boolean isDisplayNoteTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = NOTE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NOTE_TITLE");
        }
        return isDisplay;
    }
    public String getNoteTitle() {
        String text = "";
        try {
            text = NOTE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of NOTE_TITLE");
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
     * Object: ATTACHMENT_TITLE
     */
    public boolean isDisplayAttachmentTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = ATTACHMENT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_TITLE");
        }
        return isDisplay;
    }
    public String getAttachmentTitle() {
        String text = "";
        try {
            text = ATTACHMENT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of ATTACHMENT_TITLE");
        }
        return text;
    }

    /**
     * Object: RECONCILE_TITLE
     */
    public boolean isDisplayReconcileTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = RECONCILE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_TITLE");
        }
        return isDisplay;
    }
    public String getReconcileTitle() {
        String text = "";
        try {
            text = RECONCILE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_TITLE");
        }
        return text;
    }

    /**
     * Object: MORE_ACTION_ICON
     */
    public boolean isDisplayMoreActionIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = MORE_ACTION_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTION_ICON");
        }
        return isDisplay;
    }
    public void clickOnMoreActionIcon() {
        try {
            MORE_ACTION_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of MORE_ACTION_ICON");
        }
    }

    /**
     * --------------------------------------------------------------
     * Object: Hidden buttons - CATEGORY_BUTTON
     */
    public boolean isDisplayCategoryButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CATEGORY_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_BUTTON");
        }
        return isDisplay;
    }
    public String getCategoryButtonText() {
        String text = "";
        try {
            text = CATEGORY_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_BUTTON");
        }
        return text;
    }
    public void clickOnCategoryButton() {
        try {
            CATEGORY_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CATEGORY_BUTTON");
        }
    }

    /**
     * Object: RECONCILE_BUTTON
     */
    public boolean isDisplayReconcileButton() {
        boolean isDisplay = false;
        try {
            isDisplay = RECONCILE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_BUTTON");
        }
        return isDisplay;
    }
    public String getReconcileButtonText() {
        String text = "";
        try {
            text = RECONCILE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_BUTTON");
        }
        return text;
    }
    public void clickOnReconcileButton() {
        try {
            RECONCILE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of RECONCILE_BUTTON");
        }
    }

    /**
     * Object: PRINT_BUTTON
     */
    public boolean isDisplayPrintButton() {
        boolean isDisplay = false;
        try {
            isDisplay = PRINT_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRINT_BUTTON");
        }
        return isDisplay;
    }
    public String getPrintButtonText() {
        String text = "";
        try {
            text = PRINT_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of PRINT_BUTTON");
        }
        return text;
    }
    public void clickOnPrintButton() {
        try {
            PRINT_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of PRINT_BUTTON");
        }
    }

    /**
     * Object: EXPORT_BUTTON
     */
    public boolean isDisplayExportButton() {
        boolean isDisplay = false;
        try {
            isDisplay = EXPORT_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_BUTTON");
        }
        return isDisplay;
    }
    public String getExportButtonText() {
        String text = "";
        try {
            text = EXPORT_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_BUTTON");
        }
        return text;
    }
    public void clickOnExportButton() {
        try {
            EXPORT_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_BUTTON");
        }
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
     * --------------------------------------------------------------
     * Object: Records - LIST_RECORD
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
    /** --- TnxCheckpoint --- */
    public void clickOnTnxCheckpoint(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TnxCheckpoint)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxCheckpoint at " + pos);
            }
        }
    }
    /** --- TnxDate --- */
    public String getTnxDateByPosition(int pos) {
        WebElement element = getRecordElement(pos);
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
    /** --- TnxPayment --- */
    public String getTnxPaymentByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxPayment)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxPayment at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    /** --- TnxCategory --- */
    public String getTnxCategoryByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxCategory)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxCategory at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    /** --- TnxNote --- */
    public String getTnxNoteByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxNote)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxNote at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    /** --- TnxAmount --- */
    public String getTnxAmountByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxAmount)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxAmount at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    /** --- TnxAttach --- */
    public void clickOnTnxAttachByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TnxAttach)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxAttach at " + pos);
            }
        }
    }
    /** --- TnxReconcileIcon --- */
    public boolean isDisplayTnxReconcileIconByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            boolean isDisplay = false;
            try {
                isDisplay = element.findElement(By.cssSelector(TnxReconcileIcon)).isDisplayed();
            } catch (Exception e) {
                Log.addLog("css of TnxReconcileIcon at " + pos);
            }
            return isDisplay;
        } else {
            return false;
        }
    }
    public boolean isEnableTnxReconcileIconByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            boolean isDisplay = false;
            try {
                isDisplay = element.findElement(By.cssSelector(TnxReconcileIcon)).isEnabled();
            } catch (Exception e) {
                Log.addLog("css of TnxReconcileIcon at " + pos);
            }
            return isDisplay;
        } else {
            return false;
        }
    }
    /** --- TnxMoreActionIcon --- */
    public void clickOnTnxMoreActionIconByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TnxMoreActionIcon)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxMoreActionIcon at " + pos);
            }
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("giao dịch thu chi");
    }
}