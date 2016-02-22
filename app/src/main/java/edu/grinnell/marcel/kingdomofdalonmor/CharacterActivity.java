package edu.grinnell.marcel.kingdomofdalonmor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import edu.grinnell.marcel.kingdomofdalonmor.Entity.Player;

public class CharacterActivity extends AppCompatActivity {

    private ListView statsView;
    private ArrayAdapter<String> stats;
    private Intent intent;
    private Player character;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        intent = getIntent();
        character = intent.getParcelableExtra("character");
        stats = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, character.toStringArray());
        statsView = (ListView) findViewById(R.id.statsView);
        statsView.setAdapter(stats);

        backButton = (Button) findViewById(R.id.gameButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
