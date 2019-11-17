package com.example.a18801.mtkuwo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 18801 on 2019/11/17.
 */

public class mainfregment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.main_page,container,false);
        return view;
    }
}
