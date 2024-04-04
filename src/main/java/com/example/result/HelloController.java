package com.example.result;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    String[] personal2= new String[10];
    /*public void sem1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello3.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/

    @FXML
    Label per1,per2,per3,per4,per5,val;

    public void display(String personal[] ){
        
      //  for(int i=0;i<= personal.length;i++)
        per1.setText(personal[0]);
        per2.setText(personal[1]);
        per3.setText(personal[2]);
        per4.setText(personal[3]);
        personal2[0]=personal[0];
        personal2[1]=personal[1];
        personal2[2]=personal[2];
        personal2[3]=personal[3];

        //per5.setText(personal[4]);
        //for (int i = 0; i < personal.length; i++) {
          //  arr[i]= personal[i];
        //}

        //text1= text2.getText();
         //data1.setText(text2);
    }
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
       // stage.setFill();
        stage.setTitle("Personal info");
        stage.show();

    }
    @FXML
     TextField eng,chem,phy,math,pspp;
    public void next2(ActionEvent event) throws IOException {

        //personal2[4]= per5.getText();//radio button
        personal2[5]= eng.getText();
        personal2[6]= chem.getText();
        personal2[7]= phy.getText();
        personal2[8]= math.getText();
        personal2[9]= pspp.getText();
        Parent root = null;
        //String arr[] = new String[3];
       //// try {
       //     root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello4.fxml")));
      //  } catch (IOException e) {
         //   throw new RuntimeException(e);
       // }
        if(!personal2[5].isEmpty()&&!personal2[6].isEmpty()&&!personal2[7].isEmpty()&&!personal2[8].isEmpty()&&!personal2[9].isEmpty()) {
            FXMLLoader Loader1 = new FXMLLoader(getClass().getResource("hello4.fxml"));

            root = Loader1.load();
            hellocontroller2 control4 = Loader1.getController();
            control4.display(personal2);


            //Parent root = FXMLLoader.load(getClass().getResource("hello5.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Semester 2 marks");
            stage.setScene(scene);
            stage.show();
            // for(int i=0;i<= personal.length;i++)
            // data.setText(personal[0]);
        }
        else {
            val.setText("Enter all options");
        }
    }

}