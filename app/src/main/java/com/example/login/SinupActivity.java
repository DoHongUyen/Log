package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SinupActivity extends AppCompatActivity {

    Button btn;
    ImageView imga;
    EditText fn;
    EditText ln;
    EditText mail;
    EditText p1;
    EditText p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinup);

        btn = findViewById(R.id.signup);
        imga = findViewById(R.id.GoBackIcon);
        fn = findViewById(R.id.firstname);
        ln = findViewById(R.id.Lastname);
        mail = findViewById(R.id.email);
        p1 = findViewById(R.id.pass1);
        p2 = findViewById(R.id.paas2);

        imga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /*if()
               {
                   Toast.makeText(getApplicationContext(),"Dang ky thanh cong",Toast.LENGTH_LONG).show();
              }
                else {
                   Toast.makeText(getApplicationContext(),"Nhap lai thong tin",Toast.LENGTH_LONG).show();
                }*/
            }
        });

    }
}
