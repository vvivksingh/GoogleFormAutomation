package googleForm;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
    ChromeDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase01() throws InterruptedException {
        System.out.println("Start Test case: testCase01");
        driver.get("https://forms.gle/wjPkzeSEk1CM7KgGA");
        String answer = "I want to be the best QA Engineer! " + System.currentTimeMillis();
        WebElement nameBox = driver
                .findElement(By.xpath("(//input[@type='text'])[1]"));
        SeleniumWrapper.sendKeys(driver, nameBox, "Vivek Kumar Singh");
        WebElement answerTextarea = driver.findElement(By.xpath("//textarea[@aria-label='Your answer']"));
        SeleniumWrapper.sendKeys(driver, answerTextarea, answer);
        WebElement selectExperience = driver.findElement(By.id("i16"));
        SeleniumWrapper.click(selectExperience, driver);
        WebElement javaCheckbox = driver.findElement(By.xpath("//div[@data-answer-value=\"Java\"]"));
        WebElement seleniumCheckbox = driver.findElement(By.xpath("//div[@data-answer-value=\"Selenium\"]"));
        WebElement testNGCheckbox = driver.findElement(By.xpath("//div[@data-answer-value=\"TestNG\"]"));
        SeleniumWrapper.click(javaCheckbox, driver);
        SeleniumWrapper.click(seleniumCheckbox, driver);
        SeleniumWrapper.click(testNGCheckbox, driver);
        WebElement dropDownChoose = driver
                .findElement(By.xpath("//span[normalize-space()='Choose']"));
        SeleniumWrapper.click(dropDownChoose, driver);
        Thread.sleep(2000);
        WebElement selectMr = driver.findElement(
                By.xpath(
                        "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[2]/div[3]/span"));

        SeleniumWrapper.click(selectMr, driver);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Get the date 7 days earlier than today
        LocalDate sevenDaysEarlier = today.minusDays(7);
        String sevenDaysEarlierDate = sevenDaysEarlier.format(formatter);

        WebElement inputDate = driver.findElement(By.xpath("//input[@type='date']"));
        SeleniumWrapper.sendKeys(driver, inputDate, sevenDaysEarlierDate);

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();

        WebElement hourField = driver.findElement(By.xpath("//input[@aria-label='Hour']"));
        WebElement minuteField = driver.findElement(By.xpath("//input[@aria-label='Minute']"));
        SeleniumWrapper.sendKeys(driver, hourField, String.valueOf(hour));
        SeleniumWrapper.sendKeys(driver, minuteField, String.valueOf(minute));
        driver.get("https://www.amazon.in");
        driver.switchTo().alert().dismiss();
        WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
        SeleniumWrapper.click(submit, driver);
        WebElement responseMessage = driver.findElement(By.xpath("//div[@class='vHW8K']"));
        System.out.println(responseMessage.getText());
    }
}
