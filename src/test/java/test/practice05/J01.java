package test.practice05;

import Utilities.TestBaseBeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class J01 extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("busra");
        //fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yeter");
        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-1']")).click();
        //check the experience
        driver.findElement(By.xpath(("//*[@id='exp-1']"))).click();
        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("28.10.2020");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();
        //choose your continent -> Antartica
        WebElement dropDownContinent= driver.findElement(By.xpath("//*[@id='continents']"));
        Select select= new Select(dropDownContinent);
        select.selectByVisibleText("Antartica");
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();
        //click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }
}
