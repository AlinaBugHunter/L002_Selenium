package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTests {

    WebDriver driver = new ChromeDriver();
    //  System.setProperty("webdriver.chrome.driver", "/Users/alinakolestinskaa/Tools/chromedriver-mac-arm64");

    @Test
    public void firstTest() {

        driver.navigate().to("https://telranedu.web.app/home"); // Открывает страницу в браузере

        try {
            Thread.sleep(1000); // sleep - Останавливает выполнение программы
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Указываем локатор кнопки "Login" для ее нахождения и клику по ней
        WebElement btnLoginHeader = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLoginHeader.click();

        WebElement btnRegistration = driver.findElement(By.cssSelector("button[name='registration']"));
        btnRegistration.click();

        // driver.quit(); // Закрывает браузер
    }

    @Test
    public void secondTest() {

        driver.navigate().to("https://telranedu.web.app/home");
        WebElement elementTextH2 = driver.findElement(By.cssSelector("h2"));
        System.out.println(elementTextH2.getText());

        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        System.out.println("Tag Name > " + btnAbout.getTagName()); // Указывает имя тега
        System.out.println("Text > " + btnAbout.getText()); // Показывает текст

        driver.quit();

    }

}
