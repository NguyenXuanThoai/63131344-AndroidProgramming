package nxt.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // gan view tuong ung file nay
        setContentView(R.layout.activity_main);
    }

    // day la bo lang nghe va xu ly su kien click len nut tinh tong
    public void XuLyCong(View view){
        // tim, tham chiu den dieu khien tren tep XML
       EditText editSoA = findViewById(R.id.editA);
       EditText editSoB = findViewById(R.id.editB);
       EditText editKQ = findViewById(R.id.editKQ);
       // lay du lieu 2 so a va b
        String strA = editSoA.getText().toString();
        String strB = editSoB.getText().toString();
        // chuyen du lieu sang dang so
            int a = Integer.parseInt(strA);
            int b = Integer.parseInt(strB);
        // tinh toan theo yeu cau
            int  tong = a + b;
            String strtong = String.valueOf(tong); // chuyen sang dang chuoi
        // hien ket qua ra man hinh
            editKQ.setText(strtong);

    }
}