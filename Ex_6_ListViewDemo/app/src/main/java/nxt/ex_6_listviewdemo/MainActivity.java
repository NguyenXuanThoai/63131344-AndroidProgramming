package nxt.ex_6_listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsMonHoc; // khai bao
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hien thi du lieu len listView
        // b1: can du lieu
        // du lieu tu CDL ( SQL , noSQL, XML, ...)
        // can bien phu hop de chua dl


        dsMonHoc = new ArrayList<String>(); // khai bao cu the
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