package com.upb.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirMenu (View v){

        Intent i;
        i = new Intent(this, MenuActivity.class);
        startActivity(i);

    }
    public void abrirSedes (View v){

        Intent i;
        i = new Intent(this, MapsActivity.class);
        startActivity(i);

    }
    public void abrirReserva (View v){

        String numero = "+57 numero de alguien";
        String url = "https://api.whatsapp.com/send?phone=" + numero;
        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();
        Intent i = pm.getLaunchIntentForPackage(whatsApp);
        startActivity(i);

    }
    public void abrirPedido (View v){

        Intent i;
        i = new Intent(this, PedidoActivity.class);
        startActivity(i);

    }
}