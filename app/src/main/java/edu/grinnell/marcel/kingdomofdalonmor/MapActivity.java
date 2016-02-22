package edu.grinnell.marcel.kingdomofdalonmor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MapActivity extends AppCompatActivity {

    private Button backButton;
    private ImageView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        backButton = (Button) findViewById(R.id.backButton);
        mapView = (ImageView) findViewById(R.id.mapView);
        Picasso.with(this).load("http://cdn3.freefantasymaps.org/wp-content/uploads/2010/08/verhaegen.jpg").into(mapView);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
