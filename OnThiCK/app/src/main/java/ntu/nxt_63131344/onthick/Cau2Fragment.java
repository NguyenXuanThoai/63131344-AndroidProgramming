package ntu.nxt_63131344.onthick;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau2Fragment extends Fragment {
    // khai bao cac doi tuong gan voi dieu khien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDK(){
        editTextSo1 =  (EditText)findViewById(R.id.edtSo1);
        editTextSo2 =  (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong =(Button) findViewById(R.id.btnCong);
        nutTru =(Button) findViewById(R.id.btnTru);
        nutNhan =(Button) findViewById(R.id.btnNhan);
        nutChia =(Button) findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDK();
        // gan bo lang nghe SK va code xu ly cho tung nut
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }

    // xu li cong
    void XuLyCong(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float tong = soA + soB;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }

    void XuLyTru(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float hieu = soA - soB;
        String chuoiKQ = String.valueOf(hieu);
        editTextKQ.setText(chuoiKQ);
    }

    void XuLyNhan(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float tich = soA * soB;
        String chuoiKQ = String.valueOf(tich);
        editTextKQ.setText(chuoiKQ);
    }

    void XuLyChia(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float thuong = soA / soB;
        String chuoiKQ = String.valueOf(thuong);
        editTextKQ.setText(chuoiKQ);
    }
}