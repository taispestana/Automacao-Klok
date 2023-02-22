package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMap {
    @CacheLookup
    @FindBy(id = "input-search")
    protected WebElement barraBusca;

    @CacheLookup
    @FindBy( css= "#search-container > div > svg")
    protected WebElement searchIcon;

}
