package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity9 extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    ListView mListView;
    StudentsArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        SetAdapter();
    }

    private void SetAdapter() {
        mListView = (ListView) findViewById(R.id.listView);

        ArrayList<Student> myArrList = new ArrayList<>();
        myArrList.add(new Student("Ivan", "Ivanov", 22));
        myArrList.add(new Student("Petro", "Petrovich", 23));
        myArrList.add(new Student("Ann", "Semenovich", 24));

        mAdapter = new StudentsArrayAdapter(this,
                R.layout.list_item,
                myArrList);

        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Student student = mAdapter.getItem(position);

        Toast.makeText(getApplicationContext(), "Item click on " + student.FirstName, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Student student = mAdapter.getItem(position);

        Toast.makeText(getApplicationContext(), "Item long click on " + student.FirstName, Toast.LENGTH_LONG).show();

        return true;
    }
}
