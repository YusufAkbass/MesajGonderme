package com.example.mesajgnderme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<model>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LİsteDoldur();
        tanimla();
    }
    public void LİsteDoldur()
    {
        list=new ArrayList<>();
        model m1 = new model("murat","00000000000");
        model m2 = new model("basar","11111111111");
        model m3 = new model("ege","22222222222");
        model m4 = new model("tamer","33333333333");
        model m5 = new model("erdi","444444444444");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
    }
    public void tanimla()
    {
        ListView listView =(ListView) findViewById(R.id.mesajlist);
        adapter adp =new adapter(list,this,this);
        listView.setAdapter(adp);
    }
}