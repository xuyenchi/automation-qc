package finanOS.product;

import finanOS.base.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common.Log;

import java.util.List;

/**
 * Author: VyLe
 * Created date: 03May2024
 */
public class ProductListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement EXPORT_DATA_BUTTON;
    @FindBy(css = Header + "")
    private WebElement IMPORT_DATA_BUTTON;
    @FindBy(css = Header + "")
    private WebElement CREATE_PRODUCT_BUTTON;
    
    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement SKU_CODE_LABEL;
    @FindBy(css = Body + "")
    private WebElement PRODUCT_NAME_LABEL;
    @FindBy(css = Body + "")
    private WebElement PRODUCT_UNIT_LABEL;
    @FindBy(css = Body + "")
    private WebElement PRODUCT_PRICE_LABEL;
    @FindBy(css = Body + "")
    private WebElement ACTION_LABEL;
    @FindBy(css = Body + "")
    private WebElement PRODUCT_LABEL;
    @FindBy(css = Body + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Body + "")
    private List<WebElement> PRODUCT_CARD_LIST;
    private static final String EditButton = "";
    private static final String DeleteButton = "";
    private static final String CheckBox = "";
    private static final String SKUCode = "";
    private static final String ProductName = "";
    private static final String Unit = "";
    private static final String Price = "";
    /**
     * Footer
     * - currently, don't care pagination
     */

    /**
     * ==============================================================================================================
     * Constructor
     */
    public ProductListPage(WebDriver driver) {
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
     * Object: PRODUCT_LABEL
     */
    public boolean isDisplayProductLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PRODUCT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_LABEL");
        }
        return isDisplay;
    }
    public String getProductLabel(){
        String text = "";
        try {
            text = PRODUCT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_LABEL");
        }
        return text;
    }
    /**
     * Object: EXPORT_DATA_BUTTON
     */
    public boolean isDisplayExportDataButton(){
        boolean isDisplay = false;
        try {
            isDisplay = EXPORT_DATA_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_DATA_BUTTON");
        }
        return isDisplay;
    }
    public String getExportDataButton(){
        String text = "";
        try {
            text = EXPORT_DATA_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of EXPORT_DATA_BUTTON");
        }
        return text;
    }
    public void clickOnExportDataButton() {
        try {
            EXPORT_DATA_BUTTON.click();
        } catch (Exception e){
            Log.addLog("css of EXPORT_DATA_BUTTON");
        }
    }
    /**
     * Object: IMPORT_DATA_BUTTON
     */
    public boolean isDisplayImportDataButton(){
        boolean isDisplay = false;
        try {
            isDisplay = IMPORT_DATA_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of IMPORT_DATA_BUTTON");
        }
        return isDisplay;
    }
    public String getImportDataButton(){
        String text = "";
        try {
            text = IMPORT_DATA_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of IMPORT_DATA_BUTTON");
        }
        return text;
    }
    public void clickOnImportDataButton() {
        try {
            IMPORT_DATA_BUTTON.click();
        } catch (Exception e){
            Log.addLog("css of EXPORT_DATA_BUTTON");
        }
    }
    /**
     * Object: CREATE_PRODUCT_BUTTON
     */
    public boolean isDisplayCreateProductButton(){
        boolean isDisplay = false;
        try {
            isDisplay = CREATE_PRODUCT_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CREATE_PRODUCT_BUTTON");
        }
        return isDisplay;
    }
    public String getCreateProductButton(){
        String text = "";
        try {
            text = CREATE_PRODUCT_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CREATE_PRODUCT_BUTTON");
        }
        return text;
    }
    public void clickOnCreateProductButton() {
        try {
            CREATE_PRODUCT_BUTTON.click();
        } catch (Exception e){
            Log.addLog("css of CREATE_PRODUCT_BUTTON");
        }
    }
    /**
     * Object: SEARCH_BOX
     */
    public boolean isDisplaySearchBox(){
        boolean isDisplay = false;
        try {
            isDisplay = SEARCH_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
        return isDisplay;
    }
    public String getSearchBox(){
        String text = "";
        try {
            text = SEARCH_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
        return text;
    }
    public void setSearchBox(String productName){
        try {
            SEARCH_BOX.sendKeys(productName);
        } catch (Exception e) {
            Log.addLog("cssSelector of SEARCH_BOX");
        }
    }
    public void clearSearchBox() {
        try {
            SEARCH_BOX.clear();
        } catch (Exception e) {
            Log.addLog("cssSelector of SEARCH_BOX");
        }
    }
    /**
     * Object: SKU_CODE_LABEL
     */
    public boolean isDisplaySKUCodeLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = SKU_CODE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SKU_CODE_LABEL");
        }
        return isDisplay;
    }
    public String getSKUCodeLabel(){
        String text = "";
        try {
            text = SKU_CODE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of SKU_CODE_LABEL");
        }
        return text;
    }
    /**
     * Object: PRODUCT_NAME_LABEL
     */
    public boolean isDisplayProductNameLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PRODUCT_NAME_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_NAME_LABEL");
        }
        return isDisplay;
    }
    public String getProductNameLabel(){
        String text = "";
        try {
            text = PRODUCT_NAME_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_NAME_LABEL");
        }
        return text;
    }

    /**
     * Object: PRODUCT_UNIT_LABEL
     */
    public boolean isDisplayProductUnitLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PRODUCT_UNIT_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_UNIT_LABEL");
        }
        return isDisplay;
    }
    public String getProductUnitLabel(){
        String text = "";
        try {
            text = PRODUCT_UNIT_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_UNIT_LABEL");
        }
        return text;
    }
    /**
     * Object: PRODUCT_PRICE_LABEL
     */
    public boolean isDisplayProductPriceLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = PRODUCT_PRICE_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_PRICE_LABEL");
        }
        return isDisplay;
    }
    public String getProductPriceLabel(){
        String text = "";
        try {
            text = PRODUCT_PRICE_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_PRICE_LABEL");
        }
        return text;
    }

    /**
     * Object: ACTION_LABEL
     */
    public boolean isDisplayActionLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = ACTION_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ACTION_LABEL");
        }
        return isDisplay;
    }
    public String getActionLabel(){
        String text = "";
        try {
            text = ACTION_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of ACTION_LABEL");
        }
        return text;
    }
    /**
     * Object: PRODUCT_CARD_LIST
     */
    private WebElement getProductCardElement(int pos) { /* method get vị trí element */
        WebElement element = null;
        try {
            element = PRODUCT_CARD_LIST.get(pos);
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_CARD_LIST at "+ pos);
        }
        return element;
    }
    public int getTotalProductCardTable() {
        int total = 0;
        try {
            total = PRODUCT_CARD_LIST.size();
        } catch (Exception e) {
            Log.addLog("css of PRODUCT_CARD_LIST");
        }
        return total;
    }
    public void clickOnCardByPosition(int pos) {
        WebElement element = getProductCardElement(pos); /* gọi method get vị trí */
        if (element != null){
            element.click();
        }
    }

    public String getSKUCodeByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(SKUCode)).getText();
            } catch (Exception e) {
                Log.addLog("css of SKUCode at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnCardBySKUCode(String skuCode) {
        boolean isFound = false;
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())) {
                isFound = true;
                clickOnCardByPosition(i);
                break;
            }
        }

        if (!isFound) {
            Log.addLog("Nothing product on this page have SKUCode is " + skuCode);
        }
    }
    public String getProductNameByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(ProductName)).getText();
            } catch (Exception e) {
                Log.addLog("css of SKU Code at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getProductNameBySKUCode(String skuCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())){
                isFound = true;
                text = getSKUCodeByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing record on this page have SKUCode is " + skuCode);
        }
        return text;
    }
    public String getProductUnitByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Unit)).getText();
            } catch (Exception e) {
                Log.addLog("css of Unit at "+ pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getProductUnitBySKUCode(String skuCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())) {
                isFound = true;
                text = getProductUnitByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing record on this page have SKUCode is " + skuCode);
        }
        return text;
    }
    public String getPriceByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            String text = "";
            try {
                text = element.findElement(By.cssSelector(Price)).getText();
            } catch (Exception e) {
                Log.addLog("css of Price at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getPriceBySKUCode(String skuCode) {
        boolean isFound = false;
        String text = "";
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())) {
                isFound = true;
                text = getPriceByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing record on this page have SKUCode is " + skuCode);
        }
        return text;
    }
    public void clickOnCheckBoxByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(CheckBox)).click();
            } catch (Exception e) {
                Log.addLog("css of checkbox at " + pos);
            }
        }
    }
    public void clickOnCheckBoxBySKUCode(String skuCode) {
        boolean isFound = false;
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())) {
                isFound = true;
                clickOnCheckBoxByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing record on this page have SKUCode is " + skuCode);
        }
    }
    public void clickOnDeleteButtonByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(DeleteButton)).click();
            } catch (Exception e) {
                Log.addLog("css of DeleteButton at " + pos);
            }
        }
    }
    public void clickOnDeleteButtonBySKUCode(String skuCode) {
        boolean isFound = false;
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())) {
                isFound = true;
                clickOnDeleteButtonByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing record on this page have SKUCode is " + skuCode);
        }
    }
    public void clickOnEditButtonByPosition(int pos) {
        WebElement element = getProductCardElement(pos);
        if (element != null) {
            try {
                element.findElement(By.cssSelector(EditButton)).click();
            } catch (Exception e) {
                Log.addLog("css of EditButton at " + pos);
            }
        }
    }
    public void clickOnEditButtonBySKUCode(String skuCode) {
        boolean isFound = false;
        for (int i = 0; i < getTotalProductCardTable(); i++) {
            if (getSKUCodeByPosition(i).toLowerCase().equals(skuCode.toLowerCase())) {
                isFound = true;
                clickOnEditButtonByPosition(i);
                break;
            }
        }
        if (!isFound) {
            Log.addLog("Nothing record on this page have SKUCode is " + skuCode);
        }
    }
    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPageTitle() && getPageTitle().toLowerCase().equals("sản phẩm");
    }
}


