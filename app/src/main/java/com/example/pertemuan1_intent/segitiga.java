package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final TextView hasilluas =
                (TextView) findViewById(R.id.output_hasil);
        final Button btnhitung =
                (Button) findViewById(R.id.btn_run);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,t, hasil;
                a = Double.valueOf(alas.getText().toString());
                t = Double.valueOf(tinggi.getText().toString());

                hasil = (a / 2) * t;
                String hasil1 = String.valueOf(hasil);
                hasilluas.setText(hasil1);
            }
        });

    }
}