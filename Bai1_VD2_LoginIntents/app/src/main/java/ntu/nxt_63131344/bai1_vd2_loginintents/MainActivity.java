package ntu.nxt_63131344.bai1_vd2_loginintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Chuyentrang = findViewById(R.id.btnLogin);

        Chuyentrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyentrangdn = new Intent(MainActivity.this, LoginActivity.class);

                startActivity(chuyentrangdn);
            }
        });
    }
}