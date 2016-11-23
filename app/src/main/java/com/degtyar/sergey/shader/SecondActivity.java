package com.degtyar.sergey.shader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by student on 14.11.2016.
 */

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    @BindView(R.id.output)
    TextView outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String text = intent.getStringExtra(EXTRA_NAME);
        startActivity(intent);
    }
}
