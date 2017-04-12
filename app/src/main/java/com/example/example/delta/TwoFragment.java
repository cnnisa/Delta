package com.example.example.delta;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Example on 4/5/2017.
 */
public class TwoFragment extends Fragment{
    String[] itemname = {
            "Museum Mpu Tantular",
            "Wisata Lumpur Lapindo",
            "Alun-alun Sidoarjo",
            "Pasar Kuliner",
            "Puspa Agro",
            "Museum Mpu Tantular",
            "Wisata Lumpur Lapindo",
            "Alun-alun Sidoarjo",
            "Pasar Kuliner",
            "Puspa Agro",
            "Museum Mpu Tantular",
            "Wisata Lumpur Lapindo",
            "Alun-alun Sidoarjo",
            "Pasar Kuliner",
            "Puspa Agro",
            "Museum Mpu Tantular",
            "Wisata Lumpur Lapindo",
            "Alun-alun Sidoarjo",
            "Pasar Kuliner",
            "Puspa Agro"
    };

    public TwoFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two,container,false);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.mylist,R.id.Itemname,itemname);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(),itemname[position],Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
