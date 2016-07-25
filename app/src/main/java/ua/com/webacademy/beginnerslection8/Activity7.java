package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        SetAdapter();
    }

    private void SetAdapter() {
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<Student> myArrList = new ArrayList<>();
        myArrList.add(new Student("Ivan", "Ivanov", 22));
        myArrList.add(new Student("Petro", "Petrovich", 23));
        myArrList.add(new Student("Ann", "Semenovich", 24));

        StudentsArrayAdapter adapter = new StudentsArrayAdapter(this,
                R.layout.list_item,
                myArrList);

        listView.setAdapter(adapter);
    }
}