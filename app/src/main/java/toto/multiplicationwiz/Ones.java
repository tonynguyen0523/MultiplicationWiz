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
 * Created by Tony Nguyen on 10/27/2016.
 */

public class Ones extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ones_layout);

        Toast.makeText(this, "Do questions in order!", Toast.LENGTH_LONG).show();
    }

    //user presses finished button

    public void oneResult(View v){
        int correct = 0;

        EditText oneAnswer = (EditText)findViewById(R.id.edit_one);
        EditText twoAnswer = (EditText)findViewById(R.id.edit_one_two);
        EditText threeAnswer = (EditText)findViewById(R.id.edit_one_three);
        EditText fourAnswer = (EditText)findViewById(R.id.edit_one_four);
        EditText fiveAnswer = (EditText)findViewById(R.id.edit_one_five);
        EditText sixAnswer = (EditText)findViewById(R.id.edit_one_six);
        EditText sevenAnswer = (EditText)findViewById(R.id.edit_one_seven);
        EditText eightAnswer = (EditText) findViewById(R.id.edit_one_eight);
        EditText nineAnswer = (EditText)findViewById(R.id.edit_one_nine);
        EditText tenAnswer = (EditText)findViewById(R.id.edit_one_10);
        EditText elevenAnswer = (EditText)findViewById(R.id.edit_one_eleven);
        EditText twelveAnswer = (EditText)findViewById(R.id.edit_one_twelve);
        EditText thirteenAnswer = (EditText)findViewById(R.id.edit_one_13);
        EditText fourteenAnswer = (EditText)findViewById(R.id.edit_one_14);
        EditText fifteenAnswer = (EditText)findViewById(R.id.edit_one_15);
        EditText sixteenAnswer = (EditText)findViewById(R.id.edit_one_16);
        EditText seventeenAnswer = (EditText)findViewById(R.id.edit_one_17);
        EditText eighteenAnswer = (EditText)findViewById(R.id.edit_one_18);
        EditText nineteenAnswer = (EditText)findViewById(R.id.edit_one_19);
        EditText twentyAnswer = (EditText)findViewById(R.id.edit_one_20);
        EditText twentyoneAnswer = (EditText)findViewById(R.id.edit_one_21);
        EditText twentytwoAnswer = (EditText)findViewById(R.id.edit_one_22);
        EditText twentythreeAnswer = (EditText)findViewById(R.id.edit_one_23);
        EditText twentyfourAnswer = (EditText)findViewById(R.id.edit_one_24);

        TextView displayCorrect = (TextView)findViewById(R.id.display_ones_result);

        //checking each questions
        if(oneAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(oneAnswer.getText().toString());
            if(answer == 1){
                oneAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                oneAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twoAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twoAnswer.getText().toString());
            if(answer == 2){
                twoAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                twoAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(threeAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(threeAnswer.getText().toString());
            if(answer == 3){
                threeAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                threeAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(fourAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(fourAnswer.getText().toString());
            if(answer == 4){
                fourAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                fourAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(fiveAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(fiveAnswer.getText().toString());
            if(answer == 5){
                fiveAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                fiveAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(sixAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(sixAnswer.getText().toString());
            if(answer == 6){
                sixAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                sixAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(sevenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(sevenAnswer.getText().toString());
            if(answer == 7){
                sevenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                sevenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(eightAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(eightAnswer.getText().toString());
            if(answer == 8){
                eightAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                eightAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(nineAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(nineAnswer.getText().toString());
            if(answer == 9){
                nineAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                nineAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(tenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(tenAnswer.getText().toString());
            if(answer == 10){
                tenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                tenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(elevenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(elevenAnswer.getText().toString());
            if(answer == 11){
                elevenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                elevenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twelveAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twelveAnswer.getText().toString());
            if(answer == 12){
                twelveAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                twelveAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(thirteenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(thirteenAnswer.getText().toString());
            if(answer == 4){
                thirteenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                thirteenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(fourteenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(fourteenAnswer.getText().toString());
            if(answer == 7){
                fourteenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                fourteenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(fifteenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(fifteenAnswer.getText().toString());
            if(answer == 1){
                fifteenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                fifteenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(sixteenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(sixteenAnswer.getText().toString());
            if(answer == 12){
                sixteenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                sixteenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(seventeenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(seventeenAnswer.getText().toString());
            if(answer == 2){
                seventeenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                seventeenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(eighteenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(eighteenAnswer.getText().toString());
            if(answer == 6){
                eighteenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                eighteenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(nineteenAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(nineteenAnswer.getText().toString());
            if(answer == 3){
                nineteenAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                nineteenAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twentyAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twentyAnswer.getText().toString());
            if(answer == 11){
                twentyAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                twentyAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twentyoneAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twentyoneAnswer.getText().toString());
            if(answer == 5){
                twentyoneAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                twentyoneAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twentytwoAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twentytwoAnswer.getText().toString());
            if(answer == 10){
                twentytwoAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                twentytwoAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twentythreeAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twentythreeAnswer.getText().toString());
            if(answer == 9){
                twentythreeAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else {
                twentythreeAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        if(twentyfourAnswer.getText().toString().length() > 0){
            int answer = Integer.parseInt(twentyfourAnswer.getText().toString());
            if(answer == 8){
                twentyfourAnswer.setTextColor(Color.parseColor("#b8e54e"));
                correct ++;
            }else{
                twentyfourAnswer.setTextColor(Color.parseColor("#ff0000"));
            }
        }

        //displays result

        if(correct == 24){
            Intent congrats = new Intent(Ones.this, Congrats.class);
            startActivity(congrats);
        }else {
            displayCorrect.setText(correct + " out of 24 correct, please do corrections!");
        }

}

}
