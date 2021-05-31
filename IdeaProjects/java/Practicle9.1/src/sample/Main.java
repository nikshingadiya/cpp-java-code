package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import  javafx.scene.control.ComboBox;


import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set title for the stage
        primaryStage.setTitle("creating combo box ");


        ArrayList<Integer> E1 = new ArrayList();
        for (int i = 1; i < 101; i++) {
            E1.add(i);

        }


        // Create a combo box
        ComboBox combo_box =
                new ComboBox(FXCollections
                        .observableArrayList(Font.getFamilies()));

        ComboBox combo_box1 = new ComboBox(FXCollections.observableArrayList(E1));


       
        CheckBox b1=new CheckBox("Bold");
        CheckBox b2= new CheckBox("Italic ");




        HBox h1=new HBox(2,b1,b2);

        //h1.setAlignment(Pos.BOTTOM_CENTER);
         h1.setTranslateX(100);
         h1.setTranslateY(40);



        Label l2 = new Label("Font Name");
        HBox p2 = new HBox(5, l2, combo_box);
        p2.setAlignment(Pos.TOP_LEFT);


        Label l3 = new Label("Font Size");
        HBox p3 = new HBox(5, l3, combo_box1);
       // p3.setAlignment(Pos.TOP_RIGHT);


        Label l4 = new Label("Programing is fun");
        l4.setTranslateY(20);
     //   l4.setFont(Font.font("", FontWeight.BOLD, FontPosture.ITALIC,50));




        HBox g2 = new HBox(l4);
        g2.setTranslateX(100);


        ChangeListener changeListener2=new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                //setFont(l4,(String)combo_box.getSelectionModel().getSelectedItem(),(int)combo_box1.getSelectionModel().getSelectedItem());
                setBI(l4,b1.isSelected(),b2.isSelected(),(String)combo_box.getSelectionModel().getSelectedItem(),(int)combo_box1.getSelectionModel().getSelectedItem());

            }
        };
        combo_box.valueProperty().addListener(changeListener2);
        ChangeListener changeListener1=new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                setBI(l4,b1.isSelected(),b2.isSelected(),(String)combo_box.getSelectionModel().getSelectedItem(),(int)combo_box1.getSelectionModel().getSelectedItem());

                //setFont(l4,(String)combo_box.getSelectionModel().getSelectedItem(),(int)combo_box1.getSelectionModel().getSelectedItem());
            }
        };
        combo_box1.valueProperty().addListener(changeListener1);
       combo_box1.setValue(13);
    combo_box.setValue("Regular");


      ChangeListener changeListener5=new ChangeListener() {
          @Override
          public void changed(ObservableValue observable, Object oldValue, Object newValue) {

              setBI(l4,b1.isSelected(),b2.isSelected(),(String)combo_box.getSelectionModel().getSelectedItem(),(int)combo_box1.getSelectionModel().getSelectedItem());

          }
      };
        b1.selectedProperty().addListener(changeListener5);
        
        ChangeListener changeListener6= new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {

                setBI(l4,b1.isSelected(),b2.isSelected(),(String)combo_box.getSelectionModel().getSelectedItem(),(int)combo_box1.getSelectionModel().getSelectedItem());
                
            }
        };
        b2.selectedProperty().addListener(changeListener6);





        GridPane p1 = new GridPane();

        p1.addRow(0, p2);
        p1.addRow(0, p3);
        p1.addRow(1, g2);

        p1.addRow(2,h1);

        Scene scene = new Scene(p1, 600, 200);



        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void setBI(Label l4, Boolean newValue,Boolean newValue1, String selectedItem, int selectedItem1) {
        if(newValue && !(newValue1))
        {
         //   l4.setFont(new Font("Bold" ,  selectedItem1));
            


            l4.setFont(Font.font(selectedItem,FontWeight.BOLD,selectedItem1));



        }
        else  if(newValue1 && !(newValue))
        {
            //l4.setFont(new Font("ITALIC" ,  selectedItem1));
            l4.setFont(Font.font(selectedItem,FontPosture.ITALIC,selectedItem1));
        }

        else if((newValue && newValue1))
        {
            l4.setFont(Font.font(selectedItem,FontWeight.BOLD,FontPosture.ITALIC,selectedItem1));
            //l4.setFont(Font.font( l4.setFont(Font.font(selectedItem, FontWeight.BOLD, FontPosture.ITALIC,selectedItem1)); FontWeight.BOLD, FontPosture.ITALIC,selectedItem1));
        }
        else
        {

            l4.setFont(Font.font(selectedItem, selectedItem1));

        }


    }




    public static void main(String[] args) {
        launch(args);
    }
}
