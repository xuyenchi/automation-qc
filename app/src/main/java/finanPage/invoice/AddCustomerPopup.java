package finanPage.invoice;

import config.Configs;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Log;

import java.util.List;

public class AddCustomerPopup extends CreateInvoicePage {
    /**
     * ==============================================================================================================
     * Android
     */
    private static final String AndBody = "";

    /**
     * [Android] header
     */

    /**
     * [Android] body
     */
    @FindBy(xpath = AndBody + "")
    private WebElement AND_SEARCH_BOX;
    @FindBy(xpath = AndBody + "")
    private WebElement AND_CREATE_CUSTOMER_LINK;
    @FindBy(xpath = AndBody + "")
    private List<WebElement> AND_CUSTOMER_LIST;
    private static final String AndCustomerName = "";
    private static final String AndCustomerMail = "";

    /**
     * [Android] footer
     */

    /**
     * ==============================================================================================================
     * iOS
     */
    private static final String IOSBody = "";

    /**
     * [IOS] header
     */

    /**
     * [IOS] body
     */
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_SEARCH_BOX;
    @FindBy(xpath = IOSBody + "")
    private WebElement IOS_CREATE_CUSTOMER_LINK;
    @FindBy(xpath = IOSBody + "")
    private List<WebElement> IOS_CUSTOMER_LIST;
    private static final String IOSCustomerName = "";
    private static final String IOSCustomerMail = "";

    /**
     * [IOS] footer
     */

    /**
     * ==============================================================================================================
     * Constructor
     *
     * @param driver
     */
    public AddCustomerPopup(AppiumDriver driver) {
        super(driver);
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
     * Object: CREATE_CUSTOMER_LINK
     */
    public boolean isDisplayCreateCustomerLink() {
        boolean isDisplay = false;
        try {
            if (Configs.isAndroid) {
                isDisplay = AND_CREATE_CUSTOMER_LINK.isDisplayed();
            } else {
                isDisplay = IOS_CREATE_CUSTOMER_LINK.isDisplayed();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATE_CUSTOMER_LINK");
        }
        return isDisplay;
    }

    public String getCreateCustomerLinkText() {
        String text = "";
        try {
            if (Configs.isAndroid) {
                text = AND_CREATE_CUSTOMER_LINK.getText();
            } else {
                text = IOS_CREATE_CUSTOMER_LINK.getText();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATE_CUSTOMER_LINK");
        }
        return text;
    }

    public void clickOnCreateCustomerLink() {
        try {
            if (Configs.isAndroid) {
                AND_CREATE_CUSTOMER_LINK.click();
            } else {
                IOS_CREATE_CUSTOMER_LINK.click();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CREATE_CUSTOMER_LINK");
        }
    }

    /**
     * Object: CUSTOMER_LIST
     */
    private WebElement getCustomerElement(int pos) {
        WebElement element = null;
        try {
            if (Configs.isAndroid) {
                element = AND_CUSTOMER_LIST.get(pos);
            } else {
                element = IOS_CUSTOMER_LIST.get(pos);
            }
        } catch (Exception e) {
            Log.addLog("xPath of CUSTOMER_LIST at " + pos);
        }
        return element;
    }

    public int getTotalCustomer() {
        int total = 0;
        try {
            if (Configs.isAndroid) {
                total = AND_CUSTOMER_LIST.size();
            } else {
                total = IOS_CUSTOMER_LIST.size();
            }
        } catch (Exception e) {
            Log.addLog("xPath of CUSTOMER_LIST");
        }
        return total;
    }

    public String getCustomerNameByPosition(int pos) {
        WebElement element = getCustomerElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndCustomerName)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSCustomerName)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of CustomerName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getCustomerMailByPosition(int pos) {
        WebElement element = getCustomerElement(pos);
        if (element != null) {
            String text = "";
            try {
                if (Configs.isAndroid) {
                    text = element.findElement(By.xpath(AndCustomerMail)).getText();
                } else {
                    text = element.findElement(By.xpath(IOSCustomerMail)).getText();
                }
            } catch (Exception e) {
                Log.addLog("xPath of CustomerMail at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    public String getCustomerMailByCustomerName(String customerName) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalCustomer(); i++) {
            if (getCustomerMailByPosition(i).toLowerCase().equals(customerName.toLowerCase())) {
                isFound = true;
                text = getCustomerMailByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing customer with name " + customerName);
        }
        return text;
    }

    public void clickOnCustomerByPosition(int pos) {
        WebElement element = getCustomerElement(pos);
        if (element != null) {
            element.click();
        }
    }

    public void clickOnCustomerByCustomerName(String customerName) {
        boolean isFound = false;
        for (int i = 0; i < getTotalCustomer(); i++) {
            if (getCustomerMailByPosition(i).toLowerCase().equals(customerName.toLowerCase())) {
                isFound = true;
                getCustomerElement(i).click();
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing customer with name " + customerName);
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplayPopup() {
        return isDisplaySearchBox() && isDisplayCreateCustomerLink();
    }
}
