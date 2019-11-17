package com.example.a18801.mtkuwo;

import android.support.v4.app.Fragment;
import android.media.Image;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   ImageView home;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home=(ImageView)findViewById(R.id.main_image);
        home.setOnClickListener(this);
        replaceFragment(new mainfregment());
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.hide();
        }
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.main_image:
                replaceFragment(new mainfregment());
                break;
            default:
                break;
        }
    }
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.main_layout,fragment);
        transaction.commit();
    }
}
