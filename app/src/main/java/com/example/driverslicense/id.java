package com.example.driverslicense;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class id extends AppCompatActivity {
    TextView n,na,g,d,w,h,add,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);
        n = (TextView)findViewById(R.id.name);
        na = (TextView)findViewById(R.id.nation);
        g = (TextView)findViewById(R.id.gender);
        d = (TextView)findViewById(R.id.dob);
        w = (TextView)findViewById(R.id.weight);
        h = (TextView)findViewById(R.id.height);
        add = (TextView)findViewById(R.id.address);
        b = (TextView)findViewById(R.id.blood);
        c = (TextView)findViewById(R.id.condition);

        n.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));
        na.setText(getIntent().getStringExtra("EdiTtEXTvALUE1"));
        g.setText(getIntent().getStringExtra("EdiTtEXTvALUE2"));
        d.setText(getIntent().getStringExtra("EdiTtEXTvALUE3"));
        w.setText(getIntent().getStringExtra("EdiTtEXTvALUE4"));
        h.setText(getIntent().getStringExtra("EdiTtEXTvALUE5"));
        add.setText(getIntent().getStringExtra("EdiTtEXTvALUE6"));
        b.setText(getIntent().getStringExtra("EdiTtEXTvALUE7"));
        c.setText(getIntent().getStringExtra("EdiTtEXTvALUE8"));

    }
}