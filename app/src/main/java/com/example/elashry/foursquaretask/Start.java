package com.example.elashry.foursquaretask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.elashry.foursquaretask.Fragment.SettingsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Start extends AppCompatActivity {
    @BindView(R.id.real)
    Button realTime;
    @BindView(R.id.single)
    Button singleupdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);

        realTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Start.this,MainActivity.class);
                startActivity(i);
            }
        });

        singleupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
