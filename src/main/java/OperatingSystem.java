public enum OperatingSystem {
    WINDOWS("windows"),
    LINUX("linux"),
    MAC("mac")
    ;

    private final String operatingSystem;

    OperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
