import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    BankAccount prvniUcet;
    BankAccount druhyUcet;

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
    public void uzivatelMaZustatekNaUctuKc(int konecnyZustatek) {
        assertEquals(konecnyZustatek, prvniUcet.getAccountBalance());
    }

    @When("Uzivatel prevede z prvniho uctu na druhy {int}")
    public void uzivatelPrevedeZPrvnihoUctuNaDruhy(int castkaPrevodu) {
        if(prvniUcet.withdraw(castkaPrevodu)){
            druhyUcet.transfer(castkaPrevodu);
        }
    }

    @And("Uzivatel ma druhy ucet s {int} kc")
    public void uzivatelMaDruhyUcetSKc(int pocatecniZustatek) {
        druhyUcet = new BankAccount(pocatecniZustatek);
    }

    @Then("Uzivatel ma zustatek na druhem uctu {int} kc")
    public void uzivatelMaZustatekNaDruhemUctuKc(int konecnyZustatek) {
        assertEquals(konecnyZustatek, druhyUcet.getAccountBalance());
    }
}
