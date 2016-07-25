package ua.com.webacademy.beginnerslection8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentsArrayAdapter extends ArrayAdapter<Student> {
    private int mResourceId;
    private List<Student> mStudents;
    private LayoutInflater mInflater;

    public StudentsArrayAdapter(Context context, int resource, List<Student> students) {
        super(context, resource, students);

        this.mStudents = students;
        this.mResourceId = resource;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mResourceId, null);

        Student student = mStudents.get(position);

        ((TextView) convertView.findViewById(R.id.textViewFirstName)).setText(student.FirstName);
        ((TextView) convertView.findViewById(R.id.textViewLastName)).setText(student.LastName);
        ((TextView) convertView.findViewById(R.id.textViewAge)).setText(String.valueOf(student.Age));

        return convertView;
    }
}

