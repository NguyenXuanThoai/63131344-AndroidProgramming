package ntu.nxt_63131344.bai1_vd1_explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ManHinh2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void QuaylaiMHC(View view) {
        Intent QuaylaiMHChinh = new Intent(this, MainActivity.class);
        startActivity(QuaylaiMHChinh);
    }
}
