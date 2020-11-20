import framework.Navigator;
import org.testng.annotations.Test;

public class TestingChallenges8NotValidDataTest {
    //invalid data item
    private static final String ITEMNAMEnotvalid = "not valid";
    private static final String DESCRIPTIONnotvalid = "not valid item";
    private static final String STARTTIMEnotvalid = "1240pm";
    private static final String ENDTIMEnotvalid = "1250pm";


    @Test(groups = {"challenge8invalidData"})
    public void Challenge8NotValidDataTest() {
        Navigator.openTestingChallenge8()
                .createItem(ITEMNAMEnotvalid, DESCRIPTIONnotvalid, STARTTIMEnotvalid, ENDTIMEnotvalid)
                .InputDataAndSend()
                .DialogPresent()
        ;
    }

}
