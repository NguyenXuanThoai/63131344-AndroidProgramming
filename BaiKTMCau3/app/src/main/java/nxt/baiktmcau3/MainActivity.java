package nxt.baiktmcau3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtGT, edtitem;
    Button btnThem, btnSua, btnXoa;
    ArrayList<String> DS;
    ListView lvDS;
    int vitri = -1;

    void LayDl(){
        edtitem = findViewById(R.id.edititem);
        edtGT = findViewById(R.id.editgt);
        btnThem = findViewById(R.id.buttonAdd);
        btnSua = findViewById(R.id.buttonEdit);
        btnXoa = findViewById(R.id.buttonDel);
        DS = new ArrayList<String>();
        lvDS = findViewById(R.id.LVDS);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDl();
        DS.add("Content");
        DS.add("Graphics");
        DS.add("Hardware");
        DS.add("Media");
        DS.add("NFC");
        DS.add("OS");
        DS.add("Preference");

        ArrayAdapter<String> adapterDS;
        adapterDS = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,DS);

        lvDS.setAdapter(adapterDS);
        lvDS.setOnItemClickListener(BLN);

    }

    AdapterView.OnItemClickListener BLN = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String strDS = parent.getItemAtPosition(position).toString();
            vitri = position;
            edtitem.setText(String.valueOf(position));
            edtGT.setText(strDS);
            edtitem.setEnabled(true);
        }
    };
}