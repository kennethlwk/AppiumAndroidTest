package com.king.candycrushsaga_appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;

/**
*
* The LaunchCandyCrushSagaTest program is design for using Appium platform to test Android Application on Android Studio Emulator
*
* @author  Kenneth WeiKiat Lam
* @version 1.0
* @since   2022-06-12 
*/
public class LaunchCandyCrushSagaTest {
	/**
	 * 
	 * This is the  main method to start the LaunchCandyCrushSagaTest
	 * @param args The command line arguments.
	 * @throws InterruptedException if an error occurs
	 * @throws MalformedURLException if an error occurs	 
	 * 
	 **/   
    public static void main( String[] args ) throws MalformedURLException, InterruptedException

	{
		DesiredCapabilities cap = setupAndroidDevice();
		performActionsOnAndroidDevice(cap);
	}
	
	/**
	 * This method is to setup the capabilities for the android device 
	 * 
	 * @return the desired mobile capabilities
	 * 
	 */
	public static DesiredCapabilities setupAndroidDevice()  
	{  
		//Setup the device capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);	
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");	
		capabilities.setCapability("appPackage", "com.king.candycrushsaga");	
		capabilities.setCapability("appActivity", "CandyCrushSagaActivity");	
		return capabilities;
	}  
	
	/**
	 * This method is to launch the emulator and perform actions on the android device emulator 
	 * 
	 * @param the desired mobile capabilities for launching the Android emulator
	 * @throws InterruptedException if an error occurs
	 * @throws MalformedURLException if an error occurs
	 * 
	 */
	public static void performActionsOnAndroidDevice(DesiredCapabilities cap) throws InterruptedException, MalformedURLException  
	{  
		//Start the Android emulator
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		//Instantiation the AndroidTouchAction object
		AndroidTouchAction touch = new AndroidTouchAction(driver);
    
		//Timer for waiting the entry scene
		Thread.sleep(23000);

		//Press the Accept Button for Term And Condition
		touch.tap(PointOption.point(516, 1557)).perform();
		
        //Wait for the Play button appear on the screen
		Thread.sleep(3000);

		//Click the Play button position on the screen
		touch.tap(PointOption.point(514, 1176)).perform();
	
		//Wait for the game start
		Thread.sleep(15000);

		//Click on the screen to start tutorial
		touch.tap(PointOption.point(527, 1112)).perform();
		
		//Wait for the game start
		Thread.sleep(3000);

		//Perform the first move in the game 
		touch.press(PointOption.point(431, 1208)).moveTo(PointOption.point(556, 1214)).release().perform();
	}  
}
