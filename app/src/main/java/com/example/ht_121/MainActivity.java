package com.example.ht_121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void buttonOKClick(View view) {
        EditText name = findViewById(R.id.userNameInput);
        EditText email = findViewById(R.id.userEmailInput);
        TextView output = findViewById(R.id.output);
        output.setText("Подписка на рассылку успешно оформлена для пользователя " + name.getText() + " на электронный адрес " + email.getText());
    }

    public void buttonClearClick(View view) {
        EditText name = findViewById(R.id.userNameInput);
        EditText email = findViewById(R.id.userEmailInput);
        TextView output = findViewById(R.id.output);
        name.getText().clear();
        email.getText().clear();
        output.setText("");
    }
}