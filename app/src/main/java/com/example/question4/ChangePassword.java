package com.example.question4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class ChangePassword extends AppCompatActivity {
    EditText oldpwd,newpwd,rnewpwd;
    Button update;
    TextView error;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        oldpwd = findViewById(R.id.editText);
        newpwd = findViewById(R.id.editText2);
        rnewpwd =  findViewById(R.id.editText3);
        update = findViewById(R.id.button1);
        error = findViewById(R.id.textView);
        img = findViewById(R.id.back);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePassword.this, MainActivity.class);
                startActivity(intent);
            }
        });



        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newpwd.getText().toString().equals("123@123") && rnewpwd.getText().toString().equals("123@123")){
                    Intent intent = new Intent(ChangePassword.this, MainActivity.class);
                    startActivity(intent);

                }else{
                    error.setText("Insert error text");
                }
            }
        });
    }
}
