package com.mussa1.myfacebook;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class feedfb extends AppCompatActivity
{

    ImageView topImage;
    BottomNavigationView bottomNavigationView;
    com.mussa1.myfacebook.home home = new home();
    notifications notificationss = new notifications();
    Menu menu = new Menu();

    private ViewPager viewPager;
    private int[] images = {R.drawable.fixify1, R.drawable.fixify6, R.drawable.fixify4};
    private int currentPage = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedfb);


        getSupportFragmentManager().beginTransaction().replace(R.id.cont, home).commit();



        bottomNavigationView = findViewById(R.id.navbarr);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.navigation_home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.cont, home).commit();
                    return true;
                } else if (menuItem.getItemId() == R.id.navigation_notifications) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.cont, notificationss).commit();
                    return true;
                } else if (menuItem.getItemId() == R.id.navigation_menu) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.cont, menu).commit();
                    return true;
                }
                return false;
            }
        });
    }


}