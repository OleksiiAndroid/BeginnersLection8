package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        SetAdapter();
    }

    private void SetAdapter() {
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map;

        map = new HashMap<>();
        map.put("Name", "Ivan");
        map.put("Age", "22");
        myArrList.add(map);

        map = new HashMap<>();
        map.put("Name", "Petro");
        map.put("Age", "23");
        myArrList.add(map);

        map = new HashMap<>();
        map.put("Name", "Ann");
        map.put("Age", "24");
        myArrList.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this, myArrList,
                android.R.layout.simple_list_item_2,
                new String[]{"Name", "Age"},
                new int[]{android.R.id.text1, android.R.id.text2});

        listView.setAdapter(adapter);
    }
}
