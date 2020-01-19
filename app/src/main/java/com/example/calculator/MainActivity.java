package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signbox;
    String sign,value1,value2;
    Double num1,num2,result;
    boolean hasdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signbox = (TextView) findViewById(R.id.sign);
        hasdot = false;
    }

    public void Click_7(View view) { signbox.setText(signbox.getText() + "7"); }

    public void Click_9(View view) {
        signbox.setText(signbox.getText() + "9");
    }

    public void Click_8(View view) {
        signbox.setText(signbox.getText() + "8");
    }

    public void Click_4(View view) {
        signbox.setText(signbox.getText() + "4");
    }

    public void Click_5(View view) { signbox.setText(signbox.getText() + "5"); }

    public void Click_6(View view) {
        signbox.setText(signbox.getText() + "6");
    }

    public void Click_1(View view) {
        signbox.setText(signbox.getText() + "1");
    }

    public void Click_2(View view) { signbox.setText(signbox.getText() + "2"); }

    public void Click_3(View view) {
        signbox.setText(signbox.getText() + "3");
    }

    public void Click_0(View view) {
        signbox.setText(signbox.getText() + "0");
    }

    public void div(View view) {
        sign = "/";
        value1 = signbox.getText().toString();
        input.setText(null);
        signbox.setText("/");
        hasdot=false;
    }
    public void multi(View view) {
        sign = "*";
        value1 = signbox.getText().toString();
        input.setText(null);
        signbox.setText("*");
        hasdot=false;
    }

    public void subst(View view) {
        sign = "-";
        value1 = signbox.getText().toString();
        input.setText(null);
        signbox.setText("-");
        hasdot=false;
    }

    public void plus(View view) {
        sign = "+";
         value1 = signbox.getText().toString();
        input.setText(null);
        signbox.setText("+");
        hasdot=false;
    }

    public void equal(View view) {
        if (signbox.getText().equals("")){
            input.setText("Error!!");
        }
        else if(sign != null){
            value2 = signbox.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign){
              //  default:break;

                case "+":
                    result = num1 + num2;

                    input.setText(result + "");
                    sign=null;
                    signbox.setText(null);
                    break;

                case "-":
                    result = num1 - num2;
                    input.setText(result + "");
                    sign=null;
                    signbox.setText(null);
                    break;

                case "*":
                    result = num1*num2;
                    input.setText(result + "");
                    sign=null;
                    signbox.setText(null);
                    break;

                case "/":
                    result = num1/num2;
                    input.setText(result + "");
                    sign=null;
                    signbox.setText(null);
                    break;
            }
        }
        else input.setText("Error!!");
    }

    public void dot(View view) {
        if (!hasdot){
            if (signbox.getText().equals("")){

                signbox.setText("0.");
            }
            else {
                signbox.setText(signbox.getText() + ".");
            }
            hasdot=true;
        }
    }


    public void delete(View view) {
        if (signbox.getText().equals("")) {
            signbox.setText(null);
        } else {
            int len = signbox.getText().length();
            String s = signbox.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasdot = false;
                signbox.setText(signbox.getText().subSequence(0, signbox.getText().length() - 1));
            } else {
                signbox.setText( signbox.getText().subSequence(0, signbox.getText().length() - 1));

            }
        }
    }
}
