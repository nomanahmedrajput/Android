package com.example.mna_rajput.finalyearproject;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   final ArrayList<String> sms = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_receiver_activity);

        final ListView lv = (ListView)findViewById(R.id.SmsList);

        if(fetchInbox() != null){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fetchInbox());
            lv.setAdapter(adapter);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    String myData = lv.getItemAtPosition(i).toString();

                    Intent intent = new Intent(MainActivity.this, ReplyActivity.class);
                    intent.putExtra("MsgKey",myData);
                    startActivity(intent);
                }
            });
        }
    }

    public ArrayList<String> fetchInbox(){

        Uri uri = Uri.parse("content://sms/inbox");
        Cursor cursor = getContentResolver().query(uri, new String[]{"_id","address","date","body"},null,null,null);
        cursor.moveToFirst();
        while (cursor.moveToNext()){
            String address = cursor.getString(1);
            String body = cursor.getString(3);

            sms.add("Sender => "+address+"\n \n"+body);
        }
        return sms;
    }
}