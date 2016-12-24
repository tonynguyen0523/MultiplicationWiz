package toto.multiplicationwiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tonynguyen on 10/29/16.
 */

public class Twos extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twos_layout);

        Toast.makeText(this, "Do questions in order!", Toast.LENGTH_LONG).show();
    }

    //user presses finished button

    public void twoResult(View v){
        int correct = 0;

        EditText Answer1 = (EditText)findViewById(R.id.edit_two_1);
        EditText Answer2 = (EditText)findViewById(R.id.edit_two_2);
        EditText Answer3 = (EditText)findViewById(R.id.edit_two_3);
        EditText Answer4 = (EditText)findViewById(R.id.edit_two_4);
        EditText Answer5 = (EditText)findViewById(R.id.edit_two_5);
        EditText Answer6 = (EditText)findViewById(R.id.edit_two_6);
        EditText Answer7 = (EditText)findViewById(R.id.edit_two_7);
        EditText Answer8 = (EditText) findViewById(R.id.edit_two_8);
        EditText Answer9 = (EditText)findViewById(R.id.edit_two_9);
        EditText Answer10 = (EditText)findViewById(R.id.edit_two_10);
        EditText Answer11 = (EditText)findViewById(R.id.edit_two_11);
        EditText Answer12 = (EditText)findViewById(R.id.edit_two_12);
        EditText Answer13 = (EditText)findViewById(R.id.edit_two_13);
        EditText Answer14 = (EditText)findViewById(R.id.edit_two_14);
        EditText Answer15 = (EditText)findViewById(R.id.edit_two_15);
        EditText Answer16 = (EditText)findViewById(R.id.edit_two_16);
        EditText Answer17 = (EditText)findViewById(R.id.edit_two_17);
        EditText Answer18 = (EditText)findViewById(R.id.edit_two_18);
        EditText Answer19 = (EditText)findViewById(R.id.edit_two_19);
        EditText Answer20 = (EditText)findViewById(R.id.edit_two_20);
        EditText Answer21 = (EditText)findViewById(R.id.edit_two_21);
        EditText Answer22 = (EditText)findViewById(R.id.edit_two_22);
        EditText Answer23 = (EditText)findViewById(R.id.edit_two_23);
        EditText Answer24 = (EditText)findViewById(R.id.edit_two_24);

        TextView displayCorrect = (TextView)findViewById(R.id.display_twos_result);

        //checking each questions

        if(Answer1.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer1.getText().toString());
            if(answer == 2){
                Answer1.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer1.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer2.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer2.getText().toString());
            if(answer == 4){
                Answer2.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer2.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer3.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer3.getText().toString());
            if(answer == 6){
                Answer3.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer3.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer4.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer4.getText().toString());
            if(answer == 8){
                Answer4.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer4.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer5.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer5.getText().toString());
            if(answer == 10){
                Answer5.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer5.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer6.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer6.getText().toString());
            if(answer == 12){
                Answer6.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer6.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer7.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer7.getText().toString());
            if(answer == 14){
                Answer7.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer7.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer8.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer8.getText().toString());
            if(answer == 16){
                Answer8.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer8.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer9.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer9.getText().toString());
            if(answer == 18){
                Answer9.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer9.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer10.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer10.getText().toString());
            if(answer == 20){
                Answer10.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer10.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer11.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer11.getText().toString());
            if(answer == 22){
                Answer11.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer11.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer12.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer12.getText().toString());
            if(answer == 24){
                Answer12.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer12.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer13.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer13.getText().toString());
            if(answer == 16){
                Answer13.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer13.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer14.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer14.getText().toString());
            if(answer == 2){
                Answer14.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer14.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer15.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer15.getText().toString());
            if(answer == 4){
                Answer15.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer15.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer16.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer16.getText().toString());
            if(answer == 24){
                Answer16.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer16.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer17.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer17.getText().toString());
            if(answer == 14){
                Answer17.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer17.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer18.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer18.getText().toString());
            if(answer == 12){
                Answer18.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer18.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer19.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer19.getText().toString());
            if(answer == 6){
                Answer19.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer19.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer20.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer20.getText().toString());
            if(answer == 20){
                Answer20.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer20.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer21.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer21.getText().toString());
            if(answer == 10){
                Answer21.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer21.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer22.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer22.getText().toString());
            if(answer == 22){
                Answer22.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer22.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer23.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer23.getText().toString());
            if(answer == 18){
                Answer23.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else {
                Answer23.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer24.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer24.getText().toString());
            if(answer == 8){
                Answer24.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer24.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        //displays result

        if(correct == 24){
            Intent congrats = new Intent(Twos.this, Congrats.class);
            startActivity(congrats);
        }else {
            displayCorrect.setText(correct + " out of 24 correct, please do corrections!");
        }

    }

}


