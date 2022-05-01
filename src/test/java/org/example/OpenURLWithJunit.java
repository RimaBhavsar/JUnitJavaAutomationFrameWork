package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLWithJunit {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openArgos(){
        driver.get("https://www.argos.co.uk/");
    }
    @Test
    public void openNext(){
        driver.get("https://www.next.co.uk/");
    }
    @Test
    public void openPoundland(){
        driver.get("https://www.poundland.co.uk/");
    }
    @Test
    public void openAsda(){
        driver.get("https://www.asda.com/");
    }
    @Test
    public void openLidl(){
        driver.get("https://www.lidl.co.uk/");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
