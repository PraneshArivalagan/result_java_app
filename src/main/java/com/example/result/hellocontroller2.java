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

public class hellocontroller2 {
    private Stage stage;
    private Scene scene;
    private Parent root;


    /*public void sem1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello3.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/
    @FXML
    Label s11,s12,s13,s14,s15,val;
    @FXML
    TextField eng2,eg,p2,m2,c,beee;
    public void display(String personal2[] ){

        //for(int i=0;i<= personal2.length;i++)
        s11.setText(personal2[5]);
       s12.setText(personal2[6]);
        s13.setText(personal2[7]);
        s14.setText(personal2[8]);
       s15.setText(personal2[9]);
        p[0]=personal2[0];
        p[1]=personal2[1];
        p[2]=personal2[2];
        p[3]=personal2[3];
        p[4]=personal2[4];
        p[5]=personal2[5];
        p[6]=personal2[6];
        p[7]=personal2[7];
        p[8]=personal2[8];
        p[9]=personal2[9];


        /*per2.setText(personal2[1]);
        per3.setText(personal2[2]);
        per4.setText(personal2[3]);
        per5.setText(personal2[4]);
        */

        //for (int i = 0; i < personal.length; i++) {
        //  arr[i]= personal[i];
        //}

      //  data1.setText(String.valueOf(eng));
    }
    public void back2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello3.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Semester 1 marks");
        stage.show();

    }
    public void next2(ActionEvent event) throws IOException {
        Parent root = null;
        p[10]= eng2.getText();
        p[11]=eg.getText();
        p[12]=p2.getText();
        p[13]= m2.getText();
        p[14]=c.getText();
        p[15]= beee.getText();
        if(!p[10].isEmpty()&&!p[11].isEmpty()&&!p[12].isEmpty()&&!p[13].isEmpty()&&!p[14].isEmpty()&&!p[15].isEmpty()) {
            FXMLLoader Loader1 = new FXMLLoader(Objects.requireNonNull(getClass().getResource("hello5.fxml")));

            //Parent root = FXMLLoader.load(getClass().getResource("hello5.fxml"));
        /*p1[0]=p[0];
        p1[1]=p[1];
        p1[2]=p[2];
        p1[3]=p[3];*/

            root = Loader1.load();
            hellocontroller3 control4 = Loader1.getController();
            control4.display(p);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Semester 3 marks");
            stage.show();
        }else
            val.setText("Enter all options");
    }
 String p[]= new String[16];

}