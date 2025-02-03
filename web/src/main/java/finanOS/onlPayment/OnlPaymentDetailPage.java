package finanOS.onlPayment;

import finanOS.base.Sidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class OnlPaymentDetailPage extends Sidebar {
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
    private WebElement TOTAL_AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement TOTAL_AMOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement FEE_AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement FEE_AMOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement RECEIVE_AMOUNT_LABEL;
    @FindBy(css = Body + "")
    private WebElement RECEIVE_AMOUNT_VALUE;
    @FindBy(css = Body + "")
    private WebElement INVOICE_PAYMENT_NUMBER_HPL;
    @FindBy(css = Body + "")
    private WebElement TNX_CODE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TNX_CODE_VALUE;
    @FindBy(css = Body + "")
    private WebElement SETTLEMENT_CODE_LABEL;
    @FindBy(css = Body + "")
    private WebElement SETTLEMENT_CODE_VALUE_HPL;
    @FindBy(css = Body + "")
    private WebElement STATUS_LABEL;
    @FindBy(css = Body + "")
    private WebElement STATUS_VALUE;
    @FindBy(css = Body + "")
    private WebElement TNX_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TNX_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement RECEIVE_DATE_LABEL;
    @FindBy(css = Body + "")
    private WebElement RECEIVE_DATE_VALUE;
    @FindBy(css = Body + "")
    private WebElement NOTE_LABEL;
    @FindBy(css = Body + "")
    private WebElement NOTE_VALUE;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public OnlPaymentDetailPage(WebDriver driver) {
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
     * Object: TOTAL_AMOUNT_LABEL
     */
    public boolean isDisplayTotalAmountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_AMOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getTotalAmountLbl() {
        String text = "";
        try {
            text = TOTAL_AMOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: TOTAL_AMOUNT_VALUE
     */
    public boolean isDisplayTotalAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_AMOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_AMOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getTotalAmountValue() {
        String text = "";
        try {
            text = TOTAL_AMOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_AMOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: FEE_AMOUNT_LABEL
     */
    public boolean isDisplayFeeAmountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = FEE_AMOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FEE_AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getFeeAmountLbl() {
        String text = "";
        try {
            text = FEE_AMOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of FEE_AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: FEE_AMOUNT_VALUE
     */
    public boolean isDisplayFeeAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = FEE_AMOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of FEE_AMOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getFeeAmountValue() {
        String text = "";
        try {
            text = FEE_AMOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of FEE_AMOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: RECEIVE_AMOUNT_LABEL
     */
    public boolean isDisplayReceiveAmountLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVE_AMOUNT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_AMOUNT_LABEL");
        }
        return isDisplay;
    }

    public String getReceiveAmountLbl() {
        String text = "";
        try {
            text = RECEIVE_AMOUNT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_AMOUNT_LABEL");
        }
        return text;
    }

    /**
     * Object: RECEIVE_AMOUNT_VALUE
     */
    public boolean isDisplayReceiveAmountValue() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVE_AMOUNT_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_AMOUNT_VALUE");
        }
        return isDisplay;
    }

    public String getReceiveAmountValue() {
        String text = "";
        try {
            text = RECEIVE_AMOUNT_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_AMOUNT_VALUE");
        }
        return text;
    }

    /**
     * Object: INVOICE_PAYMENT_NUMBER_HPL
     */
    public boolean isDisplayInvPayNumHyperLink() {
        boolean isDisplay = false;
        try {
            isDisplay = INVOICE_PAYMENT_NUMBER_HPL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_PAYMENT_NUMBER_HPL");
        }
        return isDisplay;
    }

    public String getInvPayNumHyperLinkText() {
        String text = "";
        try {
            text = INVOICE_PAYMENT_NUMBER_HPL.getText();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_PAYMENT_NUMBER_HPL");
        }
        return text;
    }

    public void clickOnInvPayNumHyperLink() {
        try {
            INVOICE_PAYMENT_NUMBER_HPL.click();
        } catch (Exception e) {
            Log.addLog("css of INVOICE_PAYMENT_NUMBER_HPL");
        }
    }

    /**
     * Object: SETTLEMENT_CODE_LABEL
     */
    public boolean isDisplaySettlementCodeLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = SETTLEMENT_CODE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_CODE_LABEL");
        }
        return isDisplay;
    }

    public String getSettlementCodeLbl() {
        String text = "";
        try {
            text = SETTLEMENT_CODE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_CODE_LABEL");
        }
        return text;
    }

    /**
     * Object: SETTLEMENT_CODE_VALUE_HPL
     */
    public boolean isDisplaySettlementCodeHyperLink() {
        boolean isDisplay = false;
        try {
            isDisplay = SETTLEMENT_CODE_VALUE_HPL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_CODE_VALUE_HPL");
        }
        return isDisplay;
    }

    public String getSettlementCodeHyperLinkText() {
        String text = "";
        try {
            text = SETTLEMENT_CODE_VALUE_HPL.getText();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_CODE_VALUE_HPL");
        }
        return text;
    }

    public void clickOnSettlementCodeHyperLink() {
        try {
            SETTLEMENT_CODE_VALUE_HPL.click();
        } catch (Exception e) {
            Log.addLog("css of SETTLEMENT_CODE_VALUE_HPL");
        }
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
     * Object: TNX_DATE_LABEL
     */
    public boolean isDisplayTnxDateLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_DATE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_DATE_LABEL");
        }
        return isDisplay;
    }

    public String getTnxDateLb() {
        String text = "";
        try {
            text = TNX_DATE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: TNX_DATE_VALUE
     */
    public boolean isDisplayTnxDateValue() {
        boolean isDisplay = false;
        try {
            isDisplay = TNX_DATE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TNX_DATE_VALUE");
        }
        return isDisplay;
    }

    public String getTnxDateValue() {
        String text = "";
        try {
            text = TNX_DATE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of TNX_DATE_VALUE");
        }
        return text;
    }

    /**
     * Object: RECEIVE_DATE_LABEL
     */
    public boolean isDisplayRecDateLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVE_DATE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_DATE_LABEL");
        }
        return isDisplay;
    }

    public String getRecDateLbl() {
        String text = "";
        try {
            text = RECEIVE_DATE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: RECEIVE_DATE_VALUE
     */
    public boolean isDisplayRecDateValue() {
        boolean isDisplay = false;
        try {
            isDisplay = RECEIVE_DATE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_DATE_VALUE");
        }
        return isDisplay;
    }

    public String getRecDateValue() {
        String text = "";
        try {
            text = RECEIVE_DATE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of RECEIVE_DATE_VALUE");
        }
        return text;
    }

    /**
     * Object: NOTE_LABEL
     */
    public boolean isDisplayNoteLbl() {
        boolean isDisplay = false;
        try {
            isDisplay = NOTE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NOTE_LABEL");
        }
        return isDisplay;
    }

    public String getNoteLbl() {
        String text = "";
        try {
            text = NOTE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of NOTE_LABEL");
        }
        return text;
    }

    /**
     * Object: NOTE_VALUE
     */
    public boolean isDisplayNoteValue() {
        boolean isDisplay = false;
        try {
            isDisplay = NOTE_VALUE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of NOTE_VALUE");
        }
        return isDisplay;
    }

    public String getNoteValue() {
        String text = "";
        try {
            text = NOTE_VALUE.getText();
        } catch (Exception e) {
            Log.addLog("css of NOTE_VALUE");
        }
        return text;
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().contains("chi tiết khoản thu");
    }
}