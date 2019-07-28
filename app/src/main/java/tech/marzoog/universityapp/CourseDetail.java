package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class CourseDetail extends AppCompatActivity {

    private RecyclerView courses, instracters, coursesNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        courses = findViewById(R.id.coursesRecyclerView);
        instracters = findViewById(R.id.instractersRecyclerView);
        coursesNumbers = findViewById(R.id.coursesNumbersRecyclarView);

    }
}
