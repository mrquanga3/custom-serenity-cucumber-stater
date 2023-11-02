package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import starter.pageobject.Login;

public class LoginStepDefinition extends PageObject {

  Login login;
  @Given("HRMS is opened")
  public void hrmsIsOpened() {
    openUrl("https://demo.opencart.com/admin/");
    getDriver().manage().window().maximize();
  }

  @When("login with usename {string} and password {string}")
  public void loginWithUsenameAndPassword(String username, String password) {
    login.doLogin(username, password);
  }

  @Then("Error message {string} is displayed")
  public void errorMessageIsDisplayed(String errorMessage) {
    login.verifyLoginError(errorMessage);
  }
}
