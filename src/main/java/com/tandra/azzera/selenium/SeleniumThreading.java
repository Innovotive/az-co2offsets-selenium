/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tandra.azzera.selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author Waltassah
 */
public class SeleniumThreading extends Thread {

    SeleniumThreading() {

    }

    public void run() {
        String nodeURL = "https://selenium.co2-offsets.com/wd/hub";

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.LINUX);
        try {
            System.out.println("com.tandra.azzera.selenium.SeleniumThreading.run()");
            new RemoteWebDriver(new URL(nodeURL), cap);
            // setting driver propertise
        } catch (MalformedURLException ex) {
            Logger.getLogger(AzzeraSelenium.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
