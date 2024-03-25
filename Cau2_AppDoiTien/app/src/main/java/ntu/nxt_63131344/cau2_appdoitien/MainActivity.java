package ntu.nxt_63131344.cau2_appdoitien;

import static java.lang.String.format;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    @SuppressLint("DefaultLocale")
    void ChuyenDoiTien() {
        String strusd = edtUSD.getText().toString();
        String streuro = edtEURO.getText().toString();
        String strvnd = edtVND.getText().toString();

        if (!strusd.isEmpty()) {
            double usd = Double.parseDouble(strusd);
            double euro = usd * 0.92525;
            double vnd = usd * 24767;

            edtEURO.setText(String.valueOf(euro));
            edtVND.setText(String.valueOf(vnd));
        }

        if (!streuro.isEmpty()) {
            double euro = Double.parseDouble(streuro);
            double usd = euro * 1.080215;
            double vnd = euro * 26770;

            edtUSD.setText(String.format("%.3f", usd));
            edtVND.setText(String.valueOf(vnd));
        }

        if (!strvnd.isEmpty()) {
            double vnd = Double.parseDouble(strvnd);
            double usd = vnd / 24767;
            double euro = vnd * 0.00004;

            edtUSD.setText(String.format("%.3f", usd));
            edtEURO.setText(String.valueOf(euro));
        }
        if(strusd.isEmpty() && streuro.isEmpty() &&strvnd.isEmpty()){
            Toast.makeText(this, "Vui lòng nhập vào loại tiền bạn muốn chuyển!", Toast.LENGTH_SHORT).show();
        }
    }
    void XoaDuLieu() {
        edtUSD.setText("");
        edtEURO.setText("");
        edtVND.setText("");
    }

}
