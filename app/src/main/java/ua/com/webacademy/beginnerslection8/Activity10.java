package ua.com.webacademy.beginnerslection8;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity10 extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        SetAdapter();
    }

    private void SetAdapter() {
        mListView = findViewById(R.id.listView);
        mListView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        String[] myArrList = new String[]{"Ivan", "Petro", "Ann"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_single_choice, android.R.id.text1,
                myArrList);

        mListView.setAdapter(adapter);
    }

    public void OnClick(View v) {
        int position = mListView.getCheckedItemPosition();
        String item = (String) mListView.getAdapter().getItem(position);

        Toast.makeText(getApplicationContext(), "Selected item: " + item, Toast.LENGTH_LONG).show();
    }
}
