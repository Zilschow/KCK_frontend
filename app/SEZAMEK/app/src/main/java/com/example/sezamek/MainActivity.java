package com.example.sezamek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;

    private RecyclerView recyclerView;
    private ImageView imageView;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);



        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.openNavDrawer, R.string.closeNavDrawer
        );

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        if (savedInstanceState != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DaneFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_dane);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_dane:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DaneFragment()).commit();
                break;
            case R.id.nav_kategorie:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new KategorieFragment()).commit();
                break;
            case R.id.nav_koszyk:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new KoszykFragment()).commit();
                break;
            case R.id.nav_historia:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HistoriaFragment()).commit();
                break;
            case R.id.nav_zamowienia:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ZamowieniaFragment()).commit();
                break;
            case R.id.nav_godziny:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GodzinyFragment()).commit();
                break;
            case R.id.nav_kontakt:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new KontaktFragment()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}