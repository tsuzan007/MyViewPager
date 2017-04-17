package com.sujan.myviewpager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by macbookpro on 4/6/17.
 */

public class MyFirstFragment extends Fragment {
   EditText nameeditText;
    EditText ageeditText;
    EditText gendereditText;
    Button button;
    Button button1;
    Communicator c;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.myfirstfragment,container,false);
        nameeditText= (EditText) view.findViewById(R.id.nameeditText);
        ageeditText= (EditText) view.findViewById(R.id.ageeditText);
        gendereditText= (EditText) view.findViewById(R.id.gendereditText);
        button= (Button) view.findViewById(R.id.send);
        button1= (Button) view.findViewById(R.id.thirdbutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MyObject myObject=new MyObject(nameeditText.getText().toString(),
                        Integer.parseInt(ageeditText.getText().toString()),
                        gendereditText.getText().toString());
                Intent mintent=new Intent(getActivity(),ThirdActivity.class);
                mintent.putExtra("myobject",myObject);
                mintent.putExtra("name","Sujan");
                startActivity(mintent);


            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MyObject myObject=new MyObject(nameeditText.getText().toString(),
                        Integer.parseInt(ageeditText.getText().toString()),
                        gendereditText.getText().toString());


                c.respond(myObject);
//                Intent intent=new Intent();
//                intent.putExtra("myobject",myObject);
//                startActivityForResult(intent,1);


            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c=(Communicator) getActivity();
    }
}
