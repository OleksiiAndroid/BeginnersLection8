package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        SetAdapter();
    }

    private void SetAdapter() {
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map;

        map = new HashMap<>();
        map.put("FirstName", "Ivan");
        map.put("LastName", "Ivanov");
        map.put("Age", "22");
        myArrList.add(map);

        map = new HashMap<>();
        map.put("FirstName", "Petro");
        map.put("LastName", "Petrov");
        map.put("Age", "23");
        myArrList.add(map);

        map = new HashMap<>();
        map.put("FirstName", "Ann");
        map.put("LastName", "Semenovich");
        map.put("Age", "24");
        myArrList.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this, myArrList,
                R.layout.list_item,
                new String[]{"FirstName", "LastName", "Age"},
                new int[]{R.id.textViewFirstName, R.id.textViewLastName, R.id.textViewAge});

        listView.setAdapter(adapter);
    }
}
