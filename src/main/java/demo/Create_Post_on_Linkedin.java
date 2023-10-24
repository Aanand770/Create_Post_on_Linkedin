package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Create_Post_on_Linkedin{
    ChromeDriver driver;

    public Create_Post_on_Linkedin(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void testCase01(){
//        Navigate to URL  https://in.linkedin.com/
        driver.get("https://in.linkedin.com/");
//        Enter email id Using Locator "ID" session_key
        driver.findElement(By.id("session_key")).sendKeys("aanandbohara@gmail.com");
//        Enter Password Using Locator "ID" session_password
        driver.findElement(By.id("session_password")).sendKeys("EnterPassword");
//        Click on Sign In button Using Locator "ID" session_password
        driver.findElement(By.id("sign-in-form__submit-btn")).click();
//        Print Profile Viewers Using Locator "XPath" //a[@href='/me/profile-views/']/div/div/span | getText()
        WebElement ProfileViewers = driver.findElement(By.xpath("//a[@href='/me/profile-views/']/div/div/span"));
        System.out.println("Profile Viewers : " + ProfileViewers.getText());
//        Print Post Impressions Using Locator "XPath" //a[@href='/dashboard/']/div/div/span | getText()
        WebElement PostImpressions = driver.findElement(By.xpath("//a[@href='/dashboard/']/div/div/span"));
        System.out.println("Post Impressions : " + PostImpressions.getText());
//        Click on Start a Post Using Locator "XPath" //span[text() = 'Start a post']
        driver.findElement(By.xpath("//span[text() = 'Start a post']")).click();
//        Sharing with Connection only Using Locator "XPath" //button[@class = 'share-unified-settings-entry-button'] | click()
        driver.findElement(By.xpath("//button[@class = 'share-unified-settings-entry-button']")).click();
//        Select with Connections Only option Using Locator "XPath" //button[@id ='CONNECTIONS_ONLY'] | click()
        driver.findElement(By.xpath("//button[@id ='CONNECTIONS_ONLY']")).click();
//        Click on Done Button Using Locator "XPath" //span[text() = 'Done'] | click()
        driver.findElement(By.xpath("//span[text() = 'Done']")).click();
//        Enter post contain Using Locator "Class" Name share-creation-state__content-scrollable | sendKeys()
        driver.findElement(By.className("share-creation-state__content-scrollable")).sendKeys("This is an automated Post!");
//        Click on Post button Using Locator "XPath" //span[text() = 'Post'] | click()
        driver.findElement(By.xpath("//span[text() = 'Post']")).click();
    }
}