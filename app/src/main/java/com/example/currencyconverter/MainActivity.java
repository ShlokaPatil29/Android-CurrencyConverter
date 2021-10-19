package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b;
    EditText e;
    RadioButton us,di,eu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    public void add(View v) {
        LinearLayout l1 = (LinearLayout) findViewById(R.id.l1);
        t=(TextView)findViewById(R.id.res);
        b=(Button)findViewById(R.id.btn1);
        e=(EditText)findViewById(R.id.edt1);
        //Convert string value into double
        Double a=Double.parseDouble(String.valueOf(e.getText()));
        us=(RadioButton)findViewById(R.id.usd);
        eu=(RadioButton)findViewById(R.id.eur);
        di=(RadioButton)findViewById(R.id.din);
        if(us.isChecked()) {
            t.setText("Rs. "+a+" is "+(a*0.014)+" US Dollars");
            Toast.makeText(MainActivity.this,(a*0.014)+" US Dollars", Toast.LENGTH_SHORT).show(); }
        else if(di.isChecked()) {
            t.setText("Rs. "+a+" is "+(a*0.0042)+" Dinars");
            Toast.makeText(MainActivity.this,(a*0.0042)+" US Dollars", Toast.LENGTH_SHORT).show(); }
        else if(eu.isChecked()) {
            t.setText("Rs. "+a+" is "+(a*0.013)+" Euros");
            Toast.makeText(MainActivity.this,(a*0.013)+" US Dollars", Toast.LENGTH_SHORT).show(); }
        else {
            t.setText("Please select an option.");
            Toast.makeText(MainActivity.this,"Please select an option.", Toast.LENGTH_SHORT).show();  }  } }
