package com.example.LBSTest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt01;
    private Button bt02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        bt01 = (Button) findViewById(R.id.bt_way1);
        bt02 = (Button) findViewById(R.id.bt_way2);
        bt01.setOnClickListener(this);
        bt02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_way1:
                Intent intent1 = new Intent(SelectActivity.this,LbsActivity.class);
                startActivity(intent1);
                break;
            case R.id.bt_way2:
                Intent intent2= new Intent(SelectActivity.this,MainActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
