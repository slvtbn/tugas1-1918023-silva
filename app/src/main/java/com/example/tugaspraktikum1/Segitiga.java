package com.example.tugaspraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi, hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = (EditText) findViewById(R.id.input_alas);
        tinggi = (EditText) findViewById(R.id.input_tinggi);
        hitung = (Button) findViewById(R.id.btn_hitung);
        hasil = (EditText) findViewById(R.id.output_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                double alas = Double.parseDouble(alas1);
                double tinggi = Double.parseDouble(tinggi1);
                double hasil_akhir = (alas*tinggi)/2;
                String output = String.valueOf(hasil_akhir);
                hasil.setText(output.toString());
            }
        });
    }
}