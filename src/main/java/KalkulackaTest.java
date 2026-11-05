import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KalkulackaTest {

    int prvCislo;
    int druCislo;

    @Given("Uzivatel ma zadany dve cisla {int} a {int}")
    public void uzivatelMaZadanyDveCislaA(int prvniCislo, int druheCislo) {
        prvCislo = prvniCislo;
        druCislo = druheCislo;
    }

    @When("Uzivatel secte tato dve cisla")
    public void uzivatelSecteTatoDveCisla() {

    }

    @Then("Uzivatel vidi na kalkulacce vysledek {int}")
    public void uzivatelVidiNaKalkulacceVysledek(int predpokladanyVysledek) {

    }
}
