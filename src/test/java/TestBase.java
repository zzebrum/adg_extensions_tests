import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class TestBase {
    @BeforeEach
    public void beforeEach () {
        Configuration.driverManagerEnabled = false;
        //Configuration.browser = CustomDriverProvider.class.getName();
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        Configuration.browser = "chrome";

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("chrome.crx"));

        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY,options);
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        WebDriverRunner.setWebDriver(webDriver);

    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}
