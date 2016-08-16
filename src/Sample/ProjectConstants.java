package Sample;

/**
 * Created by abhishekbarla on 8/9/16.
 */
public class ProjectConstants {
    private static final String databaseURL = "jdbc:mysql://192.168.1.112:3306/applicantdetails";
    private static final String userID = "root";
    private static final String password = "Abc123def!";

    public static String getUserID() {
        return userID;
    }

    public static String getPassword() {
        return password;
    }

    public static String getDatabaseURL() {
        return databaseURL;
    }


}
