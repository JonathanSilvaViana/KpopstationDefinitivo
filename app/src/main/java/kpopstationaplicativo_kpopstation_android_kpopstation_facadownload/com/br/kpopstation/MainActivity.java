package kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {


    //ca-app-pub-2931850328324162~3800224969
    //Kpopstation

    //banner

    //Promocao ->nome do bloco de anuncios
    //sdk: ca-app-pub-2931850328324162~3800224969
    //guia de implementação: ca-app-pub-2931850328324162/8839184258

    //interestial
    //sdk: ca-app-pub-2931850328324162~3800224969
    //guia de implementação: ca-app-pub-2931850328324162/3660624165



    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent saidasplashscreen = new Intent(MainActivity.this,
                                                  MenuActivity.class );
                                          startActivity(saidasplashscreen);
                                          finish();
                                      }
                                  },
                SPLASH_TIME_OUT);

    }
}
