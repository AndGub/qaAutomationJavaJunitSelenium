import org.junit.Assert;
import org.junit.Test;

public class FirstTest  extends DriverSettings {

    @Test
    public void firstTest() {
        driver.get("http://yandex.ru");
        String title = driver.getTitle();

        Assert.assertTrue(title.equals("Яндекс"));
    }
}
