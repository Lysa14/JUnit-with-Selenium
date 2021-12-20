package base;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import utils.ElementUtil;

public abstract class BaseTest {

	private BasePage basePage;
	protected Properties properties;
	protected WebDriver driver;

	@BeforeAll
	public void setUp() {
		basePage = new BasePage() {
		};
		properties = basePage.initProp();
		driver = basePage.initDriver(properties.getProperty("browser"));
	}

	@AfterEach
	public void takesScreenshots() throws IOException {
		ElementUtil.implicitlyWait(driver, 10, TimeUnit.SECONDS);
		ElementUtil.getScreenshot(driver);
	}

	@AfterAll
	public void tearDown() {
		driver.quit();
	}
}
