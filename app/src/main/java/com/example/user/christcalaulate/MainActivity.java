package com.example.user.christcalaulate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button B7;
    Button[] btns = new Button[15];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B7 = (Button)findViewById(R.id.b7);
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
        btns[10] = (Button)findViewById(R.id.b10);
        btns[11] = (Button)findViewById(R.id.b11);
        btns[12] = (Button)findViewById(R.id.b12);
        btns[13] = (Button)findViewById(R.id.b13);
        btns[14] = (Button)findViewById(R.id.b14);

        for (int i = 0; i < 15; i++) {
            btns[i].setOnClickListener(clickListener);}
    }

    View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {
            for(int i = 0;i<15;i++) {
                btns[i].setBackgroundColor(getResources().getColor(R.color.colorOriginal));
            }
            v.setBackgroundColor(getResources().getColor(R.color.colorPink));
        }
        };

}
