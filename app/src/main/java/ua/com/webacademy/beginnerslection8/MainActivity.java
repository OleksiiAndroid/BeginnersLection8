package ua.com.webacademy.beginnerslection8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.button4:
                intent = new Intent(this, Activity5.class);
                break;
            case R.id.button5:
                intent = new Intent(this, Activity6.class);
                break;
            case R.id.button6:
                intent = new Intent(this, Activity7.class);
                break;
            case R.id.button7:
                intent = new Intent(this, Activity8.class);
                break;
            case R.id.button8:
                intent = new Intent(this, Activity9.class);
                break;
            case R.id.button9:
                intent = new Intent(this, Activity10.class);
                break;
            case R.id.button10:
                intent = new Intent(this, Activity11.class);
                break;
            case R.id.button11:
                intent = new Intent(this, Activity12.class);
                break;
            case R.id.button12:
                intent = new Intent(this, Activity13.class);
                break;
            case R.id.button13:
                intent = new Intent(this, Activity14.class);
                break;
        }
        startActivity(intent);
    }
}
