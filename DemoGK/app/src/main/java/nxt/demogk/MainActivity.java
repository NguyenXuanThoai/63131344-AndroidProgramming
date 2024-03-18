package nxt.demogk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextUserName, editTextPassword;
    Button Login;

    void LayDL(){
        editTextUserName = (EditText) findViewById(R.id.username);
        editTextPassword = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDL();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xulydangnhap();
            }
        });
    }
    public void Xulydangnhap() {
        String username = editTextUserName.getText().toString();
        String password = editTextPassword.getText().toString();
        if(username.equals("nguyenxuanthoai")&& password.equals("10092003")) {
            Toast.makeText(this, "User and Password is correct", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}