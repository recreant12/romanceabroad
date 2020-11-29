import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseActions {
    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void fillInEmailAndPassword() {
        WebElement linkLoginEmail = driver.findElement(Locators.LINK_LOGIN_EMAIL);
        linkLoginEmail.sendKeys(Data.email);

        WebElement linkLoginPassword = driver.findElement(Locators.LINK_LOGIN_PASSWORD);
        linkLoginPassword.sendKeys(Data.password);
    }
}