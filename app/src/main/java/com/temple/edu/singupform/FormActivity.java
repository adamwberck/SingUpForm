package com.temple.edu.singupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        final LinearLayout formLayout = findViewById(R.id.layout_form);
        final TextView textInfo = findViewById(R.id.text_info);
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
                if(name.isEmpty() || email.isEmpty() || pass.isEmpty() || pass2.isEmpty()){
                    Toast.makeText(FormActivity.this,R.string.enter_all_info,
                            Toast.LENGTH_SHORT).show();
                }
                else if(!pass.equals(pass2)){
                    Toast.makeText(FormActivity.this,R.string.pass_error_no_match,
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    String welcome = getString(R.string.welcome_string,name);
                    textInfo.setText(welcome);
                    formLayout.setVisibility(View.GONE);
                }
            }
        });
    }
}
