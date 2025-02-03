package finanPage.invoice;

import config.Configs;
import finanCommon.FinanBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Log;

import java.util.List;

public class InvoiceListPage extends FinanBase {
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
    private WebElement AND_SEARCH_ICON;
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_SEARCH_BOX;
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_FILTER_ICON;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EXPIRED_TAB;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EXPIRATION_SOON_TAB;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ALL_TAB;
    private static final String AndTabText = "";
    private static final String AndTabCount = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EMPTY_STATEMENT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATE_INVOICE_BUTTON;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_INVOICE_LIST;
    private static final String AndCustomer = "";
    private static final String AndInvoiceCode = "";
    private static final String AndCreatedDate = "";
    private static final String AndInvoiceAmount = "";
    private static final String AndInvoiceStatus = "";

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
    private WebElement IOS_SEARCH_ICON;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_SEARCH_BOX;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_FILTER_ICON;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EXPIRED_TAB;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EXPIRATION_SOON_TAB;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ALL_TAB;
    private static final String IOSTabText = "";
    private static final String IOSTabCount = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EMPTY_STATEMENT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATE_INVOICE_BUTTON;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_INVOICE_LIST;
    private static final String IOSCustomer = "";
    private static final String IOSInvoiceCode = "";
    private static final String IOSCreatedDate = "";
    private static final String IOSInvoiceAmount = "";
    private static final String IOSInvoiceStatus = "";

    /**
     * [IOS] footer
     */

    /**
     * ==============================================================================================================
     * Constructor
     */
    public InvoiceListPage(AppiumDriver driver) {
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
     * Object: SEARCH_ICON
     */
    public boolean isDisplaySearchIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SEARCH_ICON.isDisplayed();
            } else {
                isDisplay = IOS_SEARCH_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SEARCH_ICON");
        }
        return isDisplay;
    }

    public void clickOnSearchIcon() {
        try {
            if (Configs.isAndroid) {
                AND_SEARCH_ICON.click();
            } else {
                IOS_SEARCH_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SEARCH_ICON");
        }
    }

    /**
     * Object: SEARCH_BOX
     */
    public boolean isDisplaySearchBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SEARCH_BOX.isDisplayed();
            } else {
                isDisplay = IOS_SEARCH_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SEARCH_BOX");
        }
        return isDisplay;
    }

    public String getSearchValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SEARCH_BOX.getText();
            } else {
                text = IOS_SEARCH_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SEARCH_BOX");
        }
        return text;
    }

    public void clearSearchBox() {
        try {
            if (Configs.isAndroid) {
                AND_SEARCH_BOX.clear();
            } else {
                IOS_SEARCH_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SEARCH_BOX");
        }
    }

    public void setSearchBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_SEARCH_BOX.sendKeys(text);
            } else {
                IOS_SEARCH_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of SEARCH_BOX");
        }
    }

    /**
     * Object: FILTER_ICON
     */
    public boolean isDisplayFilterIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_FILTER_ICON.isDisplayed();
            } else {
                isDisplay = IOS_FILTER_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FILTER_ICON");
        }
        return isDisplay;
    }

    public void clickOnFilterIcon() {
        try {
            if (Configs.isAndroid) {
                AND_FILTER_ICON.click();
            } else {
                IOS_FILTER_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of FILTER_ICON");
        }
    }

    /**
     * Object: EXPIRED_TAB
     */
    public boolean isDisplayExpiredTab() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EXPIRED_TAB.isDisplayed();
            } else {
                isDisplay = IOS_EXPIRED_TAB.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_TAB");
        }
        return isDisplay;
    }

    public String getExpiredTabText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EXPIRED_TAB.findElement(By.cssSelector(AndTabText)).getText();
            } else {
                text = IOS_EXPIRED_TAB.findElement(By.cssSelector(IOSTabText)).getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_TAB - TabText");
        }
        return text;
    }

    public String getExpiredTabCount() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EXPIRED_TAB.findElement(By.cssSelector(AndTabCount)).getText();
            } else {
                text = IOS_EXPIRED_TAB.findElement(By.cssSelector(IOSTabCount)).getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_TAB - TabCount");
        }
        return text;
    }

    public void clickOnExpiredTab() {
        try {
            if (Configs.isAndroid) {
                AND_EXPIRED_TAB.click();
            } else {
                IOS_EXPIRED_TAB.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRED_TAB");
        }
    }

    /**
     * Object: EXPIRATION_SOON_TAB
     */
    public boolean isDisplayExpirationSoonTab() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EXPIRATION_SOON_TAB.isDisplayed();
            } else {
                isDisplay = IOS_EXPIRATION_SOON_TAB.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRATION_SOON_TAB");
        }
        return isDisplay;
    }

    public String getExpirationSoonTabText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EXPIRATION_SOON_TAB.findElement(By.cssSelector(AndTabText)).getText();
            } else {
                text = IOS_EXPIRATION_SOON_TAB.findElement(By.cssSelector(IOSTabText)).getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRATION_SOON_TAB - TabText");
        }
        return text;
    }

    public String getExpirationSoonTabCount() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EXPIRATION_SOON_TAB.findElement(By.cssSelector(AndTabCount)).getText();
            } else {
                text = IOS_EXPIRATION_SOON_TAB.findElement(By.cssSelector(IOSTabCount)).getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRATION_SOON_TAB - TabCount");
        }
        return text;
    }

    public void clickOnExpirationSoonTab() {
        try {
            if (Configs.isAndroid) {
                AND_EXPIRATION_SOON_TAB.click();
            } else {
                IOS_EXPIRATION_SOON_TAB.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EXPIRATION_SOON_TAB");
        }
    }

    /**
     * Object: ALL_TAB
     */
    public boolean isDisplayAllTab() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ALL_TAB.isDisplayed();
            } else {
                isDisplay = IOS_ALL_TAB.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ALL_TAB");
        }
        return isDisplay;
    }

    public String getAllTabText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_ALL_TAB.getText();
            } else {
                text = IOS_ALL_TAB.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ALL_TAB");
        }
        return text;
    }

    public void clickOnAllTab() {
        try {
            if (Configs.isAndroid) {
                AND_ALL_TAB.click();
            } else {
                IOS_ALL_TAB.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ALL_TAB");
        }
    }

    /**
     * Object: EMPTY_STATEMENT_LABEL
     */
    public boolean isDisplayEmptyStatementLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EMPTY_STATEMENT_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_EMPTY_STATEMENT_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMPTY_STATEMENT_LABEL");
        }
        return isDisplay;
    }

    public String getEmptyStatementLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EMPTY_STATEMENT_LABEL.getText();
            } else {
                text = IOS_EMPTY_STATEMENT_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMPTY_STATEMENT_LABEL");
        }
        return text;
    }

    /**
     * Object: EMPTY_STATEMENT_CREATE_INVOICE_BUTTON
     */
    public boolean isDisplayEmptyStatementCreateInvoiceButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMPTY_STATEMENT_CREATE_INVOICE_BUTTON");
        }
        return isDisplay;
    }

    public String getEmptyStatementCreateInvoiceButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON.getText();
            } else {
                text = IOS_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMPTY_STATEMENT_CREATE_INVOICE_BUTTON");
        }
        return text;
    }

    public void clickOnEmptyStatementCreateInvoiceButtonText() {
        try {
            if (Configs.isAndroid) {
                AND_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON.click();
            } else {
                IOS_EMPTY_STATEMENT_CREATE_INVOICE_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of EMPTY_STATEMENT_CREATE_INVOICE_BUTTON");
        }
    }

    /**
     * Object: CREATE_INVOICE_BUTTON
     */
    public boolean isDisplayCreateInvoiceButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATE_INVOICE_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_CREATE_INVOICE_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATE_INVOICE_BUTTON");
        }
        return isDisplay;
    }

    public void clickOnCreateInvoiceButton() {
        try {
            if (Configs.isAndroid) {
                AND_CREATE_INVOICE_BUTTON.click();
            } else {
                IOS_CREATE_INVOICE_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATE_INVOICE_BUTTON");
        }
    }

    /**
     * Object: INVOICE_LIST
     */
    private WebElement getInvoiceElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_INVOICE_LIST.get(pos);
            } else {
                element = IOS_INVOICE_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of IOS_INVOICE_LIST at " + pos);
        }
        return element;
    }

    public int getTotalInvoice() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_INVOICE_LIST.size();
            } else {
                total = IOS_INVOICE_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of IOS_INVOICE_LIST");
        }
        return total;
    }

    public String getInvoiceCustomerByPosition(int pos) {
        WebElement element = getInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndCustomer)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSCustomer)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of InvoiceCustomer at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getInvoiceCustomerByInvoiceCode(String invoiceCode) {
        String text = "";
        boolean isFound = false;
        for (int i = 0; i < getTotalInvoice(); i++) {
            if (getInvoiceCodeByPosition(i).toLowerCase().equals(invoiceCode.toLowerCase())) {
                isFound = true;
                text = getInvoiceCustomerByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing invoice with code " + invoiceCode);
        }
        return text;
    }

    public String getInvoiceCodeByPosition(int pos) {
        WebElement element = getInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndInvoiceCode)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSInvoiceCode)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of InvoiceCode at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getInvoiceCreatedByPosition(int pos) {
        WebElement element = getInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndCreatedDate)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSCreatedDate)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of CreatedDate at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getInvoiceCreatedByInvoiceCode(String invoiceCode) {
        String text = "";
        boolean isFound = false;
        for (int i = 0; i < getTotalInvoice(); i++) {
            if (getInvoiceCodeByPosition(i).toLowerCase().equals(invoiceCode.toLowerCase())) {
                isFound = true;
                text = getInvoiceCreatedByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing invoice with code " + invoiceCode);
        }
        return text;
    }

    public String getInvoiceAmountByPosition(int pos) {
        WebElement element = getInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndInvoiceAmount)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSInvoiceAmount)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of InvoiceAmount at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getInvoiceAmountByInvoiceCode(String invoiceCode) {
        String text = "";
        boolean isFound = false;
        for (int i = 0; i < getTotalInvoice(); i++) {
            if (getInvoiceCodeByPosition(i).toLowerCase().equals(invoiceCode.toLowerCase())) {
                isFound = true;
                text = getInvoiceAmountByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing invoice with code " + invoiceCode);
        }
        return text;
    }

    public String getInvoiceStatusByPosition(int pos) {
        WebElement element = getInvoiceElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndInvoiceStatus)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSInvoiceStatus)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of InvoiceStatus at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getInvoiceStatusByInvoiceCode(String invoiceCode) {
        String text = "";
        boolean isFound = false;
        for (int i = 0; i < getTotalInvoice(); i++) {
            if (getInvoiceCodeByPosition(i).toLowerCase().equals(invoiceCode.toLowerCase())) {
                isFound = true;
                text = getInvoiceStatusByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing invoice with code " + invoiceCode);
        }
        return text;
    }

    public void clickOnInvoiceByPosition(int pos) {
        WebElement element = getInvoiceElement(pos);
        if (element != null) {
            element.click();
        }
    }

    public void clickOnInvoiceByInvoiceCode(String invoiceCode) {
        boolean isFound = false;
        for (int i = 0; i < getTotalInvoice(); i++) {
            if (getInvoiceCodeByPosition(i).toLowerCase().equals(invoiceCode.toLowerCase())) {
                isFound = true;
                clickOnInvoiceByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing invoice with code " + invoiceCode);
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplaySearchIcon() && isDisplayPageTitle() && getPageTitle().toLowerCase().contains("hoá đơn");
    }
}
