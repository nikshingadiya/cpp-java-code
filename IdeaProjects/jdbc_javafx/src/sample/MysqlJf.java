package sample;

import java.sql.*;
import java.util.Scanner;

public class MysqlJf {
  public static  Connection con= null;
  public static  Statement stmt = null;
  public static PreparedStatement ps=null;
  public static String sql="insert into jdbc.persons values(?,?,?,?)";
    MysqlJf() throws SQLException {

        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/", "root", "nikhil1234?");
        System.out.println("Connection successfully! ");
        stmt = con.createStatement();
        ps=con.prepareStatement(sql);


    }
    public void addmember(Integer id, String lname,String fname,String city) throws SQLException {
        System.out.println("Enter the User id:");

        System.out.println("Enter the User LastName:");


        System.out.println("Enter the User FirstName:");

        System.out.println("Enter the User City:");


        ps.setInt(1, id);
        ps.setString(2,lname);
        ps.setString(3,fname);
        ps.setString(4,city);
        try {
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Record Update Sucessfully");
        System.out.println("Do you want to insert more data[yes/no]\n");


    }
}
