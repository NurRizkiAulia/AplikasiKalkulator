package id.ac.poliban.mi.aulia.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etAngkaPertama = findViewById(R.id.etAngkaPertama);
        EditText etAngkaKedua = findViewById(R.id.etAngkaKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btClear = findViewById(R.id.btClear);
        TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(v -> {
            double a = Double.parseDouble(etAngkaPertama.getText().toString());
            double b = Double.parseDouble(etAngkaKedua.getText().toString());
            double hasill = a+b;

            tvHasil.setText(String.valueOf(hasill));

        });

        btKali.setOnClickListener(v -> {
            double a = Double.parseDouble(etAngkaPertama.getText().toString());
            double b = Double.parseDouble(etAngkaKedua.getText().toString());
            double hasill = a*b;

            tvHasil.setText(String.valueOf(hasill));
    });

        btKurang.setOnClickListener(v -> {
            double a = Double.parseDouble(etAngkaPertama.getText().toString());
            double b = Double.parseDouble(etAngkaKedua.getText().toString());
            double hasill = a-b;

            tvHasil.setText(String.valueOf(hasill));

    });
        btBagi.setOnClickListener(v -> {
            double a = Double.parseDouble(etAngkaPertama.getText().toString());
            double b = Double.parseDouble(etAngkaKedua.getText().toString());
            double hasill = a/b;

            tvHasil.setText(String.valueOf(hasill));
    });

        btClear.setOnClickListener(v -> {
            etAngkaPertama.getText().clear();
            etAngkaKedua.getText().clear();
            tvHasil.setText("HASIL");
    });

    }
}
