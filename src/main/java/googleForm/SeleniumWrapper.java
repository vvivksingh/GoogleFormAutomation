package googleForm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SeleniumWrapper {
    /*
     * Check if the element is displayed before attempting to click
     * Scroll in to view before clicking on an element
     * return false if the element is not displayed / any other exception
     */
    public static boolean click(WebElement elementToClick, WebDriver driver) throws InterruptedException {
        if (elementToClick.isDisplayed()) {
            try {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToClick);
                Thread.sleep(500);
                elementToClick.click();
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return false;

    }

    /*
     * clear the existing text on the inputBox
     * Type in the new keys
     */
    public static boolean sendKeys(WebDriver driver, WebElement inputBox, String keysToSend) {
        try {
            // Wait for the input box to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.elementToBeClickable(inputBox));
            // Clear the input box
            inputBox.clear();
            // Send keys to the input box
            inputBox.sendKeys(keysToSend);
            return true;
        } catch (Exception e) {
            System.out.println("Input box is not clickable.");
            System.out.println(e.getMessage());
            return false;
        }
    }

}
