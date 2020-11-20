import framework.Navigator;
import org.testng.annotations.Test;


public class TestingChallenges1Test extends BaseTest {

    //TestingChallenge 1
    private static final String _emptyValue = "";
    private static final String _spaceValue = " ";
    private static final String _spaceAtEnding = "Anna"+" ";

    private static final String averageValue = "Anna";
    private static final String maxValue = "asdfghjklqwertuyioasdfghjklqwe";
    private static final String moreThanMax = "asdfghjklqwertuyioasdfghjklqwea";
    private static final String nonAlphabetic = "1234";
    private static final String nonASCII = "привет";
    private static final String minValue = "a";
    private static final String htmlTag = "<>";
    private static final String basicXSS = "<script>alert";
    private static final String spaceInMiddle = "An na";
    private static final String _spaceAtBeginning = " "+"Anna";
    private static final String[] NAMELIST = {averageValue, maxValue, moreThanMax, nonAlphabetic, nonASCII,
            minValue, htmlTag, basicXSS, spaceInMiddle, _spaceAtBeginning};




    @Test(groups={"challenge1"})
    public void NameListTest() {
      for (int number = 1; NAMELIST.length > number; number++){
          String name = NAMELIST[number];
          Navigator.openTestingChallenge1()
                  .enterNameAndSubmit(name)
                  .verifyChecksFound(number)
                  .verifyUsernameInConfirmationWindow(name)
                  .verifyNameInConfirmationWindow(name)
                  ;
      }

    }



}
