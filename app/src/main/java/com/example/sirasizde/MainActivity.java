package com.example.sirasizde;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextMaas,editTextYas;
    Button btn;
    TextView textViewSonuc;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMaas = findViewById(R.id.maas);
        editTextYas = findViewById(R.id.yas);
        textViewSonuc = findViewById(R.id.sonuc);
        btn = findViewById(R.id.hesapla);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                Personel personel  = new Personel();
                personel.setYas(yas);
                int maas = Integer.parseInt(editTextMaas.getText().toString());
                personel.setMaas(maas);
                textViewSonuc.setText("Yaş: "+personel.getYas()+" Maaş: "+personel.getMaas());
            }
        });

    }

}