import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverHelper;

public class CucumberHooks {
    @Before
    public static void iniciar() {
        DriverHelper.inicializar();
    }

    @After
    public static void tiraEvidenciaSeFalhar(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) DriverHelper.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        DriverHelper.fecharjanela();
    }
}
