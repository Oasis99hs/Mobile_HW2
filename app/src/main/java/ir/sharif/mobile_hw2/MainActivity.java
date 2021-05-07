package ir.sharif.mobile_hw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import ir.sharif.mobile_hw2.fragments.BookmarkFragment;
import ir.sharif.mobile_hw2.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar toolbar = getSupportActionBar();

        BottomNavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("ResourceType")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.settings :
                        getSupportFragmentManager().beginTransaction().add(R.xml.root_preferences , SettingsFragment.class , null).commit();
                        return true;
                    case R.id.bookmark :
                        getSupportFragmentManager().beginTransaction().add(R.id.bookmark_fragment , BookmarkFragment.class , null).commit();
                        return true;
                    case R.id.map :

                        return true;
                }
                return false;
            }
        });
    }
}