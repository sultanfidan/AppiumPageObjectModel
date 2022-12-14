import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    static AppiumDriver driver;

    @BeforeTest
    public void Android_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "HUAWEI P40 Lite");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/ToDo_v1.24_apkpure.com.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

    }

        public static void tearDown () {
            if (null != driver) {
                driver.quit();
            }
        }
    }


