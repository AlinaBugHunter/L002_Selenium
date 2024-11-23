package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ILCarroXPath {

    WebDriver driver = new ChromeDriver();

    @Test
    public void typeRegForm() {
        driver.navigate().to("https://ilcarro.web.app/search");

        WebElement btnLogIn = driver.findElement(By.xpath("//a[@ng-reflect-router-link='registration']"));
        btnLogIn.click();

        threadSleep();
        WebElement inputName = driver.findElement(By.xpath("//input[1]"));
        inputName.sendKeys("Test");

        threadSleep();
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        inputLastName.sendKeys("Tester");

        threadSleep();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("testtest1@gmail.com");

        threadSleep();
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("Password111!");

        threadSleep();
        WebElement checkBox = driver.findElement(By.xpath("//label[contains(@class, 'checkbox-label')]"));
        checkBox.click();

        threadSleep();
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();

    }

    public static void threadSleep() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
