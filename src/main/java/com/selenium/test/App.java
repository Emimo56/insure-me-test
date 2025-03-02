package com.selenium.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://3.138.32.9:8081/contact.html");

        driver.getTitle();
        WebElement name = driver.findElement(By.id("inputName"));
        name.sendKeys("FirstName");

        WebElement number = driver.findElement(By.id("inputNumber"));
        number.sendKeys("9999");

        WebElement email = driver.findElement(By.id("inputMail"));
        email.sendKeys("myemail@email.com");

        WebElement message = driver.findElement(By.id("inputMessage"));
        message.sendKeys("Hello how are you");

        WebElement submitButton = driver.findElement(By.id("my-button"));
        submitButton.click();

        WebElement responseReceived = driver.findElement(By.id("response"));
        responseReceived.getText();
        if(responseReceived.getText().equals("Message Sent")){
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }

           // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.quit();

    }
}
