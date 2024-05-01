package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class CaluculatorTest {

    public static void main(String[] args) {
        AppiumDriver<MobileElement> driver;

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
          cap.setCapability("deviceName", "CPH2219");
      	  cap.setCapability("udid", "fc7af629");
      	  cap.setCapability("platformName", "Android");
      	  cap.setCapability("platformVersion", "13");
      	  cap.setCapability("appPackage", "com.google.android.contacts");
      	  cap.setCapability("appActivity", "com.google.android.apps.contacts.activities.PeopleActivity");
      	  cap.setCapability("automationName", "UiAutomator2");
      	  cap.setCapability(null, cap);
      	  

            URL appiumServerURL = new URL("http://127.0.0.1:4723");
            
            driver = new AndroidDriver<MobileElement>(appiumServerURL, cap);

            // Your test steps go here
            // For example, you can perform some calculations, assertions, etc.

            // Close the app
         //   driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

