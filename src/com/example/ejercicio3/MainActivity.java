package com.example.ejercicio3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    private EditText etLetra;
    private Button btnCalcular;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        listeners();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void findViews() {
        etLetra = findViewById(R.id.etLetra);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResult = findViewById(R.id.tvResult);
    }

    private void listeners() {
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(String.valueOf(calcular()));
            }
        });
    }

    private double calcular() {
        double sum = 0;
        for (int i = 0; i < etLetra.getText().toString().length(); i++) {
            char l = etLetra.getText().toString().charAt(i);
            if (l == 'A') {
                sum += (5000 * 0.02);
            } else if (l == 'B') {
                sum += (4000 * 0.02);
            } else {
                sum += (3000 * 0.02);
            }
        }
        return sum;
    }
    
}
