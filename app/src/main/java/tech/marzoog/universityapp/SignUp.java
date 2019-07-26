package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {


    private Button singUpButton;
    private EditText fullNameText, userIDText, emailText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullNameText = findViewById(R.id.NameEditText);
        userIDText = findViewById(R.id.idEditText);
        emailText = findViewById(R.id.emailEditText);
        passwordText = findViewById(R.id.passwordEditText);
        singUpButton = findViewById(R.id.singUpButton);


        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = fullNameText.getText().toString();
                String userID = userIDText.getText().toString();
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();

                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(fullname, userID, email, password);
            }
        });

    }
}
