package toto.multiplicationwiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void oneTimes(View v){
        Intent intent = new Intent(MainActivity.this, Ones.class);
        startActivity(intent);
    }

    public void twoTimes(View v){
        Intent intent = new Intent(MainActivity.this, Twos.class);
        startActivity(intent);
    }
    public void threeTimes(View v){
        Intent intent = new Intent(MainActivity.this, Threes.class);
        startActivity(intent);
    }
    public void fourTimes(View v){
        Intent intent = new Intent(MainActivity.this, Fours.class);
        startActivity(intent);
    }
    public void fiveTimes(View v){
        Intent intent = new Intent(MainActivity.this, Fives.class);
        startActivity(intent);
    }
    public void sixTimes(View v){
        Intent intent = new Intent(MainActivity.this, Sixes.class);
        startActivity(intent);
    }
    public void sevenTimes(View v){
        Intent intent = new Intent(MainActivity.this, Sevens.class);
        startActivity(intent);
    }
    public void eightTimes(View v){
        Intent intent = new Intent(MainActivity.this, Eights.class);
        startActivity(intent);
    }
    public void nineTimes(View v){
        Intent intent = new Intent(MainActivity.this, Nines.class);
        startActivity(intent);
    }
    public void tenTimes(View v){
        Intent intent = new Intent(MainActivity.this, Tens.class);
        startActivity(intent);
    }
    public void elevenTimes(View v){
        Intent intent = new Intent(MainActivity.this, Elevens.class);
        startActivity(intent);
    }
    public void twelveTimes(View v){
        Intent intent = new Intent(MainActivity.this, Twelves.class);
        startActivity(intent);
    }
    public void extra(View v){
        Intent intent = new Intent(MainActivity.this, ExtraQuestions.class);
        startActivity(intent);
    }


}
