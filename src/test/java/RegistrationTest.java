import org.junit.Test;

public class RegistrationTest extends BaseTest
{
    LoadProp loadProp = new LoadProp();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void userShouldRegisterSuccessfully()
    {
        homePage.selectCurrencyByName("Euro");
        homePage.clickOnRegistrationLink();
        registrationPage.clickOnGenderFemale(loadProp.getProperty("gender"));
        registrationPage.enterFirstName(loadProp.getProperty("firstName"));
        registrationPage.enterLastName(loadProp.getProperty("lastName"));
        registrationPage.enterEmailAddress(loadProp.getProperty("email"));
        registrationPage.enterPassword(loadProp.getProperty("password"));
        registrationPage.enterConfirmPassword(loadProp.getProperty("confirmPassword"));
        registrationPage.clickOnRegisterBtn();
    }

}



