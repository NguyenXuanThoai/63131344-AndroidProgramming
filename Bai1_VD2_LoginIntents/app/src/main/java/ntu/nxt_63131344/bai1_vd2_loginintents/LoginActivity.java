package ntu.nxt_63131344.bai1_vd2_loginintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText Ten, MatKhau, EMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Ten = findViewById(R.id.edtUserName);
        MatKhau = findViewById(R.id.edtPass);
        EMail = findViewById(R.id.edtEmail);
    }

    public void XNDangNhap(View v) {
        String username = Ten.getText().toString();
        String password = MatKhau.getText().toString();
        String email = EMail.getText().toString();

        if(username.equals("xuanthoai") && password.equals("123") && email.equals("nxthoai@gmail.com")) {
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

            Intent MHHome = new Intent(this, HomeActivity.class);
            startActivity(MHHome);
        } else {
            Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
        }
    }
}
