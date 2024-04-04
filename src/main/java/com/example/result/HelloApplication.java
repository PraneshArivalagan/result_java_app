package com.example.result;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application  {
    @FXML
    TextField name,reg,clgname,clgcode;
    @FXML
    Label val;
    @FXML
    private AnchorPane page1;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));

        Scene scene = new Scene(root);
        stage.setTitle("Students Marksheet");
        stage.setScene(scene);
        stage.show();
    }

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void next(ActionEvent event) throws IOException {
        String[] personal= new String[4];
        personal[0]= name.getText();
        personal[1]= reg.getText();
        personal[2]= clgcode.getText();
        personal[3]= clgname.getText();

        if(!personal[0].isEmpty()&&!personal[1].isEmpty()&&!personal[2].isEmpty()&&!personal[3].isEmpty())
        {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("hello3.fxml"));
            root = Loader.load();
            HelloController control4 = Loader.getController();
            control4.display(personal);


            //Parent root = FXMLLoader.load(getClass().getResource("hello5.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Semester 1 marks");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else
        val.setText("Enter all options");

    }

    public static void main(String[] args) {
        launch();
    }


}



