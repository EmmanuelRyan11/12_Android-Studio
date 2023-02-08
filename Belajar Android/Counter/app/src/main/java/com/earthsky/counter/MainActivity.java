package com.earthsky.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load(){
        hasil = findViewById(R.id.hasil);
    }
    public void btnTambah (View view){
        count++;
        hasil.setText(count+"");
    }

    public void btnKurang (View view){
        count--;
        hasil.setText(count+"");
    }
}