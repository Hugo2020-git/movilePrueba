package runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import sessionManager.Session;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 24/09/2020.
 **/
@RunWith(Cucumber.class)
public class Runner {

    // Hooks (acciones antes y despues de cada scenario)
    @Before
    public void beforeCucumber(){
        System.out.println("BEFORE Cucumber");
    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {
        if (scenario.isFailed()){
            byte[] screenShoot=Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            // agregando en el report.json la informacion de la captura de pantalla
            scenario.embed(screenShoot,"image/png");
        }
        System.out.println("AFTER Cucumber");
        Session.getInstance().closeSession();
    }
}
