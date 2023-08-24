package io.readeasy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomation {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Selenium Web Driver");
        // The path to the  driver executable must be set by the webdriver.chrome.driver system property
        System.setProperty("webdriver.chrome.driver","src/main/resources/browser/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        // Maximizar pantalla de navegador
        driver.manage().window().maximize();
        // Credenciales
        String username = "tomsmith";
        String password = "SuperSecretPassword!";
        // Buscamos en navegador por id: #username #password, Localizamos por ID
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("radius"));
                // new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.submit[name = 'login']"))).click();
        // Hacemos el login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
