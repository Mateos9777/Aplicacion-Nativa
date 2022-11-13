package co.upb.edu.Tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);

        //Botones
        Button btnMapas1 = (Button) findViewById(R.id.btnMapas1);
        Button btnMapas2 = (Button) findViewById(R.id.btnMapas2);
        Button btnVolver1 = (Button) findViewById(R.id.btnVolver3);

        inicializarBotones(btnMapas1,btnMapas2,btnVolver1);
    }

    private void inicializarBotones (Button mapas1, Button mapas2, Button volver){
        mapas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mapas.this, Mirage.class);
                startActivity(intent);
            }
        });
        mapas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mapas.this, Dust.class);
                startActivity(intent);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mapas.this, Guia.class);
                startActivity(intent);
            }
        });


    }

}