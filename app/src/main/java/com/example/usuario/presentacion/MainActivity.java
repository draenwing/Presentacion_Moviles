package com.example.usuario.presentacion;

import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"Estudiante de IsI",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
    }

    @Override
   protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Desarrollo de aplicaciones Moviles",Toast.LENGTH_LONG).show();
    }

}
