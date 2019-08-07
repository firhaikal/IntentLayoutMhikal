package com.example.intentlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity2 extends AppCompatActivity {
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        selanjutnya = (Button)findViewById(R.id.it1);
        selanjutnya.setOnClickListener((View.OnClickListener) this);
    }

}
