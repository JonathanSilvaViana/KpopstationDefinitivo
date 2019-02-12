package kpopstationaplicativo_kpopstation_android_kpopstation_facadownload.com.br.kpopstation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ParceirosActivity extends AppCompatActivity {

    private WebView webView;

    String HTML , title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        title = "Parceiros e Patrocianadores";

        setTitle(title);

        ConnectivityManager CN = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);


        if (CN.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED
                || CN.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED)
        {


            webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());

            HTML = "<html><head><meta http-equiv='refresh' content='0;URL=https://kpopstation.com.br/novo/paepa'></head><body>" + " <h3>  </h3> " + "</body></html>";

            webView.loadData(HTML, "text/html", "UTF-8");
            setContentView(webView);

        }


        else if (CN.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.DISCONNECTED
                || CN.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.DISCONNECTED)
        {
            android.app.AlertDialog.Builder alertDialogBuilder = new android.app.AlertDialog.Builder(ParceirosActivity.this);
            alertDialogBuilder.setTitle("Problemas de rede");
            alertDialogBuilder
                    .setMessage("Clique em sim para fechar")
                    .setCancelable(false)
                    .setPositiveButton("Sim",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    moveTaskToBack(true);
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                    System.exit(1);
                                }
                            })

                    .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            dialog.cancel();
                            Intent mandaparahomedenovo = new Intent(ParceirosActivity.this, MainActivity.class);
                            startActivity(mandaparahomedenovo);
                        }
                    });

            android.app.AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else {

            Toast.makeText(this, "Sem rede", Toast.LENGTH_SHORT).show();
            System.exit(1);

        }

    }
}
