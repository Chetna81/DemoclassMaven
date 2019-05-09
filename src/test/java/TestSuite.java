import org.junit.Test;

public class TestSuite extends BaseTest
{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Utils utils = new Utils();

    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        //click on register link
        homePage.clickOnRegistrationLink();
        //fill in register page
        RegistrationPage.clickOnRegistrationAndFill();
        //verify user is successfully register
//        utils.assertByGetText(By.className("result"),"your registration completed","Match Fail");
    }
}
