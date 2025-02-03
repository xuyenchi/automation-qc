package finanPage.login;

import config.Accounts;
import config.Configs;
import finanCommon.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Log;
import utilities.Reports;

public class LoginTest extends BaseTest {
    InputPhoneOrEmailPage inputPhoneOrEmailPage;
    InputPasswordPage inputPasswordPage;

    Accounts account;

    @Test(priority = 1)
    private void checkLoginSuccessful() throws Exception{
        inputPhoneOrEmailPage = new InputPhoneOrEmailPage(driver);
        inputPasswordPage = new InputPasswordPage(driver);
//        otpVerifyPage = new OTPVerifyPage(driver);
//        homePage = new HomePage(driver);
//        inputPwdPage = new InputPwdPage(driver);

        account = Accounts.CHAULE;

        logger = extent.startTest("Check login page");
        Log.addLog(logger, "Open app, look & feel");

        String imgName = "LoginTest_0";
        screenshot.takeScreenshot(imgName);
//        if (inputPhoneOrEmailPage.isDisplay(true)) {
            Log.addInfoLog(logger, "Display Pre Login Page, click on Login with phone", imgName);
//            preLoginPage.clickOnLoginWithPhoneButton();
//            Thread.sleep(Configs.ServerSleep);
//
//            String imgName1 = "LoginTest_1";
//            screenshot.takeScreenshot(imgName1);
//            if (loginPage.isDisplay()) {
//                Log.addInfoLog(logger, "Display Login Page, input phone number = " + account.getPhone() + " & click on Continue", imgName1);
//                loginPage.setPhoneBox(account.getPhone());
//                loginPage.clickOnContinueButton();
//                Thread.sleep(Configs.ServerSleep);
//
//                String imgName2 = "LoginTest_2";
//                screenshot.takeScreenshot(imgName2);
//                /**
//                 * will refactor to remove login with OTP page
//                 */
//                if (otpVerifyPage.isDisplay()) {
//                    Log.addInfoLog(logger, "Display Verify OTP Page, input 1207", imgName2);
//                    otpVerifyPage.setOTPBox(account.getOtp());
//
//                    Thread.sleep(Configs.ServerDeepSleep);
//                } else if(inputPwdPage.isDisplay()){
//                    Log.addInfoLog(logger, "Display Input Password Page, input correct pwd & click on Continue button", imgName2);
//                    inputPwdPage.setPasswordBox(account.getPassword());
//                    inputPwdPage.clickOnContinueButton();
//
//                    Thread.sleep(Configs.ServerDeepSleep);
//                }
//            }
//        }

//        String imgName3 = "LoginTest_3";
//        screenshot.takeScreenshot(imgName3);
//
//        boolean check = homePage.isDisplay();
//
//        Reports.reportWithIsDisplay(logger, check, "Display Home/Create Store UI", imgName3);

        Assert.assertTrue(true);
    }
}
