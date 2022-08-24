package dev.mateux;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView = (ListView) findViewById(R.id.home_list);
        List<String> list = generateContent(100);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        listView.setAdapter(dataAdapter);
    }

    public List<String> generateContent(int size) {
        List<String> content = new ArrayList<>();
        for (int i = 1; i <= size; i++) content.add("Item " + i);

        return content;
    }

}