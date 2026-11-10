import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest {



    @Given("cena za {string} je {int} kc")
    public void cenaZaJeKc(String nazevProduktu, int cenaProduktu) {

    }

    @When("Uzivatel koupi {string} v poctu {int} ks")
    public void uzivatelKoupiVPoctuKs(String nazevProduktu, int pocetKusu) {

    }

    @Then("Uzivatel ma v nakupnim kosiku polozky v hodnote {int} kc")
    public void uzivatelMaVNakupnimKosikuPolozkyVHodnoteKc(int hodnotaNakupu) {

    }
}
