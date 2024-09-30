package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText et_euros,et_Dolares;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et_Dolares= (EditText) findViewById(R.id.et_Dolares);
        et_euros = (EditText) findViewById(R.id.et_Euros);
        bt = (Button) findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                String textoEuros=et_euros.getText().toString();
                Double euros = Double.parseDouble(textoEuros);

                Double dolares = euros * 1.13;
                String textoDolares = String.valueOf(dolares);
                et_Dolares.setText(textoDolares);

            }
        });


    }
}