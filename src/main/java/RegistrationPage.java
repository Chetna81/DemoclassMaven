import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    By genderFiledFemale = By.id("gender-female");
    By genderFiledMale = By.id("gender-male");
    By firstNameFiled = By.id("FirstName");
    By lastNameFiled = By.id("LastName");
    By emailFiled = By.xpath("//input[@id='Email']");
    By passwordFiled = By.id("Password");
    By confirmPasswordFiled = By.id("ConfirmPassword");
    By registerBtn = By.xpath("//input[@id='register-button']");


    public static void clickOnRegistrationAndFill() {
    }

    public void clickOnGenderFemale(String gender) {
        if (gender.equalsIgnoreCase("male")){
            clickElementBy(genderFiledMale);
        }else if (gender.equalsIgnoreCase("female")){
            clickElementBy(genderFiledFemale);
        }
    }

    public void enterFirstName(String firstName)
    {
        sendTextToElement(firstNameFiled, firstName);
    }

    public void enterLastName(String lastName)
    {
        sendTextToElement(lastNameFiled, lastName);
    }

    public void enterEmailAddress(String email)
    {
        sendTextToElement(emailFiled, email);
    }

    public void enterPassword(String Password)
    {
        sendTextToElement(passwordFiled, Password);
    }

    public void enterConfirmPassword(String ConfirmPassword) {
        sendTextToElement(confirmPasswordFiled, ConfirmPassword);
    }

    public void clickOnRegisterBtn()
    {
        clickElementBy(registerBtn);
    }

}


