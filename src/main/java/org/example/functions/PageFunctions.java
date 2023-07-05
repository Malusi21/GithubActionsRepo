package org.example.functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageFunctions {
    WebDriver FireFoxdriver = null;
    String projectPath = System.getProperty("user.dir");

    public String MyStor_Home = "https://www.automationexercise.com/";
    public String chrome_path = "\\src\\main\\resources\\drivers\\chromedriver.exe";
        String firefox_path = "\\src\\test\\resources\\drivers\\geckodriver.exe";
        String cache_proceed_btn = "/html/body//div[2]/button[contains(.,\"Proceed\")]";
        String gumtree_label = "/html/body/div[1]/div[3]/header/div[3]/nav/div[2]/span/span[contains(@class,\"label\")]";
        String username_field = "//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"input-main\", \" \" ))]";
        String password_field = "/html/body/div[1]/section/div[2]/div/div/div[2]/div[4]/form/div[2]/input";
        String login_button = "/html/body//form/div[4]/div[2]/button[contains(.,\"Log In\")]";
        String Error_test = "/html/body/div[1]/section/div[2]/div/div/div[1]";
        String password_error_dialog = "//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"login-form-error\", \" \" ))]";
        String getPassword_error_text = "Please correct the errors in red below.";



}
