package com.example.rent.backstackexampleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BlueActivity extends AppCompatActivity {


    Button goButton;
    TextView timeStampTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);

        goButton = (Button) findViewById(R.id.go_button);
        timeStampTV = (TextView) findViewById(R.id.dateStampTextview);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BlueActivity.this,RedActivity.class));
            }
        });

        timeStampTV.setText(SimpleDateFormat.getDateTimeInstance().format(new Date()));
    }
}
