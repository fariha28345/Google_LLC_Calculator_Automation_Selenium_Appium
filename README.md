# Google_LLC_Calculator_Automation_Selenium_Appium

## Technology used:
- Appium
- Intellij IDEA
- Android Studio
- Appium Inspector

## Scenario
Automate any series for calculator app. Pass the series as a parameter to test method.  
For an example:  

100/10*5-10+60  
or  
50+10-20*2+10/2  

pseudocode for your test function can be look like:  

public void doSeries(){  
calcuateSeries("100/10*5-10+60");  
}  

## How to run this project:
- Clone this project
- Open Android Studio and Open the APK file
- Hit this command in cmd for checking the connectivity of device : adb devices
- Open Appium Server with this command:  
  ```Appium```  
- Open Appium Inspector
- Set desired capabilites:  
  {  
    "platformName": "Android",  
    "appium:platformVersion": "11",  
    "appium:appPackage": "com.google.android.calculator",  
    "appium:appActivity": "com.android.calculator2.Calculator",  
    "appium:app": "F:\\Apk\\calculator.apk"  
  }  
- Open Intellij Idea
- Hit this command into the terminal:  
  ```gradle clean test```  
- To generating Allure Report hit these these commands:  
  ```allure generate allure-results --clean -output``` and     
  ```allure serve allure-results```

## Allure Report
![Calc_Overview](https://github.com/fariha28345/Google_LLC_Calculator_Automation_Selenium_Appium/assets/50767962/434b4d4e-201c-4f50-b30b-9f5bb49d3e83)
 ![Calc_Behaviorspng](https://github.com/fariha28345/Google_LLC_Calculator_Automation_Selenium_Appium/assets/50767962/161130fd-0f10-4b82-9e6d-771f32f4c15b)

## Automation Output Video
https://github.com/fariha28345/Google_LLC_Calculator_Automation_Selenium_Appium/assets/50767962/47e1c28a-4ca2-4b2e-9d00-9e6ca45a63cf

