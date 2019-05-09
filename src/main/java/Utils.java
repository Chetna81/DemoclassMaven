import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

public class Utils extends BasePage
{
    //Clicking element
    public static void clickElementBy(By by)
    {
        driver.findElement(by).click();
    }

    //SendText element
    public static void sendTextToElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //selectTextByValue
    public static void selectTextByValue(By by, String text)
    {
        Select select = new Select(driver.findElement(by));

        select.selectByValue(text);
    }

    //waitFor element
    public static void waitForElement(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //getTextForm element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //getRandomNumber
    public static int getRandomNumber()
    {
        return (int) (Math.random() * 5000 + 1);
    }

    //Clear Text from inout box/area
    public static void clearField(By by)
    {
        driver.findElement(by).clear();
    }

    //get attribute by value
    public static String getValue(By by)
    {
        return driver.findElement(by).getAttribute("Value");
    }

    //create timestamp with current day-month-year -hour-minute-second
    public static String randomDate()
    {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
        return format.format(new Date());
    }

    //create timestamp with current day-month-hour-minute
    public static String randomNumber()
    {
        DateFormat format = new SimpleDateFormat("ddMMHHmm");
        return format.format(new Date());
    }

    //clear text from input box area
    public static void clearText(By by)
    {
        driver.findElement(by).clear();
    }

    //enter text in input field
    public static void inputField(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //clear and enter Text in input field
    public static void clearAndEnterText(By by, String text)
    {
       // Utils.by = by;
       // Utils.text = text;
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //checking webElement present in DOM
    protected static boolean webElementPresent(By by)
    {
        try {
            driver.findElement(by).click();
            return true;
        } catch (NoSuchElementException e)
        {
            return false;
        }
    }

    //Element displayed or not
    public static boolean elementDisplayedOrNot(By by)
    {
        try {
            driver.findElement(by).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //wait to be display time
    public static void waitForElementDisplay(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //wait for fixed time given in seconds
    public static void waitForElementToBeClickable(By by, int seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //try to click element three times if not available in first go
    public boolean retryForElement(By by)
    {
        boolean result = false;
        int attempt = 0;
        while (attempt < 3)
        {
            try {
                Thread.sleep(20);
                driver.findElement(by).click();
                result = true;
            }
            catch (Exception e)
            {
            }
            attempt++;
        }
        return result;
    }

    //wait for locators to be clickable for given time in seconds
    public static void waitForLocatorToBeClickable(By by,int seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //wait for visibility of element with given time
    public static void explicitwaitForVisibilty(By by, int seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //capture ScreenShot
    public static void captureScreenShot()
    {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("src\\BrowserDrivers\\chromedriver.exe" + System.currentTimeMillis()));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //get selected value from dropdown
    public static void selectByValue(By by,String data)
    {
        Select dob = new Select(driver.findElement(by));
        dob.selectByValue(data);
    }

    //get selected value from dropdown
    public static void selectByVisibleText(By by,String data)
    {
        Select dob = new Select(driver.findElement(by));
        dob.selectByVisibleText(data);
    }

    //select text from value
    public static void getActualText(By by,String Text)
    {
        driver.findElement(by).getText();
    }

    //get css property of element
    public static String getAtrributeOfElement(WebElement element, String css)
    {
        String value = element.getCssValue(css);
        return value;
    }

    //wait for alert to display
    public boolean isAlertPresent()
    {
        boolean present = false;
        try {
            Alert alert = driver.switchTo().alert();
            present = true;
            alert.accept();
        }
        catch (NoAlertPresentException ex)
        {
            ex.printStackTrace();
        }
        return present;
    }

    //(send/type)Text to field like name ,username or password
    public static void typeText(By by,String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //select Dropdown Method  by Index
    public static void selectByIndex(By by,int indexNumber)
    {
        Select select;
        new Select(driver.findElement(by)).selectByIndex(indexNumber);
    }



    //assertion by string variables
   // public static void assertByGetTextByAttribute(String actualText,By by,String attributeValue)
   // {
   //     Assert.assertEquals(actualText,getTaxtByAttributaValue(by,attributeValue));
   // }



}


