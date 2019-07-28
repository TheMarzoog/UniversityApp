package tech.marzoog.universityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText userIDFild;
    private Button loginButton, signUpButton, searchForCoursesButton;
    private EditText password;

    public static String[] userData = {"Mohammed", "201957568", "useremail@email.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIDFild = findViewById(R.id.userID);
        loginButton = findViewById(R.id.loginButton);
        signUpButton = findViewById(R.id.signUpButton);
        searchForCoursesButton = findViewById(R.id.searchForCoursesButton);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userData[1] = userIDFild.getText().toString();
                Toast.makeText(MainActivity.this,String.format("%s login", userData[1]), Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, UserProfile.class));
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUp.class));
            }
        });

        searchForCoursesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Course_list.class));
            }
        });





//        loginButton.setOnClickListener(this);


        /*loginButton.setOnClickListener((v) -> {
            String usrID = userIDFild.getText().toString();
            Toast.makeText(MainActivity.this, usrID, Toast.LENGTH_LONG).show();
        });*/
    }
/*    public void onClick(View v)
    {


        //check if user & password field are not empty
        //check db if user exist, login, otherwise return error. PHP - Hassan
        Course_list();
    }
    public void Course_list()
    {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }*/
}
