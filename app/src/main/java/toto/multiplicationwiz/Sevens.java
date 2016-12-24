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

public class Sevens extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevens_layout);

        Toast.makeText(this, "Do questions in order!", Toast.LENGTH_LONG).show();
    }

    //user presses finished button

    public void sevenResult(View v){
        int correct = 0;

        EditText Answer1 = (EditText)findViewById(R.id.edit_seven_1);
        EditText Answer2 = (EditText)findViewById(R.id.edit_seven_2);
        EditText Answer3 = (EditText)findViewById(R.id.edit_seven_3);
        EditText Answer4 = (EditText)findViewById(R.id.edit_seven_4);
        EditText Answer5 = (EditText)findViewById(R.id.edit_seven_5);
        EditText Answer6 = (EditText)findViewById(R.id.edit_seven_6);
        EditText Answer7 = (EditText)findViewById(R.id.edit_seven_7);
        EditText Answer8 = (EditText)findViewById(R.id.edit_seven_8);
        EditText Answer9 = (EditText)findViewById(R.id.edit_seven_9);
        EditText Answer10 = (EditText)findViewById(R.id.edit_seven_10);
        EditText Answer11 = (EditText)findViewById(R.id.edit_seven_11);
        EditText Answer12 = (EditText)findViewById(R.id.edit_seven_12);
        EditText Answer13 = (EditText)findViewById(R.id.edit_seven_13);
        EditText Answer14 = (EditText)findViewById(R.id.edit_seven_14);
        EditText Answer15 = (EditText)findViewById(R.id.edit_seven_15);
        EditText Answer16 = (EditText)findViewById(R.id.edit_seven_16);
        EditText Answer17 = (EditText)findViewById(R.id.edit_seven_17);
        EditText Answer18 = (EditText)findViewById(R.id.edit_seven_18);
        EditText Answer19 = (EditText)findViewById(R.id.edit_seven_19);
        EditText Answer20 = (EditText)findViewById(R.id.edit_seven_20);
        EditText Answer21 = (EditText)findViewById(R.id.edit_seven_21);
        EditText Answer22 = (EditText)findViewById(R.id.edit_seven_22);
        EditText Answer23 = (EditText)findViewById(R.id.edit_seven_23);
        EditText Answer24 = (EditText)findViewById(R.id.edit_seven_24);


        TextView displayCorrect = (TextView)findViewById(R.id.display_sevens_result);

        //check each questions

        if(Answer1.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer1.getText().toString());
            if(answer == 7){
                Answer1.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer1.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer2.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer2.getText().toString());
            if(answer == 14){
                Answer2.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer2.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer3.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer3.getText().toString());
            if(answer == 21){
                Answer3.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer3.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer4.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer4.getText().toString());
            if(answer == 28){
                Answer4.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer4.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer5.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer5.getText().toString());
            if(answer == 35){
                Answer5.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer5.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer6.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer6.getText().toString());
            if(answer == 42){
                Answer6.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer6.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer7.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer7.getText().toString());
            if(answer == 49){
                Answer7.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer7.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer8.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer8.getText().toString());
            if(answer == 56){
                Answer8.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer8.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer9.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer9.getText().toString());
            if(answer == 63){
                Answer9.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer9.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer10.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer10.getText().toString());
            if(answer == 70){
                Answer10.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer10.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer11.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer11.getText().toString());
            if(answer == 77){
                Answer11.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer11.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer12.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer12.getText().toString());
            if(answer == 84){
                Answer12.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer12.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer13.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer13.getText().toString());
            if(answer == 56){
                Answer13.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer13.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer14.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer14.getText().toString());
            if(answer == 63){
                Answer14.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer14.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer15.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer15.getText().toString());
            if(answer == 14){
                Answer15.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer15.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer16.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer16.getText().toString());
            if(answer == 84){
                Answer16.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer16.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer17.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer17.getText().toString());
            if(answer == 49){
                Answer17.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer17.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer18.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer18.getText().toString());
            if(answer == 42){
                Answer18.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer18.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer19.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer19.getText().toString());
            if(answer == 21){
                Answer19.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer19.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer20.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer20.getText().toString());
            if(answer == 70){
                Answer20.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer20.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer21.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer21.getText().toString());
            if(answer == 35){
                Answer21.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer21.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer22.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer22.getText().toString());
            if(answer == 77){
                Answer22.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer22.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer23.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer23.getText().toString());
            if(answer == 7){
                Answer23.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else {
                Answer23.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(Answer24.getText().toString().length() > 0){
            int answer = Integer.parseInt(Answer24.getText().toString());
            if(answer == 28){
                Answer24.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                Answer24.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        //displays results
        if(correct == 24){
            Intent congrats = new Intent(Sevens.this, Congrats.class);
            startActivity(congrats);
        }else {
            displayCorrect.setText(correct + " out of 24 correct, please do corrections!");
        }

    }

}



