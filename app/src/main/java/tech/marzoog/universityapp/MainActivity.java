package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userIDFild;
    private Button loginButton;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIDFild = findViewById(R.id.userID);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener((v) -> {
            String usrID = userIDFild.getText().toString();
            Toast.makeText(MainActivity.this, usrID, Toast.LENGTH_LONG).show();
        });
    }
}
