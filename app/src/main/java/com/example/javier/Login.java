package com.example.javier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {


    EditText edtEmail, edtClave;
    Button btnentrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edtEmail=(EditText)findViewById(R.id.edtEmail);
        edtClave=(EditText)findViewById(R.id.edtClave);

        btnentrar=(Button)findViewById(R.id.btnentrar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  usu = edtEmail.getText().toString();
                String pas = edtClave.getText().toString();
                if (usu.equals("diana")&& pas.equals("123")) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(Login.this, "Datos Corectos", Toast.LENGTH_LONG).show();
                    edtEmail.setText("");
                    edtClave.setText("");
                    finish();

                }else {

                    edtEmail.setText("");
                    edtClave.setText("");
                    Toast.makeText(Login.this, "Datos Incorectos", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}


