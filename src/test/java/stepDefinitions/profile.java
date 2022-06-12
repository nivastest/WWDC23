package stepDefinitions;

import io.cucumber.java.en.*;

public class profile {
    @Given("I  m open browser")
    public void i_m_open_browser() {
        System.out.println("9");
    }

    @When("I was profile enter url")
    public void i_was_profile_enter_url() {
        System.out.println("10");
    }

    @When("I validate profile page")
    public void i_validate_profile_page() {
        System.out.println("11");
    }

    @Then("I i close browser")
    public void i_i_close_browser() {
        System.out.println("12");
    }
}
