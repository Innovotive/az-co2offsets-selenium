/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tandra.azzera.selenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author Waltassah
 */
public class AzzeraSelenium {

    public static void main(String[] args) throws MalformedURLException {
 
        String nodeURL="http://ec2-3-83-145-251.compute-1.amazonaws.com:4444/wd/hub";
        
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        // setting driver propertise
       // RemoteWebDriver driver2 = new RemoteWebDriver(new URL(nodeURL),cap);  
        WebDriver driver = new RemoteWebDriver(new URL(nodeURL), firefoxOptions);

        // Open URL
        driver.get("https://registry.verra.org/mymodule/mypage.asp?p=login");
        
        // Enter Email id
        driver.findElement(By.cssSelector("#myuserid")).sendKeys("Innovobot");

        // Enter Password
        driver.findElement(By.cssSelector("#mypassword")).sendKeys("CarbonCredits123$");
        
        //Click on login button
        driver.findElement(By.cssSelector(".btn")).click();
       
        //driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        
        // Open Sub-Account
        driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(5) a")).click();
        
        // choose Active Sub-Accounts
        driver.findElement(By.cssSelector("#id")).click();
        driver.findElement(By.id("All")).click();
        
        // Download Active Sub-Accounts report
        driver.findElement(By.cssSelector(".mr-1:nth-child(2) > img")).click();
        
        // Return to Home
        driver.findElement(By.cssSelector(".navbar > .text-primary")).click();
        
        //Wait to load
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        //upload csv
        //we want to import file. 
        //String filePath = 
        //System.getProperty("user.dir") + "/src/res/test.pdf
        //driver.findElement(By.name("temp (5).csv")).sendKeys("C:\\Users\\TandraTech\\Downloads\\temp (5).csv");

        //refresh the page
        //driver.navigate().refresh();
    }
}
