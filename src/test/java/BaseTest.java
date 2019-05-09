import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage
{
    LoadProp loadProp = new LoadProp();
    BrowserSelector browserSelector = new BrowserSelector();


    @Before
    public void setUp()
    {
        // this is to setup your path to the chrome driver
       /* System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        // this is to create the object for your driver which is in the class
        driver = new ChromeDriver();*/
        browserSelector.setUpBrowser();

        // The implicit wait is set for the life of the webDriver Object instance.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // this is to maximise your browser window
        driver.manage().window().maximize();

        // this is the website you want to visit for your testing purposes
        driver.get(loadProp.getProperty("baseUrl"));
    }

    @After
    // this will be executed after every Test run
    public void tearDown()
    {
         //driver.quit();
    }
}


