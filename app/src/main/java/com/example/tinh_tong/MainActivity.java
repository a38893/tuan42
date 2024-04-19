package com.example.tinh_tong;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button bt1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.demo);
        txt2 = findViewById(R.id.demo2);
        bt1 = findViewById(R.id.demoxn);
        tv1 = findViewById(R.id.demokq);

        bt1.setOnClickListener(v->{
            tinh_tong();
        });

    }
    private void tinh_tong() {
        String str1 = txt1.getText().toString();
        float so1;
        so1 = Float.parseFloat(str1);
        String str2 = txt2.getText().toString();
        float so2;
        so2 = Float.parseFloat(str2);
        float tong = so1+ so2;

        tv1.setText(String.valueOf(tong));
    }
}