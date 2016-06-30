package com.sukhjinder.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Sukhjinder on 6/29/16.
 */
public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(NowPlaying.this, Search.class);
                startActivity(searchIntent);
            }
        });

        Button songButton = (Button) findViewById(R.id.songButton);
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(NowPlaying.this, List.class);
                startActivity(songIntent);
            }
        });

        Button storeButton = (Button) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(NowPlaying.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}
