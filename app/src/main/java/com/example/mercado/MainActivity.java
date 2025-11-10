package com.example.mercado;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox cbCafe, cbPicanha, cbOvo, cbRefri;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbCafe = findViewById(R.id.cbCafe);
        cbPicanha = findViewById(R.id.cbPicanha);
        cbOvo = findViewById(R.id.cbOvo);
        cbRefri = findViewById(R.id.cbRefri);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(v -> {
            double total = 0;

            if (cbCafe.isChecked()) total += 16.50;
            if (cbPicanha.isChecked()) total += 69.90;
            if (cbOvo.isChecked()) total += 12.00;
            if (cbRefri.isChecked()) total += 12.00;

            String msg = "Total de compras: R$ " + String.format("%.2f", total);
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Mix Matheus")
                    .setMessage(msg)
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}
