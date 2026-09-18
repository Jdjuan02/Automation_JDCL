package configs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "definitions",
        tags = "@Criterioejercicio3",
        publish = true
)
public class RunCucumber {
    public  RunCucumber()
    {

    }
}
