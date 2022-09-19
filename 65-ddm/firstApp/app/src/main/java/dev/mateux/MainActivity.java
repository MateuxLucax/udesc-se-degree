package dev.mateux;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import dev.mateux.activity.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.main_login_button);
        EditText editTextUser = findViewById(R.id.main_username);
        EditText editTextPassword = findViewById(R.id.main_password);

        loginBtn.setOnClickListener(view -> {
            String user = editTextUser.getText().toString();
            String password = editTextPassword.getText().toString();

            if (!user.isEmpty() && password.equals("hooray")) {
                startActivity(new Intent(this, HomeActivity.class).putExtra("user", user));
            } else  {
                Toast.makeText(view.getContext(), "Unauthorized", Toast.LENGTH_SHORT).show();
            }
        });
    }
}