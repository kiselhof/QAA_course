package framework;

public class UserTestingChallenges10 {
    private static String USERNAME;
    private static String PASSWORD;
    private static String FIRSTNAME;
    private static String LASTNAME;


    public UserTestingChallenges10(String username, String password, String firstname, String lastname){
        this.USERNAME = username;
        this.PASSWORD = password;
        this.FIRSTNAME = firstname;
        this.LASTNAME = lastname;
    }


    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String username) {
        UserTestingChallenges10.USERNAME = username;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String password) {
        UserTestingChallenges10.PASSWORD = password;
    }

    public static String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public static void setFIRSTNAME(String firstname) {
        UserTestingChallenges10.FIRSTNAME = firstname;
    }

    public static String getLASTNAME() {
        return LASTNAME;
    }

    public static void setLASTNAME(String lastname) {
        UserTestingChallenges10.LASTNAME = lastname;
    }
}
