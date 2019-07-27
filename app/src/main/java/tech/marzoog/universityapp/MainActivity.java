package tech.marzoog.universityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText userIDFild;
    private Button loginButton, signUpButton, searchForCoursesButton;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIDFild = findViewById(R.id.userID);
        loginButton = findViewById(R.id.loginButton);
        signUpButton = findViewById(R.id.singUpButton);
        searchForCoursesButton = findViewById(R.id.searchForCoursesButton);



        loginButton.setOnClickListener(this);


        /*loginButton.setOnClickListener((v) -> {
            String usrID = userIDFild.getText().toString();
            Toast.makeText(MainActivity.this, usrID, Toast.LENGTH_LONG).show();
        });*/
    }
    public void onClick(View v)
    {


        //check if user & password field are not empty
        //check db if user exist, login, otherwise return error. PHP - Hassan
        Course_list();
    }
    public void Course_list()
    {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}
