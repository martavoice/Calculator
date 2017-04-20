package com.example.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    EditText editText;
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

    TextView tvresult;
    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation elements
        editText = (EditText) findViewById(R.id.editText);
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


    @Override
    public void onClick(View v) {
        String num1 = "";
        String num2 = "";
        float result = 0;

        if (TextUtils.isEmpty(editText.getText().toString())) {
            return;
        }

        switch (v.getId()) {
            case R.id.n1:
                num1 += 1;
                break;
            case R.id.n2:
                num1 += 2;
                break;
            case R.id.n3:
                num1 += 3;
                break;
            case R.id.n4:
                num1 += 4;
                break;
            case R.id.n5:
                num1 += 5;
                break;
            case R.id.n6:
                num1 += editText.getText().toString();

                break;
            case R.id.n7:
                num1 += editText.getText().toString();

                break;
            case R.id.n8:
                num1 += editText.getText().toString();

                break;
            case R.id.n9:
                num1 += editText.getText().toString();

                break;
            case R.id.n0:
                num1 += editText.getText().toString();

                break;
            case R.id.dot:
                num1 += editText.getText().toString();
                break;
            case R.id.add:

            case R.id.mult:

            case R.id.sub:

            case R.id.div:


        }
        tvresult.setText(num1);
    }
}
