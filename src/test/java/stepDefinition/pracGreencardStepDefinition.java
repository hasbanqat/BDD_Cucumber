package stepDefinition;

import Pages.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.validation.Validator;


public class pracGreencardStepDefinition extends BasePage {
    public WebDriver driver;
BasePage basePage = new BasePage();



    @Given("User is on the GreenCart landing page")
    public void user_is_on_the_green_cart_landing_page() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();// It is a runtime polymorphism. An interface can be referred by a child class reference variable.
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }

    @When("User search with shortname {} and expected actual name of the product")
    public void user_search_with_shortname_and_expected_actual_name_of_the_product(String name) throws InterruptedException {
        basePage.search.wait(2000);
        basePage.search.sendKeys(name);
        
    }
    @Then("user searched for the same short name in offers page to check if products exists")
    public void user_searched_for_the_same_short_name_in_offers_page_to_check_if_products_exists() {

    }

}