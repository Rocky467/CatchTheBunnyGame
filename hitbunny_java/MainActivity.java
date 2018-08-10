package com.example.rakesh.hitbunny;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static com.example.rakesh.hitbunny.R.raw.scream;

public class MainActivity extends AppCompatActivity {
    ImageView bunny1,bunny2,bunny3,bunny4,bunny5,bunny6,bunny7,bunny8,bunny9;
    TextView textViewLeft,textViewScore;
    Button button;
    Random random = new Random();
    int score = 0, fps = 1000, left = 5, tempifleft = 0;
    int which = 0, whichsave = 0;
    MediaPlayer mediaPlayer,mediaPlayer2,mediaPlayer3;

    AnimationDrawable an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer3 = MediaPlayer.create(this,R.raw.gameover);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.scream);
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        bunny1 = findViewById(R.id.bunny1);
        bunny2 = findViewById(R.id.bunny2);
        bunny3 = findViewById(R.id.bunny3);
        bunny4 = findViewById(R.id.bunny4);
        bunny5 = findViewById(R.id.bunny5);
        bunny6 = findViewById(R.id.bunny6);
        bunny7 = findViewById(R.id.bunny7);
        bunny8 = findViewById(R.id.bunny8);
        bunny9 = findViewById(R.id.bunny9);


        textViewLeft = findViewById(R.id.textViewLeft);
        textViewScore = findViewById(R.id.textViewScore);

        button = findViewById(R.id.button);

        bunny1.setVisibility(View.INVISIBLE);
        bunny2.setVisibility(View.INVISIBLE);
        bunny3.setVisibility(View.INVISIBLE);
        bunny4.setVisibility(View.INVISIBLE);
        bunny5.setVisibility(View.INVISIBLE);
        bunny6.setVisibility(View.INVISIBLE);
        bunny7.setVisibility(View.INVISIBLE);
        bunny8.setVisibility(View.INVISIBLE);
        bunny9.setVisibility(View.INVISIBLE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left = 5;
                textViewLeft.setText("Left: "+left);
                score = 0;
                textViewScore.setText("Score: "+score);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                         theGameAction();
                    }
                },1500);
                button.setEnabled(false);
            }
        });

        bunny1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  tempifleft = 1;
                  bunny1.setImageResource(R.drawable.rabbithit);
                  mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny1.setEnabled(false);


            }
        });

        bunny2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny2.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny2.setEnabled(false);


            }
        });

        bunny3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny3.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny3.setEnabled(false);

            }
        });

        bunny4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny4.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny4.setEnabled(false);


            }
        });

        bunny5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny5.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny5.setEnabled(false);


            }
        });

        bunny6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny6.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny6.setEnabled(false);

            }
        });

        bunny7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny7.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny7.setEnabled(false);


            }
        });

        bunny8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny8.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny8.setEnabled(false);


            }
        });

        bunny9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempifleft = 1;
                bunny9.setImageResource(R.drawable.rabbithit);
                mediaPlayer2.start();
                score = score +1;
                textViewScore.setText("Score: "+score);
                bunny9.setEnabled(false);

            }
        });

    }


    private void theGameAction(){
         if (score<10){
          fps = 1000;
         }else if (score>=10 && score<15){
             fps = 950;
         }
         else if (score>=15 && score<20){
             fps = 900;
         }
         else if (score>=20 && score<25){
             fps = 850;
         }
         else if (score>=25 && score<30){
             fps = 800;
         }
         else if (score>=30 && score<35){
             fps = 750;
         }
         else if (score>=35 && score<40){
             fps = 700;
         }
         else if (score>=40 && score<45){
             fps = 650;
         }
         else if (score>=45 && score<50){
             fps = 600;
         }
         else if (score>=50 && score<55){
             fps = 550;
         }
         else if (score>=55 && score<60){
             fps = 500;
         }
         else if (score>=60 && score<65){
             fps = 450;
         }
         else if (score>=65 && score<70){
             fps = 400;
         }
         else if (score>=70){
             fps = 350;
         }

         an = (AnimationDrawable) ContextCompat.getDrawable(this,R.drawable.anim);

         do {
             which = random.nextInt(9)+1;
         }while (whichsave==which);
         whichsave = which;

         if (which == 1){
             bunny1.setImageDrawable(an);
             bunny1.setVisibility(View.VISIBLE);
             bunny1.setEnabled(true);
         }else if (which == 2){
             bunny2.setImageDrawable(an);
             bunny2.setVisibility(View.VISIBLE);
             bunny2.setEnabled(true);
         }else if (which == 3){
             bunny3.setImageDrawable(an);
             bunny3.setVisibility(View.VISIBLE);
             bunny3.setEnabled(true);
         }else if (which == 4){
             bunny4.setImageDrawable(an);
             bunny4.setVisibility(View.VISIBLE);
             bunny4.setEnabled(true);
         }else if (which == 5){
             bunny5.setImageDrawable(an);
             bunny5.setVisibility(View.VISIBLE);
             bunny5.setEnabled(true);
         }else if (which == 6){
             bunny6.setImageDrawable(an);
             bunny6.setVisibility(View.VISIBLE);
             bunny6.setEnabled(true);
         }else if (which == 7){
             bunny7.setImageDrawable(an);
             bunny7.setVisibility(View.VISIBLE);
             bunny7.setEnabled(true);
         }else if (which == 8){
             bunny8.setImageDrawable(an);
             bunny8.setVisibility(View.VISIBLE);
             bunny8.setEnabled(true);
         }else if (which == 9){
             bunny9.setImageDrawable(an);
             bunny9.setVisibility(View.VISIBLE);
             bunny9.setEnabled(true);
         }

         an.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                bunny1.setVisibility(View.INVISIBLE);
                bunny2.setVisibility(View.INVISIBLE);
                bunny3.setVisibility(View.INVISIBLE);
                bunny4.setVisibility(View.INVISIBLE);
                bunny5.setVisibility(View.INVISIBLE);
                bunny6.setVisibility(View.INVISIBLE);
                bunny7.setVisibility(View.INVISIBLE);
                bunny8.setVisibility(View.INVISIBLE);
                bunny9.setVisibility(View.INVISIBLE);


                bunny1.setEnabled(false);
                bunny2.setEnabled(false);
                bunny3.setEnabled(false);
                bunny4.setEnabled(false);
                bunny5.setEnabled(false);
                bunny6.setEnabled(false);
                bunny7.setEnabled(false);
                bunny8.setEnabled(false);
                bunny9.setEnabled(false);


                if (tempifleft == 0){
                    left = left - 1;
                    textViewLeft.setText("Left: "+left);
                }else if (tempifleft == 1){
                    tempifleft = 0;
                }

                if (left == 0){
                    mediaPlayer.pause();
                    mediaPlayer.pause();
                    Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_LONG).show();
                    mediaPlayer3.start();
                    mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mediaPlayer.start();
                        }
                    });
                    button.setEnabled(true);
                }else if (left>0){
                    theGameAction();
                }

            }
        },fps);
        button.setEnabled(false);

    }

    public void onBackPressed(){
        buildDialogExit(MainActivity.this).show();
    }

    public AlertDialog.Builder buildDialogExit(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("Do you really want to exit?");
        builder.setMessage("");

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });


        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                mediaPlayer.stop();
                mediaPlayer2.stop();
                mediaPlayer3.stop();
                finish();
            }
        });

        return builder;
    }

}
