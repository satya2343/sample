package com.example.igormfarhan.baseadapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Igor M Farhan on 04/06/2016.
 */
public class AdapterMahasiswa extends BaseAdapter{
    Context context;
    ArrayList<mahasiswa> list;

    public AdapterMahasiswa(Context c) {

        this.context = c;
        list = new ArrayList<>();


        Resources res = c.getResources();
        String[]namaMhs = res.getStringArray(R.array.namaMhs);
        String[]nimMhs = res.getStringArray(R.array.nimMhs);

        mahasiswa mahasiswa = new mahasiswa(namaMhs,nimMhs);

        int banyakData = namaMhs.length - 1;

        for(int i = 0;i<=banyakData;i++)
        {
            list.add(i,mahasiswa);
        }

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single = inflater.inflate(R.layout.single_row,parent,false);

        TextView nama = (TextView)single.findViewById(R.id.tvNama);
        TextView nim = (TextView) single.findViewById(R.id.tvNim);

        mahasiswa temp = list.get(position);

        String namaout = temp.namaMhs[position];
        String nimout = temp.nimMhs[position];

        nama.setText(namaout);
        nim.setText(nimout);

        return single;
    }


}
