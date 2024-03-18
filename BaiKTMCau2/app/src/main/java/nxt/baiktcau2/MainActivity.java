package nxt.baiktcau2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextTien;
    Button TinhTienTip;
    RadioButton Tip13, Tip15, Tip18;
    TextView thongbao;
    double TienTip;
    void LayTien(){
        editTextTien = (EditText) findViewById(R.id.editText);
        TinhTienTip = (Button) findViewById(R.id.tip);
        Tip13 = findViewById(R.id.muoiba);
        Tip15 = findViewById(R.id.muoilam);
        Tip18 = findViewById(R.id.muoitam);
        thongbao = findViewById(R.id.ketqua);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayTien();

        TinhTienTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!XacNhan()) {
                    return;
                }
                double tt = Double.parseDouble(editTextTien.getText().toString());
                if (Tip13.isChecked()){
                    TienTip = tt * 0.13;

                } else if (Tip15.isChecked()) {
                    TienTip = tt * 0.15;
                } else if (Tip18.isChecked()) {
                    TienTip = tt * 0.18;
                }
                thongbao.setText("Your tip will be &"+String.valueOf(TienTip));
            }
        });
    }


    private boolean XacNhan() {
        String tip = editTextTien.getText().toString();
        if (tip.isEmpty()) {
            Toast.makeText(MainActivity.this, "Vui lòng nhập vào số tiền!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


}