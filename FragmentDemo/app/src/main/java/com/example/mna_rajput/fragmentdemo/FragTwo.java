package com.example.mna_rajput.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MNA-RAJPUT on 5/15/2018.
 */

public class FragTwo extends Fragment {
    TextView tv;
    boolean status = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragtwo, container, false);
        tv = (TextView) view.findViewById(R.id.tv);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                if (!status){
                    FragOne one = new FragOne();
                    ft.replace(R.id.place_holder, one);
                    ft.commit();
                    status = true;
                }
            }
        });

        return  view;
    }
}
