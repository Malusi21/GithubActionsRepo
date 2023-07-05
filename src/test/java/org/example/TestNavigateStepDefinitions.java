package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.example.functions.PageFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestNavigateStepDefinitions {

    private WebDriver driver;
    private PageFunctions functions;
    private String projectPath = System.getProperty("user.dir");

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\malusi.msomi\\Documents\\BitBucket\\untitled\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("the user opens the browser")
    public void the_user_opens_the_browser() {
        driver.get("http://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
