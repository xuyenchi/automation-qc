package config;

/**
 * Create By: chaule
 * Create At: 20Jun2023
 * Notes:
 */
public enum Devices {
    // for Android
    Emulator("Nexus_6_API_28", "9.0", "emulator-5554"),
    REAL_WIFI_VOS("VOS 4.0", "11.0", "adb-BCB00304710-pPSD7b._adb-tls-connect._tcp."),
    REAL_WIFI_REDMI("Redmi note 11", "11.0", "adb-b2de5631-pmgUva._adb-tls-connect._tcp."),
    REAL_WIFI_OPPO("OPPO A5", "13.0", "adb-MREAAAJZOBDAVGY9-Ll6u4L._adb-tls-connect._tcp."),

    Emulator_DUNG("Pixel 6 API 28", "9.0", "emulator-5554"),
    REAL_DUNG_REDMI("REDMI", "11.0", "b2de5631"),

    // for iOS
    Iphone13("Chau iPhone 13", "17.4.1", "00008110-000249AE21BA801E"),
    ;

    private String name;

    public String getName() {
        return name;
    }

    private String version;

    public String getVersion() {
        return version;
    }

    private String udid;

    public String getUdid() {
        return udid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    private Devices(String name, String version) {
        this.name = name;
        this.version = version;
    }

    private Devices(String name, String version, String udid) {
        this.name = name;
        this.version = version;
        this.udid = udid;
    }
}