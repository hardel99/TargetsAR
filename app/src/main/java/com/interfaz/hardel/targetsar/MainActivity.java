package com.interfaz.hardel.targetsar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.iniciemos);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /*Intent unity = new Intent(this, unityClassName.class);
        startActivity(unity);*/
    }
}
