package ntu.nxt_63131344.cau2_appdoitien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUSD, edtEURO, edtVND;
    Button btnChuyen, btnXoa;

    void LayDl(){
        edtUSD = findViewById(R.id.edtUSD);
        edtVND = findViewById(R.id.edtVND);
        edtEURO = findViewById(R.id.edtEUR);
        btnChuyen = findViewById(R.id.buttonchuyen);
        btnXoa = findViewById(R.id.btnXoa);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChuyenDoiTien();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XoaDuLieu();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDl();
    }

    void ChuyenDoiTien() {
        String strusd = edtUSD.getText().toString();

        if (strusd.isEmpty()) {
            Toast.makeText(MainActivity.this, "Vui lòng nhập số tiền USD.", Toast.LENGTH_SHORT).show();
            return;
        }
        double usd = Double.parseDouble(strusd);
        double euro = usd * 0.92525;
        double vnd = usd * 24767;

        edtEURO.setText(String.valueOf(euro));
        edtVND.setText(String.valueOf(vnd));
    }
    void XoaDuLieu() {
        edtUSD.setText("");
        edtEURO.setText("");
        edtVND.setText("");
    }

}
