package stepDefinition;

import Pages.BasePage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class stepDefinition extends BasePage{


    @Given("Validate the browser")
    public void validate_the_browser() {
        System.out.println("Validate the browser");

    }
    @When("Browser is triggered")
    public void browser_is_triggered() {
        System.out.println("Browser is triggered");

    }
    @Then("Check browser is displayed")
    public void check_browser_is_started() {
        System.out.println("Check browser is displayed");

    }


    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("Hello cucumber");
    }
    @When("User login into application with {string} and {string}")
    public void user_login_into_application_with_and(String string, String string2) {
        System.out.println(string);
        System.out.println(string2);
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Hello cucumber");
    }
    @Then("Cards are displayed successfully")
    public void cards_are_displayed_successfully() {
        BasePage base = new BasePage();
        System.out.println("Hello cucumber");
    }


    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable dataTable){

    List<List<String>> dataValue =   dataTable.asLists();

        System.out.println(dataValue.get(0).get(0));
        System.out.println(dataValue.get(0).get(1));
        System.out.println(dataValue.get(0).get(3));
        System.out.println(dataValue.get(0).get(2));
        System.out.println(dataValue.get(0).get(4));
    }

    @When("User login into web with different User {int} and Pass {int}")
    public void user_login_into_web_with_different_user_and_pass(Integer int1, Integer int2) {
        System.out.println(int1);
        System.out.println(int2);
    }

}
