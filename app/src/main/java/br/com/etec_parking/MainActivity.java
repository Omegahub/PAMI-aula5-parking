package br.com.etec_parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtQthoras;
    EditText txtVahoras;
    EditText txtAdhoras;
    TextView lblResul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQthoras = findViewById(R.id.txtQthoras);
        txtVahoras = findViewById(R.id.txtVahoras);
        txtAdhoras = findViewById(R.id.txtAdhoras);
        lblResul = findViewById(R.id.lblResul);
    }

    public void onCalcular(View v) {

        if (txtAdhoras.getText().toString().isEmpty() || txtVahoras.getText().toString().isEmpty() || txtQthoras.getText().toString().isEmpty()) {
            Toast.makeText(this, "digite um valor", Toast.LENGTH_LONG).show();
        } else {
            double horas = Double.parseDouble(txtQthoras.getText().toString());
            double valorHoras = Double.parseDouble(txtVahoras.getText().toString());
            double adicional = Double.parseDouble(txtAdhoras.getText().toString());

            double total = valorHoras + adicional * (horas - 1);

            lblResul.setText(String.valueOf(total));
        }
    }

}
