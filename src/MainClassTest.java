import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a = getLocalNumber();
        if (a != 14) {
            Assert.fail ("getLocalNumber вернула неверное значение");//("Bad Answer!");
        } else
        System.out.println("Good Answer!");

    }

}
