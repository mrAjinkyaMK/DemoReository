package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
WebDriver driver;

@Given("User is on Login page")
public void user_is_on_login_page() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    driver.manage().deleteAllCookies();
    driver.get("https://www.facebook.com/reg");
}

@When("user enters firstname and lastname")
public void user_enters_username_and_password() {
	driver.findElement(By.name("firstname")).sendKeys("Thomas");
	driver.findElement(By.name("lastname")).sendKeys("Fredric");
}

@And("user clicks on login in button")
public void user_clicks_on_login_in_button() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
}

@Then("user navigates to homepage")
public void user_navigates_to_homepage() {
	System.out.println("User is on Login page");
}
}
