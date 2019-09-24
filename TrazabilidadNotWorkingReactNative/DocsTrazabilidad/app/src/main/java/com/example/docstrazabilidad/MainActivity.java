package com.example.docstrazabilidad;


import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;


import android.os.PersistableBundle;


import com.example.docstrazabilidad.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
    }
}

