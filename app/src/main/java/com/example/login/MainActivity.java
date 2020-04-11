package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    EditText user;
    EditText pass;
    Button bLog;
    Button bCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imga);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.pass);
        bLog = findViewById(R.id.btnLogin);
        bCreate = findViewById(R.id.btnCreate);

        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User = "uyen";
                String Pass = "12345";
                String tk = user.getText().toString();
                String mk = pass.getText().toString();

                if(tk.equals(User) && mk.equals(Pass))
                {
                    Toast.makeText(getApplicationContext(),"Dang nhap thanh cong",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Tai khoan hoac mat khau sai",Toast.LENGTH_LONG).show();
                }
            }
        });

        bCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SinupActivity.class);
                startActivity(intent);
            }
        });

    }
}
