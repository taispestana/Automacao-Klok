package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pages.SearchPage;

public class SearchSteps {
    private SearchPage searchPage = new SearchPage();

    @Quando("o usuário digita {string} na barra de busca")
    public void o_usuário_digita_na_barra_de_busca(String nomeProduto) {
        searchPage.digitarNaBusca(nomeProduto);
    }

    @E("clica no ícone de pesquisa")
    public void clica_no_ícone_de_pesquisa() {
        searchPage.clicarIconeDePesquisa();
    }
}
