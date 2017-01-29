package com.example.mainpchan.csc201_ch726_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            EditText list1input = (EditText) findViewById(R.id.lis1inut);
            EditText list2input = (EditText) findViewById(R.id.lis2input);


            TextView result = (TextView) findViewById(R.id.result);


            String[] list1temp = list1input.getText().toString().split(" ");
            int list1len = Integer.parseInt(list1temp[0]);

            int[] list1 = new int[list1len];
            for (int i = 1; i <= (list1len - 1); i++) {
                list1[i] = Integer.parseInt(list1temp[(i + 1)]);
            }

            String[] list2temp = list2input.getText().toString().split(" ");
            int list2len = Integer.parseInt(list1temp[0]);

            int[] list2 = new int[list2len];
            for (int i = 1; i <= (list1len - 1); i++) {
                list2[i] = Integer.parseInt(list2temp[(i + 1)]);
            }

            if (list1len != list2len) {
                result.setText("Two lists are not strictly identical");
            } else if (equals(list1, list2)) {
                result.setText("Two lists are strictly identical");
            } else {
                result.setText("Two lists are not strictly identical");
            }


        }


        public boolean equals(int[] list1, int[] list2) {

            for (int i = 0; i <= (list1.length - 1); i++) {
                if (list1[i] != list2[i]) {
                    return false;
                }
            }


            return true;
        }
    };


}