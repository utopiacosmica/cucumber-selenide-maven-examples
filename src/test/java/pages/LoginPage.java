package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage open() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Selenide.open("http://executeautomation.com/demosite/Login.html");
        return this;
    }

    public SelenideElement txtUserName = $(By.name("UserName"));
    public SelenideElement txtPassword = $(By.name("Password"));
    public SelenideElement btnLogin = $(By.name("Login"));

    public void login(String userName, String password) {
        txtUserName.val(userName);
        txtPassword.val(password);
    }

    public void clickLoginBtn() {
        btnLogin.submit();
    }

}
