package stepDefinitions;

import io.cucumber.java.en.*;

public class homePage {
    @Given("I  u open browser")
    public void i_u_open_browser() {
        System.out.println("5");
    }

    @When("I enter homepage url")
    public void i_enter_homepage_url() {
        System.out.println("6");

    }

    @When("I validate home page")
    public void i_validate_home_page() {
        System.out.println("7");

    }

    @Then("I c close browser")
    public void i_c_close_browser() {
        System.out.println("8");
    }
}
