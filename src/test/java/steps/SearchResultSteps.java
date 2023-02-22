package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.jupiter.api.Assertions;
import pages.SearchResultPage;

public class SearchResultSteps {
    SearchResultPage searchResultPage = new SearchResultPage();

    @Então("a página de resultados de pesquisa é exibida")
    public void a_página_de_resultados_de_pesquisa_é_exibida() {
        Assertions.assertTrue(searchResultPage.estaNaPaginaResultadosPesquisa(), "a página de resultados de pesquisa nao foi exibida");
    }

    @E("os resultados incluem pelo menos um produto {string}")
    public void os_resultados_incluem_pelo_menos_um_produto(String nomeProduto) {
        Assertions.assertTrue(searchResultPage.existeProdutoNaPagina(nomeProduto), "Não tem nenhum produto com o nome:" + nomeProduto);
    }

    @Então("a página de resultados de pesquisa não encontrado é exibida")
    public void a_página_de_resultados_de_pesquisa_não_encontrado_é_exibida() {
        Assertions.assertTrue(searchResultPage.estaNaPaginaResultadosNaoEncontrados(), "a página de resultados não encontrados nao foi exibida");
    }
}
