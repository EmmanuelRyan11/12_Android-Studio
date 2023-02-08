package com.earthsky.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    private void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void isiData() {
        siswaList = new ArrayList<>();
        siswaList.add(new Siswa("Denny Aktor JAV","Jakarta"));
        siswaList.add(new Siswa("Yuli Aktor CAV","Bogor"));
        siswaList.add(new Siswa("Anto Aktor KAV","Depok"));
        siswaList.add(new Siswa("Sredek Aktor TAV","Tangerang"));
        siswaList.add(new Siswa("Denny Aktor JAV","Jakarta"));
        siswaList.add(new Siswa("Yuli Aktor CAV","Bogor"));
        siswaList.add(new Siswa("Anto Aktor KAV","Depok"));
        siswaList.add(new Siswa("Sredek Aktor TAV","Tangerang"));
        siswaList.add(new Siswa("Denny Aktor JAV","Jakarta"));
        siswaList.add(new Siswa("Yuli Aktor CAV","Bogor"));
        siswaList.add(new Siswa("Anto Aktor KAV","Depok"));
        siswaList.add(new Siswa("Sredek Aktor TAV","Tangerang"));
        siswaList.add(new Siswa("Denny Aktor JAV","Jakarta"));
        siswaList.add(new Siswa("Yuli Aktor CAV","Bogor"));
        siswaList.add(new Siswa("Anto Aktor KAV","Depok"));
        siswaList.add(new Siswa("Sredek Aktor TAV","Tangerang"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("Yuli Kato Aktor CAV","Bogor"));
        adapter.notifyDataSetChanged();
    }
}