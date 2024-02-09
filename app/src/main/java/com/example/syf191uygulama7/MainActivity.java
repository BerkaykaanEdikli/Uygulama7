package com.example.syf191uygulama7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText txtYas, txtMaas;
    TextView Sonuc;
    Button btnKaydet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtYas = findViewById(R.id.editTxtYas);
        txtMaas = findViewById(R.id.editTxtMaas);
        Sonuc = findViewById(R.id.TxtViewSonuc);
        btnKaydet = findViewById(R.id.butonKaydet);
        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yas = Integer.parseInt(txtYas.getText().toString());
                int maas = Integer.parseInt(txtMaas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                personel.setMaas(maas);
                Sonuc.setText("Yaş: "+personel.getYas()+" Maaş: "+personel.getMaas());
            }
        });
    }
}