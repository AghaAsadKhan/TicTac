package com.example.aghaasad.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // 0=yellow; 1=red;

    int activePlayer=0;

    // 2 means unplayed
    int[] gameState={2,2,2,2,2,2,2,2,2};





    public void dropin(View view) {

        ImageView counter = (ImageView) view;
        //System.out.println(counter.getTag().toString());

        // getting tapped column/row tag....
        int tappedCounter = Integer.parseInt(counter.getTag().toString());


        if (gameState[tappedCounter] == 2) {

            gameState[tappedCounter]=activePlayer;

            counter.setTranslationY(-1000f);

            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.tik);

                activePlayer = 1;

            } else {
                counter.setImageResource(R.drawable.tak);
                activePlayer = 0;
            }

            counter.animate().translationYBy(1000f).rotation(360).setDuration(300);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }



}
