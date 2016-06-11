package com.example.igormfarhan.baseadapter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity  {
    ListView listMahasiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMahasiswa = (ListView)findViewById(R.id.lvMahasiswa);

        AdapterMahasiswa myAdapter = new AdapterMahasiswa(this);

        listMahasiswa.setAdapter(myAdapter);

        listMahasiswa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"save",Toast.LENGTH_SHORT).show();
            }
        });
    }



}
