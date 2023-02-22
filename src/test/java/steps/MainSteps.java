package steps;

import io.cucumber.java.pt.Dado;
import pages.MainPage;

public class MainSteps {

    @Dado("que o usuário está na página inicial do site de e-commerce")
    public void que_o_usuário_está_na_página_inicial_do_site_de_e_commerce() {
        new MainPage();
    }
}
