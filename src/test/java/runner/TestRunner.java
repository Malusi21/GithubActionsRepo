package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features= "src/test/resources/features",
        glue={"org.example"},
        monochrome = true,
        plugin = {"pretty","html:target/HtmlReport.html","junit:target/JUnitReport.xml","json:target/JsonReport.json"},
        publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
