package ua.com.webacademy.beginnerslection8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.button:
                intent = new Intent(this, Activity2.class);
                break;
            case R.id.button2:
                intent = new Intent(this, Activity3.class);
                break;
            case R.id.button3:
                intent = new Intent(this, Activity4.class);
                break;
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
        }
        startActivity(intent);
    }
}
