import framework.Navigator;
import org.testng.annotations.Test;

public class TestingChallenges8ValidData1Test extends BaseTest{

    //TestingChallenge 8
    //valid data item
    //first item
    private static final String ITEMNAME1 = "first";
    private static final String DESCRIPTION1 = "first item";
    private static final String STARTTIME1 = "12:40pm";
    private static final String ENDTIME1 = "12:45pm";
    //second item
    private static final String ITEMNAME2 = "second";
    private static final String DESCRIPTION2 = "second item";
    private static final String STARTTIME2 = "12:40pm";
    private static final String ENDTIME2 = "12:50pm";


    @Test(groups={"challenge8validData"})
    public void Challenge8ValidDataTest(){
        Navigator.openTestingChallenge8()
                .createItem(ITEMNAME1, DESCRIPTION1, STARTTIME1, ENDTIME1)
                .InputDataAndSend()
                .verifyItemName()
                .createItem(ITEMNAME2, DESCRIPTION2, STARTTIME2, ENDTIME2)
                .InputDataAndSend()
                .verifyItemName()
                .deleteLastItemFromPage()
                .verifyItemWasDeleted();
    }


}
