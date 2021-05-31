package sample;

import java.sql.*;
import java.util.Scanner;

public class MysqlCon {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Connection con= null;
        Statement stmt = null;
        PreparedStatement ps=null;
        Scanner sc= null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/", "root", "nikhil1234?");
            System.out.println("Connection successfully! ");
            stmt = con.createStatement();
            String sql="insert into jdbc.persons values(?,?,?,?)";
            ps=con.prepareStatement(sql);
//            String q1 = "CREATE DATABASE IF NOT EXISTS jdbc;";
//            String q2 = "USE jdbc;";
//            String q3 = "CREATE TABLE IF NOT EXISTS Persons (\n" +
//                    "    PersonID int,\n" +
//                    "    LastName varchar(255),\n" +
//                    "    FirstName varchar(255),\n" +
//                    "    City varchar(255)\n" +
//                    "); ";
            sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("Enter the User id:");
                Integer id=sc.nextInt();
                System.out.println("Enter the User LastName:");
                String lname=sc.next();

                System.out.println("Enter the User FirstName:");
                String fname=sc.next();
                System.out.println("Enter the User City:");
                String city=sc.next();

                ps.setInt(1, id);
                ps.setString(2,lname);
                ps.setString(3,fname);
                ps.setString(4,city);
                ps.executeUpdate();
                System.out.println("Record Update Sucessfully");
                System.out.println("Do you want to insert more data[yes/no]\n");
                String dec=sc.next();
                if(dec.equalsIgnoreCase("no"))
                {
                    break;
                }

            }
//
            // Create Database and Table
//            String[] array = {q1, q2, q3};
//            for (int i = 0; i < 3; i++) {
//                stmt.addBatch(array[i]);
//            }
//            stmt.executeBatch();

//            String q4 = "INSERT INTO Persons values " +
//                    "(1,'Shingadiya','Nikhil','Rajkot')," +
//                    "(2,'Ranapara','Darshak','Vadodara')";

//            stmt.executeUpdate(q4);
//


            System.out.println("Updated Databased");


            ResultSet rs = stmt.executeQuery("SELECT * FROM jdbc.persons;");
            ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
            int counter = md.getColumnCount();
            String colName[] = new String[counter];
            System.out.println("The column names are as follows:");
            for (int loop = 1; loop <= counter; loop++) {
                colName[loop - 1] = md.getColumnLabel(loop);
                System.out.println(colName[loop - 1]);
            }
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " +
                        rs.getString(2) + "  "
                        + rs.getString(3)+rs.getString(4)+" "
                        +rs.getString(4));
        } catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
            System.out.println(se.getErrorCode());
            System.out.println(se.getSQLState());
            System.out.println(se.getMessage());


        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {


        }try{
                if(con!=null)
                    con.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try



        }
}
}
