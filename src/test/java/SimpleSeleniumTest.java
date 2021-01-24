import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSeleniumTest {

    ChromeDriver chromeDriver;

    @BeforeMethod
    public void beforeMethod() {
        chromeDriver = DriverCreator.getChromeDriver(
                ChromeVersions.CHROME_87,
                OperatingSystem.WINDOWS
        );
    }

    @Test
    public void simpleSeleniumTest() throws InterruptedException {
        chromeDriver.get("https://www.google.com");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() {
        if (chromeDriver != null) {
            chromeDriver.close();
        }
    }
}
