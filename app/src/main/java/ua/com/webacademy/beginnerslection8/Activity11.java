package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity11 extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        SetAdapter();
    }

    private void SetAdapter() {
        mListView = findViewById(R.id.listView);
        mListView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        String[] myArrList = new String[]{"Ivan", "Petro", "Ann"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice, android.R.id.text1,
                myArrList);

        mListView.setAdapter(adapter);
    }

    public void OnClick(View v) {
        SparseBooleanArray itemPositions = mListView.getCheckedItemPositions();

        String names = "";
        for (int i = 0; i < itemPositions.size(); i++) {
            if (itemPositions.get(i)) {
                names += " " +  mListView.getAdapter().getItem(i);
            }
        }

        Toast.makeText(getApplicationContext(), "Selected item: " + names, Toast.LENGTH_LONG).show();
    }
}

