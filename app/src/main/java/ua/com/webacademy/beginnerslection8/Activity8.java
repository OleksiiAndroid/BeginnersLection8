package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        SetAdapter();
    }

    private void SetAdapter() {
        ListView listView = findViewById(R.id.listView);

        ArrayList<Student> myArrList = new ArrayList<>();
        myArrList.add(new Student("Ivan", "Ivanov", 22));
        myArrList.add(new Student("Petro", "Petrovich", 23));
        myArrList.add(new Student("Ann", "Semenovich", 24));

        final StudentsArrayAdapter adapter = new StudentsArrayAdapter(this,
                R.layout.list_item,
                myArrList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = adapter.getItem(position);

                Toast.makeText(getApplicationContext(), "Item click on " + student.FirstName, Toast.LENGTH_LONG).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = adapter.getItem(position);

                Toast.makeText(getApplicationContext(), "Item long click on " + student.FirstName, Toast.LENGTH_LONG).show();

                return true;
            }
        });
    }
}
