package com.selab.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    private int count=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        final TextView countView=findViewById(R.id.count);
        Button btnAdd=findViewById(R.id.btn_add);
        Button btnReduce=findViewById(R.id.btn_reduce);
        Button btnClear=findViewById(R.id.btn_clear);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countView.setText(Integer.toString(++count));
            }
        });
        btnReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countView.setText(Integer.toString(--count));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                countView.setText(Integer.toString(count));
            }
        });
    }
}
