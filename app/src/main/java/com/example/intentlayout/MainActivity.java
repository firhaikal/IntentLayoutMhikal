package com.example.intentlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go = (Button)findViewById(R.id.start);
        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.start:
                Intent explicit = new Intent( MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.it1:
                Intent explicit1 = new Intent( MainActivity.this, IntentActivity.class);
                startActivity(explicit1);
                break;
            case R.id.it2:
                Intent explicit2 = new Intent( MainActivity.this, IntentActivity.class);
                startActivity(explicit2);
                break;
            case R.id.it3:
                Intent explicit3 = new Intent( MainActivity.this, IntentActivity.class);
                startActivity(explicit3);
                break;
            default:
                break;
        }
    }
}
