package lecture.testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day_01 {
    @AfterTest
    public void lastexecution()
    {
        System.out.println("@AfterTest---day01");

    }
    @Test
    public void Demo()
    {
        System.out.println("@Test---day01");//automation
        Assert.assertTrue(true);
    }
    @AfterSuite

    public void afSyite()
    {
        System.out.println("@AfterSuite---day01");
    }
    @Test
    public void SecondTest()
    {
        System.out.println("@Test---day01");
    }


}
