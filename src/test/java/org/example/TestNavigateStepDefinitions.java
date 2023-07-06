package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import junit.framework.Assert;
import org.example.functions.PageFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TestNavigateStepDefinitions {

    private WebDriver driver;
    private PageFunctions functions;
    private String PageTitle= "//*[@id='header']/div/div/div/div[1]/div/a/img[contains(@alt,'Website for automation practice')]";
    private String chromePath = System.getProperty("user.dir") + File.separator + "src"+ File.separator +"test"+ File.separator +"resources"+ File.separator +"drivers"+ File.separator +"chromedriver.exe";

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
    }

    @Given("the user opens the browser")
    public void the_user_opens_the_browser() {
        driver.get("http://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='header']//a/img[contains(@alt,'Website for automation practice')]")).isDisplayed();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
