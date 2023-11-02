package starter.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class Login extends PageObject {

  @FindBy(id = "input-username")
  private WebElementFacade txtUsername;
  @FindBy(id = "input-password")
  private WebElementFacade txtPassword;
  @FindBy(css = ".fas.fa-key")
  private WebElementFacade btnLogin;

  @FindBy(css = ".alert.alert-danger.alert-dismissible")
  private WebElementFacade txtErrorMessage;

  public void doLogin(String username, String password) {
    txtUsername.waitUntilVisible().sendKeys(username);
    txtPassword.waitUntilVisible().sendKeys(password);
    btnLogin.waitUntilClickable().click();
  }

  public void verifyLoginError (String message) {
    Assert.assertEquals(message, txtErrorMessage.waitUntilVisible().getText());
  }
}
