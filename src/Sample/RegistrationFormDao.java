package Sample;

import java.sql.*;
import Sample.ProjectConstants;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.*;
import javax.servlet.http.*;


/**
 * Created by abhishekbarla on 8/8/16.
 */
public class RegistrationFormDao extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        try{
            //Load Class in JVM
            Class.forName("com.mysql.jdbc.Driver");
            //Get Connection
            //Connection connection = DriverManager.getConnection(ProjectConstants.getDatabaseURL(),ProjectConstants.getUserID(),ProjectConstants.getPassword());
            Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.112:3306/applicantdetails", "root", "Abc123def!");
            if(connection!=null){
                System.out.println("Connection Successfully made");
            }
            //Create Statement
            Statement statement = connection.createStatement();
            //Query
            String query = "SELECT * FROM applicantinfo";

            ResultSet rs = statement.executeQuery(query);

            while(rs.next())
            {
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                System.out.println("Name: " + name + " Phone: " +phone);
            }

            //Writing to database
            String insertIntoDB = "INSERT INTO APPLICANTINFO(rowid,name,emailid,zipocde,phone) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertIntoDB);
            preparedStatement.setString(1,request.getParameter("rowid"));
            preparedStatement.setString(2,request.getParameter("name"));
            preparedStatement.setString(3,request.getParameter("emailid"));
            preparedStatement.setString(4,request.getParameter("zipcode"));
            preparedStatement.setString(5,request.getParameter("phone"));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Connection Failed.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
