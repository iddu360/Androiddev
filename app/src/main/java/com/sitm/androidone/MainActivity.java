package com.sitm.androidone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
  private TextView emailError;
  private TextView passwordError;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    emailError = findViewById(R.id.emailErrors);
    passwordError = findViewById(R.id.passwordErrors);
    Button submitButton = findViewById(R.id.loginButton);
    Button switchButton = findViewById(R.id.switchButton);
    submitButton.setOnClickListener(v -> {
      String email = Objects.requireNonNull(emailError.getText()).toString().trim();
      String password = Objects.requireNonNull(passwordError.getText()).toString().trim();
      if (email.isEmpty()) {
        emailError.setError("Email address is required");
        return;
      }
      if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
        emailError.setError("Invalid email address");
        return;
      }
      emailError.setError(null);
      if (password.isEmpty()) {
        passwordError.setError("Password is required");
        return;
      }
      if (password.length() < 8) {
        passwordError.setError("Password must be at least 8 characters long");
        return;
      }
      passwordError.setError(null);
      startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    });
    switchButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LogActivity.class)));
  }
}
