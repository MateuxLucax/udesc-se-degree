package dev.mateux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.button);
        EditText editTextUser = findViewById(R.id.Username);
        EditText editTextPassword = findViewById(R.id.password);

        loginBtn.setOnClickListener((View view) -> {
            String user = editTextUser.getText().toString();
            String password = editTextPassword.getText().toString();

            if (password.contains("foo")) {
                Toast.makeText(view.getContext(), "Authorized - " + user, Toast.LENGTH_SHORT).show();
            } else  {
                Toast.makeText(view.getContext(), "Unauthorized", Toast.LENGTH_SHORT).show();
            }
            startActivity(new Intent(this, HomeActivity.class));
        });

    }
}