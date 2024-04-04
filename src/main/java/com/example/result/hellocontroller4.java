package com.example.result;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class hellocontroller4 {
    @FXML
    Label d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,D16;
    @FXML
    Label CGPA1,CGPA2,CGPA3;
    @FXML
    Label OCGPA;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void displayall(String p2[]) {
     d1.setText(p2[0]);
     d2.setText(p2[1]);
     d3.setText(p2[3]);
     d4.setText(p2[2]);
     d6.setText(p2[5]);
     d7.setText(p2[6]);
     d8.setText(p2[7]);
     d9.setText(p2[8]);
     d10.setText(p2[9]);
     d11.setText(p2[10]);
     d12.setText(p2[11]);
     d13.setText(p2[12]);
     d14.setText(p2[13]);
     d15.setText(p2[14]);
     d16.setText(p2[15]);
     d17.setText(p2[16]);
     d18.setText(p2[17]);
     d19.setText(p2[18]);
     d20.setText(p2[19]);
     d21.setText(p2[20]);
     int P[]=new int[21];
     for(int i=5;i<=20;i++) {
         P[i]= Integer.parseInt(p2[i]);
     }
     String g[]=new String [21];
     for(int i=5;i<=20;i++){
         if(P[i]>90){
             g[i]="O";
         }
         else if((P[i]>80) && (P[i]<=90)){
             g[i]= "A+";
         }
         else if((P[i]>70) && (P[i]<=80)){
             g[i]="A";
         }
         else if((P[i]>60) && (P[i]<=70)){
             g[i]="B+";

         }
         else if((P[i]>50) && (P[i]<=60)){
             g[i]="B";
         }
         else if((P[i]>=45) && (P[i]<=50)){
             g[i]="C";
         }
         else{
             g[i]="U/A";
         }

     }
        D1.setText(g[5]);
        D2.setText(g[6]);
        D3.setText(g[7]);
        D4.setText(g[8]);
        D5.setText(g[9]);
        D6.setText(g[10]);
        D7.setText(g[11]);
        D8.setText(g[12]);
        D9.setText(g[13]);
        D10.setText(g[14]);
        D11.setText(g[15]);
        D12.setText(g[16]);
        D13.setText(g[17]);
        D14.setText(g[18]);
        D15.setText(g[19]);
        D16.setText(g[20]);


//float CGPA[]=new float[3];
float cgpa1=(((P[5]/10)+(P[9]/10)+(P[8]/10)+(P[7]/10)+(P[6]/10))/5);
float cgpa3=(((P[20]/10)+(P[19]/10)+(P[18]/10)+(P[17]/10)+(P[16]/10))/5);
float cgpa2=((((P[10]/10)+(P[11]/10)+(P[12]/10)+(P[13]/10)+(P[14]/10)+(P[15]/10)))/6);
//CGPA[0]= Float.parseFloat(String.valueOf(((P[5]/10)+(P[9]/10)+(P[8]/10)+(P[7]/10)+(P[6]/10))/5));
CGPA1.setText(""+cgpa1);
CGPA2.setText(""+cgpa2);
CGPA3.setText(""+cgpa3);
float ocgpa;
ocgpa=(((P[10]/10)+(P[11]/10)+(P[12]/10)+(P[13]/10)+(P[14]/10)+(P[15]/10))+((P[20]/10)+(P[19]/10)+(P[18]/10)+(P[17]/10)+(P[16]/10))+((P[5]/10)+(P[9]/10)+(P[8]/10)+(P[7]/10)+(P[6]/10)))/16;
OCGPA.setText(""+ocgpa);

    }


}
