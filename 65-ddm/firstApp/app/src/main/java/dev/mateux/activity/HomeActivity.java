package dev.mateux.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.mateux.R;
import dev.mateux.adapter.StudentAdapter;
import dev.mateux.model.Student;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView studentsList = findViewById(R.id.home_list);
        List<Student> students = generateContent(99999);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        studentsList.setLayoutManager(layoutManager);
        studentsList.setAdapter(new StudentAdapter(students));
    }

    @NonNull
    public List<Student> generateContent(int size) {
        List<Student> content = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            Drawable picture = ContextCompat.getDrawable(this, i % 2 == 0 ? R.drawable.happy_img : R.drawable.sad);
            content.add(new Student("student " + i, "student" + i + "@school.com", picture));
        }

        return content;
    }

}