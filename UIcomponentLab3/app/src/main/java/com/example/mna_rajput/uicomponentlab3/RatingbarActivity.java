package com.example.mna_rajput.uicomponentlab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingbarActivity extends AppCompatActivity {


    RatingBar ratingbar1;
    Button btRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);

        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        ratingbar1 = (RatingBar) findViewById(R.id.ratingBar);
        btRating = (Button) findViewById(R.id.btRating);
        //Performing action on Button Click
        btRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Getting the rating and displaying it on the toast
                String rating = String.valueOf(ratingbar1.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
