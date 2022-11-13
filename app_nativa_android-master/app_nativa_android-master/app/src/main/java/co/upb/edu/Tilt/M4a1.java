package co.upb.edu.Tilt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class M4a1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4a1);

        //Botones
        Button btnVolver = (Button) findViewById(R.id.btnVolver3);
        inicializarBotones(btnVolver);
    }

    private void inicializarBotones (Button volver){
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(M4a1.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}