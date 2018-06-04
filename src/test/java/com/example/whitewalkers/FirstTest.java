package com.example.whitewalkers;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void newMethod () {

        System.out.println("Belley Test");

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");

    }


}
