package com.fbmoll.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //changeResultField();
        changeTextSize();
        changeTextColor();
    }

    /*private void changeResultField() {
        EditText text_field = (EditText) findViewById(R.id.text);
        text_field.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                TextView result = (TextView) findViewById(R.id.result);
                EditText text_field = (EditText) findViewById(R.id.text);
                result.setText(text_field.getText());
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
    }*/

    private void changeTextSize() {
        final Button button = findViewById(R.id.change_size);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ProgressBar bar = (SeekBar) findViewById(R.id.sb_size);
                int value = bar.getProgress();
                TextView result = (TextView) findViewById(R.id.result);
                EditText text_field = (EditText) findViewById(R.id.text);
                result.setText(text_field.getText());
                result.setTextSize(value);
            }
        });
    }

    private void changeTextColor() {
        final Button button = findViewById(R.id.change_color);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ProgressBar red = (SeekBar) findViewById(R.id.sb_red);
                ProgressBar green = (SeekBar) findViewById(R.id.sb_green);
                ProgressBar blue = (SeekBar) findViewById(R.id.sb_blue);
                int value_red = red.getProgress();
                int value_green = green.getProgress();
                int value_blue = blue.getProgress();
                TextView result = (TextView) findViewById(R.id.result);
                result.setTextColor(Color.rgb(value_red,value_green,value_blue));
            }
        });
    }
}