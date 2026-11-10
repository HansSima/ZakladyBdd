import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;
import static org.junit.jupiter.api.Assertions.*;

public class CheckoutTest {

    Checkout nakupniKosik;

    @Given("cena za {string} je {int} kc")
    public void cenaZaJeKc(String nazevProduktu, int cenaProduktu) {
        nakupniKosik = new Checkout();
        nakupniKosik.addItem(nazevProduktu, cenaProduktu);
    }

    @When("Uzivatel koupi {string} v poctu {int} ks")
    public void uzivatelKoupiVPoctuKs(String nazevProduktu, int pocetKusu) {
        nakupniKosik.scanItems(nazevProduktu, pocetKusu);
    }

    @Then("Uzivatel ma v nakupnim kosiku polozky v hodnote {int} kc")
    public void uzivatelMaVNakupnimKosikuPolozkyVHodnoteKc(int hodnotaNakupu) {
        assertEquals(hodnotaNakupu, nakupniKosik.totalCart());
    }
}
