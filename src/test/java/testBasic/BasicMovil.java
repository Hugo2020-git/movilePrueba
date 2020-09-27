package testBasic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicMovil {
    private AppiumDriver driver;
    /**
     * {
     *   "deviceName": "Hugo Aruni (Galaxy A5)",
     *   "platformVersion": "6",
     *   "appPackage": "com.sec.android.app.popupcalculator",
     *   "appActivity": "Calculator  ",
     *   "platformName": "Android"
     * }
     * **/

    @Before
    public void before() throws MalformedURLException {
        System.out.println("iniciando conexion .....");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Hugo Aruni (Galaxy A5)");
        capabilities.setCapability("platformVersion","6");
        capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity","Calculator");
        capabilities.setCapability("platformName","Android");

        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test
    public void myFirstTest(){
        System.out.println("Test1 .....");
        // press2
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();

        // press +
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
        // press 5
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05")).click();
        // press =
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
        // verificacion 7
        String actualResult=this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
        System.out.println(actualResult);
        String expectectedResult = "7";

        Assert.assertEquals("ERROR! La suma incorrecta ", expectectedResult,actualResult);
    }
    @Test
    public void myFirstTest2(){
        System.out.println("Test2 .....");
    }
    @After
    public void after(){
        System.out.println("after .....");
    }

}
