package ua.com.webacademy.beginnerslection8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SpinnerArrayAdapter extends ArrayAdapter<Student> {
    private int mResourceId;
    private List<Student> mStudents;
    private LayoutInflater mInflater;

    public SpinnerArrayAdapter(Context context, int resource, List<Student> students) {
        super(context, resource, students);

        this.mStudents = students;
        this.mResourceId = resource;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(convertView, position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getView(convertView, position);
    }

    private View getView(View convertView, int position) {
        convertView = mInflater.inflate(mResourceId, null);

        Student student = mStudents.get(position);
        if (student != null) {
            TextView textViewFirstName = (TextView) convertView.findViewById(R.id.textViewFirstName);
            TextView textViewLastName = (TextView) convertView.findViewById(R.id.textViewLastName);
            TextView textViewAge = (TextView) convertView.findViewById(R.id.textViewAge);

            textViewFirstName.setText(student.FirstName);
            textViewLastName.setText(student.LastName);
            textViewAge.setText(String.valueOf(student.Age));
        }

        return convertView;
    }
}

