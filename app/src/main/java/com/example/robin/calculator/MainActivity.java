package com.example.robin.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int signe, op1, op2;
    float test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find elements and assign them an id
        Button Case0 = (Button)findViewById(R.id.button0);
        Button Case1 = (Button)findViewById(R.id.button1);
        Button Case2 = (Button)findViewById(R.id.button2);
        Button Case3 = (Button)findViewById(R.id.button3);
        Button Case4 = (Button)findViewById(R.id.button4);
        Button Case5 = (Button)findViewById(R.id.button5);
        Button Case6 = (Button)findViewById(R.id.button6);
        Button Case7 = (Button)findViewById(R.id.button7);
        Button Case8 = (Button)findViewById(R.id.button8);
        Button Case9 = (Button)findViewById(R.id.button9);
        final Button CaseEgal = (Button)findViewById(R.id.Egal);
        CaseEgal.setEnabled(false);
        final Button CaseAddition = (Button)findViewById(R.id.Plus);
        CaseAddition.setEnabled(false);
        final Button CaseSoustraction = (Button)findViewById(R.id.Moins);
        CaseSoustraction.setEnabled(false);
        final Button CaseMultiplication = (Button)findViewById(R.id.Multi);
        CaseMultiplication.setEnabled(false);
        final Button CaseDivision = (Button)findViewById(R.id.Division);
        CaseDivision.setEnabled(false);
        final Button CaseClear = (Button)findViewById(R.id.Clear);
        final TextView Notification = (TextView) findViewById(R.id.textView);
        final TextView CaseTexte = (TextView)findViewById(R.id.MonTexte);
        CaseTexte.setFocusableInTouchMode(false);

        // Create onclick listener
        CaseAddition.setOnClickListener(this);
        CaseSoustraction.setOnClickListener(this);
        CaseMultiplication.setOnClickListener(this);
        CaseDivision.setOnClickListener(this);

        //Managing the number buttons
        Case0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"0"); //Display in textView the value of the button
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });


        Case1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"1");//Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"2"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+""); //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"3"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"4"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"5"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"6"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"7"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"8"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"9"); //Display in textView the value of the button
                CaseTexte.setText(CaseTexte.getText()+"");  //Display a space after the number
                CaseEgal.setEnabled(true); //Enable the sign buttons
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        //Gestion du clear
        CaseClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText("");
                //Reset some variable to 0 in case of Clear
                op1 = 0;
                op2 = 0;
                signe = 0;
                CaseTexte.setText(CaseTexte.getText()+""); //Reset the text field to an empty string
                CaseEgal.setEnabled(false); // Disable the sign buttons
                CaseAddition.setEnabled(false);
                CaseSoustraction.setEnabled(false);
                CaseMultiplication.setEnabled(false);
                CaseDivision.setEnabled(false);
            }
        });

        //Gestion de l'addition
        CaseAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseEgal.setEnabled(false);
                CaseAddition.setEnabled(false);
                CaseSoustraction.setEnabled(false);
                CaseMultiplication.setEnabled(false);
                CaseDivision.setEnabled(false);
                signe = 1; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+""); // Stock the value of the 1st term in op1
                CaseTexte.setText(""); //Reset the value of the textView
            }
        });


        //Gestion de la soustraction
        CaseSoustraction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                CaseEgal.setEnabled(false);
                CaseAddition.setEnabled(false);
                CaseSoustraction.setEnabled(false);
                CaseMultiplication.setEnabled(false);
                CaseDivision.setEnabled(false);
                signe = 2; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+""); // Stock the value of the 1st term in op1
                CaseTexte.setText(""); //Reset the value of the textView
            }
        });


        //Gestion de la multiplication
        CaseMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseEgal.setEnabled(false);
                CaseAddition.setEnabled(false);
                CaseSoustraction.setEnabled(false);
                CaseMultiplication.setEnabled(false);
                CaseDivision.setEnabled(false);
                signe = 3; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+""); // Stock the value of the 1st term in op1
                CaseTexte.setText(""); //Reset the value of the textView
            }
        });

        //Gestion de la division
        CaseDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseEgal.setEnabled(false);
                CaseAddition.setEnabled(false);
                CaseSoustraction.setEnabled(false);
                CaseMultiplication.setEnabled(false);
                CaseDivision.setEnabled(false);
                signe = 4; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+""); // Stock the value of the 1st term in op1
                CaseTexte.setText(""); //Reset the value of the textView
            }
        });

        //Gestion du égal
        CaseEgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2 = Integer.parseInt(CaseTexte.getText()+""); // Stock the value of the 2nd term in op2
                if (signe == 1) {
                    Notification.setText(""); //Reset the value of the notification zone
                    CaseTexte.setText(op1 + op2 + ""); // Do the operation and display it in the textView
                }
                else if (signe == 2){
                    Notification.setText(""); //Reset the value of the notification zone
                    CaseTexte.setText(op1 - op2 + ""); // Do the operation and display it in the textView
                }
                else if (signe == 3){
                    Notification.setText(""); //Reset the value of the notification zone
                    CaseTexte.setText(op1 * op2 + ""); // Do the operation and display it in the textView
                }
                else if(signe == 4){
                    if (op2 == 0){
                        Notification.setText("Tu ne peux pas diviser par 0"); //Set the notification zone due to the impossibility to divide by 0
                        CaseTexte.setText(""); // Display a empty string in the textView
                        CaseEgal.setEnabled(false); //Disable the sign buttons
                        CaseAddition.setEnabled(false);
                        CaseSoustraction.setEnabled(false);
                        CaseMultiplication.setEnabled(false);
                        CaseDivision.setEnabled(false);
                    }
                    else{
                        test = (float) op1 / op2; //Make it float if we need it
                        CaseTexte.setText(new DecimalFormat("##.##").format(test)); //Set the decimal format each # are a number
                    }

                }
            }
        });
    }
    @Override
    public void onClick(View v) {

    }
}
