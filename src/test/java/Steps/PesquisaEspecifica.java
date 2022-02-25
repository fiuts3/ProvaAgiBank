package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaEspecifica {

    WebDriver driver;

    @Given("open site")
    public void open_site() {
        System.setProperty("webdriver.chrome.driver","src/test/java/utils/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://blogdoagi.com.br/");
    }
    @When("click search")
    public void click_search() {
        driver.findElement(By.id("search-open")).click();
    }

    @When("write in search field specific")
    public void write_in_search_field_specific() {
        driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/form/label/input")).sendKeys("Vale a pena fazer empréstimo? Saiba quando recorrer a essa alternativa");
    }

    @Then("show result")
    public void show_result() {
        driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/form/input")).submit();
        driver.quit();
    }
}
