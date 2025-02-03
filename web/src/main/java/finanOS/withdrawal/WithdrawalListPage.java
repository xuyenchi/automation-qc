/* (C)2024 */
package finanOS.withdrawal;

import finanOS.base.Sidebar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class WithdrawalListPage extends Sidebar {
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
    private WebElement WITHDRAWAL_BUTTON;
    @FindBy(css = Header + "")
    private WebElement TNX_TAB;
    @FindBy(css = Header + "")
    private WebElement WITHDRAWAL_MGT_TAB;
    @FindBy(css = Header + "")
    private WebElement REPORT_TAB;

    /**
     * Search and filter
     */
    @FindBy(css = Body + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Body + "")
    private WebElement WITHDRAWAL_DATE_FILTER;
    @FindBy(css = Body + "")
    private WebElement WITHDRAWAL_DATE_TIME_PICKER;
    @FindBy(css = Body + "")
    private WebElement STATUS_FILTER;
    @FindBy(css = Body + "")
    private WebElement IS_DISPLAY_STATUS_FILTER_POPUP;

    /**
     * Data table
     */
    @FindBy(css = Body + "")
    private WebElement WITHDRAWAL_DATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement TNX_CODE_TITLE;
    @FindBy(css = Body + "")
    private WebElement TRANSFER_TO_TITLE;
    @FindBy(css = Body + "")
    private WebElement CONTENT_TITLE;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_TITLE;
    @FindBy(css = Body + "")
    private WebElement STATUS_TITLE;
    @FindBy(css = Body + "")
    private WebElement ACTION_ICON;
    @FindBy(css = Body + "")
    private List<WebElement> RECORD_LIST;

    private static final String TnxCode = "";
    private static final String WithdrawalDate = "";
    private static final String TransferTo = "";
    private static final String Content = "";
    private static final String Amount = "";
    private static final String Status = "";
    private static final String Action = "";

    /**
     * ==============================================================================================================
     * Constructor
     */
    public WithdrawalListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * ----------------- START HEADER -----------------
     */
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
     * Object: WITHDRAWAL_BUTTON
     */
    public boolean isDisplayWithdrawalButton() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_BUTTON");
        }
        return isDisplay;
    }

    public String getWithdrawalButtonText() {
        String text = "";
        try {
            text = WITHDRAWAL_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_BUTTON");
        }
        return text;
    }

    public void clickOnWithdrawalButton() {
        try {
            WITHDRAWAL_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_BUTTON");
        }
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
     * Object: WITHDRAWAL_MGT_TAB
     */
    public boolean isDisplayWithdrawalMgtTab() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_MGT_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_MGT_TAB");
        }
        return isDisplay;
    }

    public String getWithdrawalMgtTab() {
        String text = "";
        try {
            text = WITHDRAWAL_MGT_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_MGT_TAB");
        }
        return text;
    }

    public void clickOnWithdrawalMgtTab() {
        try {
            WITHDRAWAL_MGT_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_MGT_TAB");
        }
    }

    /**
     * Object: REPORT_TAB
     */
    public boolean isDisplayReportTab() {
        boolean isDisplay = false;
        try {
            isDisplay = REPORT_TAB.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of REPORT_TAB");
        }
        return isDisplay;
    }

    public String getReportTab() {
        String text = "";
        try {
            text = REPORT_TAB.getText();
        } catch (Exception e) {
            Log.addLog("css of REPORT_TAB");
        }
        return text;
    }

    public void clickOnReportTab() {
        try {
            REPORT_TAB.click();
        } catch (Exception e) {
            Log.addLog("css of REPORT_TAB");
        }
    }

    /**
     * ----------------- END HEADER -----------------
     */

    /**
     * ----------------- START SEARCH AND FILTER -----------------
     */
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
     * Object: WITHDRAWAL_DATE_FILTER
     */
    public boolean isDisplayWithdrawalDateFilter() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_DATE_FILTER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_FILTER");
        }
        return isDisplay;
    }

    public String getWithdrawalDateFilter() {
        String text = "";
        try {
            text = WITHDRAWAL_DATE_FILTER.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_FILTER");
        }
        return text;
    }

    public void clickOnWithdrawalDateFilter() {
        try {
            WITHDRAWAL_DATE_FILTER.click();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_FILTER");
        }
    }

    /**
     * Object: WITHDRAWAL_DATE_TIME_PICKER
     */
    public boolean isDisplayWithdrawalDateTimePicker() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_DATE_TIME_PICKER.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_TIME_PICKER");
        }
        return isDisplay;
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
    /**
     * Object: IS_DISPLAY_STATUS_FILTER_POPUP
     */
    public boolean isDisplayStatusInProgressOption() {
        boolean isDisplay = false;
        try {
            isDisplay = IS_DISPLAY_STATUS_FILTER_POPUP.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of IS_DISPLAY_STATUS_FILTER_POPUP");
        }
        return isDisplay;
    }

    /**
     * ----------------- END SEARCH AND FILTER -----------------
     */
    /**
     * ----------------- START DATA TABLE -----------------
     */
    /**
     * --------------------------------------------------------------
     * Object: Table - WITHDRAWAL_DATE_TITLE
     */
    public boolean isDisplayWithdrawalDateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_DATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_TITLE");
        }
        return isDisplay;
    }

    public String getWithdrawalDateTitle() {
        String text = "";
        try {
            text = WITHDRAWAL_DATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_TITLE");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: Table - TNX_CODE_TITLE
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
     * --------------------------------------------------------------
     * Object: Table - TRANSFER_TO_TITLE
     */
    public boolean isDisplayTransferToTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TRANSFER_TO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TRANSFER_TO_TITLE");
        }
        return isDisplay;
    }

    public String getTransferToTitle() {
        String text = "";
        try {
            text = TRANSFER_TO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TRANSFER_TO_TITLE");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: Table - CONTENT_TITLE
     */
    public boolean isDisplayContentTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTENT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_TITLE");
        }
        return isDisplay;
    }

    public String getContentTitle() {
        String text = "";
        try {
            text = CONTENT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_TITLE");
        }
        return text;
    }

    /**
     * --------------------------------------------------------------
     * Object: Table - AMOUNT_TITLE
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
     * --------------------------------------------------------------
     * Object: Table - STATUS_TITLE
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

    public String getTnxCodeByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TnxCode)).getText();
            } catch (Exception e) {
                Log.addLog("css of TnxCode at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnRecordByTnxCode(String tnxCode) {
        boolean isFound = false;
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                clickOnRecordByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
        }
    }

    public String getWithdrawalDateByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(WithdrawalDate)).getText();
            } catch (Exception e) {
                Log.addLog("css of WithdrawalDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getWithdrawalDateByTnxCode(String tnxCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                text = getWithdrawalDateByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
        }
        return text;
    }

    public String getTransferToByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TransferTo)).getText();
            } catch (Exception e) {
                Log.addLog("css of TransferTo at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTransferToByTnxCode(String tnxCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                text = getTransferToByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
        }
        return text;
    }

    public String getContentByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Content)).getText();
            } catch (Exception e) {
                Log.addLog("css of Content at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getContentByTnxCode(String tnxCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                text = getContentByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
        }
        return text;
    }

    public String getAmountByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Amount)).getText();
            } catch (Exception e) {
                Log.addLog("css of getAmount at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getAmountByTnxCode(String tnxCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                text = getAmountByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
        }
        return text;
    }

    public String getTnxStatusByPosition(int pos) {
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

    public String getTnxStatusByTnxCode(String tnxCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                text = getTnxStatusByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
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

    public String getActionByTnxCode(String tnxCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalRecordTable(); i++) {
            if (getTnxCodeByPosition(i).toLowerCase().equals(tnxCode.toLowerCase())) {
                isFound = true;
                text = getActionByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing record on this page have tnxCode is " + tnxCode);
        }
        return text;
    }

    public void clickOnActionByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(Action)).click();
            } catch (Exception e) {
                Log.addLog("css of ActionIcon at " + pos);
            }
        }
    }

    /**
     * ----------------- END DATA TABLE -----------------
     */

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("finanpay");
    }
}
