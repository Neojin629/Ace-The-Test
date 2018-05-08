package com.example.android.acethetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main_Page extends AppCompatActivity {

private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page);

        button = findViewById(R.id.enter_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });


    }

    public void openMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
