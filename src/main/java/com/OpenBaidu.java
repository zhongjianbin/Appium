package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBaidu {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.addArguments("disable-infobars");//解决chrome浏览器提示chrome正在受到自动测试软件控制
        String driverPath = System.getProperty("user.dir") + "\\drivers\\chrome\\chromedriver.exe";
        String browserPath = System.getProperty("user.dir") + "\\browsers\\chrome\\chrome.exe";
        System.setProperty("webdriver.chrome.bin", browserPath);
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver(cOptions);
        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driver.close();
    }
}
