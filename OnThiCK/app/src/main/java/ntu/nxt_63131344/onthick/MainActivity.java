package ntu.nxt_63131344.onthick;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import ntu.nxt_63131344.onthick.R.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottom = findViewById(R.id.bottomNavigationView);
        bottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selected  = null;
                int itemID = item.getItemId();
                if (itemID == R.id.nv_cau1){
                    selected = new HomeFragment();
                } else if (itemID == R.id.nv_cau2){
                    selected = new Cau1Fragment();
                } else if (itemID == R.id.nv_cau3){
                    selected = new Cau2Fragment();
                } else if (itemID == R.id.nv_cau4){
                    selected = new Cau3Fragment();
                } else if (itemID == R.id.nv_cau5){
                    selected = new Cau4Fragment();
                }
                if (selected != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace,selected).commit();
                }
                return true;
            }
        });
    }
}