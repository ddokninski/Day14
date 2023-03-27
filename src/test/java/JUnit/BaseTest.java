package JUnit;

import configuration.BrowserEnvironment;
import configuration.EnvironmentProperty;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

@Slf4j
public class BaseTest {

    protected static WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    public static EnvironmentProperty environmentProperty;

    @BeforeAll
    static void setup() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver = browserEnvironment.getDriver();
        log.debug("WebDriver initialized properly");
    }

//    @BeforeEach
//    void setupDriver() {
//        driver = new ChromeDriver();
//    }

    @AfterEach
    void tearDown() {
        driver.quit();
        log.debug("Driver is closed");
    }
}
