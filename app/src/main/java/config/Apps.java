package config;

/**
 * Create By: chaule
 * Create At: 20Jun2023
 * Notes:
 */
public enum Apps {
    /**
     * - Get bundleId: updating...
     * - Get appPackage & appActivity on Mac:
     * 1. Open app on device
     * 2. adb shell dumpsys window | grep -E 'mCurrentFocus'
     */
    FINAN_STG("me.finan.book.stg", "me.finan.book.stg.MainActivity", "me.finan.book.stg", ":id/", "STG"),
    FINAN_DEV("", "", "", "", "DEV"),
    ;

    private String appPackage;
    private String appActivity;
    private String bundleId;
    private String andPackageID;
    private String env;

    private Apps(String appPackage, String appActivity, String bundleId, String andPackageID, String env) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.bundleId = bundleId;
        this.andPackageID = andPackageID;
        this.env = env;
    }

    public String getAppPackage() {
        return this.appPackage;
    }

    public String getAppActivity() {
        return this.appActivity;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public String getAndPackageID() {
        return this.andPackageID;
    }

    public String getEnv() {
        return this.env;
    }
}
