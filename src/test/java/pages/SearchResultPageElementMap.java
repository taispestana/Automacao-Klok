package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPageElementMap {

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div/main/section[4]/div[1]/div/span")
    protected WebElement txtResultadosEncontrados;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li/a/div[3]/h2")
    protected List<WebElement> productNameList;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div/main/section[5]/div[1]/div/h1")
    protected WebElement txtResultadoNaoEncontrado;
}
