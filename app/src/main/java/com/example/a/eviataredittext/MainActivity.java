package com.example.a.eviataredittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String str;
    EditText edi;
    ImageButton ib;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        edi = (EditText) findViewById(R.id.edi);

    }

    public void click(View view) {
        str = edi.getText().toString();
        txt.setText(str);
    }
}