package com.example.user.christcalaulate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] btns = new Button[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns[0] = (Button)findViewById(R.id.b0);
        btns[1] = (Button)findViewById(R.id.b1);
        btns[2] = (Button)findViewById(R.id.b2);
        btns[3] = (Button)findViewById(R.id.b3);
        btns[4] = (Button)findViewById(R.id.b4);
        btns[5] = (Button)findViewById(R.id.b5);
        btns[6] = (Button)findViewById(R.id.b6);
        btns[7] = (Button)findViewById(R.id.b7);
        btns[8] = (Button)findViewById(R.id.b8);
        btns[9] = (Button)findViewById(R.id.b9);


        for (int i = 0; i < 10; i++) {
            btns[i].setOnClickListener(clickListener);}
    }

    View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {
            for(int i = 0;i<10;i++) {
                btns[i].setBackgroundColor(getResources().getColor(R.color.colorOriginal));
            }
            v.setBackgroundColor(getResources().getColor(R.color.colorPink));
        }
        };

}
