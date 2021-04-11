package com.example.loginmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements LoginView {
    LoginPresenter loginPresenter;
    LoginView loginView;
    View loginButton;
    EditText username;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
        button = findViewById(R.id.login);
        loginPresenter=new LoginPresenterImpl(this);
        button.setOnClickListener(view -> {

            loginPresenter.onHandleLogin(username.getText().toString(),password.getText().toString());
        });
    }

    @Override
    public void onSuccess() {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onError(String errorMassage) {
        Toast.makeText(this, errorMassage, Toast.LENGTH_SHORT).show();

    }
}