package finanOS.tax;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

import java.util.List;

public class TaxListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String TaxCheckpoint = "";
    private static final String TaxPercent = "";
    private static final String TaxNote = "";
    private static final String TaxMoreActionIcon = "";
    private static final String TaxEditByPosition = "";
    private static final String TaxRemoveByPosition = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement CREATE_BUTTON;
    @FindBy(css = Header + "")
    private WebElement BACK_BUTTON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement TAX_NAME_TITLE;
    @FindBy(css = Body + "")
    private WebElement TAX_PERCENT_TITLE;
    @FindBy(css = Body + "")
    private WebElement TAX_NOTE_TITLE;
    @FindBy(css = Body + "")
    private List<WebElement> LIST_RECORD;

    public TaxListPage(WebDriver driver) {
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
     * Object: CREATE_BUTTON
     */
    public boolean isDisplayCreateButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CREATE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
        return isDisplay;
    }

    public String getCreateButtonText() {
        String text = "";
        try {
            text = CREATE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
        return text;
    }

    public void clickOnCreateButton() {
        try {
            CREATE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
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
     * Object: Title: TAX_NAME_TITLE, TAX_PERCENT, TAX_NOTE
     */
    public boolean isDisplayTaxNameTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_NAME_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_TITLE");
        }
        return isDisplay;
    }

    public String getTaxNameTitle() {
        String text = "";
        try {
            text = TAX_NAME_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_NAME_TITLE");
        }
        return text;
    }

    /**
     * Object: Title: TAX_PERCENT_TITLE
     */
    public boolean isDisplayTaxPercentTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_PERCENT_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_TITLE");
        }
        return isDisplay;
    }

    public String getTaxPercentTitle() {
        String text = "";
        try {
            text = TAX_PERCENT_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_PERCENT_TITLE");
        }
        return text;
    }

    /**
     * Object: Title: TAX_NOTE_TITLE
     */
    public boolean isDisplayTaxNoteTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TAX_NOTE_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_TITLE");
        }
        return isDisplay;
    }

    public String getTaxNoteTitle() {
        String text = "";
        try {
            text = TAX_NOTE_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TAX_NOTE_TITLE");
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
            element = LIST_RECORD.get(pos);
        } catch (Exception e) {
            Log.addLog("css of LIST_RECORD at " + pos);
        }
        return element;
    }

    public int getTotalRecordTable() {
        int total = 0;
        try {
            total = LIST_RECORD.size();
        } catch (Exception e) {
            Log.addLog("css of LIST_RECORD");
        }
        return total;
    }

    public void clickOnRecordByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            element.click();
        }
    }

    /**
     * --- TaxCheckpoint ---
     */
    public void clickOnTaxCheckpoint(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TaxCheckpoint)).click();
            } catch (Exception e) {
                Log.addLog("css of TnxCheckpoint at " + pos);
            }
        }
    }

    /**
     * --- TaxPercent ---
     */
    public String getTaxPercentByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TaxPercent)).getText();
            } catch (Exception e) {
                Log.addLog("css of TaxPercent at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    /**
     * --- TaxNote ---
     */
    public String getTaxNoteByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TaxNote)).getText();
            } catch (Exception e) {
                Log.addLog("css of TaxNote at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }

    /**
     * --- TaxMoreActionIcon ---
     */
    public void clickOnTaxMoreActionIconByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TaxMoreActionIcon)).click();
            } catch (Exception e) {
                Log.addLog("css of TaxMoreActionIcon at " + pos);
            }
        }
    }

    /**
     * --- EditTaxIcon ---
     */
    public void clickOnTaxEditByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TaxEditByPosition)).click();
            } catch (Exception e) {
                Log.addLog("css of EditTaxIconByPosition at " + pos);
            }
        }
    }

    /**
     * --- RemoveTaxIcon ---
     */
    public void clickOnTaxRemoveByPosition(int pos) {
        WebElement element = getRecordElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(TaxRemoveByPosition)).click();
            } catch (Exception e) {
                Log.addLog("css of RemoveTaxIconByPosition at " + pos);
            }
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("thuế");
    }
}