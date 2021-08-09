package com.example.hlsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

public class MainActivity extends AppCompatActivity {
    String hlsUri = "https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleExoPlayer simpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
        PlayerView playerView = findViewById(R.id.exoPlayerView);

        playerView.setPlayer(simpleExoPlayer);
        MediaItem mediaItem = MediaItem.fromUri(hlsUri);
        simpleExoPlayer.addMediaItem(mediaItem);

        simpleExoPlayer.prepare();
        simpleExoPlayer.play();

    }
}