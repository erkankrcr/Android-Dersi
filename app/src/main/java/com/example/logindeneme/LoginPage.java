package com.example.logindeneme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginPage extends Activity {

    @BindView(R.id.recycler) RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        ButterKnife.bind(this);

        String[] arr = {"Medipol","ITU","ODTU"};
/*
ListAdapter adapter = new ArrayAdapter(this,R.layout.login_list_item,R.id.listTextView,arr);

        Loginlist.setAdapter(adapter);

 */


    OrnekAdapter adapter = new OrnekAdapter(getLayoutInflater());
    recycler.setLayoutManager(new LinearLayoutManager(this));
    recycler.setAdapter(adapter);





    }
}
