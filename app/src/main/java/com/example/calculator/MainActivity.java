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
    private static ArrayList<String> orderOfOperations = new ArrayList<>();
    private static ArrayList<String> orderOfNumbers = new ArrayList<>();
    TextView tvresult;
    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation elements
        editText = (TextView) findViewById(R.id.editText);
        add = (Button) findViewById(R.id.add);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        sub = (Button) findViewById(R.id.sub);
        tvresult = (TextView) findViewById(R.id.tvResult);

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

    }

    public static String createLineOfOperations(ArrayList<String> list) {
        String result = "";
        for (String var : list) {
            result += var;
        }
        return result;
    }

    public static String createCurrentNumber(ArrayList<String> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+") || list.get(i).equals("-") || list.get(i).equals("*") || list.get(i).equals("*")) {
                for (int j = i + 1; j < list.size(); j++) {
                    result += list.get(j);
                }
            } else {
                for (String var : list) {
                    result += var;
                }
            }
        }

        return result;
    }

    public static void fullLists(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+") || list.get(i).equals("*") || list.get(i).equals("-") || list.get(i).equals("/")) {
                orderOfOperations.add(list.get(i));
                String number = "";
                for (int j = 0; j < i; j++) {
                    number += list.get(j);
                }
                orderOfNumbers.add(number);
                for (int j = 0; j <= i; j++) {
                    list.remove(j);
                }
            }

        }
        if (list.size() != 0) {
            fullLists(list);
        }

    }


    public static String count(ArrayList<String> list) {
        String result = "";


        return result;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(editText.getText().toString())) {
            return;
        }

        switch (v.getId()) {
            case R.id.n1:
                listOfOperations.add("1");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n2:
                listOfOperations.add("2");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n3:
                listOfOperations.add("3");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n4:
                listOfOperations.add("4");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n5:
                listOfOperations.add("5");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n6:
                listOfOperations.add("6");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n7:
                listOfOperations.add("7");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n8:
                listOfOperations.add("8");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n9:
                listOfOperations.add("9");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.n0:
                listOfOperations.add("0");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.dot:
                listOfOperations.add(".");
                tvresult.setText(createLineOfOperations(listOfOperations));
                editText.setText(createCurrentNumber(listOfOperations));
                break;
            case R.id.add:
                listOfOperations.add("+");
            case R.id.mult:
                listOfOperations.add("*");
            case R.id.sub:
                listOfOperations.add("-");
            case R.id.div:
                listOfOperations.add("/");
            case R.id.equal:
                count(listOfOperations);
        }

    }
}
