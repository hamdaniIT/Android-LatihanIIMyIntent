package com.example.latihaniimyintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity,btnMoveWithDataActivity,btnDialNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity=findViewById(R.id.btn_move_activity);
        btnMoveWithDataActivity=findViewById(R.id.btn_move_activity_data);
        btnDialNumber=findViewById(R.id.btn_dial_number);

        btnMoveActivity.setOnClickListener(this);
        btnMoveWithDataActivity.setOnClickListener(this);
        btnDialNumber.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent= new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent= new Intent(MainActivity.this,MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Hamdani");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,24);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber="082350321212";
                Intent dialPhoneIntent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

        }

    }
}
