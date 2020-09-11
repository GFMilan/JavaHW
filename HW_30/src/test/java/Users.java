import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Users {

    public static WebDriver driver;

    @Test

    public void Login () throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html"); //открытие сайта в браузере

        //Login with email and password
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("qeqeqe@gmail.com");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")).sendKeys("12345");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[3]//td[2]//input[1]")).click();
        Thread.sleep(3000);
        WebElement AddUser = driver.findElement(By.xpath("//a[@class='btn btn-danger']"));
        Assert.assertEquals(true, AddUser.isDisplayed());

        //Search user by name
        driver.findElement(By.xpath("//input[@placeholder='Введите email или имя']")).sendKeys("Andrii");
        driver.findElement(By.xpath("//button[@class='btn btn-submit']")).click();
        Thread.sleep(3000);
        WebElement SearchUser = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        Assert.assertEquals(true, SearchUser.isDisplayed());

        //Add new user
        driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='noibiz_name']")).sendKeys("Andrii12");
        driver.findElement(By.xpath("//input[@name='noibiz_email']")).sendKeys("qeqeqe12@gmail.com");
        driver.findElement(By.xpath("//input[@name='noibiz_password']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@name='act_create']")).click();
        Thread.sleep(2000);
        //Exception handling
        try{
            WebElement NewUser = driver.findElement(By.xpath("//*[contains(text(), 'qeqeqe12@gmail.com')]"));
            Assert.assertEquals(true, NewUser.isDisplayed());
        }
        catch(Exception ex){
            System.out.println("Пользователь с email \"qeqeqe12@gmail.com\" уже существует!");
        }

        //Transfer to Personal Area
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.xpath("//*[contains(text(), 'Личный кабинет')]")).click();
        Thread.sleep(2000);
        WebElement PA = driver.findElement(By.xpath("//*[contains(text(), 'Профиль')]"));
        Assert.assertEquals(true, PA.isDisplayed());

        //Edit personal information
        driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Мужской");
        driver.findElement(By.xpath("//textarea[@name='hobby']")).clear();
        driver.findElement(By.xpath("//textarea[@name='hobby']")).sendKeys("Футбол");
        driver.findElement(By.xpath("//input[@name='inn']")).clear();
        driver.findElement(By.xpath("//input[@name='inn']")).sendKeys("123456789012");
        driver.findElement(By.xpath("//input[@name='act_profile_now']")).click();
        Thread.sleep(2000);
        String EpI= driver.findElement(By.xpath("//input[@name='inn']")).getAttribute("value");
        Assert.assertEquals(true, EpI.equals("123456789012"));


    }

}
