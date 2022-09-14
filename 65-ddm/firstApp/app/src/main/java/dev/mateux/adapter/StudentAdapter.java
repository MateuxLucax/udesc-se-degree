package dev.mateux.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.mateux.R;
import dev.mateux.model.Student;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private final List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_adapter_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = students.get(position);
        holder.getStudentEmail().setText(student.getEmail());
        holder.getStudentName().setText(student.getName());
        holder.getStudentPicture().setImageDrawable(student.getPicture());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView studentName;
        private final TextView studentEmail;
        private final ImageView studentPicture;

        public ViewHolder(View view) {
            super(view);
            studentName = view.findViewById(R.id.student_name);
            studentEmail = view.findViewById(R.id.student_email);
            studentPicture = view.findViewById(R.id.student_picture);

            view.setOnClickListener(clickView -> {
                Toast.makeText(clickView.getContext(), studentName.getText() + " - " + studentEmail.getText(), Toast.LENGTH_SHORT).show();
            });
        }

        public TextView getStudentEmail() {
            return studentEmail;
        }

        public TextView getStudentName() {
            return studentName;
        }

        public ImageView getStudentPicture() {
            return studentPicture;
        }
    }
}
