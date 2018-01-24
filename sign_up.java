package com.example.kdmani.thedoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        b2 = (Button)findViewById(R.id.button2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(sign_up.this, login.class);
                startActivity(next);
                Toast.makeText(getApplicationContext(),
                        "Registered Successfully!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}


