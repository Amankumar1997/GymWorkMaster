package com.example.gymworkout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView absButton, backButton,bicepsButton,calfButton,chestButton,forearmsButton,legsButton,shoulderButton,tricepsButton,cardioButton;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        absButton= findViewById(R.id.absButton);
        backButton= findViewById(R.id.backButton);
        bicepsButton= findViewById(R.id.bicepsButton);
        calfButton= findViewById(R.id.calfButton);
        chestButton= findViewById(R.id.chestButton);
        forearmsButton= findViewById(R.id.forearmsButton);
        legsButton= findViewById(R.id.legsButton);
        shoulderButton= findViewById(R.id.shoulderButton);
        tricepsButton= findViewById(R.id.tricepsButton);
        cardioButton= findViewById(R.id.cardioButton);
        toolbar=findViewById(R.id.toolbar);
        drawerLayout=findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.navigationView);


        absButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(DashboardActivity.this,AbsActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,BackActivity.class));
            }
        });

        setSupportActionBar(toolbar);


        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.excersize:
                        Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
                        startActivities(intent);
                        Toast.makeText(DashboardActivity.this, "excrsize", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;
                    case R.id.workout:
                        Toast.makeText(DashboardActivity.this, "excrsizeq", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.setting:
                        Toast.makeText(DashboardActivity.this, "excrsize", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }


                return true;
            }

            private void startActivities(Intent intent) {
            }
        });








    }
}