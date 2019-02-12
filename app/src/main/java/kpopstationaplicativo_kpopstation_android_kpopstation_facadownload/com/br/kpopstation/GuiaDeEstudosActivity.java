package kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuiaDeEstudosActivity extends AppCompatActivity {

    FloatingActionButton VoltarView;

    Button btaula;

    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_de_estudos);

        title = "Guia de estudos";

        setTitle(title);

        btaula = (Button)findViewById(R.id.button_aulas);

        btaula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guiaEstudos = new Intent(GuiaDeEstudosActivity.this, Aulas.class);
                startActivity(guiaEstudos);
            }
        });


        //volta página
        VoltarView = (FloatingActionButton)findViewById(R.id.btVoltarAntes);

        VoltarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}