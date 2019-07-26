package com.example.android.playingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myMediaPlayer;
    Button playPauseButton;
    boolean playPause = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.feduk___more_love);
        playPauseButton = findViewById(R.id.buttonPlay);
    }

    public void Play(View view) {

        if (playPause) {

            myMediaPlayer.start();

            playPauseButton.setText(R.string.Pause);

            playPause = false;

        } else {

            myMediaPlayer.pause();

            playPauseButton.setText(R.string.Play);

            playPause = true;
        }

    }
}
