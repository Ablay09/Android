package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    enum Sign {
        PLUS, MINUS, MUL, DIV,
        SQRT, SQR, FLOAT;
    }

    private Sign sign;

    private EditText inputNumber;

    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;

    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonSqrt;
    private Button buttonSqr;
    private Button buttonFloat;
    private Button buttonEqual;
    private Button buttonClear;
    private Button buttonDelete;

    private float number1;
    private float number2;
    private float result;
    private boolean mIsFloat = false;
    private String mCurrentText;
    private final String mException = "Infinity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputNumber = findViewById(R.id.numberInput);

        buttonNumber1 = findViewById(R.id.buttonNumber1);
        buttonNumber2 = findViewById(R.id.buttonNumber2);
        buttonNumber3 = findViewById(R.id.buttonNumber3);
        buttonNumber4 = findViewById(R.id.buttonNumber4);
        buttonNumber5 = findViewById(R.id.buttonNumber5);
        buttonNumber6 = findViewById(R.id.buttonNumber6);
        buttonNumber7 = findViewById(R.id.buttonNumber7);
        buttonNumber8 = findViewById(R.id.buttonNumber8);
        buttonNumber9 = findViewById(R.id.buttonNumber9);
        buttonNumber0 = findViewById(R.id.buttonNumber0);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonSqr = findViewById(R.id.buttonSqr);
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonFloat = findViewById(R.id.buttonFloat);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonClear = findViewById(R.id.buttonClear);
        buttonDelete = findViewById(R.id.buttonDelete);

        buttonNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("1");
                    setCursor();
                } else {
                    inputNumber.append("1");
                }
            }
        });

        buttonNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("2");
                    setCursor();
                } else {
                    inputNumber.append("2");
                }
            }
        });

        buttonNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("3");
                    setCursor();
                } else {
                    inputNumber.append("3");
                }
            }
        });
        buttonNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("4");
                    setCursor();
                } else {
                    inputNumber.append("4");
                }
            }
        });
        buttonNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("5");
                    setCursor();
                } else {
                    inputNumber.append("5");
                }
            }
        });
        buttonNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("6");
                    setCursor();
                } else {
                    inputNumber.append("6");
                }
            }
        });
        buttonNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("7");
                    setCursor();
                } else {
                    inputNumber.append("7");
                }
            }
        });
        buttonNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("8");
                    setCursor();
                } else {
                    inputNumber.append("8");
                }
            }
        });
        buttonNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero() || mCurrentText.equals(mException)) {
                    inputNumber.setText("9");
                    setCursor();
                } else {
                    inputNumber.append("9");
                }
            }
        });
        buttonNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentText = inputNumber.getText().toString();
                if(checkIfZero()) {
                    return;
                } else if (mCurrentText.equals(mException)) {
                    inputNumber.setText("0");
                    setCursor();
                }
                else {
                    inputNumber.append("0");
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText("");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputNumber.getText().toString().equals("")) {
                    return;
                } else {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");
                    sign = Sign.PLUS;
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.MINUS;
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputNumber.getText().toString().equals("")) {
                    return;
                } else {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");
                    sign = Sign.MUL;
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputNumber.getText().toString().equals("")) {
                    return;
                } else {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");
                    sign = Sign.DIV;
                }
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = inputNumber.getText().toString();
                if(currentText.equals("")) {
                    return;
                } else if (inputNumber.getText().length() == 1) {
                    inputNumber.setText("");
                } else {
                    removeLastChar(currentText);
                }
            }
        });

        buttonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(inputNumber.getText().toString());
                inputNumber.setText(String.valueOf(number1*number1));
                setCursor();
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(inputNumber.getText().toString());
                inputNumber.setText(String.valueOf(Math.sqrt(number1)));
                setCursor();
            }
        });

        buttonFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsFloat) {
                    return;
                } else {
                    inputNumber.setText(inputNumber.getText() + ".");
                    mIsFloat = true;
                    setCursor();
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Float.parseFloat(inputNumber.getText().toString());
                if (sign == Sign.PLUS) {
                    result = number1 + number2;
                } else if (sign == Sign.MINUS) {
                    result = number1 - number2;
                } else if (sign == Sign.MUL) {
                    result = number1 * number2;
                } else if (sign == Sign.DIV) {
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        inputNumber.setText(mException);
                        setCursor();
                        return;
                    }
                }
                inputNumber.setText(String.valueOf(result));
                setCursor();
            }
        });
    }

    private void setCursor() { inputNumber.setSelection(inputNumber.getText().length()); }

    private void removeLastChar(String value) {
        inputNumber.setText(value.substring(0, value.length()-1));
        setCursor();
    }

    private boolean checkIfZero() {
        if (inputNumber.getText().toString().equals("0")) {
            return true;
        } else {
            return false;
        }
    }

}
