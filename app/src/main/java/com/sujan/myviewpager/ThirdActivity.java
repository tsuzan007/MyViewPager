package com.sujan.myviewpager;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent returnintent=getIntent();
        String name=returnintent.getStringExtra("name");
        MyObject newmyobject=returnintent.getParcelableExtra("myobject");
    }

    @Override
    protected void onResume() {
        super.onResume();

       ThirdFragment thirdFragment=new ThirdFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.thirdactivitylayout,thirdFragment);
        fragmentTransaction.commit();
    }
}
