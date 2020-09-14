package com.HW_31.Cucumber.steps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

@RunWith(SerenityRunner.class)

public class LandFSteps {
    @Managed  WebDriver driver;

    @Test

    @Given("^User navigates to Mixcloud website$")
    public void user_navigates_to_Mixcloud_website() throws Throwable {
        driver.get("https://www.mixcloud.com/");
        this.driver.manage().window().maximize();
    }

    @Step
    @When("^User clicks on the login button on page$")
    public void user_clicks_on_the_login_button_on_page() throws Throwable {
        driver.findElement(By.xpath("//p[contains(text(),'Login')]")).click();
    }

    @Step
    @When("^User enters a valid username \"([^\"]*)\"$")
    public void user_enters_a_valid_username(String username) throws Throwable {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

    }

    @Step
    @When("^User enters a valid password \"([^\"]*)\"$")
    public void user_enters_a_valid_password(String password) throws Throwable {
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @Step
    @When("^User clicks on the log in button$")
    public void user_clicks_on_the_log_in_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }

    @Step
    @Then("^User should be successfully logged in \"([^\"]*)\"$")
    public void user_should_be_successfully_logged_in(String username ) throws Throwable {
        Thread.sleep(2000);
      // WebElement Uname=driver.findElement(By.xpath("//*[contains(text(), 'GFMilan')]"));
        WebElement Uname=driver.findElement(By.xpath("//*[contains(text(), '"+ username +"')]"));
        Assert.assertEquals(true,  Uname.isDisplayed());
    }

    @Step
    @When("^User clicks Search field$")
    public void user_clicks_Search_field() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
    }

    @Step
    @When("^User enters artistname in the Search field \"([^\"]*)\"$")
    public void user_enters_artistname_in_the_Search_field(String artistname) throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(artistname);
    }

    @Step
    @When("^User clicks on necessary music artist in the list$")
    public void user_clicks_on_necessary_music_artist_in_the_list() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/span/a")).click();

    }

    @Step
    @When("^User clicks on Follow button$")
    public void user_clicks_on_Follow_button() throws Throwable {
        try{
            driver.findElement(By.xpath("//body/div[@id='react-root']/div/section/div/div/div/div/div/div/section/div/div/div/div/span[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[contains(text(),'Following!')]//*[local-name()='svg']")).click();
        }
        catch(NoSuchElementException ex){
            System.out.println("Данный пользователь уже следит за этим исполнителем!");
        }

   }

    @Step
    @When("^User clicks on profile button$")
    public void user_clicks_on_profile_button() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='react-root']/div/section/div/div/div/div/div/div/div/div/div/img[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div[2]/div/div/div[1]/a")).click();
    }

    @Step
    @Then("^User should see the necessary music artist in his follow list \"([^\"]*)\"$")
    public void user_should_see_the_necessary_music_artist_in_his_follow_list(String artistname) throws Throwable {
        Thread.sleep(2000);
        try{
           WebElement Aname=driver.findElement(By.xpath("//a[contains(text(),'"+ artistname +"')]"));
           Assert.assertEquals(true,  Aname.isDisplayed());
           }
        catch(NoSuchElementException ex){
            System.out.println("Опять кнопку Follow не нажали!");

        }

    }

    @Step
    @When("^User clicks on artistname in his folowing list \"([^\"]*)\"$")
    public void user_clicks_on_artistname_in_following_list(String artistname) throws Throwable {
        Thread.sleep(1500);
        try{
        driver.findElement(By.xpath("//a[contains(text(),'"+ artistname +"')]")).click();
        }
        catch(NoSuchElementException ex){
            String newname = artistname.replaceAll("\\s","");
            driver.get("https://www.mixcloud.com/"+ newname);

        }
    }

    @Step
    @Then("^User clicks on Following button$")
    public void user_clicks_on_following_button() throws Throwable {
        Thread.sleep(2000);
        try{
            driver.findElement(By.xpath("//body/div[@id='react-root']/div/section/div/div/div/div/div/div/section/div/div/div/div/div/div[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(text(),'Unfollow')]")).click();
        }
        catch(Exception ex){
            System.out.println("Данный пользователь НЕ следит за этим исполнителем!");
        }
       Thread.sleep(2000);

    }





}
