package com.example.sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText UserField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserField = findViewById(R.id.editTextName);
        UserField.setOnClickListener(view -> {
            if("Enter username".equals(UserField.getText().toString()))
            {
                UserField.setText("");
            }
        });
    }
}