package finanOS.staffManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import finanOS.base.Sidebar;
import utilities.common.Log;

import java.util.List;

/**
 * Design: https://www.figma.com/file/kCvRoOl4ef31Kk5R1itttK/Kanban-4?type=design&node-id=523-148&mode=design&t=12IwGZQ7Fl0T3qFQ-0
 * Created at: 5Jan2024
 * Created by: chaule
 */

public class RoleNPermissionListPage extends Sidebar {
    private static final String Header = "";
    private static final String Body = "";
    private static final String Popup = "";

    /**
     * Header
     */
    @FindBy(css = Header + "")
    private WebElement PAGE_TITLE;
    @FindBy(css = Header + "")
    private WebElement SEARCH_BOX;
    @FindBy(css = Header + "")
    private WebElement CREATE_BUTTON;

    /**
     * Body
     */
    @FindBy(css = Body + "")
    private WebElement ROLE_NAME_TITLE;
    @FindBy(css = Body + "")
    private WebElement DESC_TITLE;
    @FindBy(css = Body + "")
    private WebElement TOTAL_STAFF_TITLE;
    @FindBy(css = Body + "")
    private List<WebElement> RECORD_LIST;
    private static final String RoleNameValue = "";
    private static final String DescriptionValue = "";
    private static final String TotalStaffValue = "";
    private static final String ThreeDotAction = "";
    /** currently, action list with fix to handle */
    private static final String EditRecord = "";
    private static final String DeleteRecord = "";

    /**
     * Popup
     */
    @FindBy(xpath = Popup + "")
    private WebElement POPUP_TITLE;
    @FindBy(xpath = Popup + "")
    private WebElement POPUP_DESCRIPTION;
    @FindBy(xpath = Popup + "")
    private WebElement POPUP_ACCEPT_BUTTON;
    @FindBy(xpath = Popup + "")
    private WebElement POPUP_REJECT_BUTTON;

    /**
     * ==============================================================================================================
     * Constructor
     */
    public RoleNPermissionListPage(WebDriver driver) {
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
     * Object: SEARCH_BOX
     */
    public boolean isDisplaySearchBox() {
        boolean isDisplay = false;
        try {
            isDisplay = SEARCH_BOX.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
        return isDisplay;
    }
    public String getSearchBoxValue() {
        String text = "";
        try {
            text = SEARCH_BOX.getText();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
        return text;
    }
    public void clearSearchBox() {
        try {
            SEARCH_BOX.clear();
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
    }
    public void setSearchBox(String text) {
        try {
            SEARCH_BOX.sendKeys(text);
        } catch (Exception e) {
            Log.addLog("css of SEARCH_BOX");
        }
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
    public void clickOnCreateButton(){
        try {
            CREATE_BUTTON.click();
        } catch (Exception e) {
            Log.addLog("css of CREATE_BUTTON");
        }
    }

    /**
     * Object: ROLE_NAME_TITLE
     */
    public boolean isDisplayRoleNameTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = ROLE_NAME_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_TITLE");
        }
        return isDisplay;
    }
    public String getRoleNameTitle() {
        String text = "";
        try {
            text = ROLE_NAME_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of ROLE_NAME_TITLE");
        }
        return text;
    }

    /**
     * Object: DESC_TITLE
     */
    public boolean isDisplayDescriptionTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = DESC_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of DESC_TITLE");
        }
        return isDisplay;
    }
    public String getDescriptionTitle() {
        String text = "";
        try {
            text = DESC_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of DESC_TITLE");
        }
        return text;
    }

    /**
     * Object: TOTAL_STAFF_TITLE
     */
    public boolean isDisplayTotalStaffTitle() {
        boolean isDisplay = false;
        try {
            isDisplay = TOTAL_STAFF_TITLE.isDisplayed();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_STAFF_TITLE");
        }
        return isDisplay;
    }
    public String getTotalStaffTitle() {
        String text = "";
        try {
            text = TOTAL_STAFF_TITLE.getText();
        } catch (Exception e) {
            Log.addLog("css of TOTAL_STAFF_TITLE");
        }
        return text;
    }

    /**
     * Object: RECORD_LIST ------------------------------------------------------------------------------------------
     */
     private WebElement getRecordByPosition(int pos){
         WebElement element = null;
         try {
             element = RECORD_LIST.get(pos);
         } catch (Exception e){
             Log.addLog("css of RECORD_LIST at " + pos);
         }
         return element;
     }
     public int getTotalRecords(){
         int total = 0;
         try {
             total = RECORD_LIST.size();
         } catch (Exception e){
             Log.addLog("css of RECORD_LIST");
         }
         return total;
     }
     public String getRoleNameByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(RoleNameValue)).getText();
            } catch (Exception e){
                Log.addLog("css of RoleNameValue at " + pos);
            }
            return text;
        } else {
            return "";
        }
     }
     public void clickOnRecordByPosition(int pos){
         getRecordByPosition(pos).click();
     }
     /** currently, this method only support on current page */
     public void clickOnRecordByRoleName(String roleName){
         boolean isFound = false;
         for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                clickOnRecordByPosition(i);
                break;
            }
         }
         if(!isFound){
             Log.addLog("Can't find record with role name is " + roleName);
         }
     }
     public String getDescriptionByPosition(int pos){
         WebElement element = getRecordByPosition(pos);
         if(element != null){
             String text = "";
             try {
                 text = element.findElement(By.cssSelector(DescriptionValue)).getText();
             } catch (Exception e){
                 Log.addLog("css of DescriptionValue at " + pos);
             }
             return text;
         } else {
             return "";
         }
     }
     public String getDescriptionByRoleName(String roleName){
         String text = "";
         boolean isFound = false;
         for(int i = 0; i < getTotalRecords(); i++){
             if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                 isFound = true;
                 text = getDescriptionByPosition(i);
                 break;
             }
         }
         if(!isFound){
             Log.addLog("Can't find record with role name is " + roleName);
         }
         return text;
     }
    public String getTotalStaffByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(TotalStaffValue)).getText();
            } catch (Exception e){
                Log.addLog("css of TotalStaffValue at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getTotalStaffByRoleName(String roleName){
        String text = "";
        boolean isFound = false;
        for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                text = getTotalStaffByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with role name is " + roleName);
        }
        return text;
    }
    public void clickOnThreeDotByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            try {
                element.findElement(By.cssSelector(ThreeDotAction)).click();
            } catch (Exception e){
                Log.addLog("css of ThreeDotAction at " + pos);
            }
        }
    }
    public void clickOnThreeDotByRoleName(String roleName){
        boolean isFound = false;
        for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                try {
                    getRecordByPosition(i).findElement(By.cssSelector(ThreeDotAction)).click();
                } catch (Exception e){
                    Log.addLog("css of ThreeDotAction at " + i);
                }
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with role name is " + roleName);
        }
    }
    public String getEditActionByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(EditRecord)).getText();
            } catch (Exception e){
                Log.addLog("css of EditRecord at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getEditActionByRoleName(String roleName){
        String text = "";
        boolean isFound = false;
        for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                text = getEditActionByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with role name is " + roleName);
        }
        return text;
    }
    public void clickOnEditActionByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            try {
                element.findElement(By.cssSelector(EditRecord)).click();
            } catch (Exception e){
                Log.addLog("css of EditRecord at " + pos);
            }
        }
    }
    public void clickOnEditActionByRoleName(String roleName){
        boolean isFound = false;
        for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                try {
                    getRecordByPosition(i).findElement(By.cssSelector(EditRecord)).click();
                } catch (Exception e){
                    Log.addLog("css of EditRecord at " + i);
                }
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with role name is " + roleName);
        }
    }
    public String getDeleteActionByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            String text = "";
            try {
                text = element.findElement(By.cssSelector(DeleteRecord)).getText();
            } catch (Exception e){
                Log.addLog("css of DeleteRecord at " + pos);
            }
            return text;
        } else {
            return "";
        }
    }
    public String getDeleteActionByRoleName(String roleName){
        String text = "";
        boolean isFound = false;
        for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                text = getDeleteActionByPosition(i);
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with role name is " + roleName);
        }
        return text;
    }
    public void clickOnDeleteActionByPosition(int pos){
        WebElement element = getRecordByPosition(pos);
        if(element != null){
            try {
                element.findElement(By.cssSelector(DeleteRecord)).click();
            } catch (Exception e){
                Log.addLog("css of DeleteRecord at " + pos);
            }
        }
    }
    public void clickOnDeleteActionByRoleName(String roleName){
        boolean isFound = false;
        for(int i = 0; i < getTotalRecords(); i++){
            if(getRoleNameByPosition(i).toLowerCase().equals(roleName.toLowerCase())){
                isFound = true;
                try {
                    getRecordByPosition(i).findElement(By.cssSelector(DeleteRecord)).click();
                } catch (Exception e){
                    Log.addLog("css of DeleteRecord at " + i);
                }
                break;
            }
        }
        if(!isFound){
            Log.addLog("Can't find record with role name is " + roleName);
        }
    }

    /** --------------------------------------- POPUP ----------------------------------------------------------- */
    /**
     * Object: POPUP_TITLE
     */
    public boolean isDisplayPopupTitle(){
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_TITLE.isDisplayed();
        } catch (Exception e){
            Log.addLog("css of Popup Title");
        }
        return isDisplay;
    }
    public String getPopupTitle(){
        String text = "";
        try {
            text = POPUP_TITLE.getText();
        } catch (Exception e){
            Log.addLog("css of Popup Title");
        }
        return text;
    }

    /**
     * Object: POPUP_DESCRIPTION
     */
    public boolean isDisplayPopupDescription(){
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_DESCRIPTION.isDisplayed();
        } catch (Exception e){
            Log.addLog("css of Popup Description");
        }
        return isDisplay;
    }
    public String getPopupDescription(){
        String text = "";
        try {
            text = POPUP_DESCRIPTION.getText();
        } catch (Exception e){
            Log.addLog("css of Popup Description");
        }
        return text;
    }

    /**
     * Object: POPUP_ACCEPT_BUTTON
     */
    public boolean isDisplayPopupAcceptButton(){
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_ACCEPT_BUTTON.isDisplayed();
        } catch (Exception e){
            Log.addLog("css of Popup Accept Button");
        }
        return isDisplay;
    }
    public String getPopupAcceptButtonText(){
        String text = "";
        try {
            text = POPUP_ACCEPT_BUTTON.getText();
        } catch (Exception e){
            Log.addLog("css of Popup Accept Button");
        }
        return text;
    }
    public void clickOnPopupAcceptButton(){
        try {
            POPUP_ACCEPT_BUTTON.click();
        } catch (Exception e){
            Log.addLog("css of Popup Accept Button");
        }
    }

    /**
     * Object: POPUP_REJECT_BUTTON
     */
    public boolean isDisplayPopupRejectButton(){
        boolean isDisplay = false;
        try {
            isDisplay = POPUP_REJECT_BUTTON.isDisplayed();
        } catch (Exception e){
            Log.addLog("css of Popup Reject Button");
        }
        return isDisplay;
    }
    public String getPopupRejectButtonText(){
        String text = "";
        try {
            text = POPUP_REJECT_BUTTON.getText();
        } catch (Exception e){
            Log.addLog("css of Popup Reject Button");
        }
        return text;
    }
    public void clickOnPopupRejectButton(){
        try {
            POPUP_REJECT_BUTTON.click();
        } catch (Exception e){
            Log.addLog("css of Popup Reject Button");
        }
    }

    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return isDisplayCreateButton() && isDisplayRoleNameTitle() && getPageTitle().toLowerCase().contains("vai trò");
    }
}
