package tech.marzoog.universityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Course_list extends AppCompatActivity {

    private ScrollView courseListScrollView;
    private TextView courseListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        courseListScrollView = findViewById(R.id.coursesListScrollView);
        courseListTextView = findViewById(R.id.coursesListTextView);

        String courses[] = {
                "Computer Science 1", "Computer Science 2",
                "Network Managment", "Software Engineering",
                "Web Programming", "Mobile App & Development",
                "Network Security", "Business Inteligence",
                "Data Structures", "Math Reasoning",
                "Computer Organization"}; //11

        String teachers[] = {
                "Mohammed Zikria", "Shahabulddain",
                "Zafar Abbas Kazimi", "Elyas Aljahni",
                "Mohammed Zikria", "Mohammed Zikria",
                "Nazeer Aldean", "Ghassen Ben Ibrahim",
                "Loay Alzubidi", "Maryous Naji",
                "Abdul Bashar"}; //11

        String days[] = {
                "UTR", "RT",
                "UT", "MW",
                "UMTWR", "UTR",
                "RT","MW",
                "UT", "MW",
                "UMTWR"}; //11

        String times[] =  {
                "08:00", "09:00",
                "09:45", "10:00",
                "11:00", "12:00",
                "01:00", "02:00",
                "03:00", "04:00",
                "05:00"};

        String locations[] = {
                "F056", "F055",
                "F054", "S064",
                "F053", "F052",
                "F053", "F052",
                "F156", "F155",
                "F120"};

        // making one String out of the arrays

        String finalString = "";

        for(int i = 0; i < courses.length; i++){
            finalString += String.format("%s%nDr.%s%n%s%n%s%n%s%n%n", courses[i], teachers[i], days[i], times[i], locations[i]);
        }

        courseListTextView.setText(finalString);




//        RecyclerView myView = findViewById(R.id.coursesRecyclerView);
//           myView.addItemDecoration();
    }
}
