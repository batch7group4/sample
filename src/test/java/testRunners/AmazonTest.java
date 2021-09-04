package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Feature;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\java\\Appfeatures"},
		glue= {"StepDefintions"},
		plugin= {"pretty"}
		)


public class AmazonTest {

	
}
