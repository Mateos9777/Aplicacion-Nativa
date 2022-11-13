package co.upb.edu.Tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Guia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);

        //Botones
        Button btnEquipamiento = (Button) findViewById(R.id.btnEquipamiento);
        Button btnMapas = (Button) findViewById(R.id.btnMapas);
        Button btnTips = (Button) findViewById(R.id.btnTips);

        inicializarBotones(btnEquipamiento,btnTips,btnMapas);
    }

    private void inicializarBotones (Button equipamiento, Button mapas, Button tips){
        equipamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Guia.this, Armas.class);
                startActivity(intent);
            }
        });
        mapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Guia.this, Tips.class);
                startActivity(intent);
            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Guia.this, Mapas.class);
                startActivity(intent);
            }
        });

    }

}
