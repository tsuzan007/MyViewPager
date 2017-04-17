package com.sujan.myviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by macbookpro on 4/6/17.
 */

public class MySecondFragment extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mysecondfragment,container,false);
        textView= (TextView) view.findViewById(R.id.secondtext);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
//        MyObject myObject=getActivity().getIntent().getParcelableExtra("myobject");
//        textView.setText(myObject.getAge());

    }



    public void getFromA(MyObject object){
        textView.setText(object.getAge()+"");

    }

}
