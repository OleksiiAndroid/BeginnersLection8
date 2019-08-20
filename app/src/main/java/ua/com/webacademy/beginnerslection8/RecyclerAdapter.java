package ua.com.webacademy.beginnerslection8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.StudentViewHolder> {
    private ArrayList<Student> mStudents;
    private LayoutInflater mInflater;

    private OnItemClickListener Listener;

    public RecyclerAdapter(android.content.Context context, ArrayList<Student> students) {
        this.mStudents = students;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = mInflater.inflate(R.layout.list_item, parent, false);

        StudentViewHolder viewHolder = new StudentViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, final int i) {
        Student student = mStudents.get(i);

        holder.mTextViewFirstName.setText(student.FirstName);
        holder.mTextViewLastName.setText(student.LastName);
        holder.mTextViewAge.setText(String.valueOf(student.Age));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Listener != null) {
                    Listener.onItemClick(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStudents.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.Listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }


    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView mTextViewFirstName;
        TextView mTextViewLastName;
        TextView mTextViewAge;

        public StudentViewHolder(View view) {
            super(view);

            mTextViewFirstName = view.findViewById(R.id.textViewFirstName);
            mTextViewLastName = view.findViewById(R.id.textViewLastName);
            mTextViewAge = view.findViewById(R.id.textViewAge);
        }
    }
}
