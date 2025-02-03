/* (C)2024 */
package finanOS.setting.invoiceSetting;

import finanOS.base.Sidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class InvoiceSettingPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement BACK_BUTTON;

    /**
     * Left Menu
     */
    @FindBy(css = Body + "")
    private WebElement SETTING_MENU;
    @FindBy(css = Body + "")
    private WebElement INVOICE_TEMPLATE_MENU;

    /**
     * Right Menu of Setting
     */
    @FindBy(css = Body + "")
    private WebElement SETTING_TITLE;
    @FindBy(css = Body + "")
    private WebElement SALE_OF_PRODUCT_TITLE;
    @FindBy(css = Body + "")
    private WebElement NO_TAX_TITLE;
    @FindBy(css = Body + "")
    private WebElement NO_TAX_OPTION;
    @FindBy(css = Body + "")
    private WebElement INCLUDE_TAX_TITLE;
    @FindBy(css = Body + "")
    private WebElement INCLUDE_TAX_OPTION;
    @FindBy(css = Body + "")
    private WebElement DEPEND_ON_INVOICE_TITLE;
    @FindBy(css = Body + "")
    private WebElement DEPEND_ON_INVOICE_OPTION;
    @FindBy(css = Body + "")
    private WebElement DISCOUNT_INVOICE_TITLE;
    @FindBy(css = Body + "")
    private WebElement BEFORE_TAX_TITLE;
    @FindBy(css = Body + "")
    private WebElement BEFORE_TAX_OPTION;
    @FindBy(css = Body + "")
    private WebElement AFTER_TAX_TITLE;
    @FindBy(css = Body + "")
    private WebElement AFTER_TAX_OPTION;
    @FindBy(css = Body + "")
    private WebElement SAVE_SETTING_BTN;

    /**
     * Right Menu of Invoice Template
     */
    @FindBy(css = Body + "")
    private WebElement INVOICE_TEMPLATE_TITLE;
    @FindBy(css = Body + "")
    private WebElement NAME_INVOICE_TITLE;
    @FindBy(css = Body + "")
    private WebElement NAME_INVOICE_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement FOOTER_OF_INVOICE_TITLE;
    @FindBy(css = Body + "")
    private WebElement FOOTER_OF_INVOICE_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement IS_DISPLAY_VIET_QR_TITLE;
    @FindBy(css = Body + "")
    private WebElement IS_DISPLAY_VIET_QR_CONTENT;
    @FindBy(css = Body + "")
    private WebElement IS_DISPLAY_VIET_QR_CHECK_BOX;
    @FindBy(css = Body + "")
    private WebElement SAVE_EMAIL_TEMPLATE_BTN;

    /**
     * Save popup
     */
    @FindBy(css = Body + "")
    private WebElement POPUP_TITLE;
    @FindBy(css = Body + "")
    private WebElement POPUP_DESCRIPTION;
    @FindBy(css = Body + "")
    private WebElement POPUP_CANCEL_BUTTON;
    @FindBy(css = Body + "")
    private WebElement POPUP_ACCEPT_BTN;

    public InvoiceSettingPage(WebDriver driver) {
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
     * Object: BACK_BUTTON
     */
    public boolean isDisplayBackButton() {
        boolean isDisplay = false;
        try {
            isDisplay = BACK_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BACK_BUTTON");
        }
        return isDisplay;
    }

    public String getBackButtonText() {
        String text = "";
        try {
            text = BACK_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of BACK_BUTTON");
        }
        return text;
    }

    public void clickOnBackButton() {
        try {
            BACK_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of BACK_BUTTON");
        }
    }

    /**
     * ----------------- START LEFT MENU -----------------
     */
    /**
     * Object: SETTING_MENU_LIST
     */
    public boolean isDisplaySettingMenuList() {
        boolean isDisplay = false;
        try {
            isDisplay = SETTING_MENU.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SETTING_MENU_LIST");
        }
        return isDisplay;
    }

    public String getSettingMenuList() {
        String text = "";
        try {
            text = SETTING_MENU.getText();
        } catch (Exception e) {
            Log.addLog("css of SETTING_MENU_LIST");
        }
        return text;
    }

    public void clickOnSettingMenuList() {
        try {
            SETTING_MENU.click();
        } catch (Exception e) {
            Log.addLog("css of SETTING_MENU_LIST");
        }
    }

    /**
     * Object: INVOICE_TEMPLATE_MENU_LIST
     */
    public boolean isDisplayInvoiceTemplateMenuList() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_TEMPLATE_MENU.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_TEMPLATE_MENU_LIST");
        }
        return isDisplay;
    }

    public String getInvoiceTemplateMenuList() {
        String text = "";
        try {
            text = INVOICE_TEMPLATE_MENU.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_TEMPLATE_MENU_LIST");
        }
        return text;
    }

    public void clickOnInvoiceTemplateMenuList() {
        try {
            INVOICE_TEMPLATE_MENU.click();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_TEMPLATE_MENU_LIST");
        }
    }

    /**
     * ----------------- END LEFT MENU -----------------
     */

    /**
     * ----------------- START RIGHT MENU OF SETTING -----------------
     */
    /**
     * Object: SETTING_TITLE
     */
    public boolean isDisplaySettingTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = SETTING_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NEW_INVOICE_NOTIFY_TITLE");
        }
        return isDisplay;
    }

    public String getSettingTitle() {
        String text = "";
        try {
            text = SETTING_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of SETTING_TITLE");
        }
        return text;
    }

    /**
     * Object: SALE_OF_PRODUCT_TITLE
     */
    public boolean isDisplaySaleOfProductTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = SALE_OF_PRODUCT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SALE_OF_PRODUCT_TITLE");
        }
        return isDisplay;
    }

    public String getSaleOfProductTitle() {
        String text = "";
        try {
            text = SALE_OF_PRODUCT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of SALE_OF_PRODUCT_TITLE");
        }
        return text;
    }

    /**
     * Object: NO_TAX_TITLE
     */
    public boolean isDisplayNoTaxTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = NO_TAX_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NO_TAX_TITLE");
        }
        return isDisplay;
    }

    public String getNoTaxTitle() {
        String text = "";
        try {
            text = NO_TAX_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of NO_TAX_TITLE");
        }
        return text;
    }

    /**
     * Object: NO_TAX_OPTION
     */
    public boolean isDisplayNoTaxOption() {
        boolean isDisplay = false;
        try {
            isDisplay = NO_TAX_OPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NO_TAX_OPTION");
        }
        return isDisplay;
    }

    public String getNoTaxOptionText() {
        String text = "";
        try {
            text = NO_TAX_OPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of NO_TAX_OPTION");
        }
        return text;
    }

    public void clickOnNoTaxOption() {
        try {
            NO_TAX_OPTION.click();
        } catch (Exception e) {
            Log.addLog("css of NO_TAX_OPTION");
        }
    }

    /**
     * Object: INCLUDE_TAX_TITLE
     */
    public boolean isDisplayIncludeTaxTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = INCLUDE_TAX_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INCLUDE_TAX_TITLE");
        }
        return isDisplay;
    }

    public String getIncludeTaxTitle() {
        String text = "";
        try {
            text = INCLUDE_TAX_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of INCLUDE_TAX_TITLE");
        }
        return text;
    }

    /**
     * Object: INCLUDE_TAX_OPTION
     */
    public boolean isDisplayIncludeTaxOption() {
        boolean isDisplay = false;
        try {
            isDisplay = INCLUDE_TAX_OPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INCLUDE_TAX_OPTION");
        }
        return isDisplay;
    }

    public String getIncludeTaxOptionText() {
        String text = "";
        try {
            text = INCLUDE_TAX_OPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of INCLUDE_TAX_OPTION");
        }
        return text;
    }

    public void clickOnIncludeTaxOption() {
        try {
            INCLUDE_TAX_OPTION.click();
        } catch (Exception e) {
            Log.addLog("css of INCLUDE_TAX_OPTION");
        }
    }

    /**
     * Object: DEPEND_ON_INVOICE_TITLE
     */
    public boolean isDisplayDependOnInvoiceTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = DEPEND_ON_INVOICE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DEPEND_ON_INVOICE_TITLE");
        }
        return isDisplay;
    }

    public String getDependOnInvoiceTitle() {
        String text = "";
        try {
            text = DEPEND_ON_INVOICE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DEPEND_ON_INVOICE_TITLE");
        }
        return text;
    }

    /**
     * Object: DEPEND_ON_INVOICE_OPTION
     */
    public boolean isDisplayDependOnInvoiceOption() {
        boolean isDisplay = false;
        try {
            isDisplay = DEPEND_ON_INVOICE_OPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DEPEND_ON_INVOICE_OPTION");
        }
        return isDisplay;
    }

    public String getDependOnInvoiceOptionText() {
        String text = "";
        try {
            text = DEPEND_ON_INVOICE_OPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of DEPEND_ON_INVOICE_OPTION");
        }
        return text;
    }

    public void clickOnDependOnInvoiceOption() {
        try {
            DEPEND_ON_INVOICE_OPTION.click();
        } catch (Exception e) {
            Log.addLog("css of DEPEND_ON_INVOICE_OPTION");
        }
    }

    /**
     * Object: DISCOUNT_INVOICE_TITLE
     */
    public boolean isDisplayDiscountInvoiceTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = DISCOUNT_INVOICE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DISCOUNT_INVOICE_TITLE");
        }
        return isDisplay;
    }

    public String getDiscountInvoiceTitle() {
        String text = "";
        try {
            text = DISCOUNT_INVOICE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DISCOUNT_INVOICE_TITLE");
        }
        return text;
    }

    /**
     * Object: BEFORE_TAX_TITLE
     */
    public boolean isDisplayBeforeTaxTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = BEFORE_TAX_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BEFORE_TAX_TITLE");
        }
        return isDisplay;
    }

    public String getBeforeTaxTitle() {
        String text = "";
        try {
            text = BEFORE_TAX_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of BEFORE_TAX_TITLE");
        }
        return text;
    }

    /**
     * Object: BEFORE_TAX_OPTION
     */
    public boolean isDisplayBeforeTaxOption() {
        boolean isDisplay = false;
        try {
            isDisplay = BEFORE_TAX_OPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BEFORE_TAX_OPTION");
        }
        return isDisplay;
    }

    public String getBeforeTaxOptionText() {
        String text = "";
        try {
            text = BEFORE_TAX_OPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of BEFORE_TAX_OPTION");
        }
        return text;
    }

    public void clickOnBeforeTaxOption() {
        try {
            BEFORE_TAX_OPTION.click();
        } catch (Exception e) {
            Log.addLog("css of BEFORE_TAX_OPTION");
        }
    }

    /**
     * Object: AFTER_TAX_TITLE
     */
    public boolean isDisplayAfterTaxTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = AFTER_TAX_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AFTER_TAX_TITLE");
        }
        return isDisplay;
    }

    public String getAfterTaxTitle() {
        String text = "";
        try {
            text = AFTER_TAX_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of AFTER_TAX_TITLE");
        }
        return text;
    }

    /**
     * Object: AFTER_TAX_OPTION
     */
    public boolean isDisplayAfterTaxOption() {
        boolean isDisplay = false;
        try {
            isDisplay = AFTER_TAX_OPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AFTER_TAX_OPTION");
        }
        return isDisplay;
    }

    public String getAfterTaxOptionText() {
        String text = "";
        try {
            text = AFTER_TAX_OPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of AFTER_TAX_OPTION");
        }
        return text;
    }

    public void clickOnAfterTaxOption() {
        try {
            AFTER_TAX_OPTION.click();
        } catch (Exception e) {
            Log.addLog("css of AFTER_TAX_OPTION");
        }
    }

    /**
     * Object: SAVE_SETTING_BTN
     */
    public boolean isDisplaySaveSettingButton() {
        boolean isDisplay = false;
        try {
            isDisplay = SAVE_SETTING_BTN.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SAVE_SETTING_BTN");
        }
        return isDisplay;
    }

    public String getSaveSettingButtonText() {
        String text = "";
        try {
            text = SAVE_SETTING_BTN.getText();
        } catch (Exception e) {
            Log.addLog("css of SAVE_SETTING_BTN");
        }
        return text;
    }

    public void clickOnSaveSettingButton() {
        try {
            SAVE_SETTING_BTN.click();
        } catch (Exception e) {
            Log.addLog("css of SAVE_SETTING_BTN");
        }
    }

    /**
     * ----------------- END RIGHT MENU OF SETTING -----------------
     */
    /**
     * ----------------- START RIGHT MENU OF INVOICE TEMPLATE -----------------
     */
    /**
     * Object: INVOICE_TEMPLATE_TITLE
     */
    public boolean isDisplayInvoiceTemplateTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_TEMPLATE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_TEMPLATE_TITLE");
        }
        return isDisplay;
    }

    public String getInvoiceTemplateTitle() {
        String text = "";
        try {
            text = INVOICE_TEMPLATE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_TEMPLATE_TITLE");
        }
        return text;
    }

    /**
     * Object: TITLE_OF_INVOICE_TITLE
     */
    public boolean isDisplayTitleOfInvoiceTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = NAME_INVOICE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TITLE_OF_INVOICE_TITLE");
        }
        return isDisplay;
    }

    public String getTitleOfInvoiceTitle() {
        String text = "";
        try {
            text = NAME_INVOICE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TITLE_OF_INVOICE_TITLE");
        }
        return text;
    }

    /**
     * Object: TITLE_OF_INVOICE_TEXT_BOX
     */
    public boolean isDisplayTitleOfInvoiceTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = NAME_INVOICE_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TITLE_OF_INVOICE_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getTitleOfInvoiceTextBox() {
        String text = "";
        try {
            text = NAME_INVOICE_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of TITLE_OF_INVOICE_TEXT_BOX");
        }
        return text;
    }

    public void setTitleOfInvoiceTextBox(String text) {
        try {
            NAME_INVOICE_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of TITLE_OF_INVOICE_TEXT_BOX");
        }
    }

    public void clearTitleOfInvoiceTextBox() {
        try {
            NAME_INVOICE_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of TITLE_OF_INVOICE_TEXT_BOX");
        }
    }

    /**
     * Object: FOOTER_OF_INVOICE_TITLE
     */
    public boolean isDisplayFooterOfInvoiceTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = FOOTER_OF_INVOICE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FOOTER_OF_INVOICE_TITLE");
        }
        return isDisplay;
    }

    public String getFooterOfInvoiceTitle() {
        String text = "";
        try {
            text = FOOTER_OF_INVOICE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of FOOTER_OF_INVOICE_TITLE");
        }
        return text;
    }

    /**
     * Object: FOOTER_OF_INVOICE_TEXT_BOX
     */
    public boolean isDisplayFooterOfInvoiceTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = FOOTER_OF_INVOICE_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FOOTER_OF_INVOICE_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getFooterOfInvoiceTextBox() {
        String text = "";
        try {
            text = FOOTER_OF_INVOICE_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of FOOTER_OF_INVOICE_TEXT_BOX");
        }
        return text;
    }

    public void setFooterOfInvoiceTextBox(String text) {
        try {
            FOOTER_OF_INVOICE_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of FOOTER_OF_INVOICE_TEXT_BOX");
        }
    }

    public void clearFooterOfInvoiceTextBox() {
        try {
            FOOTER_OF_INVOICE_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of FOOTER_OF_INVOICE_TEXT_BOX");
        }
    }

    /**
     * Object: DISPLAY_VIET_QR_TITLE
     */
    public boolean isDisplayVietQrTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = IS_DISPLAY_VIET_QR_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DISPLAY_VIET_QR_TITLE");
        }
        return isDisplay;
    }

    public String getVietQrTitle() {
        String text = "";
        try {
            text = IS_DISPLAY_VIET_QR_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DISPLAY_VIET_QR_TITLE");
        }
        return text;
    }

    /**
     * Object: DISPLAY_VIET_QR_CONTENT
     */
    public boolean isDisplayVietQrContent() {
        boolean isDisplay = false;
        try {
            isDisplay = IS_DISPLAY_VIET_QR_CONTENT.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DISPLAY_VIET_QR_CONTENT");
        }
        return isDisplay;
    }

    public String getVietQrContent() {
        String text = "";
        try {
            text = IS_DISPLAY_VIET_QR_CONTENT.getText();
        } catch (Exception e) {
            Log.addLog("css of DISPLAY_VIET_QR_CONTENT");
        }
        return text;
    }

    /**
     * Object: DISPLAY_VIET_QR_CHECK_BOX
     */
    public boolean isDisplayVietQrCheckBox() {
        boolean isDisplay = false;
        try {
            isDisplay = IS_DISPLAY_VIET_QR_CHECK_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DISPLAY_VIET_QR_CHECK_BOX");
        }
        return isDisplay;
    }

    public void clickOnVietQrCheckBox() {
        try {
            IS_DISPLAY_VIET_QR_CHECK_BOX.click();
        } catch (Exception e) {
            Log.addLog("css of DISPLAY_VIET_QR_CHECK_BOX");
        }
    }

    /**
     * Object: SAVE_EMAIL_TEMPLATE_BTN
     */
    public boolean isDisplaySaveEmailTemplateButton() {
        boolean isDisplay = false;
        try {
            isDisplay = SAVE_EMAIL_TEMPLATE_BTN.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SAVE_EMAIL_TEMPLATE_BTN");
        }
        return isDisplay;
    }

    public String getSaveEmailTemplateButtonText() {
        String text = "";
        try {
            text = SAVE_EMAIL_TEMPLATE_BTN.getText();
        } catch (Exception e) {
            Log.addLog("css of SAVE_EMAIL_TEMPLATE_BTN");
        }
        return text;
    }

    public void clickOnSaveEmailTemplateButton() {
        try {
            SAVE_EMAIL_TEMPLATE_BTN.click();
        } catch (Exception e) {
            Log.addLog("css of SAVE_EMAIL_TEMPLATE_BTN");
        }
    }

    /**
     * ----------------- END RIGHT MENU OF INVOICE TEMPLATE -----------------
     */

    /**
     * ----------------- START SAVE CONFORM POPUP -----------------
     */
    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_TITLE");
        }
        return isDisplay;
    }

    public String getPopupTitle() {
        String text = "";
        try {
            text = POPUP_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_TITLE");
        }
        return text;
    }

    /**
     * Object: POPUP_DESCRIPTION
     */
    public boolean isDisplayPopupDescription() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_DESCRIPTION.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_DESCRIPTION");
        }
        return isDisplay;
    }

    public String getPopupDescriptionText() {
        String text = "";
        try {
            text = POPUP_DESCRIPTION.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_DESCRIPTION");
        }
        return text;
    }

    /**
     * Object: POPUP_CANCEL_BUTTON
     */
    public boolean isDisplayPopupCancelButton() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_CANCEL_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_CANCEL_BUTTON");
        }
        return isDisplay;
    }

    public String getPopupCancelButtonText() {
        String text = "";
        try {
            text = POPUP_CANCEL_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_CANCEL_BUTTON");
        }
        return text;
    }

    public void clickOnPopupCancelButton() {
        try {
            POPUP_CANCEL_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of POPUP_CANCEL_BUTTON");
        }
    }

    /**
     * Object: POPUP_ACCEPT_BTN
     */
    public boolean isDisplayPopupAcceptButton() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_ACCEPT_BTN.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of POPUP_ACCEPT_BTN");
        }
        return isDisplay;
    }

    public String getPopupAcceptButtonText() {
        String text = "";
        try {
            text = POPUP_ACCEPT_BTN.getText();
        } catch (Exception e) {
            Log.addLog("css of POPUP_ACCEPT_BTN");
        }
        return text;
    }

    public void clickOnPopupAcceptButton() {
        try {
            POPUP_ACCEPT_BTN.click();
        } catch (Exception e) {
            Log.addLog("css of POPUP_ACCEPT_BTN");
        }
    }

    /**
     * ----------------- END SAVE CONFORM POPUP -----------------
     */

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("cài đặt hoá dơn");
    }
}
