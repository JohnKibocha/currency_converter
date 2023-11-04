package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View view){
        Log.d("Debug Info", "The button works.");
        EditText amountInEurosEditText = (EditText) findViewById(R.id.amountInEurosEditText);
        TextView amountInDollarsTextView = (TextView) findViewById(R.id.amountInDollarsTextView);
        String amountInEuros = amountInEurosEditText.getText().toString();
        double amountInEurosDouble = Double.parseDouble(amountInEuros);
        double amountInDollarsDouble = amountInEurosDouble * 1.3;
        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);
        amountInDollarsTextView.setText("€" + amountInEuros + " is equal to $" + amountInDollarsString);
        Toast.makeText(this, "€" + amountInEuros + " is equal to $" + amountInDollarsString, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}