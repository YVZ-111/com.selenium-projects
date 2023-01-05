package lecture.testNGTutorial;

import org.testng.annotations.*;

public class Day_03 {
    @BeforeClass
    public void befoclas()
    {
        System.out.println("@BeforeClass---day03");
    }
    @Parameters({ "URL","APIKey/usrname" })
    @Test
    public void WebloginCarLoan(String urlname,String key)
    {
        //selenium
        System.out.println("@Test---day03");
        System.out.println(urlname);
        System.out.println(key);
        System.out.println("---------------");
    }
    @BeforeMethod
    public void beforeevery()
    {
        System.out.println("@BeforeMethod---day03");
    }

    @AfterMethod
    public void afterevery()
    {
        System.out.println("@AfterMethod---day03");
    }
    @AfterClass
    public void afteclas()
    {
        System.out.println("@AfterClass---day03");
    }

    @Test(groups={"Smoke"})
    public void MobileLogincarLoan()
    {
        //Appium
        System.out.println("@Test---day03");
    }
    @BeforeSuite
    public void Bfsuite()
    {
        System.out.println("@BeforeSuite---day03");
    }
    @Test(enabled=false)
    public void MobilesignimcarLoan()
    {
        //Appium
        System.out.println("@Test---day03");
    }
    @Test(dataProvider="getData")
    public void MobilesignoutcarLoan(String username,String password)
    {
        //Appium
        System.out.println("@Test---day03");
        System.out.println(username);
        System.out.println(password);
        System.out.println("--------------");
    }

    @Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutcarLoan"})
    public void APIcarLoan()
    {
        //Rest API automation
        System.out.println(" @Test---day03");
    }
    @DataProvider
    public Object[][] getData()
    {
        //1st combiantion - username password - good credit history= row
        //2nd - username password  - no crdit history
        // 3rd - fraudelent credit history
        Object[][] data= new Object[3][2];
        //1st set
        data[0][0]="firstsetusername";
        data[0][1]="firstpassword";
        //couloumns in the row are nothing but values for that particualar combination(row)

        //2nd set
        data[1][0]= "secondsetusername";
        data[1][1]= "secondpassword";

        //3rd set
        data[2][0]="thirdsetusername";
        data[2][1]="thirdpassword";
        return data;








    }
}
