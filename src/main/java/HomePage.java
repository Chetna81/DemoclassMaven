import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By registrationLink = By.linkText("Register");

    private By customerCurrency = By.id("customerCurrency");


    public void clickOnRegistrationLink()
    {
        clickElementBy(registrationLink);
    }

    public void selectCurrencyByName(String currency)
    {
        selectByVisibleText(customerCurrency, currency);
    }


}
