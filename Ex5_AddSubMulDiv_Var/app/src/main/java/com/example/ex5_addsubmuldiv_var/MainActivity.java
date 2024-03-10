package com.example.ex5_addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // tim view
        TimView();

        // gan cac bo lang nghe
        //btnCong.setOnClickListener(BLN_XLC);
        btnTru.setOnClickListener(BLN_XLT);
        btnNhan.setOnClickListener(BLN_XLN);
        btnChia.setOnClickListener(BLN_XLCH);

        // VD bo lang nghe an danh
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code xu ly cong
                String strSoA = edtSoA.getText().toString();
                String strSoB = edtSoB.getText().toString();
                float soA = Float.parseFloat(strSoA);
                float soB = Float.parseFloat(strSoB);
                float tong = soA + soB;
                String strKQ = String.valueOf(tong);
                KQ.setText(strKQ);
            }
        });

    }

    // tao bo lang nghe va xu ly SK

//    View.OnClickListener BLN_XLC = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            // code xu ly cong
//            String strSoA = edtSoA.getText().toString();
//            String strSoB = edtSoB.getText().toString();
//            float soA = Float.parseFloat(strSoA);
//            float soB = Float.parseFloat(strSoB);
//            float tong = soA + soB;
//            String strKQ = String.valueOf(tong);
//            KQ.setText(strKQ);
//        }
//    };

    View.OnClickListener BLN_XLT = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // code xu ly tru
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            float soA = Float.parseFloat(strSoA);
            float soB = Float.parseFloat(strSoB);
            float hieu = soA - soB;
            String strKQ = String.valueOf(hieu);
            KQ.setText(strKQ);
        }
    };

    View.OnClickListener BLN_XLN = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // code xu ly nhan
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            float soA = Float.parseFloat(strSoA);
            float soB = Float.parseFloat(strSoB);
            float tich = soA * soB;
            String strKQ = String.valueOf(tich);
            KQ.setText(strKQ);
        }
    };

    View.OnClickListener BLN_XLCH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // code xu ly chia
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            float soA = Float.parseFloat(strSoA);
            float soB = Float.parseFloat(strSoB);
            float thuong = soA / soB;
            String strKQ = String.valueOf(thuong);
            KQ.setText(strKQ);
        }
    };
    void TimView(){
        edtSoA = findViewById(R.id.edtSo1);
        edtSoB =findViewById(R.id.edtSo2);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        KQ = (TextView) findViewById(R.id.edtKQ);
    }

    // khai bao cac doi tuong tuong ung voi cac dieu khien ( View can thao tac )
    EditText edtSoA, edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView KQ;
}