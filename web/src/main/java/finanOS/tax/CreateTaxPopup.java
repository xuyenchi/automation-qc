package finanOS.tax;

import finanOS.base.Sidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

public class CreateTaxPopup extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement POPUP_TITLE;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement TAX_NAME_LABEL;
    @FindBy(css = Body + "")
    private WebElement TAX_PERCENT_LABEL;
    @FindBy(css = Body + "")
    private WebElement TAX_NOTE_LABEL;
    @FindBy(css = Body + "")
    private WebElement TAX_NAME_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement TAX_PERCENT_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement TAX_NOTE_TEXT_BOX;
    @FindBy(css = Body + "")
    private WebElement CLOSE_ICON;
    @FindBy(css = Body + "")
    private WebElement TAX_ERROR_MESSAGE;
    @FindBy(css = Body + "")
    private WebElement TAX_PERCENT_ERROR_MESSAGE;

    /**
     * Footer
     */
    @FindBy(css = Footer + "")
    private WebElement CONFIRM_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public CreateTaxPopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PAGE_TITLE");
        }
        return isDisplay;
    }

    public String getPopupTitle() {
        String text = "";
        try {
            text = POPUP_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of PAGE_TITLE");
        }
        return text;
    }

    /**
     * Object: TAX_NAME_LABEL
     */
    public boolean isDisplayTaxNameLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_NAME_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_LABEL");
        }
        return isDisplay;
    }

    public String getTaxNameLabel() {
        String text = "";
        try {
            text = TAX_NAME_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_LABEL");
        }
        return text;
    }

    /**
     * Object: TAX_NAME_TEXT_BOX
     */
    public boolean isDisplayTaxNameTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_NAME_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getTaxNameTextBox() {
        String text = "";
        try {
            text = TAX_NAME_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAM_TEXT_BOX");
        }
        return text;
    }

    public void setTaxNameTextBox(String text) {
        try {
            TAX_NAME_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_TEXT_BOX");
        }
    }

    public void clearTaxNameTextBox() {
        try {
            TAX_NAME_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_TEXT_BOX");
        }
    }

    /**
     * Object: CLOSE_ICON
     */
    public boolean isDisplayClosePopupIcon() {
        boolean isDisplay = false;
        try {
            isDisplay = CLOSE_ICON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
        }
        return isDisplay;
    }

    public void clickOnClosePopupIcon() {
        try {
            CLOSE_ICON.click();
        } catch (Exception e) {
            Log.addLog("css of CLOSE_ICON");
        }
    }

    /**
     * Object: TAX_ERROR_MESSAGE
     */
    public boolean isDisplayTaxErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getTaxErrorMessage() {
        String text = "";
        try {
            text = TAX_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: TAX_PERCENT_LABEL
     */
    public boolean isDisplayTaxPercentLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_PERCENT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_LABEL");
        }
        return isDisplay;
    }

    public String getTaxPercentLabel() {
        String text = "";
        try {
            text = TAX_PERCENT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATED_DATE_LABEL");
        }
        return text;
    }

    /**
     * Object: TAX_PERCENT_TEXT_BOX
     */
    public boolean isDisplayTaxPercentTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_PERCENT_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getTaxPercentTextBox() {
        String text = "";
        try {
            text = TAX_PERCENT_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_TEXT_BOX");
        }
        return text;
    }

    public void setTaxPercentTextBox(String text) {
        try {
            TAX_PERCENT_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_TEXT_BOX");
        }
    }

    public void clearTaxPercentTextBox() {
        try {
            TAX_PERCENT_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_TEXT_BOX");
        }
    }

    /**
     * Object: TAX_PERCENT_ERROR_MESSAGE
     */
    public boolean isDisplayTaxPercentErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_PERCENT_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_ERROR_MESSAGE");
        }
        return isDisplay;
    }

    public String getTaxPercentErrorMessage() {
        String text = "";
        try {
            text = TAX_PERCENT_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: TAX_NOTE_LABEL
     */
    public boolean isDisplayTaxNoteLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_NOTE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_LABEL");
        }
        return isDisplay;
    }

    public String getTaxNoteLabel() {
        String text = "";
        try {
            text = TAX_NOTE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_LABEL");
        }
        return text;
    }

    /**
     * Object: TAX_NOTE_TEXT_BOX
     */
    public boolean isDisplayTaxNoteTextBox() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_NOTE_TEXT_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_TEXT_BOX");
        }
        return isDisplay;
    }

    public String getTaxNoteTextBox() {
        String text = "";
        try {
            text = TAX_NOTE_TEXT_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_TEXT_BOX");
        }
        return text;
    }

    public void setTaxNoteTextBox(String text) {
        try {
            TAX_NOTE_TEXT_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_TEXT_BOX");
        }
    }

    public void clearTaxNoteTextBox() {
        try {
            TAX_NOTE_TEXT_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_TEXT_BOX");
        }
    }

    /**
     * Object: CONFIRM_BUTTON
     */
    public boolean isDisplayConfirmButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CONFIRM_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_BUTTON");
        }
        return isDisplay;
    }

    public String getConfirmButtonText() {
        String text = "";
        try {
            text = CONFIRM_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_BUTTON");
        }
        return text;
    }

    public void clickOnConfirmButton() {
        try {
            CONFIRM_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CONFIRM_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPopupTitle() && getPopupTitle().toLowerCase().contains("tạo thuế");
    }
}