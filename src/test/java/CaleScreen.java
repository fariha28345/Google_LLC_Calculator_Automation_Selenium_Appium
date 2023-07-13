import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaleScreen {
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;
    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnAC;
    AndroidDriver driver;

    public CaleScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public String calculateSeries(String series){
        for(int i = 0; i < series.length(); i++){
            if(series.charAt(i) == '+'){
                driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
            }
            else if(series.charAt(i) == '-'){
                driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
            }
            else if (series.charAt(i) == '*') {
                driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
            }
            else if (series.charAt(i) == '/') {
                driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
            }
            else {
                driver.findElement(By.id("com.google.android.calculator:id/digit_"+series.charAt(i)+"")).click();
            }
        }
        btnEqual.click();
        return txtResult.getText();
    }
    public void clearScreen(){
        btnAC.click();
    }
}
