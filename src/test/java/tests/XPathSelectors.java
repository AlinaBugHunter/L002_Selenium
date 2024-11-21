package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelectors {

    WebDriver driver = new ChromeDriver();

    @Test
    public void methodXPath() {
        driver.get("https://telranedu.web.app/login");

        threadSleep();
        WebElement inputEmail = driver.findElement(By.xpath("//form/input[1]"));
        inputEmail.sendKeys("test_email@gmail.com");

        threadSleep();
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys("Password123!");

        threadSleep();
        WebElement btnRegistration = driver.findElement(By.xpath("//form/button[last()]"));
        btnRegistration.click();

    }

    public static void threadSleep() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
