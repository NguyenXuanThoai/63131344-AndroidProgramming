package ntu.nxt_63131344.vdmysql;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db = openOrCreateDatabase("MYbook.db" // ten file
                                                        ,MODE_PRIVATE, // gioi han truy cap
                                                    null); // con tro

        // lenh tao CSDL
        String sqlTaoDB = "";
        

    }
}