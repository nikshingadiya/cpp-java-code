package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import  javafx.scene.text.TextAlignment;
import  javafx.scene.control.Labeled;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static javafx.geometry.Pos.TOP_CENTER;
import static javafx.scene.input.KeyCode.X;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("BarChart Experiments");

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("X-Axis");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Y-Axis");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Grade");
        XYChart.Data m1= new XYChart.Data();
        double [] d1=new double[4];
        String [] s1={"Project--20%","Quiz--10%","Midterm--30%","Final--40%"};

        for (int i = 0; i < d1.length; i++) {
            Scanner obj=new Scanner(System.in);
            System.out.println("please enter the"+ s1[i]);
            System.out.println();
            d1[i]=100;


        }



        dataSeries1.getData().add(new XYChart.Data("Project--20%", 0.2*d1[0]));
        dataSeries1.getData().add(new XYChart.Data("Quiz--10%", 0.1*d1[1]));
        dataSeries1.getData().add(new XYChart.Data("Midterm--30%", 0.3*d1[2]));
        dataSeries1.getData().add(new XYChart.Data("Final--40%",0.4*d1[3]));

        barChart.getData().add(dataSeries1);
        Node m = barChart.lookup(".data0.chart-bar");

        m.setStyle("-fx-bar-fill: red");
        m = barChart.lookup(".data1.chart-bar");
        m.setStyle("-fx-bar-fill: blue");
        m = barChart.lookup(".data2.chart-bar");
        m.setStyle("-fx-bar-fill: green");
        m = barChart.lookup(".data3.chart-bar");
        m.setStyle("-fx-bar-fill: orange");

        VBox vbox = new VBox(barChart);


        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);

        primaryStage.show();


    }





        /*Rectangle R1= new Rectangle();
       *//* Text l1=new Text("Percentage-20%");
        l1.setTextAlignment();*//*
       Label l1=new Label("nik",R1);
       //l1.setTextAlignment(R1.getHeight());
         l1.setNodeOrientation(NodeOrientation.);
        R1.setHeight(80);
        R1.setWidth(90);
        R1.setFill(Color.BLUE);
        HBox h1=new HBox(4,l1);
        h1.setAlignment(Pos.CENTER);
        Scene root= new Scene(h1,400,400);
        primaryStage.setScene(root);
        primaryStage.setTitle("P-8.2");
        primaryStage.show();*/



    public static void main(String[] args) {
        launch(args);
    }
}
