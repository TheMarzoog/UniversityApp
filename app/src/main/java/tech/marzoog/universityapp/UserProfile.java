package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    private TextView userNameTextView, emailTextView, IDTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        userNameTextView = findViewById(R.id.userNameTextView);
        emailTextView = findViewById(R.id.emailEditText);
        IDTextView = findViewById(R.id.IDTextView);

        userNameTextView.setText(MainActivity.userData[0]);
        emailTextView.setText(MainActivity.userData[2]);
        IDTextView.setText(MainActivity.userData[1]);



    }




}
