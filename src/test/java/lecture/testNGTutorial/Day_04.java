package lecture.testNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day_04 {
    @Parameters({ "URL" })
    @Test
    public void WebloginHomeLoan(String uname)
    {
        //selenium
        System.out.println("@Test---day04");
        System.out.println(uname);
        System.out.println("--------------");
    }


    @Test(groups={"Smoke"})
    public void MobileLoginHomeLoan()
    {
        //Appium
        System.out.println("@Test---day04");
    }

    @Test
    public void LoginAPIHomeLoan()
    {
        //Rest API automation
        System.out.println("@Test---day04");
    }
}
