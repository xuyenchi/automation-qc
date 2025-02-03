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

import java.util.List;

public class CreateInvoicePage extends FinanBase {
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

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CHOICE_CUSTOMER_BOX;
    private static final String AndCustomerName = "";
    private static final String AndCustomerMail = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CHOICE_CUSTOMER_ICON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CHOICE_CUSTOMER_ERROR_MESSAGE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_AT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_AT_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATED_AT_PICKER;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DUE_DATE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DUE_DATE_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DUE_DATE_PICKER;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_CODE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_INVOICE_CODE_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_TAX_ACTION_OBJ;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_TAX_ACTION_LIST;
    private static final String AndTaxActionName = "";
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_PRODUCT_LIST;
    private static final String AndProductName = "";
    private static final String AndProductPrice = "";
    private static final String AndProductQuantity = "";
    private static final String AndProductSubtotal = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ADD_PRODUCT_LINK;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_AMOUNT_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_AMOUNT_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_AMOUNT_ERROR_MESSAGE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ADD_TAX_LINK;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SUBTOTAL_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SUBTOTAL_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_DISCOUNT_LINK;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_SURCHARGE_LIST;
    private static final String AndSurchargeContent = "";
    private static final String AndSurchargePrice = "";
    @FindBy(xpath = AndBody + "")
    private WebElement AND_TOTAL_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_TOTAL_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_NOTE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_NOTE_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ATTACHMENT_LINK;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PAYMENT_METHOD_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PAYMENT_METHOD_ICON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SCROLLABLE;

    /**
     * [Android] footer
     */
    @FindBy(xpath = AndFooter + "")
    private WebElement AND_DRAFT_SAVE_BUTTON;
    @FindBy(xpath = AndFooter + "")
    private WebElement AND_CONFIRM_BUTTON;

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

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CHOICE_CUSTOMER_BOX;
    private static final String IOSCustomerName = "";
    private static final String IOSCustomerMail = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CHOICE_CUSTOMER_ICON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CHOICE_CUSTOMER_ERROR_MESSAGE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_AT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_AT_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATED_AT_PICKER;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DUE_DATE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DUE_DATE_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DUE_DATE_PICKER;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_CODE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_INVOICE_CODE_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_TAX_ACTION_OBJ;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_TAX_ACTION_LIST;
    private static final String IOSTaxActionName = "";
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_PRODUCT_LIST;
    private static final String IOSProductName = "";
    private static final String IOSProductPrice = "";
    private static final String IOSProductQuantity = "";
    private static final String IOSProductSubtotal = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ADD_PRODUCT_LINK;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_AMOUNT_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_AMOUNT_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_AMOUNT_ERROR_MESSAGE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ADD_TAX_LINK;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SUBTOTAL_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SUBTOTAL_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_DISCOUNT_LINK;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_SURCHARGE_LIST;
    private static final String IOSSurchargeContent = "";
    private static final String IOSSurchargePrice = "";
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_TOTAL_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_TOTAL_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_NOTE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_NOTE_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ATTACHMENT_LINK;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PAYMENT_METHOD_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PAYMENT_METHOD_ICON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SCROLLABLE;

    /**
     * [IOS] footer
     */
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_DRAFT_SAVE_BUTTON;
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public CreateInvoicePage(AppiumDriver driver) {
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
     * Object: CHOICE_CUSTOMER_BOX
     */
    public boolean isDisplayChoiceCustomerBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CHOICE_CUSTOMER_BOX.isDisplayed();
            } else {
                isDisplay = IOS_CHOICE_CUSTOMER_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_BOX");
        }
        return isDisplay;
    }

    public void clickOnChoiceCustomerBox() {
        try {
            if (Configs.isAndroid) {
                AND_CHOICE_CUSTOMER_BOX.click();
            } else {
                IOS_CHOICE_CUSTOMER_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_BOX");
        }
    }

    public String getCustomerName() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CHOICE_CUSTOMER_BOX.findElement(By.xpath(AndCustomerName)).getText();
            } else {
                text = IOS_CHOICE_CUSTOMER_BOX.findElement(By.xpath(IOSCustomerName)).getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_BOX - CustomerName");
        }
        return text;
    }

    public String getCustomerMail() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CHOICE_CUSTOMER_BOX.findElement(By.xpath(AndCustomerMail)).getText();
            } else {
                text = IOS_CHOICE_CUSTOMER_BOX.findElement(By.xpath(IOSCustomerMail)).getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_BOX - CustomerMail");
        }
        return text;
    }

    /**
     * Object: CHOICE_CUSTOMER_ICON
     */
    public boolean isDisplayChoiceCustomerIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CHOICE_CUSTOMER_ICON.isDisplayed();
            } else {
                isDisplay = IOS_CHOICE_CUSTOMER_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_ICON");
        }
        return isDisplay;
    }

    public void clickOnChoiceCustomerIcon() {
        try {
            if (Configs.isAndroid) {
                AND_CHOICE_CUSTOMER_ICON.click();
            } else {
                IOS_CHOICE_CUSTOMER_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_ICON");
        }
    }

    /**
     * Object: CHOICE_CUSTOMER_ERROR_MESSAGE
     */
    public boolean isDisplayCustomerErrorMessage() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CHOICE_CUSTOMER_ERROR_MESSAGE.isDisplayed();
            } else {
                isDisplay = IOS_CHOICE_CUSTOMER_ERROR_MESSAGE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getCustomerErrorMessage() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CHOICE_CUSTOMER_ERROR_MESSAGE.getText();
            } else {
                text = IOS_CHOICE_CUSTOMER_ERROR_MESSAGE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CHOICE_CUSTOMER_ERROR_MESSAGE");
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
     * Object: CREATED_AT_BOX
     */
    public boolean isDisplayCreatedAtBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATED_AT_BOX.isDisplayed();
            } else {
                isDisplay = IOS_CREATED_AT_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_BOX");
        }
        return isDisplay;
    }

    public String getCreatedAtValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATED_AT_BOX.getText();
            } else {
                text = IOS_CREATED_AT_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_BOX");
        }
        return text;
    }

    public void clickOnCreateAtBox() {
        try {
            if (Configs.isAndroid) {
                AND_CREATED_AT_BOX.click();
            } else {
                IOS_CREATED_AT_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATED_AT_BOX");
        }
    }

    /**
     * Object: CREATED_AT_PICKER
     */
    public void setCreateAt(String yyyy, String mm, String dd) {
        if (Configs.isAndroid) {
            setAndDatePicker(AND_CREATED_AT_PICKER, yyyy, mm, dd);
        } else {
            setIOSDatePicker(IOS_CREATED_AT_PICKER, yyyy, mm, dd);
        }
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
     * Object: DUE_DATE_BOX
     */
    public boolean isDisplayDueDateBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DUE_DATE_BOX.isDisplayed();
            } else {
                isDisplay = IOS_DUE_DATE_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_BOX");
        }
        return isDisplay;
    }

    public String getDueDateValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DUE_DATE_BOX.getText();
            } else {
                text = IOS_DUE_DATE_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_BOX");
        }
        return text;
    }

    public void clickOnDueDateBox() {
        try {
            if (Configs.isAndroid) {
                AND_DUE_DATE_BOX.click();
            } else {
                IOS_DUE_DATE_BOX.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DUE_DATE_BOX");
        }
    }

    /**
     * Object: DUE_DATE_PICKER
     */
    public void setDueDate(String yyyy, String mm, String dd) {
        if (Configs.isAndroid) {
            setAndDatePicker(AND_DUE_DATE_PICKER, yyyy, mm, dd);
        } else {
            setIOSDatePicker(IOS_DUE_DATE_PICKER, yyyy, mm, dd);
        }
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
     * Object: INVOICE_CODE_BOX
     */
    public boolean isDisplayInvoiceCodeBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_INVOICE_CODE_BOX.isDisplayed();
            } else {
                isDisplay = IOS_INVOICE_CODE_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_BOX");
        }
        return isDisplay;
    }

    public String getInvoiceCodeValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_INVOICE_CODE_BOX.getText();
            } else {
                text = IOS_INVOICE_CODE_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_BOX");
        }
        return text;
    }

    public void clearInvoiceCodeBox() {
        try {
            if (Configs.isAndroid) {
                AND_INVOICE_CODE_BOX.clear();
            } else {
                IOS_INVOICE_CODE_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_BOX");
        }
    }

    public void setInvoiceCodeBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_INVOICE_CODE_BOX.sendKeys(text);
            } else {
                IOS_INVOICE_CODE_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of INVOICE_CODE_BOX");
        }
    }

    /**
     * Object: TAX_ACTION_OBJ
     */
    public boolean isDisplayTaxActionObj() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_TAX_ACTION_OBJ.isDisplayed();
            } else {
                isDisplay = IOS_TAX_ACTION_OBJ.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_ACTION_OBJ");
        }
        return isDisplay;
    }

    public void clickOnTaxActionObj() {
        try {
            if (Configs.isAndroid) {
                AND_TAX_ACTION_OBJ.click();
            } else {
                IOS_TAX_ACTION_OBJ.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_ACTION_OBJ");
        }
    }

    /**
     * Object: TAX_ACTION_LIST
     */
    private WebElement getTaxActionElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_TAX_ACTION_LIST.get(pos);
            } else {
                element = IOS_TAX_ACTION_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_ACTION_LIST at " + pos);
        }
        return element;
    }

    public int getTotalTaxAction() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_TAX_ACTION_LIST.size();
            } else {
                total = IOS_TAX_ACTION_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_ACTION_LIST");
        }
        return total;
    }

    public String getTaxActionNameByPosition(int pos) {
        WebElement element = getTaxActionElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndTaxActionName)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSTaxActionName)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of TaxActionName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnTaxActionNameByPosition(int pos) {
        WebElement element = getTaxActionElement(pos);
        if (element != null) {
            try {
                if (Configs.isAndroid) {
                    element.findElement(By.xpath(AndTaxActionName)).click();
                } else {
                    element.findElement(By.xpath(IOSTaxActionName)).click();
                }
            } catch (Exception e) {
                Log.addLog("xPath of TaxActionName at " + pos);
            }
        }
    }

    /**
     * Object: PRODUCT_LIST
     */
    private WebElement getProductElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_PRODUCT_LIST.get(pos);
            } else {
                element = IOS_PRODUCT_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRODUCT_LIST at " + pos);
        }
        return element;
    }

    public int getTotalProduct() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_PRODUCT_LIST.size();
            } else {
                total = IOS_PRODUCT_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRODUCT_LIST");
        }
        return total;
    }

    public String getProductNameByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndProductName)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSProductName)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of ProductName at " + pos);
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
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndProductPrice)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSProductPrice)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of ProductName at " + pos);
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
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndProductQuantity)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSProductQuantity)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of ProductName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getProductSubtotalByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndProductSubtotal)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSProductSubtotal)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of ProductName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnProductByPosition(int pos) {
        WebElement element = getProductElement(pos);
        if (element != null) {
            element.click();
        }
    }

    /**
     * Object: ADD_PRODUCT_LINK
     */
    public boolean isDisplayAddProductLink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ADD_PRODUCT_LINK.isDisplayed();
            } else {
                isDisplay = IOS_ADD_PRODUCT_LINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_PRODUCT_LINK");
        }
        return isDisplay;
    }

    public String getAddProductLinkText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_ADD_PRODUCT_LINK.getText();
            } else {
                text = IOS_ADD_PRODUCT_LINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_PRODUCT_LINK");
        }
        return text;
    }

    public void clickOnAddProductLink() {
        try {
            if (Configs.isAndroid) {
                AND_ADD_PRODUCT_LINK.click();
            } else {
                IOS_ADD_PRODUCT_LINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_PRODUCT_LINK");
        }
    }

    /**
     * Object: AMOUNT_LABEL
     * note: only with invoice nothing product
     */
    public boolean isDisplayAmountLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_AMOUNT_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_AMOUNT_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getAmountLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_AMOUNT_LABEL.getText();
            } else {
                text = IOS_AMOUNT_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: AMOUNT_BOX
     */
    public boolean isDisplayAmountBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_AMOUNT_BOX.isDisplayed();
            } else {
                isDisplay = IOS_AMOUNT_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_BOX");
        }
        return isDisplay;
    }

    public String getAmountValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_AMOUNT_BOX.getText();
            } else {
                text = IOS_AMOUNT_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_BOX");
        }
        return text;
    }

    public void clearAmountBox() {
        try {
            if (Configs.isAndroid) {
                AND_AMOUNT_BOX.clear();
            } else {
                IOS_AMOUNT_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_BOX");
        }
    }

    public void setAmountBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_AMOUNT_BOX.sendKeys(text);
            } else {
                IOS_AMOUNT_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_BOX");
        }
    }

    /**
     * Object: AMOUNT_ERROR_MESSAGE
     */
    public boolean isDisplayAmountErrorMessage() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_AMOUNT_ERROR_MESSAGE.isDisplayed();
            } else {
                isDisplay = IOS_AMOUNT_ERROR_MESSAGE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getAmountErrorMessage() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_AMOUNT_ERROR_MESSAGE.getText();
            } else {
                text = IOS_AMOUNT_ERROR_MESSAGE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of AMOUNT_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: ADD_TAX_LINK
     */
    public boolean isDisplayAddTaxLink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ADD_TAX_LINK.isDisplayed();
            } else {
                isDisplay = IOS_ADD_TAX_LINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_TAX_LINK");
        }
        return isDisplay;
    }

    public String getAddTaxLinkText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_ADD_TAX_LINK.getText();
            } else {
                text = IOS_ADD_TAX_LINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_TAX_LINK");
        }
        return text;
    }

    public void clickOnAddTaxLink() {
        try {
            if (Configs.isAndroid) {
                AND_ADD_TAX_LINK.click();
            } else {
                IOS_ADD_TAX_LINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_TAX_LINK");
        }
    }

    /**
     * Object: SUBTOTAL_LABEL
     */
    public boolean isDisplaySubtotalLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SUBTOTAL_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_SUBTOTAL_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SUBTOTAL_LABEL");
        }
        return isDisplay;
    }

    public String getSubtotalLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SUBTOTAL_LABEL.getText();
            } else {
                text = IOS_SUBTOTAL_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SUBTOTAL_LABEL");
        }
        return text;
    }

    /**
     * Object: SUBTOTAL_VALUE
     */
    public boolean isDisplaySubtotalValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SUBTOTAL_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_SUBTOTAL_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SUBTOTAL_VALUE");
        }
        return isDisplay;
    }

    public String getSubtotalValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_SUBTOTAL_VALUE.getText();
            } else {
                text = IOS_SUBTOTAL_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SUBTOTAL_VALUE");
        }
        return text;
    }

    /**
     * Object: DISCOUNT_LINK
     */
    public boolean isDisplayDiscountLink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DISCOUNT_LINK.isDisplayed();
            } else {
                isDisplay = IOS_DISCOUNT_LINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_LINK");
        }
        return isDisplay;
    }

    public String getDiscountLinkText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DISCOUNT_LINK.getText();
            } else {
                text = IOS_DISCOUNT_LINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_LINK");
        }
        return text;
    }

    public void clickOnDiscountLink() {
        try {
            if (Configs.isAndroid) {
                AND_DISCOUNT_LINK.click();
            } else {
                IOS_DISCOUNT_LINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DISCOUNT_LINK");
        }
    }

    /**
     * Object: SURCHARGE_LIST
     */
    private WebElement getSurchargeElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_SURCHARGE_LIST.get(pos);
            } else {
                element = IOS_SURCHARGE_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of SURCHARGE_LIST at " + pos);
        }
        return element;
    }

    public int getTotalSurcharge() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_SURCHARGE_LIST.size();
            } else {
                total = IOS_SURCHARGE_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SURCHARGE_LIST");
        }
        return total;
    }

    public String getSurchargeContentByPosition(int pos) {
        WebElement element = getSurchargeElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndSurchargeContent)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSSurchargeContent)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of SurchargeContent at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getSurchargePriceByPosition(int pos) {
        WebElement element = getSurchargeElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndSurchargePrice)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSSurchargePrice)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of SurchargeContent at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    /**
     * Object: TOTAL_LABEL
     */
    public boolean isDisplayTotalLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_TOTAL_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_TOTAL_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TOTAL_LABEL");
        }
        return isDisplay;
    }

    public String getTotalLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_TOTAL_LABEL.getText();
            } else {
                text = IOS_TOTAL_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TOTAL_LABEL");
        }
        return text;
    }

    /**
     * Object: TOTAL_VALUE
     */
    public boolean isDisplayTotalValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_TOTAL_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_TOTAL_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TOTAL_VALUE");
        }
        return isDisplay;
    }

    public String getTotalValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_TOTAL_VALUE.getText();
            } else {
                text = IOS_TOTAL_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TOTAL_VALUE");
        }
        return text;
    }

    /**
     * Object: NOTE_LABEL
     */
    public boolean isDisplayNoteLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_NOTE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_NOTE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of NOTE_LABEL");
        }
        return isDisplay;
    }

    public String getNoteLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_NOTE_LABEL.getText();
            } else {
                text = IOS_NOTE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of NOTE_LABEL");
        }
        return text;
    }

    /**
     * Object: NOTE_BOX
     */
    public boolean isDisplayNoteBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_NOTE_BOX.isDisplayed();
            } else {
                isDisplay = IOS_NOTE_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of NOTE_BOX");
        }
        return isDisplay;
    }

    public String getNoteValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_NOTE_BOX.getText();
            } else {
                text = IOS_NOTE_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of NOTE_BOX");
        }
        return text;
    }

    public void clearNoteBox() {
        try {
            if (Configs.isAndroid) {
                AND_NOTE_BOX.clear();
            } else {
                IOS_NOTE_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of NOTE_BOX");
        }
    }

    public void setNoteBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_NOTE_BOX.sendKeys(text);
            } else {
                IOS_NOTE_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of NOTE_BOX");
        }
    }

    /**
     * Object: ATTACHMENT_LINK
     */
    public boolean isDisplayAttachmentLink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ATTACHMENT_LINK.isDisplayed();
            } else {
                isDisplay = IOS_ATTACHMENT_LINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_LINK");
        }
        return isDisplay;
    }

    public String getAttachmentLinkText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_ATTACHMENT_LINK.getText();
            } else {
                text = IOS_ATTACHMENT_LINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_LINK");
        }
        return text;
    }

    public void clickOnAttachmentLink() {
        try {
            if (Configs.isAndroid) {
                AND_ATTACHMENT_LINK.click();
            } else {
                IOS_ATTACHMENT_LINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ATTACHMENT_LINK");
        }
    }

    /**
     * Object: PAYMENT_METHOD_LABEL
     */
    public boolean isDisplayPaymentMethodLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PAYMENT_METHOD_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_PAYMENT_METHOD_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_METHOD_LABEL");
        }
        return isDisplay;
    }

    public String getPaymentMethodLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PAYMENT_METHOD_LABEL.getText();
            } else {
                text = IOS_PAYMENT_METHOD_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_METHOD_LABEL");
        }
        return text;
    }

    /**
     * Object: PAYMENT_METHOD_ICON
     */
    public boolean isDisplayPaymentMethodIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PAYMENT_METHOD_ICON.isDisplayed();
            } else {
                isDisplay = IOS_PAYMENT_METHOD_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_METHOD_ICON");
        }
        return isDisplay;
    }

    public void clickOnPaymentMethodIcon() {
        try {
            if (Configs.isAndroid) {
                AND_PAYMENT_METHOD_ICON.click();
            } else {
                IOS_PAYMENT_METHOD_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PAYMENT_METHOD_ICON");
        }
    }

    /**
     * Object: SCROLLABLE
     */
    public void scrollPage(Direction direction) {
        if (Configs.isAndroid) {
            scrollInElements(AND_SCROLLABLE, direction);
        } else {
            scrollInElements(IOS_SCROLLABLE, direction);
        }
    }

    /**
     * Object: DRAFT_SAVE_BUTTON
     */
    public boolean isDisplayDraftSaveButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DRAFT_SAVE_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_DRAFT_SAVE_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DRAFT_SAVE_BUTTON");
        }
        return isDisplay;
    }

    public String getDraftSaveButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DRAFT_SAVE_BUTTON.getText();
            } else {
                text = IOS_DRAFT_SAVE_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DRAFT_SAVE_BUTTON");
        }
        return text;
    }

    public void clickOnDraftSaveButton() {
        try {
            if (Configs.isAndroid) {
                AND_DRAFT_SAVE_BUTTON.click();
            } else {
                IOS_DRAFT_SAVE_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DRAFT_SAVE_BUTTON");
        }
    }

    /**
     * Object: CONFIRM_BUTTON
     */
    public boolean isDisplayConfirmButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CONFIRM_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_CONFIRM_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONFIRM_BUTTON");
        }
        return isDisplay;
    }

    public String getConfirmButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CONFIRM_BUTTON.getText();
            } else {
                text = IOS_CONFIRM_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONFIRM_BUTTON");
        }
        return text;
    }

    public void clickOnConfirmButton() {
        try {
            if (Configs.isAndroid) {
                AND_CONFIRM_BUTTON.click();
            } else {
                IOS_CONFIRM_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CONFIRM_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("tạo hoá đơn") && isDisplayConfirmButton();
    }
}
