package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "\\src\\test\\features"
        ,glue={"\\src\\main\\java\\StepDefinations"}
)
public class Runner {


}
