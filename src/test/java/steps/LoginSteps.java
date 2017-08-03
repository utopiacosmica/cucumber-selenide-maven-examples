package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    LoginPage page = new LoginPage();


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        page.open();
    }


    @And("^I enter the username (.*) and password (.*)$")
    public void iEnterTheUsernameUserNameAndPasswordPassWord(String username, String password) throws Throwable {
        page.login(username, password);
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        page.clickLoginBtn();
    }


    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        $("h1").shouldHave(text("Execute Automation Selenium Test Site"));
    }
}
