package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        SetAdapter1();
        SetAdapter2();
        SetAdapter3();
    }

    private void SetAdapter1() {
        Spinner spinner = findViewById(R.id.spinner);

        ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map;

        map = new HashMap<>();
        map.put("Name", "Ivan");
        myArrList.add(map);

        map = new HashMap<>();
        map.put("Name", "Petro");
        myArrList.add(map);

        map = new HashMap<>();
        map.put("Name", "Ann");
        myArrList.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this, myArrList, android.R.layout.simple_list_item_1, new String[]{"Name"},
                new int[]{android.R.id.text1});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private void SetAdapter2() {
        Spinner spinner = findViewById(R.id.spinner2);

        Student[] myArrList = new Student[]{
                new Student("Ivan", "Ivanov", 22),
                new Student("Petro", "Petrovich", 23),
                new Student("Ann", "Semenovich", 24)
        };

        ArrayAdapter<Student> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, myArrList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private void SetAdapter3() {
        Spinner spinner = findViewById(R.id.spinner3);

        ArrayList<Student> myArrList = new ArrayList<>();
        myArrList.add(new Student("Ivan", "Ivanov", 22));
        myArrList.add(new Student("Petro", "Petrovich", 23));
        myArrList.add(new Student("Ann", "Semenovich", 24));

        SpinnerArrayAdapter adapter = new SpinnerArrayAdapter(this, R.layout.list_item, myArrList);

        spinner.setAdapter(adapter);
    }
}
