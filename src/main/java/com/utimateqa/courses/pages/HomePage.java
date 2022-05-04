package com.utimateqa.courses.pages;

import com.utimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signInLink = By .linkText("Sign In");

    public void clickOnSingInLink(){
        clickOnElement(signInLink);
    }
}

