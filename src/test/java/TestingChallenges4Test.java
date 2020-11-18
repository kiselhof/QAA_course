import framework.CNPNumber;
import framework.Navigator;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestingChallenges4Test extends BaseTest{

    @Test(groups = {"challenge4"})
    public void NumbersListTest() {
        int amount = 5;
        ArrayList<CNPNumber> numbersList = new ArrayList<CNPNumber>(amount);

        for (int index = 0; index <= amount-1; index++){
            CNPNumber number = new CNPNumber();
            numbersList.add(number);
            //numbersList.add(index,number);
        }
        for (int index = 1; index <= amount-1; index++){
            CNPNumber number = numbersList.get(index);
            Navigator.openTestingChallenge4()
                    .inputNumberAndSubmit(numbersList,index)
                    .verifyChecksFound(index);

        }/*
        CNPNumber number = new CNPNumber();
        Navigator.openTestingChallenge4()
                .inputNumberAndSubmit(numbersList,1)
                .verifyChecksFound(1);*/
    }
}
