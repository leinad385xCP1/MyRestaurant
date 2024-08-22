package com.upb.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
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

        String numero = "+573167497545";
        String mensaje = "Hola, quiero hacer una reserva";
        String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + Uri.encode(mensaje);
        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);


    }
    public void abrirPedido (View v){

        String numero = "+573042081589";
        String mensaje = "Hola, quiero hacer un pedido";
        String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + Uri.encode(mensaje);
        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}