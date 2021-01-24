public enum ChromeVersions {
    CHROME_86("86.0.4240.22"),
    CHROME_87("87.0.4280.88"),
    CHROME_88("88.0.4324.27"),
    ;

    private final String chromeVersion;

    public String getChromeVersion() {
        return this.chromeVersion;
    }

    ChromeVersions(String chromeVersion) {
        this.chromeVersion = chromeVersion;
    }
}
