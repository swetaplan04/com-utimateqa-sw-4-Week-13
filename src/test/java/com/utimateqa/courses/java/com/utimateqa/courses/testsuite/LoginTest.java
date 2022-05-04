package com.utimateqa.courses.java.com.utimateqa.courses.testsuite;

import com.utimateqa.courses.java.com.utimateqa.courses.testbase.TestBase;
import com.utimateqa.courses.pages.HomePage;
import com.utimateqa.courses.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSingInLink();
        String actualMessage = signInPage.getWelcomeBackText();
        Assert.assertEquals(actualMessage,"Welcome Back!","error");

    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSingInLink();
        signInPage.enterEmailId("Lalita122=@gmail.com");
        signInPage.enterPasswordField("Lalita123");
        signInPage.clickOnSignInButton();
        String actualMessage = signInPage.errorMessageText();
        Assert.assertEquals(actualMessage,"Invalid email or password.","error");

    }
}

