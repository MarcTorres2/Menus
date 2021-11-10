package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public boolean onCreateOptionsMenu(Menu menu) { //Crea el menu

        //Mostra el menu
        MenuInflater inflater = getMenuInflater(); //findById para Menu
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuAbout: startActivity(new Intent(this, About.class)); break; /* El menu About executa una nova activitat definida a About.java*/
            case R.id.action_settings: /*De moment no fa res*/ break;
        }

        return super.onOptionsItemSelected(item);
    }
}
