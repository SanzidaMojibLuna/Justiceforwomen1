package com.example.nusratjahan.justiceforwomen1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static android.support.design.widget.NavigationView.*;

public class lawyerhomepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout lawyerdraw;
    private ActionBarDrawerToggle lawyerabt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyerhomepage);
        lawyerdraw=(DrawerLayout)findViewById(R.id.lawyerdraw);
        lawyerabt=new ActionBarDrawerToggle(this,lawyerdraw,R.string.open,R.string.close);
        lawyerdraw.addDrawerListener(lawyerabt);
        lawyerabt.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navview=(NavigationView)findViewById(R.id.navView);
        navview.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(lawyerabt.onOptionsItemSelected(item)){
            //int id=item.getItemId();
            //if(id==R.id.appreq){
               // Intent myintent= new Intent(lawyerhomepage.this,lappreq.class);
               // startActivity(myintent);
                return true;
            }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.appreq){
            Intent myintent= new Intent(this,lappreq.class);
            startActivity(myintent);
        }
        else if(id==R.id.approval){
            Intent myintent= new Intent(this,lapproval.class);
            startActivity(myintent);
        }
        else if(id==R.id.consult){
            Intent myintent= new Intent(this,lconsult.class);
            startActivity(myintent);
        }
        else if(id==R.id.set){
            Intent myintent= new Intent(this,lsettings.class);
            startActivity(myintent);
        }
        else if(id==R.id.logo){
            Intent myintent= new Intent(this,llogout.class);
            startActivity(myintent);
        }
        return false;
    }
}
