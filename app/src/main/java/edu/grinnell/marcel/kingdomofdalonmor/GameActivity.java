package edu.grinnell.marcel.kingdomofdalonmor;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import edu.grinnell.marcel.kingdomofdalonmor.Entity.Player;

public class GameActivity extends AppCompatActivity {

    Player character;
    ImageView background;
    Button menuButton;
    Button mapButton;
    Button characterButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        character = new Player();

        menuButton = (Button) findViewById(R.id.menuButton);
        mapButton = (Button) findViewById(R.id.mapButton);
        characterButton = (Button) findViewById(R.id.characterButton);

        // Set the background image
        background = (ImageView) findViewById(R.id.backgroundImage);
        Picasso.with(this).load("http://dungeonchannel.com/wp-content/uploads/2015/11/Cabin_feat.jpg").into(background);

        // Quit to main menu
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // View character statistics
        characterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(GameActivity.this, CharacterActivity.class);
                intent.putExtra("character", character);
                startActivity(intent);
            }
        });


        // View world map
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(GameActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume(){
        super.onResume();
    }

}
