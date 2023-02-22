package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverHelper {

    public static final int TIMEOUT = 10;
    private static DriverHelper driverHelper;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverHelper() {
        ChromeOptions options = new ChromeOptions();
        driver.set(ThreadGuard.protect(new ChromeDriver()));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void inicializar() {
        driverHelper = new DriverHelper();
    }

    public static void fecharjanela() {
        getDriver().close();
        driver.remove();
    }

    public static void aguardarVisibilidadeDoElemento(WebElement element) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOf(element));
    }

    public static void acessarURL(String url) {
        getDriver().navigate().to(url);
    }
}
