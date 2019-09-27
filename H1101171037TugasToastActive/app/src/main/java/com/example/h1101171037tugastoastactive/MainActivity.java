package com.example.h1101171037tugastoastactive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount= 37;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }
    public void showToast(View view){
        Toast toast = Toat.makeText(context: this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view){
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(integer.toString(mCount));
    }
    public void coundDown(View view) {
        mCount != null)
        mShowCount.setText(Integer.toString(mCount));
    }
}
