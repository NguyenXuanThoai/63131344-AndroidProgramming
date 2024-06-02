package ntu.nxt_63131344.onthick;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {
    EditText editText_met;
    EditText editText_kilomet;
    Button btnChuyen;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);

        // Tìm điều khiển
        editText_met = viewCau1.findViewById(R.id.txtmet);
        editText_kilomet = viewCau1.findViewById(R.id.txtkm);
        btnChuyen  = viewCau1.findViewById(R.id.btnchuyen);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuMet = editText_met.getText().toString();
                String duLieuKiloMet = editText_kilomet.getText().toString();

                if (!duLieuMet.isEmpty()) {
                     // met sang km
                    try {
                        double met = Double.parseDouble(duLieuMet);
                        double kilomet = met / 1000;
                        editText_kilomet.setText(String.valueOf(kilomet));
                        Toast.makeText(viewCau1.getContext(), "m -> km", Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(viewCau1.getContext(), "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                } else if (!duLieuKiloMet.isEmpty()) {
                    // Đổi từ km sang met
                    try {
                        double kilomet = Double.parseDouble(duLieuKiloMet);
                        double met = kilomet * 1000;
                        editText_met.setText(String.valueOf(met));
                        Toast.makeText(viewCau1.getContext(), "km -> m", Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(viewCau1.getContext(), "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(viewCau1.getContext(), "Vui lòng nhập dữ liệu để chuyển đổi", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewCau1;
    }
}
