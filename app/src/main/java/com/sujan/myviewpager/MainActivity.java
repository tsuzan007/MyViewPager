package com.sujan.myviewpager;

import android.os.Parcelable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.Tab;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Communicator{
    ViewPager viewPager;
    TabLayout tabLayout;
    Fragment fragment;
    MyViewPagerAdapter myViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.myviewPager);
        tabLayout= (TabLayout) findViewById(R.id.mytablayout);
        tabLayout.setupWithViewPager(viewPager);
         myViewPagerAdapter=new MyViewPagerAdapter(getSupportFragmentManager());
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager.setAdapter(myViewPagerAdapter);



    }

    @Override
    public void respond(MyObject object) {
        MySecondFragment mySecondFragment=(MySecondFragment)myViewPagerAdapter.getFragment(1);
        mySecondFragment.getFromA(object);












    }

    public class MyViewPagerAdapter extends FragmentPagerAdapter {


        List<Fragment> fragmentList=new ArrayList<>();
        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            switch (position){

                case 0:
                    fragment =  new MyFirstFragment();
                    break;
                case 1:
                    fragment =  new MySecondFragment();
                    break;
                default: return null;
            }
            fragmentList.add(fragment);
            return fragment;


        }
        public Fragment getFragment(int position){
            return fragmentList.get(position);

        }

        @Override
        public int getCount() {
            return 2;

        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position==0){
                return "Tab1";
            }
            else{
                return "Tab2";
            }
        }
    }
}
