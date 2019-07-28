package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class Course_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        String Courses[] = {"Computer Science 1", "Computer Science 2", "Network Managment", "Software Engineering", "Web Programming",
                "Mobile App & Development", "Network Security", "Business Inteligence", "Data Structures", "Math Reasoning", "Computer Organization"};
        String Teachers[] = {"Mohammed Zikria", "Shahabulddain", "Zafar Abbas Kazimi", "Elyas Aljahni", "Zafar Abbas Kazimi",
                "Mohammed Zikria", "Nazeer Aldean", "Ghassen Ben Ibrahim", "Loay Alzubidi", "Maryous Naji", "Abdul Bashar"};
        String Days[] = {"UTR", "RT", "UT", "MW", "UMTWR"};
        String Times[] =  {"08:00", "09:00", "09:45", "10:00", "11:00", "12:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00"};
        String Locations[] = {"F056", "F055", "F054", "S064", "F053", "F052", "F156", "F155", "F120"};


        RecyclerView myView = findViewById(R.id.coursesRecyclerView);
        //   myView.addItemDecoration();
    }
}
