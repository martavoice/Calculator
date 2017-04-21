package com.example.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity implements View.OnClickListener {
    ArrayList<String> listOfOperations = new ArrayList<>();
    TextView editText;
    Button add;
    Button mult;
    Button div;
    Button sub;
    Button n0;
    Button n1;
    Button n2;
    Button n3;
    Button n4;
    Button n5;
    Button n6;
    Button n7;
    Button n8;
    Button n9;
    Button dot;
    Button equal;
    Button clear;
    private static ArrayList<String> orderOfOperations = new ArrayList<>();
    private static ArrayList<String> orderOfNumbers = new ArrayList<>();
    TextView tvresult;
    String s = "0";
    double result = 0;
    char lO = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialisation elements

        add = (Button) findViewById(R.id.add);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        sub = (Button) findViewById(R.id.sub);
        tvresult = (TextView) findViewById(R.id.tvResult);
        n0 = (Button) findViewById(R.id.n0);
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        clear = (Button) findViewById(R.id.clear);
        tvresult.setText("0");

        //set listeners
        add.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        sub.setOnClickListener(this);

        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        clear.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.n1:
            case R.id.n2:
            case R.id.n3:
            case R.id.n4:
            case R.id.n5:
            case R.id.n6:
            case R.id.n7:
            case R.id.n8:
            case R.id.n9:
            case R.id.n0:
            case R.id.dot:
                String inDigit = ((Button) v).getText().toString();
                if (s.equals("0")) {
                    s = inDigit;
                } else {
                    s += inDigit;
                }
                tvresult.setText(s);
                if (lO == '=') {
                    result = 0;
                    lO = ' ';
                }
                break;


            // need to think about
            case R.id.add:
                compute();
                lO = '+';
                break;
            case R.id.mult:
                compute();
                lO = '*';
                break;
            case R.id.sub:
                compute();
                lO = '-';
                break;
            case R.id.div:
                compute();
                lO = '/';
                break;
            case R.id.equal:
                compute();
                lO = '=';
                break;
            case R.id.clear:
                result = 0;
                s = "0";
                lO = ' ';
                tvresult.setText("0");
                break;
        }

    }
    private void compute() {

        double inNum = Double.parseDouble(s);
        s = "0";
        if (lO == ' ') {
            result = inNum;
        } else if (lO == '+') {
            result += inNum;
        } else if (lO == '-') {
            result -= inNum;
        } else if (lO == '*') {
            result *= inNum;
        } else if (lO == '/') {
            result /= inNum;
        } else if (lO == '=') {
            // Keep the result for the next operation
        }
        tvresult.setText(String.valueOf(result));
    }
}
