package io.loop.test.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {
        // in selenium 3 we had to set up the driver, for that we need webdrivermanager libraries
        // WebDriverManager.chromedriver().setup();

        // after that we need create driver object

        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get("https://www.google.com/");

        // maximize the window (page)
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Actual title is: " + actualTitle + ", matches expected title: " + expectedTitle + ". =>TEST PASS");
            } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT MATCH expected title: " + expectedTitle + ", =>TEST FAIL");
        }
        // System.out.println(driver.getCurrentUrl());

        String expectedURL = "https://www.google.com";
        String actualURl = driver.getCurrentUrl();

        if(actualURl.contains(expectedURL)){
            System.out.println("Actual url: " + actualURl + ", matches expected url: " + expectedURL + ". => TEST PASS");
        } else {
            System.err.println("Actual url: " + actualURl + ", DOES NOT match expected url: " + expectedURL + ". => TEST PASS");
        }
        driver.quit();
    }

}
