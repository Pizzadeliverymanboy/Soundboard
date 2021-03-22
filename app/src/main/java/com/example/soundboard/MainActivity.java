package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Field[] fields = R.raw.class.getFields();


    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = findViewById(R.id.a);
        Button b = findViewById(R.id.b);
        Button c = findViewById(R.id.c);
        Button d = findViewById(R.id.d);
        Button e = findViewById(R.id.e);
        Button f = findViewById(R.id.f);
        Button g = findViewById(R.id.g);
        Button h = findViewById(R.id.h);
        Button i = findViewById(R.id.i);
        Button j = findViewById(R.id.j);
        Button k = findViewById(R.id.k);
        Button l = findViewById(R.id.l);
        Button m = findViewById(R.id.m);
        Button n = findViewById(R.id.n);
        Button o = findViewById(R.id.o);
        Button p = findViewById(R.id.p);
        Button q = findViewById(R.id.q);
        Button r = findViewById(R.id.r);
        Button s = findViewById(R.id.s);
        Button t = findViewById(R.id.t);
        Button u = findViewById(R.id.u);
        Button v = findViewById(R.id.v);
        Button w = findViewById(R.id.w);
        Button x = findViewById(R.id.x);
        Button y = findViewById(R.id.y);
        Button z = findViewById(R.id.z);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView button = findViewById(R.id.a);
                play(button);
            }
        });
    }


        public void play(TextView v) {
            player = MediaPlayer.create(this, R.raw.a);
            player.start();
        }








}
