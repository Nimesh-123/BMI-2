package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView h1, t2,t1,r1;
    EditText h2, w2;

    float hight, weight, n = 1, ans;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        h1 = findViewById(R.id.h1);
        h2 = findViewById(R.id.h2);
        t2 = findViewById(R.id.t2);
        w2 = findViewById(R.id.w2);
        t1 = findViewById(R.id.t1);
        r1 = findViewById(R.id.r1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hight = Float.parseFloat(h2.getText().toString());
                weight = Float.parseFloat(w2.getText().toString());

                Float h = hight / 100;

                ans = weight / (h * h);

                if (ans < 18.3) {
                    r1.setText(" Weight");
                    t1.setText("" + ans);
                } else if (ans >= 18.5 && ans < 25) {
                    r1.setText(" Weight");
                    t1.setText("" + ans);
                } else if (ans >= 25 && ans < 30) {
                    r1.setText(" Weight");
                    t1.setText("" + ans);
                } else {
                    r1.setText("");
                    t1.setText("" + ans);
                }
            }


        });


    }
}