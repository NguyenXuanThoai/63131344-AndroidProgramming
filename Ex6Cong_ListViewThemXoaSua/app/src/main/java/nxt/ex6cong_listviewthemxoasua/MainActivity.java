package nxt.ex6cong_listviewthemxoasua;

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
    ArrayList<String> dsMonHoc; // khai bao
    Button btnThem, btnSua;

    EditText editTextMH;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hien thi du lieu len listView
        // b1: can du lieu
        // du lieu tu CDL ( SQL , noSQL, XML, ...)
        // can bien phu hop de chua dl


        dsMonHoc = new ArrayList<String>(); // khai bao cu the

        btnThem = (Button) findViewById(R.id.buttonMH);
        btnSua = (Button) findViewById(R.id.btnSua);

        editTextMH = (EditText) findViewById(R.id.editTextMH);
        // them du lieu ( tu 1 nguon or cho san ( hard-code)
        dsMonHoc.add("Toán");
        dsMonHoc.add("Anh");
        dsMonHoc.add("Văn");
        dsMonHoc.add("Hóa");
        dsMonHoc.add("Lý");
        dsMonHoc.add("Sinh");
        // b2: tao adapter
        ArrayAdapter<String> adapterMH;
        adapterMH = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsMonHoc);
        // b3: gan vao DK hien thi ListView
        // b3.1: tim
        ListView lvDSMH = findViewById(R.id.lvDSMH);
        // b3.2 gan
        lvDSMH.setAdapter(adapterMH);
        // b3.3 lang nghe va xu ly SK nguoi dung tuong tac
        lvDSMH.setOnItemClickListener(BLNVXL);

        // Them
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc = editTextMH.getText().toString();
                dsMonHoc.add(monhoc);
                adapterMH.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Ban da them thanh cong",Toast.LENGTH_SHORT).show();
            }
        });

        // Sua
        lvDSMH.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editTextMH.setText(dsMonHoc.get(i));
                vitri = i;
            }
        }));

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsMonHoc.set(vitri, editTextMH.getText().toString());
                adapterMH.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Ban da sua thanh cong",Toast.LENGTH_SHORT).show();
            }
        });

        // Xoa
        lvDSMH.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                dsMonHoc.remove(position);
                adapterMH.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Ban da xoa thanh cong",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
    // tao 1 bo lang nghe va XLSK onItemClick, dat vao 1 bine
    AdapterView.OnItemClickListener BLNVXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
            // i la vi tri cua pt dc click

            // hien thi nhanh 1 thong bao ( hien vi tri cua pt )
            // Toast.makeText(MainActivity.this,"Ban vua click vao i"+String.valueOf(i), Toast.LENGTH_SHORT).show();
            // hien gia tri cua pt i
            String strTenMH = dsMonHoc.get(i);
            Toast.makeText(MainActivity.this,strTenMH, Toast.LENGTH_SHORT).show();
        }
    };
}