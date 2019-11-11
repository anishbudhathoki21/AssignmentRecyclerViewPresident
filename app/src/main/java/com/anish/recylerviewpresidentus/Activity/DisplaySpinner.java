package com.anish.recylerviewpresidentus.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.anish.recylerviewpresidentus.R;

public class DisplaySpinner extends AppCompatActivity {

    TextView tvName, tvEmail, tvCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_spinner);

        tvName = findViewById(R.id.tvFullName);
        tvEmail = findViewById(R.id.tvEmail);
        tvCountry = findViewById(R.id.tvCountry);

        Bundle bundleForm = getIntent().getExtras();
        if(bundleForm != null){
            tvName.setText(bundleForm.getString("formName"));
            tvEmail.setText(bundleForm.getString("formEmail"));
            tvCountry.setText(bundleForm.getString("formCountry"));
        }
        else{
            Toast.makeText(this, "No Message", Toast.LENGTH_LONG).show();
        }
    }
}