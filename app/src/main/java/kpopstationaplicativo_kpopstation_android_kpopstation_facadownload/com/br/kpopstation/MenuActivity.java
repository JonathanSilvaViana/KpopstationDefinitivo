package kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    FloatingActionButton compartilhar;

    Button guiadeestudos, news, sobre, promocoes, produtos, seguir, parceiros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ação de compartilhar

        compartilhar = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        compartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //avisa as pessoas
                Toast.makeText(MenuActivity.this, "Disponível apenas para Android", Toast.LENGTH_LONG).show();
                //faz a brincadeira
                Intent intentCompartilhar = new Intent();
                intentCompartilhar.setAction(Intent.ACTION_SEND);
                intentCompartilhar.putExtra(Intent.EXTRA_TEXT, "Baixe o aplicativo do Kpopstation: https://play.google.com/store/apps/details?id=kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation");
                intentCompartilhar.setType("text/plain");
                startActivity(intentCompartilhar);
            }
        });

        //guia de estudos

        guiadeestudos = (Button)findViewById(R.id.bt_estudos);

        guiadeestudos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guiadeestudos = new Intent(MenuActivity.this, GuiaDeEstudosActivity.class);
                startActivity(guiadeestudos);
            }
        });

        news = (Button)findViewById(R.id.bt_noticias);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newsI = new Intent(MenuActivity.this, Posts.class);
                startActivity(newsI);
            }
        });

        sobre = (Button)findViewById(R.id.sobreoaplicativo);

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sobre = new Intent(MenuActivity.this, SobreActivity.class);
                startActivity(sobre);
            }
        });

        promocoes = (Button)findViewById(R.id.bt_promocoes);

        promocoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promo = new Intent(MenuActivity.this, PromocoesActivity.class);
                startActivity(promo);
            }
        });

        produtos = (Button)findViewById(R.id.produtos);

        produtos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent produtos = new Intent(MenuActivity.this, ProdutosActivity.class);
                startActivity(produtos);
            }
        });

        seguir = (Button)findViewById(R.id.bt_seguir);

        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segue = new Intent(MenuActivity.this, SeguirActivity.class);
                startActivity(segue);
            }
        });

        parceiros = (Button)findViewById(R.id.bt_p);

        parceiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parceiros = new Intent(MenuActivity.this, ParceirosActivity.class);
                startActivity(parceiros);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
    }
}