package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    EditText value1, value2;
//    TextView result;
//    Button buttonPlus, buttonLess, buttonTimes, buttonDivided;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText value1 = (EditText) findViewById(R.id.value1Input);
        final EditText value2 = (EditText) findViewById(R.id.value2Input);
        final TextView result = (TextView) findViewById(R.id.result);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonLess = (Button) findViewById(R.id.buttonLess);
        Button buttonTimes = (Button) findViewById(R.id.buttonTimes);
        Button buttonDivided = (Button) findViewById(R.id.buttonDivided);

//            result.setText("Meu saco, carai");

        buttonPlus.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Double firstValue = Double.parseDouble(value1.getText().toString());
                Double secondValue = Double.parseDouble(value2.getText().toString());
                result.setText(String.valueOf(secondValue+firstValue));
            }
        });
        buttonLess.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View V){
                Double firstValue = Double.parseDouble(value1.getText().toString());
                Double secondValue = Double.parseDouble(value2.getText().toString());
                result.setText(String.valueOf(firstValue-secondValue));
            }
        });
        buttonTimes.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View V){
                Double firstValue = Double.parseDouble(value1.getText().toString());
                Double secondValue = Double.parseDouble(value2.getText().toString());
                result.setText(String.valueOf(secondValue*firstValue));
            }
        });
        buttonDivided.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View V){
                Double firstValue = Double.parseDouble(value1.getText().toString());
                Double secondValue = Double.parseDouble(value2.getText().toString());
                if(secondValue == 0){
                    result.setText("Operação inválida");
                }
                else {
                    result.setText(String.valueOf(firstValue/secondValue));
                }
            }
        });
    }
}