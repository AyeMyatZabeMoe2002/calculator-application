package com.example.calculatorlogbook;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class CalculatorActivity extends AppCompatActivity {
    Button btnZero,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine;
    Button btnClear,btnEqual,btnPlus,btnMinus,btnMultiply,btnDivision;
    TextView calculator_textView,textView;
    int number1,number2, flag=0;

    int operator;//one plus, two minus, three multiply, four division

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textView = findViewById(R.id.textView);
        calculator_textView = findViewById(R.id.calculator_textView);
        calculator_textView.setText(""+flag);

        btnZero  = findViewById(R.id.btnZero);
        btnOne   = findViewById(R.id.btnOne);
        btnTwo   = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour  = findViewById(R.id.btnFour);
        btnFive  = findViewById(R.id.btnFive);
        btnSix   = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine  = findViewById(R.id.btnNine);

        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);
        btnPlus  = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivision = findViewById(R.id.btnDivision);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator_textView.setText("0");
                flag=0;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double divisionResult=0.0;
                number2 = Integer.parseInt(calculator_textView.getText().toString());
                int ans =0;
                if (operator==1)
                    ans = number1+number2;
                else if (operator==2)
                    ans = number1-number2;
                else if (operator==3)
                    ans = number1*number2;
                else if (operator==4) {
                    if(number2==0)
                        Toast.makeText(CalculatorActivity.this,"Can't divided by Zero!",Toast.LENGTH_LONG).show();
                    else{
                        if (number1%number2!=0)
                            divisionResult = (double) number1 /number2;
                        else
                            ans = number1/number2;
                    }
                }
                flag =0;
                if ((operator==4) && (number2!=0) && (number1%number2!=0))
                    calculator_textView.setText(""+divisionResult);
                else
                    calculator_textView.setText(""+ans);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             number1  = Integer.parseInt(calculator_textView.getText().toString());
             operator =1;
             flag =0;
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1  = Integer.parseInt(calculator_textView.getText().toString());
                operator =2;
                flag =0;
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1  = Integer.parseInt(calculator_textView.getText().toString());
                operator =3;
                flag =0;
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1  = Integer.parseInt(calculator_textView.getText().toString());
                operator =4;
                flag =0;
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (flag==0){
                calculator_textView.setText("1");
                flag=1;
            }
            else {
                calculator_textView.append("1");
            }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("2");
                    flag=2;
                }
                else {
                    calculator_textView.append("2");
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("3");
                    flag=3;
                }
                else {
                    calculator_textView.append("3");
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("4");
                    flag=4;
                }
                else {
                    calculator_textView.append("4");
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("5");
                    flag=5;
                }
                else {
                    calculator_textView.append("5");
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("6");
                    flag=6;
                }
                else {
                    calculator_textView.append("6");
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("7");
                    flag=7;
                }
                else {
                    calculator_textView.append("7");
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("8");
                    flag=8;
                }
                else {
                    calculator_textView.append("8");
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("9");
                    flag=9;
                }
                else {
                    calculator_textView.append("9");
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    calculator_textView.setText("0");
                    flag=0;
                }
                else {
                    calculator_textView.append("0");
                }
            }
        });

    }//end of onCreate
}//end of class