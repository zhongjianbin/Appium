package com;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenWuliangye {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "device");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0");
        capabilities.setCapability("appPackage", "com.staff.wuliangye");
        capabilities.setCapability("appActivity", ".mvp.ui.activity.SplashActivity");
        //<a href="javascript:;" class="btn-query">我要咨询</a>
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        KeyEvent kv = new KeyEvent(AndroidKey.HOME);
        Thread.sleep(3000);
        SwipeLeft(driver);
        SwipeLeft(driver);
        SwipeLeft(driver);
        Thread.sleep(3000);
        driver.findElementById("com.staff.wuliangye:id/guide_done").click();
        Thread.sleep(3000);
        driver.pressKey(kv);
        driver.quit();
    }

    public static void SwipeLeft(AndroidDriver driver) {
        Dimension size = driver.manage().window().getSize();
        int height = size.height;
        int width = size.width;
        new TouchAction(driver)
                .longPress(PointOption.point(width - 100, height / 2))
                .moveTo(PointOption.point(100, height / 2)).release().perform();
    }
}
