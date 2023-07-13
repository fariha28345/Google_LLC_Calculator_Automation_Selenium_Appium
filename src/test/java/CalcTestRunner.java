import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    CaleScreen caleScreen;
    @Test(priority = 1, description = "Do series 1")
    public void doSeries() throws InterruptedException {
        caleScreen = new CaleScreen(driver);
        Thread.sleep(1000);
        String res = caleScreen.calculateSeries("100/10*5-10+60");
        Assert.assertTrue(res.contains("100"));
    }
    @Test(priority = 2, description = "Do series 2")
    public void doSeries2() throws InterruptedException {
        caleScreen = new CaleScreen(driver);
        Thread.sleep(1000);
        String res = caleScreen.calculateSeries("50+10-20*2+10/2");
        Assert.assertTrue(res.contains("25"));
        Thread.sleep(1000);
    }

    @AfterMethod
    public void ClearScreen(){
        caleScreen = new CaleScreen(driver);
        caleScreen.clearScreen();
    }
}
