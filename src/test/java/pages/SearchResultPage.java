package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverHelper;

public class SearchResultPage extends SearchResultPageElementMap {
    public SearchResultPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    public boolean estaNaPaginaResultadosPesquisa() {
        DriverHelper.aguardarVisibilidadeDoElemento(txtResultadosEncontrados);
        return txtResultadosEncontrados.isDisplayed();
    }

    public boolean existeProdutoNaPagina(String nomeProduto) {
        return productNameList.stream().anyMatch(product -> product.getText().toLowerCase().contains(nomeProduto.toLowerCase()));
    }

    public boolean estaNaPaginaResultadosNaoEncontrados() {
        DriverHelper.aguardarVisibilidadeDoElemento(txtResultadoNaoEncontrado);
        return txtResultadoNaoEncontrado.isDisplayed();
    }
}
