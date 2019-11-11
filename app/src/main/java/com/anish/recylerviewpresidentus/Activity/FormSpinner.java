package com.anish.recylerviewpresidentus.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.anish.recylerviewpresidentus.R;

public class FormSpinner extends AppCompatActivity {
    EditText etName, etEmail;
    Spinner spinner;
    Button btnRegister;

    public static final String religion[] = {
            "Hindu",
            "Buddhist",
            "Christian",
            "Islam"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_spinner);

        initView();

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                religion);

        spinner.setAdapter(adapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, country;
                name = etName.getText().toString();
                email = etEmail.getText().toString();
                country = spinner.getSelectedItem().toString();

                Intent intentForm = new Intent(FormSpinner.this, DisplaySpinner.class);
                intentForm.putExtra("formName", name);
                intentForm.putExtra("formEmail", email);
                intentForm.putExtra("formCountry", country);
                startActivity(intentForm);
            }
        });
    }


    private void initView() {
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        btnRegister = findViewById(R.id.btnRegister);
        spinner = findViewById(R.id.spinner);
    }
}