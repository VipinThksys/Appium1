package browser;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.Test;

	import java.net.MalformedURLException;
	import java.net.URL;
	

	public class AndroidCap {

		public static AppiumDriver<MobileElement> driver;
		public static DesiredCapabilities cap;

		
		public void cap() throws MalformedURLException {
			cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("deviceName", "emulator-4723");
			cap.setCapability("automationName", "UiAutomator2");
			cap.setCapability("platformVersion", "10.0");
			cap.setCapability("newCommandTimeout", "45000");
			cap.setCapability("androidInstallTimeout", "200000");
			// cap.setCapability("appPackage", "com.android.calculator2");
			// cap.setCapability("appActivity", ".Calculator");
			// cap.setCapability("appPackage", "com.google.android.dialer");
			// cap.setCapability("appActivity", ".DialtactsActivity");
			// cap.setCapability("appPackage", "com.swaglabsmobileapp");
			// cap.setCapability("appActivity", ".MainActivity");
			//cap.setCapability("appPackage", "com.android.vending");
			//cap.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
			cap.setCapability("app", System.getProperty("user.dir")+"/app/WorkMaxRN_0_8_16.apk");

			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		}
		
		
		
		
		@Test
		public void playStore() throws MalformedURLException, InterruptedException {
			cap();
			System.out.println("driver set");
			Thread.sleep(20000);
			
			quit();
			System.out.println("driver quit");
			
		}
		
		
		
		public void quit() {
			driver.quit();
		}
		
		
	}

