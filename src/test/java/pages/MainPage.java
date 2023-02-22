package pages;

import utils.DriverHelper;

public class MainPage {

    private static final String MAIN_URL = "https://www.magazineluiza.com.br/";

    public MainPage() {
        DriverHelper.acessarURL(MAIN_URL);
    }

}
