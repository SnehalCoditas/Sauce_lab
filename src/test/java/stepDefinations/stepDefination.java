package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class stepDefination {


    WebDriver driver;

    @Given("^User opens browser$")
    public  void user_opens_browser() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @When("^Login with username and password$")
    public void login_with_username_and_password() throws Throwable {
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
    }

    @Then("^add items to cart$")
    public void add_items_to_cart() {


        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }

    @Then("^checkout from cart$")
    public void checkout_from_cart() {
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("snehal");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("pimpal");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("440001");
        driver.findElement(By.xpath("//input[@name='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();

    }


}
