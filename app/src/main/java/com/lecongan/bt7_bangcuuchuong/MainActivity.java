package com.lecongan.bt7_bangcuuchuong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText edtNhap;
    private TextView tv_kq;
    private Button btnKq;
    private List<String> arrChuoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNhap = (EditText) findViewById(R.id.edt_nhap);
        tv_kq = (TextView) findViewById(R.id.tv_kq);
        btnKq = (Button) findViewById(R.id.btnKQ);
        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(edtNhap.getText().toString());
                String chuoi = "";
                for (int i = 1; i <= 10; i++) {
                    chuoi += n + " x " + i + " = " + (n * i) + "\n";
                    tv_kq.setText(chuoi);
                }


            }
        });
    }
}
