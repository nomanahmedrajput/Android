package com.example.mna_rajput.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by MNA-RAJPUT on 5/15/2018.
 */

public class FragOne extends Fragment {

    Button btn;
    boolean status = false;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragone,container,false);
        btn = (Button) view.findViewById(R.id.btn_fragone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                if (!status){
                    FragTwo two = new FragTwo();
                    ft.replace(R.id.place_holder, two);
                    ft.commit();
                    status = true;
                }
            }
        });
        return view;
    }
}
