package com.sujan.myviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by macbookpro on 4/6/17.
 */

public class ThirdFragment extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.thirdfragment,container,false);
        textView= (TextView) view.findViewById(R.id.thirdtext);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }
}
