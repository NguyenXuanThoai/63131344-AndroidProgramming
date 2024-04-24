package ntu.nxt_63131344.bai1_vd1_explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenMH(View view) {
        // Tạo 1 Intent để chuyển đến màn hình thứ 2
        Intent ChuyenMH = new Intent(this, ManHinh2.class);
        // Thực hiện chuyển
        startActivity(ChuyenMH);
    }
}