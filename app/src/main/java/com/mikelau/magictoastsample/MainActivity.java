package com.mikelau.magictoastsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mikelau.magictoast.MagicToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MagicToast.showSuccess(getApplicationContext(), "HELLO WORLD");
    }
}
