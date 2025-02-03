/* (C)2024 */
package finanOS.setting;

import finanOS.base.Sidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class SettingPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement BUSINESS_INFO_ICON;
    @FindBy(css = Body + "")
    private WebElement BUSINESS_INFO_TITLE;
    @FindBy(css = Body + "")
    private WebElement BUSINESS_INFO_CONTENT;
    @FindBy(css = Body + "")
    private WebElement STAFF_INFO_ICON;
    @FindBy(css = Body + "")
    private WebElement STAFF_INFO_TITLE;
    @FindBy(css = Body + "")
    private WebElement STAFF_INFO_CONTENT;
    @FindBy(css = Body + "")
    private WebElement INVOICE_INFO_ICON;
    @FindBy(css = Body + "")
    private WebElement INVOICE_INFO_TITLE;
    @FindBy(css = Body + "")
    private WebElement INVOICE_INFO_CONTENT;
    @FindBy(css = Body + "")
    private WebElement TAX_INFO_ICON;
    @FindBy(css = Body + "")
    private WebElement TAX_INFO_TITLE;
    @FindBy(css = Body + "")
    private WebElement TAX_INFO_CONTENT;
    @FindBy(css = Body + "")
    private WebElement EMAIL_TEMPLATE_ICON;
    @FindBy(css = Body + "")
    private WebElement EMAIL_TEMPLATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement EMAIL_TEMPLATE_CONTENT;

    public SettingPage(WebDriver driver) {
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
     * ----------------- START BUSINESS INFORMATION -----------------
     */
    /**
     * Object: BUSINESS_INFO_ICON
     */
    public boolean isDisplayBusinessInfoIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = BUSINESS_INFO_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_ICON");
        }
        return isDisplay;
    }

    public void clickOnBusinessInfoIcon() {
        try {
            BUSINESS_INFO_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_ICON");
        }
    }

    /**
     * Object: BUSINESS_INFO_TITLE
     */
    public boolean isDisplayBusinessInfoTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = BUSINESS_INFO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_TITLE");
        }
        return isDisplay;
    }

    public String getBusinessInfoTitle() {
        String text = "";
        try {
            text = BUSINESS_INFO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_TITLE");
        }
        return text;
    }

    public void clickOnBusinessInfoTitle() {
        try {
            BUSINESS_INFO_TITLE.click();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_TITLE");
        }
    }

    /**
     * Object: BUSINESS_INFO_CONTENT
     */
    public boolean isDisplayBusinessInfoContent() {
        boolean isDisplay = false;
        try {
            isDisplay = BUSINESS_INFO_CONTENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_CONTENT");
        }
        return isDisplay;
    }

    public String getBusinessInfoContent() {
        String text = "";
        try {
            text = BUSINESS_INFO_CONTENT.getText();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_CONTENT");
        }
        return text;
    }

    public void clickOnBusinessInfoContent() {
        try {
            BUSINESS_INFO_CONTENT.click();
        } catch (Exception e) {
            Log.addLog("css of BUSINESS_INFO_CONTENT");
        }
    }

    /**
     * ----------------- END BUSINESS INFORMATION -----------------
     */

    /**
     * ----------------- START STAFF INFORMATION -----------------
     */
    /**
     * Object: STAFF_INFO_ICON
     */
    public boolean isDisplayStaffInfoIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = STAFF_INFO_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_ICON");
        }
        return isDisplay;
    }

    public String getStaffInfoIcon() {
        String text = "";
        try {
            text = STAFF_INFO_ICON.getText();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_ICON");
        }
        return text;
    }

    public void clickOnStaffInfoIcon() {
        try {
            STAFF_INFO_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_ICON");
        }
    }

    /**
     * Object: STAFF_INFO_TITLE
     */
    public boolean isDisplayStaffInfoTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = STAFF_INFO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_TITLE");
        }
        return isDisplay;
    }

    public String getStaffInfoTitle() {
        String text = "";
        try {
            text = STAFF_INFO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_TITLE");
        }
        return text;
    }

    public void clickOnStaffInfoTitle() {
        try {
            STAFF_INFO_TITLE.click();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_TITLE");
        }
    }

    /**
     * Object: STAFF_INFO_CONTENT
     */
    public boolean isDisplayStaffInfoContent() {
        boolean isDisplay = false;
        try {
            isDisplay = STAFF_INFO_CONTENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_CONTENT");
        }
        return isDisplay;
    }

    public String getStaffInfoContent() {
        String text = "";
        try {
            text = STAFF_INFO_CONTENT.getText();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_CONTENT");
        }
        return text;
    }

    public void clickOnStaffInfoContent() {
        try {
            STAFF_INFO_CONTENT.click();
        } catch (Exception e) {
            Log.addLog("css of STAFF_INFO_CONTENT");
        }
    }

    /**
     * ----------------- END STAFF INFORMATION -----------------
     */

    /**
     * ----------------- START INVOICE INFORMATION -----------------
     */
    /**
     * Object: INVOICE_INFO_ICON
     */
    public boolean isDisplayInvoiceInfoIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_INFO_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_ICON");
        }
        return isDisplay;
    }

    public String getInvoiceInfoIcon() {
        String text = "";
        try {
            text = INVOICE_INFO_ICON.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_ICON");
        }
        return text;
    }

    public void clickOnInvoiceInfoIcon() {
        try {
            INVOICE_INFO_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_ICON");
        }
    }

    /**
     * Object: INVOICE_INFO_TITLE
     */
    public boolean isDisplayInvoiceInfoTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_INFO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_TITLE");
        }
        return isDisplay;
    }

    public String getInvoiceInfoTitle() {
        String text = "";
        try {
            text = INVOICE_INFO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_TITLE");
        }
        return text;
    }

    public void clickOnInvoiceInfoTitle() {
        try {
            INVOICE_INFO_TITLE.click();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_TITLE");
        }
    }

    /**
     * Object: INVOICE_INFO_CONTENT
     */
    public boolean isDisplayInvoiceInfoContent() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_INFO_CONTENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_CONTENT");
        }
        return isDisplay;
    }

    public String getInvoiceInfoContent() {
        String text = "";
        try {
            text = INVOICE_INFO_CONTENT.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_CONTENT");
        }
        return text;
    }

    public void clickOnInvoiceInfoContent() {
        try {
            INVOICE_INFO_CONTENT.click();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_INFO_CONTENT");
        }
    }

    /**
     * ----------------- END INVOICE INFORMATION -----------------
     */

    /**
     * ----------------- START TAX INFORMATION -----------------
     */
    /**
     * Object: TAX_INFO_ICON
     */
    public boolean isDisplayTaxInfoIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_INFO_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_ICON");
        }
        return isDisplay;
    }

    public String getTaxInfoIcon() {
        String text = "";
        try {
            text = TAX_INFO_ICON.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_ICON");
        }
        return text;
    }

    public void clickOnTaxInfoIcon() {
        try {
            TAX_INFO_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_ICON");
        }
    }

    /**
     * Object: TAX_INFO_TITLE
     */
    public boolean isDisplayTaxInfoTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_INFO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_TITLE");
        }
        return isDisplay;
    }

    public String getTaxInfoTitle() {
        String text = "";
        try {
            text = TAX_INFO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_TITLE");
        }
        return text;
    }

    public void clickOnTaxInfoTitle() {
        try {
            TAX_INFO_TITLE.click();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_TITLE");
        }
    }

    /**
     * Object: TAX_INFO_CONTENT
     */
    public boolean isDisplayTaxInfoContent() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_INFO_CONTENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_CONTENT");
        }
        return isDisplay;
    }

    public String getTaxInfoContent() {
        String text = "";
        try {
            text = TAX_INFO_CONTENT.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_CONTENT");
        }
        return text;
    }

    public void clickOnTaxInfoContent() {
        try {
            TAX_INFO_CONTENT.click();
        } catch (Exception e) {
            Log.addLog("css of TAX_INFO_CONTENT");
        }
    }

    /**
     * ----------------- END TAX INFORMATION -----------------
     */

    /**
     * ----------------- START EMAIL_TEMPLATE -----------------
     */
    /**
     * Object: EMAIL_TEMPLATE_ICON
     */
    public boolean isDisplayEmailTemplateIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = EMAIL_TEMPLATE_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_ICON");
        }
        return isDisplay;
    }

    public String getEmailTemplateIcon() {
        String text = "";
        try {
            text = EMAIL_TEMPLATE_ICON.getText();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_ICON");
        }
        return text;
    }

    public void clickOnEmailTemplateIcon() {
        try {
            EMAIL_TEMPLATE_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_ICON");
        }
    }

    /**
     * Object: EMAIL_TEMPLATE_TITLE
     */
    public boolean isDisplayEmailTemplateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = EMAIL_TEMPLATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_TITLE");
        }
        return isDisplay;
    }

    public String getEmailTemplateTitle() {
        String text = "";
        try {
            text = EMAIL_TEMPLATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_TITLE");
        }
        return text;
    }

    public void clickOnEmailTemplateTitle() {
        try {
            EMAIL_TEMPLATE_TITLE.click();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_TITLE");
        }
    }

    /**
     * Object: EMAIL_TEMPLATE_CONTENT
     */
    public boolean isDisplayEmailTemplateContent() {
        boolean isDisplay = false;
        try {
            isDisplay = EMAIL_TEMPLATE_CONTENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_CONTENT");
        }
        return isDisplay;
    }

    public String getEmailTemplateContent() {
        String text = "";
        try {
            text = EMAIL_TEMPLATE_CONTENT.getText();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_CONTENT");
        }
        return text;
    }

    public void clickOnEmailTemplateContent() {
        try {
            EMAIL_TEMPLATE_CONTENT.click();
        } catch (Exception e) {
            Log.addLog("css of EMAIL_TEMPLATE_CONTENT");
        }
    }

    /**
     * ----------------- END EMAIL_TEMPLATE -----------------
     */

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("cài đặt");
    }
}
