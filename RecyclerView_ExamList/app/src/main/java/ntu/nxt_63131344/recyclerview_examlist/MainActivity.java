package ntu.nxt_63131344.recyclerview_examlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView view;
    ArrayList<ExamData> ds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.recyclerView);
        ds = new ArrayList<>();
        ds.add(new ExamData("First exam", "May 23, 2015", "Best Of Luck"));
        ds.add(new ExamData("Second Exam", "June 09, 2015", "b of l"));
        ds.add(new ExamData("My Test Exam", "April 27, 2017", "This is testing exam .."));
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(new Image(ds, this));
    }
}