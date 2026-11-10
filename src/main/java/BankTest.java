import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;

public class BankTest {

    BankAccount prvniUcet;

    @Given("Uzivatel ma ucet s {int} kc")
    public void uzivatelMaUcetSKc(int pocatecniZustatek) {
        prvniUcet = new BankAccount(pocatecniZustatek);
    }

    @When("Uzivatel vybere {int} kc")
    public void uzivatelVybereKc(int castkaVyberu) {
        prvniUcet.withdraw(castkaVyberu);
    }

    @And("Uzivateli prijde na ucet {int} kc")
    public void uzivateliPrijdeNaUcetKc(int prichoziCastka) {
        prvniUcet.transfer(prichoziCastka);
    }

    @Then("Uzivatel ma zustatek na uctu {int} kc")
    public void uzivatelMaZustatekNaUctuKc(int kocecnyZustatek) {

    }
}
