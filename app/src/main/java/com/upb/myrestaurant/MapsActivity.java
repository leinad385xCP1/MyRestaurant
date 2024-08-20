package com.upb.myrestaurant;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.upb.myrestaurant.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Medellin = new LatLng(6.25184, -75.6224111);

        //Latitud y longitud de las sedes
        LatLng Envigado = new LatLng(6.1659405, -75.5899758);
        LatLng Poblado = new LatLng(6.2068313, -75.565633);
        LatLng Laureles = new LatLng(6.245869, -75.5969556);
        LatLng LasPalmas = new LatLng(6.1527863, -75.5382216);

        mMap.addMarker(new MarkerOptions().position(Envigado).title("Ubicación en Envigado"));
        mMap.addMarker(new MarkerOptions().position(Poblado).title("Ubicación en el Poblado"));
        mMap.addMarker(new MarkerOptions().position(Laureles).title("Ubicación en Laureles"));
        mMap.addMarker(new MarkerOptions().position(LasPalmas).title("Ubicación en Las Palmas"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Medellin, 10));
    }
}