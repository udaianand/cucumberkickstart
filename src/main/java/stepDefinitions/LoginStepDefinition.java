package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Aanand\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("^title of login page is CRM$")
	public void title_of_login_page_is_CRM() {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println("Website Page Title is : " + title);
		Assert.assertEquals("CRM", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys("snrqa@rediffmail.com");
		driver.findElement(By.name("password")).sendKeys("Tester12#");

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginButton = driver
				.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", loginButton);

	}

	@Then("^user in on homepage$")
	public void user_in_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println("Home Page Title is also: " + title);
		Assert.assertEquals("CRM", title);
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		// driver.quit();

	}
}
