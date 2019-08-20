package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        SetAdapter();
    }

    private void SetAdapter() {
        ListView listView = findViewById(R.id.listView);

        String[] myArrList = new String[]{"Ivan", "Petro", "Ann"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                myArrList);

        listView.setAdapter(adapter);
    }
}
