package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {
    public static Connection con= null;
    public static Statement stmt = null;
    public static PreparedStatement ps=null;
    public static String sql="insert into jdbc.persons values(?,?,?,?)";


    @Override
    public void start(Stage primaryStage) throws Exception{



        Label pid=new Label("person id");
        Label fn=new Label("first name");
        Label ln = new Label("lastname");
        Label c= new Label("City");

        Label message= new Label("Message");



        TextField id=new TextField();
        TextField fname=new TextField();
        TextField lname=new TextField();
        TextField city=new TextField();
        Label Message =new Label(" Message");



        Button b = new Button(" Add Member");

        GridPane root = new GridPane();
        root.addRow(0, pid, id);
        root.addRow(1, fn, fname);
        root.addRow(2, ln, lname);
        root.addRow(3, c, city);



        root.addRow(4, b);
        root.addRow(5, message);

        Scene scene=new Scene(root,800,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Field Example");
        primaryStage.show();
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                try {
                    con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/", "root", "nikhil1234?");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                System.out.println("Connection successfully! ");
                try {
                    stmt = con.createStatement();


                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    ps=con.prepareStatement(sql);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    ps.setInt(1, Integer.parseInt(id.getText()));
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    ps.setString(2,lname.getText());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    ps.setString(3,fname.getText());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    ps.setString(4,city.getText());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Record Update Sucessfully");
                Message.setText("Record Update Sucessfully");
            }
        };

        // when button is pressed
        b.setOnAction(event);
//        ps.setInt(1, Integer.parseInt(id.getText()));
//        ps.setString(2,lname.getText());
//        ps.setString(3,fname.getText());
//        ps.setString(4,city.getText());
//        try {
//            ps.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        System.out.println("Record Update Sucessfully");
//        System.out.println("Do you want to insert more data[yes/no]\n");

    }


    public static void main(String[] args) throws SQLException {
        launch(args);

    }
}
