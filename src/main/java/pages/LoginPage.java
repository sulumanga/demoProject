package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By txtUserName = By.xpath("//input[@name=uid]");
    By txtPassword = By.xpath("//input[@name=password]");
    By lblTitleText = By.className("barone");
    By btnLogin = By.name("btnLogin");

    public void setTxtUserName(String userName){
        driver.findElement(txtUserName).sendKeys("userName");
    }

    public void setTxtPassword(String password){
        driver.findElement(txtUserName).sendKeys("password");
    }

    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }

    public String getLoginTitle(){
        return driver.findElement(lblTitleText).getText();
    }

    public void login(String userName, String password){
        this.setTxtUserName(userName);
        this.setTxtPassword(password);
        this.clickLogin();
    }
}
