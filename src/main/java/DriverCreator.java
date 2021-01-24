import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DriverCreator {

    public static ChromeDriver getChromeDriver(ChromeVersions chromeVersion, OperatingSystem operatingSystem) {
        String chromeDriverVersion = "chromedriver_" + chromeVersion.getChromeVersion();
        String chromeDriverPath =
                "drivers/"
                + operatingSystem.getOperatingSystem()
                + "/"
                + chromeDriverVersion
                + (operatingSystem == OperatingSystem.WINDOWS ? ".exe" : "");

        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--enable-precise-memory-info",
                "disable-infobars",
                "--disable-translate",
                "--disable-gpu",
                "--start-maximized"
        );
        switch (operatingSystem) {
            case WINDOWS:
                File file = new File(chromeDriverPath);
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                break;
            case LINUX:
            case MAC:
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                break;
            default:
                break;
        }

        return new ChromeDriver(options);
    }
}
