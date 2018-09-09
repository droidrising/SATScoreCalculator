package com.wordpress.httpsdroidrisinglabs.satscorecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button satMain;
    private Button physics;
    private Button math2;
    private Button chem;
    private Button math1;
    private Button ush;
    private Button bio;
    private Button lit;
    private Button wh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        satMain=(Button)findViewById(R.id.sat);
        satMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
              openSAT();
            }
        });

        physics=(Button)findViewById(R.id.physicsButton);
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openPhysics();
            }
        });
        math2=(Button)findViewById(R.id.math2);
        math2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openMath2();
            }
        });

        chem=(Button)findViewById(R.id.chem);
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openChem();
            }
        });

        math1=(Button)findViewById(R.id.math1);
        math1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openMath1();
            }
        });

        ush=(Button)findViewById(R.id.ush);
        ush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openUSH();
            }
        });

        bio=(Button)findViewById(R.id.bio);
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openBio();
            }
        });

        lit=(Button)findViewById(R.id.lit);
        lit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openLit();
            }
        });

        wh=(Button)findViewById(R.id.wh);
        wh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                openWH();
            }
        });

    }
    public void openSAT(){
        Intent intent = new Intent(this, SATScreen.class);
        startActivity(intent);
    }
    public void openLit(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p="Literature";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    public void openWH(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p="World History";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    public void openPhysics(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p="Physics";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    public void openMath2(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p="Math 2";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    public void openChem(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p = "Chem";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    private void openMath1(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p = "Math 1";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    public void openUSH(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p = "US History";
        intent.putExtra("p", p);
        startActivity(intent);
    }
    private void openBio(){
        Intent intent = new Intent (this, SubjectTest.class);
        String p = "Bio E/M";
        intent.putExtra("p", p);
        startActivity(intent);
    }


}
