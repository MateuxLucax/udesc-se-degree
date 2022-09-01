package dev.mateux;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import dev.mateux.model.Student;

public class StudentAdapter extends BaseAdapter {

    private final List<Student> students;
    private final Context context;

    StudentAdapter(Context context, List<Student> students) {
        this.students = students;
        this.context = context;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.student_adapter_item, parent, false);
        Student student = students.get(position);
        TextView studentName = (TextView) view.findViewById(R.id.student_name);
        TextView studentEmail = (TextView) view.findViewById(R.id.student_email);
        LinearLayout listItem = (LinearLayout) view.findViewById(R.id.student_list_item);

        if(position % 2 == 0)
            listItem.setBackgroundColor(Color.parseColor("#F5F5F5"));

        studentName.setText(student.getName());
        studentEmail.setText(student.getEmail());
        return view;
    }
}
