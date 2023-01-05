package lecture.testNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_02 {
    @Test(groups={"Smoke"})
    public void ploan()
    {
        System.out.println("@Test---day02");
    }

    @BeforeTest
    public void prerequiste()
    {
        System.out.println("@BeforeTest---day02");
    }
}
