package kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SobreActivity extends AppCompatActivity {

    String titulo = "Sobre o aplicativo";
    FloatingActionButton VoltarView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        setTitle(titulo);

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

