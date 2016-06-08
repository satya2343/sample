package com.example.igormfarhan.baseadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity{
    ListView listMahasiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMahasiswa = (ListView)findViewById(R.id.lvMahasiswa);

        AdapterMahasiswa myAdapter = new AdapterMahasiswa(this);

        listMahasiswa.setAdapter(myAdapter);
    }
}
