# AppiumAndroidTest
## Description
   - This code is written in JAVA and Appium java libraries which is use for testing the Candy Crush Saga game on Android Studio Simulator
   - The code will start the game and perform different automated actions 
   - To precced to the subsequent game scenes, the emulator is aumotated to perform actions such as tap the screen,  and also swipe the candy from point to another point where it should perform one move. 


## Environment Setup 
1) Download Appium 
    - https://github.com/appium/appium-desktop/releases
    - Makesure you have correct host and port configured 
     ![image](https://user-images.githubusercontent.com/22057288/173740849-8445ca23-0301-4e83-97d8-25696ffd7712.png)
2) Download Android Studio
    - https://developer.android.com/studio
    - Open Android Studio App, and create a New empty project
	  - Open Device Manager 
	  - Click "Create Virtual Devices" button to create a new Android Simulator device
    - Select an android "Phone" device from the virtual devices list , and select the Android version software for the virtual device
    - ![image](https://user-images.githubusercontent.com/22057288/173740989-87b4b11d-d20f-42db-b058-11c991183bf5.png)
    - Click the "Play" button on the created virtual Device
    - ![image](https://user-images.githubusercontent.com/22057288/173741837-835f8308-3ba3-454a-90ca-f67559e08f57.png)
    -  Virtual Device will show up automatically
    - ![image](https://user-images.githubusercontent.com/22057288/173741422-13fdf66e-0543-43a7-a79a-7a15d9283147.png)
3) Download Yur IDE InteliJ 0r Eclipse
    - https://www.eclipse.org/downloads/
5) Download & Install appium inspector
    - https://github.com/appium/appium-inspector/releases
    - Configure Appium Inspector with the parameters below
    -     ![image](https://user-images.githubusercontent.com/22057288/173740168-8cca4f0f-59bc-405c-b596-71bd94465e4e.png)
    - Start the session, an Android simulator will turn on, and you can start to observe different API paramters when moving around and tapping the screen
    - It is useful to check to position point since you will need it later to locate t he exact position to perform different actions
5) Download & install java jdk
    - https://www.eclipse.org/downloads/
7) Setup Xsystem Environment Variables
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
1) To execute the game, please clone the repo to yout local repository
2) Import the maven project from your local repo to your prefer Java IDE tool, I am recommending to use Eclipse for this.
3) Start the Android Studio Simulator
    - And create a New empty project
    - Open Device Manage
    - Click "Create Virtual Devices" button
    - Select an android "Phone" device from the virtual devices list , and select the Android version software for the virtual device
	- Click the "Play" button on the created virtual Device
	- Virtual Device will show up automatically 
	- Download the candy crush saga apk file on your websrowaser
	- Drag the draop the  candycrushsaga.apk file into the Android device simulator to trigger game installation
4) Start the Appium Server to observe the activties that has been performed on the Android Simulator
5) Finally, start to run the code on your IDE device and observe the scene changes on the Android Simulator, and also check the live traffic logs on Appium Server to see the request that has been sent to the simulator.



