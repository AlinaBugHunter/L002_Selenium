package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorsCSS {

    WebDriver driver = new ChromeDriver();

    @Test
    public void elementsHeaderIlCarro() {

        driver.navigate().to("https://ilcarro.web.app/search");

        threadSleep();
        WebElement btnLetTheCarWorkHeader = driver.findElement(By.cssSelector("a[id='1']"));
        btnLetTheCarWorkHeader.click(); // Click on the "Let the car work" link in the header
        System.out.println("1. " + btnLetTheCarWorkHeader.getText()); // Text output

        threadSleep();
        WebElement btnSearchHeader = driver.findElement(By.cssSelector("a[id='0']"));
        btnSearchHeader.click(); // Click on the "Search" link in the header
        System.out.println("2. " + btnSearchHeader.getText());

        threadSleep();
        WebElement btnTermsOfUseHeader = driver.findElement(By.cssSelector("a[id='2']"));
        btnTermsOfUseHeader.click(); // Click on the "Terms of use" link in the header
        System.out.println("3. " + btnTermsOfUseHeader.getText());

        threadSleep();
        WebElement btnSignUpHeader = driver.findElement(By.cssSelector("a[ng-reflect-router-link='registration']"));
        btnSignUpHeader.click(); // Click on the "Registration" link in the header
        System.out.println("4. " + btnSignUpHeader.getText());

        threadSleep();
        WebElement btnLogInHeader = driver.findElement(By.cssSelector("a[ng-reflect-router-link='login']"));
        btnLogInHeader.click(); // Click on the "Registration" link in the header
        System.out.println("5. " + btnLogInHeader.getText());

        threadSleep();
        WebElement btnLogoHeader = driver.findElement(By.cssSelector("div.header img[alt='logo']"));
        btnLogoHeader.click(); // Click on the logo in the header

        threadSleep();
        driver.quit();

    }

    public static void threadSleep() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
