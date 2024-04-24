package ntu.nxt_63131344.bai1_vd2_loginintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    public void QLTrangChu(View v) {
        Intent MHChinh = new Intent(this, MainActivity.class);
        startActivity(MHChinh);
    }
}
