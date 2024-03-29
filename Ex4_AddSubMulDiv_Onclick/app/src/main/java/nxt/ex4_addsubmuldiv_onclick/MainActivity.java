package nxt.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // khai bao cac doi tuong gan voi dieu khien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDK();
    }
    void TimDK(){
        editTextSo1 =  (EditText)findViewById(R.id.edtSo1);
        editTextSo2 =  (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong =(Button) findViewById(R.id.btnCong);
        nutTru =(Button) findViewById(R.id.btnTru);
        nutNhan =(Button) findViewById(R.id.btnNhan);
        nutChia =(Button) findViewById(R.id.btnChia);

    }
    // xu li cong
    public void XuLyCong(View v){
        // code xu ly cong
        // B1. lay du lieu 2 so
        // B1.1 tim editText so 1 va 2

        // B1.2 lay du lieu tu 2 dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tinh toan
        float tong = soA + soB;
        // B3 in ket qua
        // B3.1 tim EditText ket qua

        // B3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tong);
        // B3.3 gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);

    }

    public void XuLyTru(View v){
        // code xu ly tru
        // B1. lay du lieu 2 so
        // B1.1 tim editText so 1 va 2

        // B1.2 lay du lieu tu 2 dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tinh toan
        float hieu = soA - soB;
        // B3 in ket qua
        // B3.1 tim EditText ket qua

        // B3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(hieu);
        // B3.3 gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }

     public void XuLyNhan(View v){
        // code xu ly nhan
        // B1. lay du lieu 2 so
        // B1.1 tim editText so 1 va 2

        // B1.2 lay du lieu tu 2 dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tinh toan
        float tich = soA * soB;
        // B3 in ket qua
        // B3.1 tim EditText ket qua

        // B3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tich);
        // B3.3 gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyChia(View v){
        // code xu ly chia
        // code xu ly cong
        // B1. lay du lieu 2 so
        // B1.1 tim editText so 1 va 2

        // B1.2 lay du lieu tu 2 dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tinh toan
        float thuong = soA / soB;
        // B3 in ket qua
        // B3.1 tim EditText ket qua

        // B3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(thuong);
        // B3.3 gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
}