package demo.AppiumDemo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class AndroidCap {

	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities cap;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "emulator-4723");
		cap.setCapability("automationName", "UiAutomator2");
		// cap.setCapability("appPackage", "com.android.calculator2");
		// cap.setCapability("appActivity", ".Calculator");
		// cap.setCapability("appPackage", "com.google.android.dialer");
		// cap.setCapability("appActivity", ".DialtactsActivity");
		// cap.setCapability("appPackage", "com.swaglabsmobileapp");
		// cap.setCapability("appActivity", ".MainActivity");
		cap.setCapability("appPackage", "com.android.vending");
		cap.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Thread.sleep(30000);

		System.out.println("appium demo prooject");

		driver.quit();
	}

}
