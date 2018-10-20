package com.example.xhoana.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView xhoanaText = (TextView) findViewById(R.id.xhoanaText);
        final Button xhoanabutton = (Button) findViewById(R.id.xhoanaButton);

        xhoanabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xhoanaText.setText("Koca");
            }
        });

        xhoanaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xhoanaText.setText("Xhoana");
            }
        });


    }
}
