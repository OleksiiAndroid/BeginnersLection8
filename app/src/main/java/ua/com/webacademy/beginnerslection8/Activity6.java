package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        SetAdapter();
    }

    private void SetAdapter() {
        ListView listView = (ListView) findViewById(R.id.listView);

        Student[] myArrList = new Student[]{
                new Student("Ivan", "Ivanov", 22),
                new Student("Petro", "Petrovich", 23),
                new Student("Ann", "Semenovich", 24)
        };

        ArrayAdapter<Student> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                myArrList);

        listView.setAdapter(adapter);
    }
}
