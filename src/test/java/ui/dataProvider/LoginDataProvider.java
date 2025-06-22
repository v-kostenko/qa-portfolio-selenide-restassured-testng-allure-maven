package ui.dataProvider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "invalidLoginData")
    public static Object[][] invalidLoginData(){
        return new Object[][]{
                {"password", "login"},
                {"correctLogin", "wrongPass"},
                {"wrongLogin", "correctPass"}
        };
    }
}
