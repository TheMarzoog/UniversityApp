package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class CourseDetail extends AppCompatActivity {

    private TextView courseName, courseDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

       courseName = findViewById(R.id.detailCourseNameTextView);
       courseDetails = findViewById(R.id.courseDetailsTextView);

       courseName.setText("Computer Science 1");

       courseDetails.setText("Computer Science I is an introduction to programming \n" +
                       "and to the use of algorithms in designing \n" +
                       " programs. A software engineering approach \n" +
                       "to developing computer programs is stressed \n" +
                       "and object-oriented concepts are introduced.\n" +
                       " The course examines standard control\n" +
                       " structures, approaches to modularization,\n" +
                       " and the use of primitive and \n" +
                       "structured data types."
               );

    }
}
