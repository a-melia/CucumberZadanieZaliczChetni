package cucumber.test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class ZadanieZalicz_1_Chetni {

    WebDriver driver = null;
    WebElement element;
    @Given("an open browser")
    public void an_open_browser() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://prod-kurs.coderslab.pl/");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[1]/div[1]/input")).sendKeys("pejatan878@zcai55.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        sleep(2000);
        driver.findElement(By.id("submit-login")).click();
    }
    @When("user clicks Addresses")
    public void user_clicks_addresses() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]/span")).click();
            }
    @When("user enters {string} and {string}")
    public void user_enters_and(String address, String postcode) {
        driver.findElement(By.name("address1")).sendKeys(address);
        driver.findElement(By.name("postcode")).sendKeys(postcode);
    }
    @When("used enters {string}")
    public void used_enters(String city) {
        driver.findElement(By.name("city")).sendKeys(city);
    }

    @When("user chooses country")
    public void user_chooses_country() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.name("id_country")));
        dropdown.selectByIndex(1);
        sleep(3000);
    }
    @And("user clicks save")
    public void user_clicks_save() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();
    }
    @Then("the result should contain {string}")
    public void address_successfully_added(String expectedText) throws InterruptedException {
        System.out.println(expectedText);
        sleep(3000);
    }

    @When("user clicks delete")
    public void user_clicks_delete() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]/span")).click(); }

    @Then("the result should contain deleted")
    public void address_successfully_deleted(String expectedText) {
        System.out.println(expectedText);
    }

//    @And("close browser")
//    public void close_browser() {
//        driver.quit();
//    }
}