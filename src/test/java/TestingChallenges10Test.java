import framework.Navigator;
import org.testng.annotations.Test;

public class TestingChallenges10Test extends BaseTest {

    //data for registration
    public static final String PASSWORD = "1234qwerty";
    public static final String FIRSTNAME = "Anna";
    public static final String LASTNAME = "Kiselhof";
    private static final String USERNAME = "anna2020";

    @Test(groups = {"challenge10"})
    public void Challenge10Test() {
        Navigator.openTestingChallenge10()
                .CreateUser(USERNAME, PASSWORD, FIRSTNAME, LASTNAME)
                .inputDataAndRegisterUser()
                .verifyUsername(USERNAME)
                .verifypassword(PASSWORD)
                .verifyfirstname(FIRSTNAME)
                .verifylastname(LASTNAME)
                .clickOnLinkToLogin()
                .verifyLogIn();

        //если открывать не по клику на страничке, а новый url
/*
        Navigator
                .openTestingChallenge10Login()
                .CreateUser(USERNAME, PASSWORD, FIRSTNAME, LASTNAME)
                .openPageInputDataAndLogIn()
                .verifyUsername(USERNAME)
                .verifypassword(PASSWORD)
                .verifyfirstname(FIRSTNAME)
                .verifylastname(LASTNAME)
                .clickOnLinkToLogin()
                .verifyLogIn();
*/

    }
}
