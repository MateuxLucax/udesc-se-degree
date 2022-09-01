package dev.mateux;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import dev.mateux.model.Student;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView studentsList = findViewById(R.id.home_list);
        List<Student> students = generateContent(100);

        studentsList.setAdapter(new StudentAdapter(this, students));

        studentsList.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
        });
    }

    @NonNull
    public List<Student> generateContent(int size) {
        List<Student> content = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            content.add(new Student("student " + i, "student" + i + "@school.com"));
        }

        return content;
    }

}