package com.programacion.movil.estemanp.androidmvcapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.programacion.movil.estemanp.androidmvcapplication.View.EventListActivity;
import com.programacion.movil.estemanp.androidmvcapplication.View.LandingActivity;

public class OptionActivity extends AppCompatActivity {

    Button btnList, btnMap, btnNotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        btnList = (Button)findViewById(R.id.btnListaEventos);
        btnMap = (Button)findViewById(R.id.btnMaps);
        btnNotification = (Button)findViewById(R.id.btnNotifications);

        btnList.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){

                Intent intent = new Intent(OptionActivity.this,EventListActivity.class);
                startActivity(intent);
            }

        });

        btnMap.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){

                Intent intent = new Intent(OptionActivity.this,MapsActivity.class);
                startActivity(intent);
            }

        });

        btnNotification.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){

                Intent intent = new Intent(OptionActivity.this,MapsActivity.class);
                startActivity(intent);
            }

        });



    }


}
