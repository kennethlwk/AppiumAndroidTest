# AppiumAndroidTest
## Description
   - This code is written in JAVA and Appium java libraries which is use for testing the Candy Crush Saga game on Android Studio Simulator
   - LaunchCandyCrushSagaTest.java consist of the main() method, setupAndroidDevice() method, and performActionsOnAndroidDevice(DesiredCapabilities cap) method
   - The code will setup the Android Emulator capabilities, launch the emulator, start the game and perform different automated actions 
   - To proceed to the subsequent game scenes, the emulator is automated to perform actions such as tap the screen,  and also swipe the candy from point to another point where it should perform one move. 


## Environment Setup 
1) Download Appium 
    - https://github.com/appium/appium-desktop/releases
    - Make sure you have correct host and port configured 
    - ![image](https://user-images.githubusercontent.com/22057288/173740849-8445ca23-0301-4e83-97d8-25696ffd7712.png)
2) Download Android Studio
    - https://developer.android.com/studio
    - Open Android Studio App, and create a New empty project
	  - Open Device Manager 
	  - Click "Create Virtual Devices" button to create a new Android Emulator device
    - Select an android "Phone" device from the virtual devices list , and select the Android version software for the virtual device
    - ![image](https://user-images.githubusercontent.com/22057288/173740989-87b4b11d-d20f-42db-b058-11c991183bf5.png)
    - Click the "Play" button on the created virtual Device
    - ![image](https://user-images.githubusercontent.com/22057288/173741837-835f8308-3ba3-454a-90ca-f67559e08f57.png)
    -  Virtual Device will show up automatically
    - ![image](https://user-images.githubusercontent.com/22057288/173741422-13fdf66e-0543-43a7-a79a-7a15d9283147.png)
3) Download and install candycrushsaga.apk 
    - Download the candy crush saga apk file on your laptop's web browser
    - Drag and drop the  candycrushsaga.apk file from your laptop into the Android Emulator to trigger the game installation
3) Download your chosen JAVA IDE Eclipse or InteliJ
    - https://www.eclipse.org/downloads/
5) Download & Install appium inspector
    - https://github.com/appium/appium-inspector/releases
    - Configure Appium Inspector with the parameters below
    - ![image](https://user-images.githubusercontent.com/22057288/173748166-634243e5-2cdf-4890-9d9a-c02ef7ca065e.png)
    - Start the session, an Android Emulator will turn on, and you can start to observe different API parameters when moving around and tapping the screen
    - It is useful to check to position point since you will need it later to locate the exact position to perform different actions
5) Download & install java jdk
    - https://www.eclipse.org/downloads/
7) Setup System Environment Variables
    	- JAVA HOME
		i. Add new System Variable -JAVA_HOME
		ii. C:\Program Files\Java\jdk-11.0.14
     	- ANDROID HOME
		i. Add new System Variable - ANDROID_HOME
		ii. C:\Users\kenneth\AppData\Local\Android\Sdk
	- Platform Tool
		i. Edit "Path" in System Variable , and add New 
		ii. C:\Users\kenneth\AppData\Local\Android\Sdk\platforms
		iii. C:\Users\kenneth\AppData\Local\Android\Sdk\platform-tools
	- Build Tool
		i. Edit "Path" in System Variable , and add New 
		ii. C:\Users\kenneth\AppData\Local\Android\Sdk\build-tools
	- Tool
		i. Edit "Path" in System Variable , and add New 
               ii. C:\Users\kenneth\AppData\Local\Android\Sdk\tools

## Execute the game
1) To execute the game, please clone the repo to your local repository
2) Import the maven project from your local repo to your preferred Java IDE tool. I recommend using Eclipse for this.
3) Start the Android Studio Simulator, click the "Play" button on the Android Emulator which has the candycrushsaga game installed.
4) Start the Appium Server to observe the activities that have been performed on the Android Emulator.
5) Finally, start to run the LaunchCandyCrushSagaTest.java on your IDE tool and observe the scene changes on the Android Emulator, and also check the live traffic logs on Appium Server to see the requests that have been sent to the emulator.
6) Video below shows the demo on how to launch the test automation code.
https://user-images.githubusercontent.com/22057288/173817968-0250052e-ee06-4896-8c89-9a173b681a43.mp4

## Code Implementation
The LaunchCandyCrushSagaTest.java class is the main file that contains all the logic in the code, and it is located at the file path below.This is the main class where we run the application. 
> Blockquotes/AppiumAndroidTest/tree/main/candycrushsaga-appiumtest/src/test/java/com/king/candycrushsaga_appiumtest/LaunchCandyCrushSagaTest.java

These libraries have been use  for building the android game test automation 
```java
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;
```

The code below is the main method,  and it consists of the method to setupAndroidDevice and performActionsOnAndroidDevice. The detailed descriptions of the code have been written within the code. 
```java
    public static void main( String[] args ) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = setupAndroidDevice();
		performActionsOnAndroidDevice(cap);
	}
```

The io.appium dependency is added in the pom.xml in order to fetch the external dependencies to local
```java
    <!-- https://mvnrepository.com/artifact/io.appium/java-client -->
	<dependency>
    	<groupId>io.appium</groupId>
    	<artifactId>java-client</artifactId>
    	<version>7.5.1</version>
	</dependency>
```
