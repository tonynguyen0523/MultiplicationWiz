package toto.multiplicationwiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by tonynguyen on 10/31/16.
 */

public class Congrats extends AppCompatActivity{


    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.congrats_layout);

    }

    public void goHomeButton(View v){
        Intent home = new Intent(Congrats.this, MainActivity.class);
        startActivity(home);
    }
}
