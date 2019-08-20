package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        SetAdapter();
    }

    private void SetAdapter() {
        Spinner spinner = findViewById(R.id.spinner);

        ArrayList<Student> myArrList = new ArrayList<>();
        myArrList.add(new Student("Ivan", "Ivanov", 22));
        myArrList.add(new Student("Petro", "Petrovich", 23));
        myArrList.add(new Student("Ann", "Semenovich", 24));

        final SpinnerArrayAdapter adapter = new SpinnerArrayAdapter(this, R.layout.list_item, myArrList);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Student student = adapter.getItem(position);

                Toast.makeText(getApplicationContext(), "Selected " + student.FirstName, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
