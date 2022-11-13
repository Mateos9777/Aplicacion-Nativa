package co.upb.edu.Tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Armas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armas);

        //Botones
        Button btnArmas1 = (Button) findViewById(R.id.btnMapas1);
        Button btnArmas2 = (Button) findViewById(R.id.btnMapas2);
        Button btnVolver = (Button) findViewById(R.id.btnVolver3);

        inicializarBotones(btnArmas1,btnArmas2,btnVolver);
    }

    private void inicializarBotones (Button armas1, Button armas2, Button volver){
        armas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Armas.this, M4a1.class);
                startActivity(intent);
            }
        });
        armas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Armas.this, Ak47.class);
                startActivity(intent);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Armas.this, Guia.class);
                startActivity(intent);
            }
        });


    }

}