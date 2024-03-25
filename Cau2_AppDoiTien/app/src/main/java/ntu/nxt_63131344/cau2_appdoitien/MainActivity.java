package ntu.nxt_63131344.cau2_appdoitien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUSD, edtEURO, edtVND;
    Button btnChuyen, btnXoa;

    void LayDl(){
        edtUSD = findViewById(R.id.edtUSD);
        edtVND = findViewById(R.id.edtVND);
        edtEURO = findViewById(R.id.edtEUR);
        btnChuyen = findViewById(R.id.buttonchuyen);
        btnXoa = findViewById(R.id.btnXoa);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDl();
    }
}