package com.example.innocentsuta.alc4phase1;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        TextView text = (TextView)findViewById(R.id.name);

        text.setPaintFlags(text.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
