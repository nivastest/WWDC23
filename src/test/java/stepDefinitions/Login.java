package stepDefinitions;

import io.cucumber.java.en.*;

public class Login {
    @Given("I open browser")
    public void i_open_browser() {

        System.out.println("1");
        System.out.println("$done$");

    }

    @When("I enter url")
    public void i_enter_url() {
        System.out.println("2");
    }

    @When("I validate page")
    public void i_validate_page() {
        System.out.println("3");
    }

    @Then("I close browser")
    public void i_close_browser() {
        System.out.println("4");
    }
}
