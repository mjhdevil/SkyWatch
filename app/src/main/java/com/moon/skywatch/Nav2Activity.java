package com.moon.skywatch;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.moon.skywatch.databinding.ActivityNav2Binding;
import com.moon.skywatch.ui.gallery.GalleryFragment;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Nav2Activity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityNav2Binding binding;
    ConstraintLayout conlayout;

    int REQUEST_LOGIN = 1;
    // 문자열을 저장할 수 있는 arrayList 생성하고
    // 게시판 글 5개 저장하기!
    ArrayList<String> data;
    ArrayAdapter<String> adapter;
    int REQUEST_WRITE = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.replace(R.id.child_fragment_container, GalleryFragment.newInstance());
//        ft.commit();


//        conlayout = findViewById(R.id.conlayout);




        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DisplayMetrics display = this.getResources().getDisplayMetrics();

        int widh = display.widthPixels;
        int height = display.heightPixels;

        if(widh>height){
            Fragment1 fragment1 = new Fragment1();
            fragmentTransaction.replace(android.R.id.content, fragment1);
        }else{
            Fragment2 fragment2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content, fragment2);
        }
        fragmentTransaction.commit();

        setContentView(R.layout.fragment_gallery);



        binding = ActivityNav2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //sss
//        setSupportActionBar(binding.appBarNav2.toolbar);


//        binding.appBarNav2.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_number4, R.id.nav_report5, R.id.nav_connection6)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_nav2);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_nav2);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }




    }
}








