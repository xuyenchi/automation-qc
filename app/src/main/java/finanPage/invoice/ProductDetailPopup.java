package finanPage.invoice;

import config.Configs;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Log;

import java.util.List;

public class ProductDetailPopup extends CreateInvoicePage {
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
    private WebElement AND_POPUP_TITLE;
    @FindBy(xpath = AndHeader + "")
    private WebElement AND_CLOSE_POPUP_ICON;

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_QUANTITY_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SUB_ICON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_QUANTITY_VALUE;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ADD_ICON;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PRICE_LABEL;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_PRICE_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_ADD_TAX_LINK;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_TAX_DROPDOWN_LIST;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_TAX_LIST;
    private static final String AndTaxName = "";
    private static final String AndTaxValue = "";
    private static final String AndTaxRemoveAction = "";

    /**
     * [Android] footer
     */
    @FindBy(xpath = AndFooter + "")
    private WebElement AND_DELETE_BUTTON;
    @FindBy(xpath = AndHeader + "")
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
    private WebElement IOS_POPUP_TITLE;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_CLOSE_POPUP_ICON;

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_QUANTITY_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SUB_ICON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_QUANTITY_VALUE;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ADD_ICON;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PRICE_LABEL;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_PRICE_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_ADD_TAX_LINK;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_TAX_DROPDOWN_LIST;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_TAX_LIST;
    private static final String IOSTaxName = "";
    private static final String IOSTaxValue = "";
    private static final String IOSTaxRemoveAction = "";

    /**
     * [IOS] footer
     */
    @FindBy(xpath = IOSFooter + "")
    private WebElement IOS_DELETE_BUTTON;
    @FindBy(xpath = IOSHeader + "")
    private WebElement IOS_CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public ProductDetailPopup(AppiumDriver driver) {
        super(driver);
    }

    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_POPUP_TITLE.isDisplayed();
            } else {
                isDisplay = IOS_POPUP_TITLE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of POPUP_TITLE");
        }
        return isDisplay;
    }

    public String getPopupTitle() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_POPUP_TITLE.getText();
            } else {
                text = IOS_POPUP_TITLE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of POPUP_TITLE");
        }
        return text;
    }

    /**
     * Object: CLOSE_POPUP_ICON
     */
    public boolean isDisplayClosePopupIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CLOSE_POPUP_ICON.isDisplayed();
            } else {
                isDisplay = IOS_CLOSE_POPUP_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CLOSE_POPUP_ICON");
        }
        return isDisplay;
    }

    public void clickOnClosePopupIcon() {
        try {
            if (Configs.isAndroid) {
                AND_CLOSE_POPUP_ICON.click();
            } else {
                IOS_CLOSE_POPUP_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CLOSE_POPUP_ICON");
        }
    }

    /**
     * Object: QUANTITY_LABEL
     */
    public boolean isDisplayQuantityLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_QUANTITY_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_QUANTITY_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of QUANTITY_LABEL");
        }
        return isDisplay;
    }

    public String getQuantityLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_QUANTITY_LABEL.getText();
            } else {
                text = IOS_QUANTITY_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of QUANTITY_LABEL");
        }
        return text;
    }

    /**
     * Object: SUB_ICON
     */
    public boolean isDisplaySubIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_SUB_ICON.isDisplayed();
            } else {
                isDisplay = IOS_SUB_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SUB_ICON");
        }
        return isDisplay;
    }

    public void clickOnSubIcon() {
        try {
            if (Configs.isAndroid) {
                AND_SUB_ICON.click();
            } else {
                IOS_SUB_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of SUB_ICON");
        }
    }

    /**
     * Object: QUANTITY_VALUE
     */
    public boolean isDisplayQuantityValue() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_QUANTITY_VALUE.isDisplayed();
            } else {
                isDisplay = IOS_QUANTITY_VALUE.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of QUANTITY_VALUE");
        }
        return isDisplay;
    }

    public String getQuantityValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_QUANTITY_VALUE.getText();
            } else {
                text = IOS_QUANTITY_VALUE.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of QUANTITY_VALUE");
        }
        return text;
    }

    public void clearQuantityBox() {
        try {
            if (Configs.isAndroid) {
                AND_QUANTITY_VALUE.clear();
            } else {
                IOS_QUANTITY_VALUE.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of QUANTITY_VALUE");
        }
    }

    public void setQuantityBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_QUANTITY_VALUE.sendKeys(text);
            } else {
                IOS_QUANTITY_VALUE.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of QUANTITY_VALUE");
        }
    }

    /**
     * Object: ADD_ICON
     */
    public boolean isDisplayAddIcon() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_ADD_ICON.isDisplayed();
            } else {
                isDisplay = IOS_ADD_ICON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_ICON");
        }
        return isDisplay;
    }

    public void clickOnAddIcon() {
        try {
            if (Configs.isAndroid) {
                AND_ADD_ICON.click();
            } else {
                IOS_ADD_ICON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of ADD_ICON");
        }
    }

    /**
     * Object: PRICE_LABEL
     */
    public boolean isDisplayPriceLabel() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PRICE_LABEL.isDisplayed();
            } else {
                isDisplay = IOS_PRICE_LABEL.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRICE_LABEL");
        }
        return isDisplay;
    }

    public String getPriceLabel() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PRICE_LABEL.getText();
            } else {
                text = IOS_PRICE_LABEL.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRICE_LABEL");
        }
        return text;
    }

    /**
     * Object: PRICE_BOX
     */
    public boolean isDisplayPriceBox() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_PRICE_BOX.isDisplayed();
            } else {
                isDisplay = IOS_PRICE_BOX.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRICE_BOX");
        }
        return isDisplay;
    }

    public String getPriceValue() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_PRICE_BOX.getText();
            } else {
                text = IOS_PRICE_BOX.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRICE_BOX");
        }
        return text;
    }

    public void clearPriceBox() {
        try {
            if (Configs.isAndroid) {
                AND_PRICE_BOX.clear();
            } else {
                IOS_PRICE_BOX.clear();
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRICE_BOX");
        }
    }

    public void setPriceBox(String text) {
        try {
            if (Configs.isAndroid) {
                AND_PRICE_BOX.sendKeys(text);
            } else {
                IOS_PRICE_BOX.sendKeys(text);
            }
        } catch (Exception e) {
            Log.addLog("xPath of PRICE_BOX");
        }
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

    public String getAddTaxLink() {
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
     * Object: TAX_DROPDOWN_LIST
     */
    private WebElement getTaxDropdownElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_TAX_DROPDOWN_LIST.get(pos);
            } else {
                element = IOS_TAX_DROPDOWN_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_DROPDOWN_LIST at " + pos);
        }
        return element;
    }

    public int getTotalTaxDropdown() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_TAX_DROPDOWN_LIST.size();
            } else {
                total = IOS_TAX_DROPDOWN_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_DROPDOWN_LIST");
        }
        return total;
    }

    public String getTaxDropdownByPosition(int pos) {
        WebElement element = getTaxDropdownElement(pos);
        if (element != null) {
            return element.getText();
        } else {
            return "";
        }
    }

    public void clickOnTaxDropdownByPosition(int pos) {
        WebElement element = getTaxDropdownElement(pos);
        if (element != null) {
            element.click();
        }
    }

    /**
     * Object: TAX_LIST
     */
    private WebElement getTaxElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_TAX_LIST.get(pos);
            } else {
                element = IOS_TAX_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_LIST at " + pos);
        }
        return element;
    }

    public int getTotalTax() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_TAX_LIST.size();
            } else {
                total = IOS_TAX_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of TAX_LIST");
        }
        return total;
    }

    public String getTaxNameByPosition(int pos) {
        WebElement element = getTaxElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndTaxName)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSTaxName)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of TaxName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getTaxValueByPosition(int pos) {
        WebElement element = getTaxElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndTaxValue)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSTaxValue)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of TaxValue at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public void clickOnRemoveTaxByPosition(int pos) {
        WebElement element = getTaxElement(pos);
        if (element != null) {
            try {
                if (Configs.isAndroid) {
                    element.findElement(By.xpath(AndTaxRemoveAction)).click();
                } else {
                    element.findElement(By.xpath(IOSTaxRemoveAction)).click();
                }
            } catch (Exception e) {
                Log.addLog("xPath of TaxRemoveAction at " + pos);
            }
        }
    }

    /**
     * Object: DELETE_BUTTON
     */
    public boolean isDisplayDeleteButton() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_DELETE_BUTTON.isDisplayed();
            } else {
                isDisplay = IOS_DELETE_BUTTON.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DELETE_BUTTON");
        }
        return isDisplay;
    }

    public String getDeleteButtonText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_DELETE_BUTTON.getText();
            } else {
                text = IOS_DELETE_BUTTON.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DELETE_BUTTON");
        }
        return text;
    }

    public void clickOnDeleteButton() {
        try {
            if (Configs.isAndroid) {
                AND_DELETE_BUTTON.click();
            } else {
                IOS_DELETE_BUTTON.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of DELETE_BUTTON");
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
        return isDisplayQuantityLabel() && getQuantityLabel().toLowerCase().contains("số lượng");
    }
}
