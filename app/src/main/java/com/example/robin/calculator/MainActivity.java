package com.example.robin.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int signe, op1, op2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Find elements
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

        // Create onclick listener
        CaseAddition.setOnClickListener(this);
        CaseSoustraction.setOnClickListener(this);
        CaseMultiplication.setOnClickListener(this);
        CaseDivision.setOnClickListener(this);

        //Gestion des touches nombres
        Case0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"1");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"2");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"3");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"4");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"5");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"6");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"7");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"8");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
                CaseAddition.setEnabled(true);
                CaseSoustraction.setEnabled(true);
                CaseMultiplication.setEnabled(true);
                CaseDivision.setEnabled(true);
            }
        });
        Case9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaseTexte.setText(CaseTexte.getText()+"9");
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(true);
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
                //Remise à 0 des variables si Clear
                op1 = 0;
                op2 = 0;
                signe = 0;
                CaseTexte.setText(CaseTexte.getText()+"0");
                CaseEgal.setEnabled(false);
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
               signe = 1; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+"");
                CaseTexte.setText("");
            }
        });


        //Gestion de la soustraction
        CaseSoustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signe = 2; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+"");
                CaseTexte.setText("");
            }
        });


        //Gestion de la mutliplication
        CaseMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signe = 3; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+"");
                CaseTexte.setText("");
            }
        });

        //Gestion de la mutliplication
        CaseDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signe = 4; // + = 1 | - = 2 | x = 3 | / = 4
                op1 = Integer.parseInt(CaseTexte.getText()+"");
                CaseTexte.setText("");
            }
        });

        //Gestion du égal
        CaseEgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2 = Integer.parseInt(CaseTexte.getText()+"");
                if (signe == 1) {
                    Notification.setText("");
                    CaseTexte.setText(op1 + op2 + "");
                }
                else if (signe == 2){
                    Notification.setText("");
                    CaseTexte.setText(op1 - op2 + "");
                }
                else if (signe == 3){
                    Notification.setText("");
                    CaseTexte.setText(op1 * op2 + "");
                }
                else if(signe == 4){
                    if (op2 == 0){
                        Notification.setText("Tu ne peux pas diviser par 0");
                        CaseTexte.setText("");
                    }
                    else{
                        CaseTexte.setText(op1 / op2 + "");
                    }

                }
            }
        });
    }
    @Override
    public void onClick(View v) {

    }
}
