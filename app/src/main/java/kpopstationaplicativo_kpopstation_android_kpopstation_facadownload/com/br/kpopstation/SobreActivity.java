package kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SobreActivity extends AppCompatActivity {

    String titulo = "Sobre o aplicativo";
    FloatingActionButton VoltarView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        setTitle(titulo);


        //ads

        MobileAds.initialize(this,
                "ca-app-pub-2931850328324162~3800224969");

        //banner ad
        mAdView = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

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

