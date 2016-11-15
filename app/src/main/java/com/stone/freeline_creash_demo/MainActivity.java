package com.stone.freeline_creash_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.goto_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLogin();
            }
        });
    }

    private void gotoLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
