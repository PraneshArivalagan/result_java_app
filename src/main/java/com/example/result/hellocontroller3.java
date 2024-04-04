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

public class hellocontroller3 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void back3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello4.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("2nd Semester marks");
        stage.show();
    }
    @FXML
    Label s21,s22,s23,s24,s25,s26,val;
    @FXML
    TextField oop,fdsc,ds,m3,dpco;
    public void display(String p[] ) {
        s21.setText(p[14]);
        s22.setText(p[13]);
        s23.setText(p[12]);
        s24.setText(p[13]);
        s25.setText(p[14]);
        s26.setText(p[15]);
        p2[0]=p[0];
        p2[1]=p[1];
        p2[2]=p[2];
        p2[3]=p[3];
        p2[4]=p[4];
        p2[5]=p[5];
        p2[6]=p[6];
        p2[7]=p[7];
        p2[8]=p[8];
        p2[9]=p[9];
        p2[10]=p[10];
        p2[11]=p[11];
        p2[12]=p[12];
        p2[13]=p[13];
        p2[14]=p[14];
        p2[15]=p[15];
    }
        public void next3(ActionEvent event) throws IOException {
        Parent root = null;
        p2[16]=oop.getText();
        p2[17]= fdsc.getText();
        p2[18]=ds.getText();
        p2[19]= m3.getText();
        p2[20]= dpco.getText();
        if(!p2[16].isEmpty()&&!p2[17].isEmpty()&&!p2[18].isEmpty()&&!p2[19].isEmpty()&&!p2[20].isEmpty()){
            FXMLLoader Loader5=new FXMLLoader(Objects.requireNonNull(getClass().getResource("overall-result.fxml")));
            root =Loader5.load();
            hellocontroller4 control= Loader5.getController();
            control.displayall(p2);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("overall Semester marks");
        stage.show();
        }
        else
            val.setText("Enter all options");
    }
    String p2[]=new String[21];
}