package finanPage.login;

import finanCommon.FinanBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class CreatePasswordPage extends FinanBase {

    /**
     * ==============================================================================================================
     * Constructor
     */
    public CreatePasswordPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplay(){
        return true;
    }
}
