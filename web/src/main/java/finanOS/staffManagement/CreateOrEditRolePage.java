package finanOS.staffManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import finanOS.base.Sidebar;
import utilities.common.Log;

import java.util.List;

public class CreateOrEditRolePage extends Sidebar {
    private static final String Header = "";
    private static final String LeftBody = "";
    private static final String RightBody = "";
    private static final String Footer = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;

    /**
     * Body
     */
    @FindBy(css = LeftBody + "")
    private WebElement GENERAL_INFO_TITLE;
    @FindBy(css = LeftBody + "")
    private WebElement ROLE_NAME_LABEL;
    @FindBy(css = LeftBody + "")
    private WebElement ROLE_NAME_BOX;
    @FindBy(css = LeftBody + "")
    private WebElement ROLE_NAME_ERROR_MESSAGE;
    @FindBy(css = LeftBody + "")
    private WebElement DESC_LABEL;
    @FindBy(css = LeftBody + "")
    private WebElement DESC_BOX;
    @FindBy(css = LeftBody + "")
    private WebElement PERMISSION_LABEL;
    @FindBy(css = LeftBody + "")
    private WebElement PERMISSION_ERROR_MESSAGE;
    @FindBy(css = LeftBody + "")
    private List<WebElement> PERMISSION_LIST;
    @FindBy(css = LeftBody + "")
    private List<WebElement> PERMISSION_SUB_LIST;
    @FindBy(css = RightBody + "")
    private WebElement STAFF_LABEL;
    @FindBy(css = RightBody + "")
    private WebElement SEARCH_STAFF_BOX;
    @FindBy(css = RightBody + "")
    private WebElement DROPDOWN_STAFF_LABEL;
    @FindBy(css = RightBody + "")
    private WebElement DROPDOWN_STAFF_NEW_BUTTON;
    @FindBy(css = RightBody + "")
    private List<WebElement> DROPDOWN_STAFF_LIST;
    private static final String DropdownStaffName = "";
    private static final String DropdownStaffPhone = "";
    @FindBy(css = RightBody + "")
    private WebElement DROPDOWN_STAFF_BACK_BUTTON;
    @FindBy(css = RightBody + "")
    private WebElement DROPDOWN_STAFF_APPLY_BUTTON;
    @FindBy(css = RightBody + "")
    private List<WebElement> STAFF_LIST;
    private static final String StaffName = "";
    private static final String StaffPhone = "";
    private static final String RemoveStaffIcon = "";

    /**
     * Footer
     */
    @FindBy(css = Footer + "")
    private WebElement CANCEL_BUTTON;
    @FindBy(css = Footer + "")
    private WebElement ACCEPT_OR_UPDATE_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public CreateOrEditRolePage(WebDriver driver) {
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
     * Object: GENERAL_INFO_TITLE
     */
    public boolean isDisplayGeneralInfoTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = GENERAL_INFO_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of GENERAL_INFO_TITLE");
        }
        return isDisplay;
    }
    public String getGeneralInfoTitle() {
        String text = "";
        try {
            text = GENERAL_INFO_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of GENERAL_INFO_TITLE");
        }
        return text;
    }

    /**
     * Object: ROLE_NAME_LABEL
     */
    public boolean isDisplayRoleNameLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = ROLE_NAME_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_LABEL");
        }
        return isDisplay;
    }
    public String getRoleNameLabel() {
        String text = "";
        try {
            text = ROLE_NAME_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_LABEL");
        }
        return text;
    }

    /**
     * Object: ROLE_NAME_BOX
     */
    public boolean isDisplayRoleNameBox() {
        boolean isDisplay = false;
        try {
            isDisplay = ROLE_NAME_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_BOX");
        }
        return isDisplay;
    }
    public String getRoleNameValue() {
        String text = "";
        try {
            text = ROLE_NAME_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_BOX");
        }
        return text;
    }
    public void clearRoleNameBox() {
        try {
            ROLE_NAME_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_BOX");
        }
    }
    public void setRoleNameBox(String roleName) {
        try {
            ROLE_NAME_BOX.sendKeys(roleName);
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_BOX");
        }
    }

    /**
     * Object: ROLE_NAME_ERROR_MESSAGE
     */
    public boolean isDisplayRoleNameErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = ROLE_NAME_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getRoleNameErrorMessage() {
        String text = "";
        try {
            text = ROLE_NAME_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: DESC_LABEL
     */
    public boolean isDisplayDescriptionLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = DESC_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DESC_LABEL");
        }
        return isDisplay;
    }
    public String getDescriptionLabel() {
        String text = "";
        try {
            text = DESC_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of DESC_LABEL");
        }
        return text;
    }

    /**
     * Object: DESC_BOX
     */
    public boolean isDisplayDescriptionBox() {
        boolean isDisplay = false;
        try {
            isDisplay = DESC_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DESC_BOX");
        }
        return isDisplay;
    }
    public String getDescriptionValue() {
        String text = "";
        try {
            text = DESC_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of DESC_BOX");
        }
        return text;
    }
    public void clearDescriptionBox() {
        try {
            DESC_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of DESC_BOX");
        }
    }
    public void setDescriptionBox(String description) {
        try {
            DESC_BOX.sendKeys(description);
        } catch (Exception e) {
            Log.addLog("css of DESC_BOX");
        }
    }

    /**
     * Object: PERMISSION_LABEL
     */
    public boolean isDisplayPermissionTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = PERMISSION_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PERMISSION_LABEL");
        }
        return isDisplay;
    }
    public String getPermissionTitle() {
        String text = "";
        try {
            text = PERMISSION_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of PERMISSION_LABEL");
        }
        return text;
    }

    /**
     * Object: PERMISSION_ERROR_MESSAGE
     */
    public boolean isDisplayPermissionErrorMessage() {
        boolean isDisplay = false;
        try {
            isDisplay = PERMISSION_ERROR_MESSAGE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of PERMISSION_ERROR_MESSAGE");
        }
        return isDisplay;
    }
    public String getPermissionErrorMessage() {
        String text = "";
        try {
            text = PERMISSION_ERROR_MESSAGE.getText();
        } catch (Exception e) {
            Log.addLog("css of PERMISSION_ERROR_MESSAGE");
        }
        return text;
    }

    /**
     * Object: PERMISSION_LIST
     */
    private WebElement getRecordByPosition(int pos){
        WebElement element = null;
        try {
            element = PERMISSION_LIST.get(pos);
        } catch (Exception e){
            Log.addLog("css of PERMISSION_LIST at " + pos);
        }
        return element;
    }
    public int getTotalPermission(){
        int total = 0;
        try {
            total = PERMISSION_LIST.size();
        } catch (Exception e){
            Log.addLog("css of PERMISSION_LIST");
        }
        return total;
    }
    public String getPermissionByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector("")).getText();
            } catch (Exception e){
                Log.addLog("css of '' at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnPermissionByPosition(int pos){
        getRecordByPosition(pos).click();
    }
    public void clickOnPermissionByName(String permissionName){
        boolean isFound = false;
        for(int i = 0; i < getTotalPermission(); i++){
            if(getPermissionByPosition(i).toLowerCase().contains(permissionName.toLowerCase())){
                isFound = true;
                clickOnPermissionByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with permission name is " + permissionName);
        }
    }

    /**
     * Object: PERMISSION_SUB_LIST
     */
    private WebElement getSubRecordByPosition(int pos){
        WebElement element = null;
        try {
            element = PERMISSION_SUB_LIST.get(pos);
        } catch (Exception e){
            Log.addLog("css of PERMISSION_SUB_LIST at " + pos);
        }
        return element;
    }
    public int getTotalSubPermission(){
        int total = 0;
        try {
            total = PERMISSION_SUB_LIST.size();
        } catch (Exception e){
            Log.addLog("css of PERMISSION_SUB_LIST");
        }
        return total;
    }
    public String getSubPermissionByPosition(int pos){
        WebElement element = getSubRecordByPosition(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector("")).getText();
            } catch (Exception e){
                Log.addLog("css of '' at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnSubPermissionByPosition(int pos){
        getSubRecordByPosition(pos).click();
    }
    public void clickOnSubPermissionByName(String subPermissionName){
        boolean isFound = false;
        for(int i = 0; i < getTotalPermission(); i++){
            if(getSubPermissionByPosition(i).toLowerCase().contains(subPermissionName.toLowerCase())){
                isFound = true;
                clickOnSubPermissionByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with sub permission name is " + subPermissionName);
        }
    }

    /**
     * Object: STAFF_LABEL
     */
    public boolean isDisplayStaffLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = STAFF_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of STAFF_TITLE");
        }
        return isDisplay;
    }
    public String getStaffLabel() {
        String text = "";
        try {
            text = STAFF_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of STAFF_TITLE");
        }
        return text;
    }

    /**
     * Object: SEARCH_STAFF_BOX
     */
    public boolean isDisplaySearchStaffBox() {
        boolean isDisplay = false;
        try {
            isDisplay = SEARCH_STAFF_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_STAFF_BOX");
        }
        return isDisplay;
    }
    public String getSearchStaffValue() {
        String text = "";
        try {
            text = SEARCH_STAFF_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_STAFF_BOX");
        }
        return text;
    }
    public void clearSearchStaffBox() {
        try {
            SEARCH_STAFF_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_STAFF_BOX");
        }
    }
    public void setSearchStaffBox(String staffName) {
        try {
            SEARCH_STAFF_BOX.sendKeys(staffName);
        } catch (Exception e) {
            Log.addLog("css of SEARCH_STAFF_BOX");
        }
    }

    /**
     * Object: DROPDOWN_STAFF_LABEL
     */
    public boolean isDisplayDropdownStaffLabel() {
        boolean isDisplay = false;
        try {
            isDisplay = DROPDOWN_STAFF_LABEL.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_LABEL");
        }
        return isDisplay;
    }
    public String getDropdownStaffLabel() {
        String text = "";
        try {
            text = DROPDOWN_STAFF_LABEL.getText();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_LABEL");
        }
        return text;
    }
    public void clickOnDropdownStaffLabel(){
        try {
            DROPDOWN_STAFF_LABEL.click();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_LABEL");
        }
    }

    /**
     * Object: DROPDOWN_STAFF_NEW_BUTTON
     */
    public boolean isDisplayDropdownStaffNewButton() {
        boolean isDisplay = false;
        try {
            isDisplay = DROPDOWN_STAFF_NEW_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_NEW_BUTTON");
        }
        return isDisplay;
    }
    public String getDropdownStaffNewButton() {
        String text = "";
        try {
            text = DROPDOWN_STAFF_NEW_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_NEW_BUTTON");
        }
        return text;
    }
    public void clickOnDropdownStaffNewButton(){
        try {
            DROPDOWN_STAFF_NEW_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_NEW_BUTTON");
        }
    }

    /**
     * Object: DROPDOWN_STAFF_LIST
     */
    private WebElement getDropdownStaffElement(int pos){
        WebElement element = null;
        try {
            element = DROPDOWN_STAFF_LIST.get(pos);
        } catch (Exception e){
            Log.addLog("css of DROPDOWN_STAFF_LIST at " + pos);
        }
        return element;
    }
    public int getTotalDropdownStaff(){
        int total = 0;
        try {
            total = DROPDOWN_STAFF_LIST.size();
        } catch (Exception e){
            Log.addLog("css of DROPDOWN_STAFF_LIST");
        }
        return total;
    }
    public String getStaffNameInDropdownByPosition(int pos){
        WebElement element = getDropdownStaffElement(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(DropdownStaffName)).getText();
            } catch (Exception e){
                Log.addLog("css of DropdownStaffName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getStaffPhoneInDropdownByPosition(int pos){
        WebElement element = getDropdownStaffElement(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(DropdownStaffPhone)).getText();
            } catch (Exception e){
                Log.addLog("css of DropdownStaffPhone at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnStaffInDropdownByPosition(int pos){
        getDropdownStaffElement(pos).click();
    }
    public void clickOnStaffInDropdownByName(String staffName){
        boolean isFound = false;
        for(int i = 0; i < getTotalPermission(); i++){
            if(getStaffNameInDropdownByPosition(i).toLowerCase().equals(staffName.toLowerCase())){
                isFound = true;
                clickOnStaffInDropdownByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with staff name is " + staffName);
        }
    }

    /**
     * Object: DROPDOWN_STAFF_BACK_BUTTON
     */
    public boolean isDisplayDropdownBackButton() {
        boolean isDisplay = false;
        try {
            isDisplay = DROPDOWN_STAFF_BACK_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_BACK_BUTTON");
        }
        return isDisplay;
    }
    public String getDropdownBackButton() {
        String text = "";
        try {
            text = DROPDOWN_STAFF_BACK_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_BACK_BUTTON");
        }
        return text;
    }
    public void clickOnDropdownBackButton(){
        try {
            DROPDOWN_STAFF_BACK_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_BACK_BUTTON");
        }
    }

    /**
     * Object: DROPDOWN_STAFF_APPLY_BUTTON
     */
    public boolean isDisplayDropdownApplyButton() {
        boolean isDisplay = false;
        try {
            isDisplay = DROPDOWN_STAFF_APPLY_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_APPLY_BUTTON");
        }
        return isDisplay;
    }
    public String getDropdownApplyButton() {
        String text = "";
        try {
            text = DROPDOWN_STAFF_APPLY_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_APPLY_BUTTON");
        }
        return text;
    }
    public void clickOnDropdownApplyButton(){
        try {
            DROPDOWN_STAFF_APPLY_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of DROPDOWN_STAFF_APPLY_BUTTON");
        }
    }

    /**
     * Object: STAFF_LIST
     */
    private WebElement getStaffElement(int pos){
        WebElement element = null;
        try {
            element = STAFF_LIST.get(pos);
        } catch (Exception e){
            Log.addLog("css of STAFF_LIST at " + pos);
        }
        return element;
    }
    public int getTotalStaff(){
        int total = 0;
        try {
            total = STAFF_LIST.size();
        } catch (Exception e){
            Log.addLog("css of STAFF_LIST");
        }
        return total;
    }
    public String getStaffNameByPosition(int pos){
        WebElement element = getStaffElement(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(StaffName)).getText();
            } catch (Exception e){
                Log.addLog("css of StaffName at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getStaffPhoneByPosition(int pos){
        WebElement element = getStaffElement(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(StaffPhone)).getText();
            } catch (Exception e){
                Log.addLog("css of StaffPhone at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public void clickOnRemoveStaffIconByPosition(int pos){
        WebElement element = getStaffElement(pos);
        if(element != null){
            try {
                element.findElement(By.cssSelector(RemoveStaffIcon)).click();
            } catch (Exception e){
                Log.addLog("css of RemoveStaffIcon at " + pos);
            }
        }
    }
    public void clickOnRemoveStaffIconByName(String staffName){
        boolean isFound = false;
        for(int i = 0; i < getTotalPermission(); i++){
            if(getStaffNameByPosition(i).toLowerCase().equals(staffName.toLowerCase())){
                isFound = true;
                clickOnRemoveStaffIconByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with staff name is " + staffName);
        }
    }

    /**
     * Object: CANCEL_BUTTON
     */
    public boolean isDisplayCancelButton() {
        boolean isDisplay = false;
        try {
            isDisplay = CANCEL_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of CANCEL_BUTTON");
        }
        return isDisplay;
    }
    public String getCancelButton() {
        String text = "";
        try {
            text = CANCEL_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of CANCEL_BUTTON");
        }
        return text;
    }
    public void clickOnCancelButton(){
        try {
            CANCEL_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CANCEL_BUTTON");
        }
    }

    /**
     * Object: ACCEPT_OR_UPDATE_BUTTON
     */
    public boolean isDisplayAcceptButton() {
        boolean isDisplay = false;
        try {
            isDisplay = ACCEPT_OR_UPDATE_BUTTON.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ACCEPT_OR_UPDATE_BUTTON");
        }
        return isDisplay;
    }
    public String getAcceptButton() {
        String text = "";
        try {
            text = ACCEPT_OR_UPDATE_BUTTON.getText();
        } catch (Exception e) {
            Log.addLog("css of ACCEPT_OR_UPDATE_BUTTON");
        }
        return text;
    }
    public void clickOnAcceptButton(){
        try {
            ACCEPT_OR_UPDATE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of ACCEPT_OR_UPDATE_BUTTON");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayPermissionTitle() && isDisplayStaffLabel();
    }
}
