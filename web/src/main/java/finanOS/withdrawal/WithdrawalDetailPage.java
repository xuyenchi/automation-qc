/* (C)2024 */
package finanOS.withdrawal;

import finanOS.base.Sidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class WithdrawalDetailPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement BACK_ICON;
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement AMOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement STATUS_LABEL;
    @FindBy(css = Body + "")
    private WebElement STATUS_VALUE;
    @FindBy(css = Body + "")
    private WebElement FROM_ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement FROM_ACCOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement TO_ACCOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement TO_ACCOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement WITHDRAWAL_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement WITHDRAWAL_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement CONTENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement CONTENT_VALUE;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public WithdrawalDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: BACK_ICON
     */
    public boolean isDisplayBackIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = BACK_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of BACK_ICON");
        }
        return isDisplay;
    }

    public void clickOnBackIcon() {
        try {
            BACK_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of BACK_ICON");
        }
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
     * Object: AMOUNT_LABEL
     */
    public boolean isDisplayAmountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getAmountLbl() {
        String text = "";
        try {
            text = AMOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: AMOUNT_VALUE
     */
    public boolean isDisplayAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = AMOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getAmountValue() {
        String text = "";
        try {
            text = AMOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of AMOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: STATUS_LABEL
     */
    public boolean isDisplayStatusLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = STATUS_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STATUS_LABEL");
        }
        return isDisplay;
    }

    public String getStatusLbl() {
        String text = "";
        try {
            text = STATUS_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of STATUS_LABEL");
        }
        return text;
    }

    /**
     * Object: STATUS_VALUE
     */
    public boolean isDisplayStatusValue() {
        boolean isDisplay = false;
        try {
            isDisplay = STATUS_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STATUS_VALUE");
        }
        return isDisplay;
    }

    public String getStatusValue() {
        String text = "";
        try {
            text = STATUS_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of STATUS_VALUE");
        }
        return text;
    }

    /**
     * Object: FROM_ACCOUNT_LABEL
     */
    public boolean isDisplayFromAmountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getFromAmountLbl() {
        String text = "";
        try {
            text = FROM_ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: FROM_ACCOUNT_VALUE
     */
    public boolean isDisplayFromAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = FROM_ACCOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getFromAmountValue() {
        String text = "";
        try {
            text = FROM_ACCOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of FROM_ACCOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: TO_ACCOUNT_LABEL
     */
    public boolean isDisplayToAccountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = TO_ACCOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getToAccountLbl() {
        String text = "";
        try {
            text = TO_ACCOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: TO_ACCOUNT_VALUE
     */
    public boolean isDisplayToAccountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TO_ACCOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getToAccountValue() {
        String text = "";
        try {
            text = TO_ACCOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TO_ACCOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: WITHDRAWAL_DATE_LABEL
     */
    public boolean isDisplayWithdrawalDateLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_DATE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_LABEL");
        }
        return isDisplay;
    }

    public String getWithdrawalDateLbl() {
        String text = "";
        try {
            text = WITHDRAWAL_DATE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: WITHDRAWAL_DATE_VALUE
     */
    public boolean isDisplayWithdrawalDateValue() {
        boolean isDisplay = false;
        try {
            isDisplay = WITHDRAWAL_DATE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_VALUE");
        }
        return isDisplay;
    }

    public String getWithdrawalDateValue() {
        String text = "";
        try {
            text = WITHDRAWAL_DATE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of WITHDRAWAL_DATE_VALUE");
        }
        return text;
    }

    /**
     * Object: CONTENT_LABEL
     */
    public boolean isDisplayContentLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTENT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_LABEL");
        }
        return isDisplay;
    }

    public String getContentLbl() {
        String text = "";
        try {
            text = CONTENT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_LABEL");
        }
        return text;
    }

    /**
     * Object: CONTENT_VALUE
     */
    public boolean isDisplayContentValue() {
        boolean isDisplay = false;
        try {
            isDisplay = CONTENT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_VALUE");
        }
        return isDisplay;
    }

    public String getContentValue() {
        String text = "";
        try {
            text = CONTENT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of CONTENT_VALUE");
        }
        return text;
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("chi tiết rút tiền");
    }
}
