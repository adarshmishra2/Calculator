package com.example.abhishekpc.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}
    public void onButtonClick(View v) {
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);
        Button rest = (Button) findViewById(R.id.results);

        int no1 = Integer.parseInt(txt1.getText().toString());
        int no2 = Integer.parseInt(txt2.getText().toString());

        int sum = no1 + no2;
        rest.setText(Integer.toString(sum));

    }

    public void onButtonsub(View v) {
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);
        Button rest = (Button) findViewById(R.id.results);

        int no1 = Integer.parseInt(txt1.getText().toString());
        int no2 = Integer.parseInt(txt2.getText().toString());

        int subt = no1 - no2;
        rest.setText(Integer.toString(subt));
    }
    public void onButtonmul(View v) {
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);
        Button rest = (Button) findViewById(R.id.results);

        int no1 = Integer.parseInt(txt1.getText().toString());
        int no2 = Integer.parseInt(txt2.getText().toString());

        int mult = no1 * no2;
        rest.setText(Integer.toString(mult));
    }
    public void onButtondiv(View v) {
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);
        Button rest = (Button) findViewById(R.id.results);

        float no1 = Float.parseFloat(txt1.getText().toString());
        float no2 = Float.parseFloat(txt2.getText().toString());

        float divt = no1 / no2;
        rest.setText(Float.toString(divt));
    }
}



