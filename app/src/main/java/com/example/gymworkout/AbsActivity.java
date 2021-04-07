package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AbsActivity extends AppCompatActivity {
ImageView imageviewinclinebenchsitups,imageviewhanginglegaises,imageviewdumbbellsidebends,imageviewCrunches,
        imageviewsitups,imageviewslegraises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        imageviewinclinebenchsitups= findViewById(R.id.imageviewinclinebenchsitups);
        imageviewhanginglegaises= findViewById(R.id.imageviewhanginglegaises);
        imageviewdumbbellsidebends= findViewById(R.id.imageviewdumbbellsidebends);
        imageviewCrunches= findViewById(R.id.imageviewCrunches);
        imageviewsitups= findViewById(R.id.imageviewsitups);
        imageviewslegraises= findViewById(R.id.imageviewslegraises);

//        FragmentManager fragmentManager = getSupportFragmentManager();
//      final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//      final Sit_UpsFragment myFragment = new Sit_UpsFragment();

        imageviewinclinebenchsitups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}