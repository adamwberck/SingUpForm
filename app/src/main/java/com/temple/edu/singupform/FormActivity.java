package com.temple.edu.singupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        final EditText editName  = findViewById(R.id.edit_name);
        final EditText editEmail = findViewById(R.id.edit_email);
        final EditText editPass  = findViewById(R.id.edit_pass);
        final EditText editPass2 = findViewById(R.id.edit_pass2);
        Button saveButton = findViewById(R.id.button_save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();
                String email = editEmail.getText().toString().trim();
                String pass = editPass.getText().toString().trim();
                String pass2 = editPass2.getText().toString().trim();
            }
        });
    }
}
