package com.degtyar.sergey.shader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.input)
    EditText inputView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        inputView.setText("It's Work!!!");
    }

    protected void onClick(View view)
    {
        String text = inputView.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            Toast.makeText(this, "EnterValidData",Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(this, SecondActivity.class);
        //before startActivity
        intent.putExtra(SecondActivity.EXTRA_NAME,text);
        startActivity(intent);
        //finishAffinity();
    }
}
