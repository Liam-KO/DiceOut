package com.example.diceout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        Intent intent = getIntent();
        String finalScore = intent.getStringExtra(MainActivity.EXTRA_FINAL_SCORE);

        TextView finalScoreText = (TextView) findViewById(R.id.finalScoreText);
        finalScoreText.setText("Final " + finalScore);

        Button button = (Button) findViewById(R.id.restartButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAgain(view);
            }
        });
    }


    void playAgain(View view){
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );

        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);



    }

}
