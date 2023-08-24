package io.readeasy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomation {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Selenium Web Driver");
        // Configura web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/browser/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login"); // pagina web que se desea hacer las pruebas
        // Maximizar pantalla de navegador
        driver.manage().window().maximize();
        // Credenciales, seran los datos de entrada
        String username = "tomsmith";
        String password = "SuperSecretPassword!";
        // Buscamos en navegador por id: #username #password, Localizamos por ID
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        // WebElement loginButton = driver.findElement(By.className("radius")); // obtenemos por class, no recomendado
        // WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button")); // obtenemos por xPath, lo copiamos desde chrome.
        WebElement loginButton = driver.findElement(By.cssSelector(".radius")); // obtenemos por css
        // Inyectar los valores a la interface
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        // Inyectamos el evento click
        loginButton.click();
    }
}
