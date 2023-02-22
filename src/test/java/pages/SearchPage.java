package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverHelper;

public class SearchPage extends SearchPageElementMap {
    public SearchPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    public void digitarNaBusca(String nomeProduto) {
        DriverHelper.aguardarVisibilidadeDoElemento(barraBusca);
        barraBusca.sendKeys(nomeProduto);
    }

    public void clicarIconeDePesquisa() {
        searchIcon.click();
    }
}
