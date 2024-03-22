package nxt.tinhtoanngaunguyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edtSo1, edtSo2;
    TextView textKQ;
    Button btnSoNN;
    ImageButton img1, img2, img3, img4;

    int taoSoNN(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
    void LayDL(){
        edtSo1 = findViewById(R.id.editSo1);
        edtSo2 = findViewById(R.id.editSo2);
        textKQ = findViewById(R.id.textKQ);
        btnSoNN = findViewById(R.id.btnNN);
        img1 = findViewById(R.id.imgbtn1);
        img2 = findViewById(R.id.imgbtn2);
        img3 = findViewById(R.id.imgbtn3);
        img4 = findViewById(R.id.imgbtn4);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDL();

        btnSoNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int SoNN1 = taoSoNN();
                int SoNN2 = taoSoNN();
                edtSo1.setText(String.valueOf(SoNN1));
                edtSo2.setText(String.valueOf(SoNN2));
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cong();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tru();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nhan();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chia();
            }
        });
    }
    void Cong(){
        String soThuNhat = edtSo1.getText().toString();
        String soThuHai = edtSo2.getText().toString();
        int so1 = Integer.parseInt(soThuNhat);
        int so2 = Integer.parseInt(soThuHai);
        int tong = so1 + so2;
        String KQ = String.valueOf(tong);
        textKQ.setText(KQ);
    }

    void Tru(){
        String soThuNhat = edtSo1.getText().toString();
        String soThuHai = edtSo2.getText().toString();
        int so1 = Integer.parseInt(soThuNhat);
        int so2 = Integer.parseInt(soThuHai);
        int hieu = so1 - so2;
        String KQ = String.valueOf(hieu);
        textKQ.setText(KQ);
    }

    void Nhan(){
        String soThuNhat = edtSo1.getText().toString();
        String soThuHai = edtSo2.getText().toString();
        int so1 = Integer.parseInt(soThuNhat);
        int so2 = Integer.parseInt(soThuHai);
        int tich = so1 * so2;
        String KQ = String.valueOf(tich);
        textKQ.setText(KQ);
    }

    void Chia(){
        String soThuNhat = edtSo1.getText().toString();
        String soThuHai = edtSo2.getText().toString();
        int so1 = Integer.parseInt(soThuNhat);
        int so2 = Integer.parseInt(soThuHai);
        int thuong = so1 / so2;
        String KQ = String.valueOf(thuong);
        textKQ.setText(KQ);
    }
}