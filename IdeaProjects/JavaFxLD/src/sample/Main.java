package sample;//package sample;
//
//import javafx.application.Application;
//import javafx.beans.value.ObservableValue;
//import javafx.fxml.FXMLLoader;
//import javafx.geometry.NodeOrientation;
//import javafx.geometry.Orientation;
//import javafx.geometry.Pos;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.ScrollBar;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//
//    @Override
//    public void start(Stage primaryStage) {
//        Label jio = new Label("Show Colors");
//
//       /* Color Red = Color.web("rgb(255, 0, 0)");
//        jio.setTextFill(Red);*/
//        //jio.setTextFill(Paint.valueOf("-fx-fill :red"));
//        ScrollBar s = new ScrollBar();
//        Label l0 = new Label("Red");
//
//
//        l0.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
//        s.setMaxSize(100, 10);
//        s.setMin(0);
//        s.setMax(255);
//        s.setValue(0);
//        s.setOrientation(Orientation.HORIZONTAL);
//        s.setUnitIncrement(10);
//        s.setBlockIncrement(12);
//
//
//        ScrollBar s1 = new ScrollBar();
//        Label l1 = new Label("Green");
//        l1.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
//        s1.setMaxSize(100, 10);
//        s1.setMin(0);
//        s1.setMax(255);
//        s1.setValue(0);
//        s1.setOrientation(Orientation.HORIZONTAL);
//        s1.setUnitIncrement(20);
//        s1.setBlockIncrement(12);
//
//
//        ScrollBar s2 = new ScrollBar();
//        Label l2 = new Label("Blue");
//        l2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
//        s2.setMaxSize(100, 10);
//        s2.setMin(0);
//        s2.setMax(255);
//        s2.setValue(0);
//        s2.setOrientation(Orientation.HORIZONTAL);
//        s2.setUnitIncrement(0.01);
//        s2.setBlockIncrement(0.02);
//
//
//        ScrollBar s3 = new ScrollBar();
//        Label l3 = new Label("Opacity");
//
//
//        l3.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
//        s3.setMaxSize(100, 10);
//        s3.setMin(0);
//        s3.setMax(100);
//        s3.setValue(0);
//        s3.setOrientation(Orientation.HORIZONTAL);
//        s3.setUnitIncrement(10);
//        s3.setBlockIncrement(12);
//
//
//
//
//        GridPane r = new GridPane();
//
//        r.addRow(1, l0);
//        r.addRow(2, l1);
//        r.addRow(3, l2);
//        r.addRow(4, l3);
//        r.setHgap(20);
//        r.addColumn(1, jio);
//        r.addColumn(1, s);
//        r.addColumn(1, s1);
//        r.addColumn(1, s2);
//        r.addColumn(1, s3);
//        r.setAlignment(Pos.CENTER);
//
//
//        Scene scene = new Scene(r, 400, 400);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("JavaLd");
//        primaryStage.show();
//
//
//        s.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) ->
//        {
//            updateui1(jio, s, s1, s2, s3);
//
//        });
//        s1.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) ->
//        {
//            updateui1(jio, s, s1, s2, s3);
//
//        });
//        s2.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) ->
//        {
//            updateui1(jio, s, s1, s2, s3);
//
//        });
//        s3.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) ->
//        {
//            updateui1(jio, s, s1, s2, s3);
//
//        });
//
//
//    }
//
//
//    private void updateui1(Label jio, ScrollBar s, ScrollBar s1, ScrollBar s2, ScrollBar s3) {
//        Integer r = (int) (s.getValue()); //0 255
//        Integer g = (int) (s1.getValue());
//        Integer b = (int) (s2.getValue());
//        float a = (float) ((s3.getValue()) / 100); //0.0 to 1.0
//
//
//        // String colorcode="rgba("+r+","+g+","+b+","+a+")";
//        String colorcode = String.format("rgba(%d,%d,%d,%f)", r, g, b, a);
//
//        Color W = Color.web(colorcode);
//        jio.setTextFill(W);
//
//
//        System.out.println("sliderevent red=" + s.getValue());
//        System.out.println("sliderevent Green =" + s1.getValue());
//        System.out.println("sliderevent blue=" + s2.getValue());
//        System.out.println("sliderevent alpha=" + a);
//
//
//    }
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}







//AVi
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javapplication16;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.Math;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Background;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javax.imageio.ImageIO;

/**
 *
 * @author Avi
 */
public class Main extends Application{


    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage Ps) throws Exception {
        Ps.setTitle("App9");

        //==========================Make VBox to fit the Buttons=====================
        VBox vbox=new VBox();
        vbox.setPrefHeight(100.0);
        vbox.setPrefWidth(500.0);

        HBox hbox=new HBox();

        //===================================Create Buttons==============================
        Button B1=new Button("FreeDraw");
        Button B2=new Button("Line");
        Button B3=new Button("Circle");
        Button B4=new Button("Rectangle");
        Button B5=new Button("Ellipse");

        hbox.setSpacing(5.0);
        hbox.getChildren().addAll(B1,B2,B3,B4,B5);

        vbox.getChildren().add(hbox);



        AnchorPane root=new AnchorPane();
        root.getChildren().addAll(vbox);

        Ps.setScene(new Scene(root,500,100));

        //=================== Define A All Button Event=============================//

        //===================B1 event freedrawing===================================//
        B1.setOnAction(freeDraw->{
            AnchorPane n1=new AnchorPane();
            Scene scene=new Scene(n1,800,600);
            Stage st=new Stage();

            GraphicsContext GC;
            HBox Vx=new HBox();
            Canvas canvas=new Canvas(800,600);
            ///==============add Widgets IN Canvas =============================////////
            ColorPicker CP=new ColorPicker();
            Slider S=new Slider(1,100,1);
            Button btnSave=new Button("Save");
            TextField TF=new TextField();

            Vx.getChildren().addAll(CP,S,TF,btnSave);
            GC=canvas.getGraphicsContext2D();
            /////================= save Image as png file ===========================
            btnSave.setOnAction(ss->{

                WritableImage fxImage=scene.snapshot(null);
                BufferedImage bImg=SwingFXUtils.fromFXImage(fxImage,null);
                try{
                    ImageIO.write(bImg,"png",new File(TF.getText()));
                }
                catch(IOException e){

                }
            });
            ////==========================///////////===================================
            canvas.setOnMousePressed(P->{
                GC.setStroke(CP.getValue());
                GC.setLineWidth(S.getValue());
                GC.beginPath();
                GC.lineTo(P.getX(),P.getY());

            });

            canvas.setOnMouseDragged(E->{

                GC.lineTo(E.getX(),E.getY());
                GC.stroke();


            });
            canvas.setOnMouseReleased(R->{
                GC.lineTo(R.getX(), R.getY());
                GC.stroke();
                GC.closePath();

            });

            st.setTitle("FreeDrawing");
            st.setScene(scene);
            n1.getChildren().addAll(canvas,Vx);
            st.show();

        });

        //========================B2 event Line Drawing===================================
        B2.setOnAction(line->{
            AnchorPane n1=new AnchorPane();
            Stage st=new Stage();
            Scene scene=new Scene(n1,800,600);
            GraphicsContext GC;
            Canvas canvas=new Canvas(800,600);
            HBox V1=new HBox();

            ColorPicker CP=new ColorPicker();
            Slider Lsize=new Slider(1,80,1);
            Button btnSave=new Button("Save");
            TextField TF=new TextField();

            V1.setSpacing(3.0);
            V1.getChildren().addAll(CP,Lsize,TF,btnSave);
            GC=canvas.getGraphicsContext2D();
            Line L1=new Line();
            L1.setSmooth(true);
            /////================= save Image as png file ===========================
            btnSave.setOnAction(ss->{

                WritableImage fxImage=scene.snapshot(null);
                BufferedImage bImg=SwingFXUtils.fromFXImage(fxImage,null);
                try{
                    ImageIO.write(bImg,"png",new File(TF.getText()));
                }
                catch(IOException e){

                }
            });
            ////==========================///////////===================================
            canvas.setOnMousePressed(P->{
                GC.setStroke(CP.getValue());
                GC.setLineWidth(Lsize.getValue());
                GC.setLineCap(StrokeLineCap.ROUND);
                L1.setStartX(P.getX());
                L1.setStartY(P.getY());

            });

            canvas.setOnMouseReleased(R->{
                L1.setEndX(R.getX());
                L1.setEndY(R.getY());
                GC.strokeLine(L1.getStartX(), L1.getStartY(), L1.getEndX(), L1.getEndY());

            });

            st.setTitle("LineDrawing");
            st.setScene(scene);
            n1.getChildren().addAll(canvas,V1);
            st.show();

        });

        //=========================B3 event Circle Drawing=============================
        B3.setOnAction(circleDraw->{
            AnchorPane n1=new AnchorPane();
            Stage st=new Stage();
            Scene scene=new Scene(n1,800,600);

            GraphicsContext GC;
            Canvas canvas=new Canvas(800,600);

            ColorPicker CP=new ColorPicker();
            Slider S1=new Slider(1,80,1);
            ColorPicker fill=new ColorPicker();
            Button btnSave=new Button("Save");
            TextField TF=new TextField();

            HBox V2=new HBox();
            V2.setSpacing(3.0);

            GC=canvas.getGraphicsContext2D();
            Circle C1=new Circle();
            V2.getChildren().addAll(CP,S1,fill,TF,btnSave);

            canvas.setOnMousePressed(P->{
                GC.setStroke(CP.getValue());
                GC.setFill(fill.getValue());
                GC.setLineWidth(S1.getValue());
                C1.setCenterX(P.getX());
                C1.setCenterY(P.getY());
            });

            /////================= save Image as png file ===========================
            btnSave.setOnAction(ss->{

                WritableImage fxImage=scene.snapshot(null);
                BufferedImage bImg=SwingFXUtils.fromFXImage(fxImage,null);
                try{
                    ImageIO.write(bImg,"png",new File(TF.getText()));
                }
                catch(IOException e){

                }
            });
            ////==========================///////////===================================

            canvas.setOnMouseReleased(R->{
                C1.setRadius(Math.abs(C1.getCenterX()-R.getX()+C1.getCenterY()-R.getY())/2.0);

                if(C1.getCenterX()>R.getX())
                    C1.setCenterX(R.getX());
                if(C1.getCenterY()>R.getY())
                    C1.setCenterY(R.getY());
                GC.strokeOval(C1.getCenterX(), C1.getCenterY(), C1.getRadius(), C1.getRadius());
                GC.fillOval(C1.getCenterX(), C1.getCenterY(), C1.getRadius(), C1.getRadius());

            });

            st.setTitle("CircleDrawing");
            st.setScene(scene);
            n1.getChildren().addAll(canvas,V2);
            st.show();

        });

        //==============================B4 event draw rectangle===========================//
        B4.setOnAction(RectDraw->{
            AnchorPane n1=new AnchorPane();
            Stage st=new Stage();
            Scene scene=new Scene(n1,800,600);
            GraphicsContext GC;
            Canvas canvas=new Canvas(800,600);

            HBox V3=new HBox();
            V3.setSpacing(3.0);

            ColorPicker CP=new ColorPicker();
            Slider S2=new Slider(1,80,1);
            ColorPicker fill=new ColorPicker();
            Button btnSave=new Button("Save");
            TextField TF=new TextField();


            V3.getChildren().addAll(CP,S2,fill,TF,btnSave);
            GC=canvas.getGraphicsContext2D();


            /////================= save Image as png file ===========================
            btnSave.setOnAction(ss->{

                WritableImage fxImage=scene.snapshot(null);
                BufferedImage bImg=SwingFXUtils.fromFXImage(fxImage,null);
                try{
                    ImageIO.write(bImg,"png",new File(TF.getText()));
                }
                catch(IOException e){

                }
            });
            ////==========================///////////===================================



            Rectangle rect=new Rectangle();
            canvas.setOnMousePressed(P->{
                GC.setStroke(CP.getValue());
                GC.setFill(fill.getValue());
                GC.setLineWidth(S2.getValue());
                rect.setX(P.getX());
                rect.setY(P.getY());


            });

            canvas.setOnMouseDragged(D->{
                rect.setWidth(Math.abs(rect.getX()-D.getX()));
                rect.setHeight(Math.abs(rect.getY()-D.getY()));

                if(rect.getX()>D.getX())
                    rect.setX(D.getX());
                if(rect.getY()>D.getY())
                    rect.setY(D.getY());

                GC.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                GC.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

            });

            canvas.setOnMouseReleased(R->{

                rect.setWidth(Math.abs(rect.getX()-R.getX()));
                rect.setHeight(Math.abs(rect.getY()-R.getY()));

                if(rect.getX()>R.getX())
                    rect.setX(R.getX());
                if(rect.getY()>R.getY())
                    rect.setY(R.getY());

                GC.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                GC.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());


            });

            st.setTitle("RectangleDrawing");
            st.setScene(scene);
            n1.getChildren().addAll(canvas,V3);
            st.show();

        });

        //====================================Draw A ellipse========================
        B5.setOnAction(line->{
            AnchorPane n1=new AnchorPane();
            Stage st=new Stage();
            Scene scene=new Scene(n1,800,600);

            GraphicsContext GC;
            Canvas canvas=new Canvas(800,600);
            HBox V1=new HBox();

            ColorPicker CP=new ColorPicker();
            ColorPicker fill=new ColorPicker();
            Slider Esize=new Slider(1,80,1);
            Button btnSave=new Button("Save");
            TextField TF=new TextField();


            V1.setSpacing(3.0);
            V1.getChildren().addAll(CP,Esize,fill,TF,btnSave);
            GC=canvas.getGraphicsContext2D();


            /////================= save Image as png file ===========================
            btnSave.setOnAction(ss->{

                WritableImage fxImage=scene.snapshot(null);
                BufferedImage bImg=SwingFXUtils.fromFXImage(fxImage, null);
                try{
                    ImageIO.write(bImg,"png",new File(TF.getText()));
                }
                catch(IOException e){

                }
            });
            ////==========================///////////===================================



            Ellipse E1=new Ellipse();
            E1.setSmooth(true);

            canvas.setOnMousePressed(P->{
                GC.setStroke(CP.getValue());
                GC.setLineWidth(Esize.getValue());
                GC.setFill(fill.getValue());
                E1.setCenterX(P.getX());
                E1.setCenterY(P.getY());

            });

            canvas.setOnMouseReleased(R->{
                E1.setRadiusX(Math.abs(E1.getCenterX()-R.getX()));
                E1.setRadiusY(Math.abs(E1.getCenterY()-R.getY()));
                if (E1.getCenterX()>R.getX())
                    E1.setCenterX(R.getX());
                if (E1.getCenterY()>R.getY())
                    E1.setCenterY(R.getY());
                GC.strokeOval(E1.getCenterX(),E1.getCenterY(),E1.getRadiusX(),E1.getRadiusY());
                GC.fillOval(E1.getCenterX(),E1.getCenterY(),E1.getRadiusX(),E1.getRadiusY());

            });

            st.setTitle("EllipseDrawing");
            st.setScene(scene);
            n1.getChildren().addAll(canvas,V1);
            st.show();

        });


        Ps.show();
    }

}
