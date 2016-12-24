package toto.multiplicationwiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Tony Nguyen on 11/4/2016.
 */

public class ExtraQuestions extends AppCompatActivity {

    int correct = 0;

    TextView extraResult;
    TextView extra1;
    TextView extra2;
    TextView extra3;
    TextView extra4;
    TextView extra5;
    TextView extra6;
    TextView extra7;
    TextView extra8;
    TextView extra9;
    TextView extra10;

    RadioButton rbr1;
    RadioButton rbr2;
    RadioButton rbr3;
    RadioButton rbr4;
    RadioButton rbr5;

    RadioButton rbw1;
    RadioButton rbw2;
    RadioButton rbw3;
    RadioButton rbw4;
    RadioButton rbw5;

    RadioButton rbww1;
    RadioButton rbww2;
    RadioButton rbww3;
    RadioButton rbww4;
    RadioButton rbww5;

    RadioButton rbwww1;
    RadioButton rbwww2;
    RadioButton rbwww3;
    RadioButton rbwww4;
    RadioButton rbwww5;

    CheckBox cbr1;
    CheckBox cbrr1;
    CheckBox cbr2;
    CheckBox cbrr2;
    CheckBox cbr3;
    CheckBox cbrr3;
    CheckBox cbr4;
    CheckBox cbrr4;
    CheckBox cbr5;
    CheckBox cbrr5;

    CheckBox cbw1;
    CheckBox cbww1;
    CheckBox cbw2;
    CheckBox cbww2;
    CheckBox cbw3;
    CheckBox cbww3;
    CheckBox cbw4;
    CheckBox cbww4;
    CheckBox cbw5;
    CheckBox cbww5;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extra_layout);

        rbr1 = (RadioButton) findViewById(R.id.rbr1);
        rbr2 = (RadioButton) findViewById(R.id.rbr2);
        rbr3 = (RadioButton) findViewById(R.id.rbr3);
        rbr4 = (RadioButton) findViewById(R.id.rbr4);
        rbr5 = (RadioButton) findViewById(R.id.rbr5);

        rbw1 = (RadioButton) findViewById(R.id.rbw1);
        rbw2 = (RadioButton) findViewById(R.id.rbw2);
        rbw3 = (RadioButton) findViewById(R.id.rbw3);
        rbw4 = (RadioButton) findViewById(R.id.rbw4);
        rbw5 = (RadioButton) findViewById(R.id.rbw5);

        rbww1 = (RadioButton) findViewById(R.id.rbww1);
        rbww2 = (RadioButton) findViewById(R.id.rbww2);
        rbww3 = (RadioButton) findViewById(R.id.rbww3);
        rbww4 = (RadioButton) findViewById(R.id.rbww4);
        rbww5 = (RadioButton) findViewById(R.id.rbww5);

        rbwww1 = (RadioButton) findViewById(R.id.rbwww1);
        rbwww2 = (RadioButton) findViewById(R.id.rbwww2);
        rbwww3 = (RadioButton) findViewById(R.id.rbwww3);
        rbwww4 = (RadioButton) findViewById(R.id.rbwww4);
        rbwww5 = (RadioButton) findViewById(R.id.rbwww5);

        cbr1 = (CheckBox) findViewById(R.id.cbr1);
        cbrr1 = (CheckBox) findViewById(R.id.cbrr1);
        cbr2 = (CheckBox) findViewById(R.id.cbr2);
        cbrr2 = (CheckBox) findViewById(R.id.cbrr2);
        cbr3 = (CheckBox) findViewById(R.id.cbr3);
        cbrr3 = (CheckBox) findViewById(R.id.cbrr3);
        cbr4 = (CheckBox) findViewById(R.id.cbr4);
        cbrr4 = (CheckBox) findViewById(R.id.cbrr4);
        cbr5 = (CheckBox) findViewById(R.id.cbr5);
        cbrr5 = (CheckBox) findViewById(R.id.cbrr5);

        cbw1 = (CheckBox)findViewById(R.id.cbw1);
        cbww1 = (CheckBox)findViewById(R.id.cbww1);
        cbw2 = (CheckBox)findViewById(R.id.cbw2);
        cbww2 = (CheckBox)findViewById(R.id.cbww2);
        cbw3 = (CheckBox)findViewById(R.id.cbw3);
        cbww3 = (CheckBox)findViewById(R.id.cbww3);
        cbw4 = (CheckBox)findViewById(R.id.cbw4);
        cbww4 = (CheckBox)findViewById(R.id.cbww4);
        cbw5 = (CheckBox)findViewById(R.id.cbw5);
        cbww5 = (CheckBox)findViewById(R.id.cbww5);

        extra1 = (TextView)findViewById(R.id.extra_one);
        extra2 = (TextView)findViewById(R.id.extra_two);
        extra3 = (TextView)findViewById(R.id.extra_three);
        extra4 = (TextView)findViewById(R.id.extra_four);
        extra5 = (TextView)findViewById(R.id.extra_five);
        extra6 = (TextView)findViewById(R.id.extra_six);
        extra7 = (TextView)findViewById(R.id.extra_seven);
        extra8 = (TextView)findViewById(R.id.extra_eight);
        extra9 = (TextView)findViewById(R.id.extra_nine);
        extra10 = (TextView)findViewById(R.id.extra_ten);

        extraResult = (TextView)findViewById(R.id.display_extras_result);


        Toast.makeText(this, "Make the statements true.", Toast.LENGTH_LONG).show();
    }


    public void extraResult(View v) {
        correct = 0;

        boolean r1 = rbr1.isChecked();
        boolean r2 = rbr2.isChecked();
        boolean r3 = rbr3.isChecked();
        boolean r4 = rbr4.isChecked();
        boolean r5 = rbr5.isChecked();

        boolean checkboxR1 = cbr1.isChecked();
        boolean checkboxRR1 = cbrr1.isChecked();
        boolean checkboxR2 = cbr2.isChecked();
        boolean checkboxRR2 = cbrr2.isChecked();
        boolean checkboxR3 = cbr3.isChecked();
        boolean checkboxRR3 = cbrr3.isChecked();
        boolean checkboxR4 = cbr4.isChecked();
        boolean checkboxRR4 = cbrr4.isChecked();
        boolean checkboxR5 = cbr5.isChecked();
        boolean checkboxRR5 = cbrr5.isChecked();

        boolean checkboxW1 = cbw1.isChecked();
        boolean checkboxWW1 = cbww1.isChecked();
        boolean checkboxW2 = cbw2.isChecked();
        boolean checkboxWW2 = cbww2.isChecked();
        boolean checkboxW3 = cbw3.isChecked();
        boolean checkboxWW3 = cbww3.isChecked();
        boolean checkboxW4 = cbw4.isChecked();
        boolean checkboxWW4 = cbww4.isChecked();
        boolean checkboxW5 = cbw5.isChecked();
        boolean checkboxWW5 = cbww5.isChecked();

        //radio button check

    if(r1 == true){
        extra1.setTextColor(Color.parseColor("#b8e54e"));
        correct++;
    }else{
        extra1.setTextColor(Color.parseColor("#ff0000"));
    }
        if(r2 == true){
            extra2.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra2.setTextColor(Color.parseColor("#ff0000"));
        }

        if(r3 == true){
            extra3.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra3.setTextColor(Color.parseColor("#ff0000"));
        }

        if(r4 == true){
            extra4.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra4.setTextColor(Color.parseColor("#ff0000"));
        }

        if(r5 == true){
            extra5.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra5.setTextColor(Color.parseColor("#ff0000"));
        }

        //checkbox check

        if(checkboxR1 == true
                && checkboxRR1 == true
                && checkboxW1 == false
                && checkboxWW1 == false){
            extra6.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra6.setTextColor(Color.parseColor("#ff0000"));
        }

        if(checkboxR2 == true
                && checkboxRR2 == true
                && checkboxW2 == false
                && checkboxWW2 == false){
            extra7.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra7.setTextColor(Color.parseColor("#ff0000"));
        }


        if(checkboxR3 == true
                && checkboxRR3 == true
                && checkboxW3 == false
                && checkboxWW3 == false){
            extra8.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra8.setTextColor(Color.parseColor("#ff0000"));
        }

        if(checkboxR4 == true
                && checkboxRR4 == true
                && checkboxW4 == false
                && checkboxWW4 == false){
            extra9.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra9.setTextColor(Color.parseColor("#ff0000"));
        }

        if(checkboxR5 == true
                && checkboxRR5 == true
                && checkboxW5 == false
                && checkboxWW5 == false){
            extra10.setTextColor(Color.parseColor("#b8e54e"));
            correct++;
        }else{
            extra10.setTextColor(Color.parseColor("#ff0000"));
        }

        //displays results

        if(correct == 10){
            Intent intent = new Intent(ExtraQuestions.this, Congrats.class);
            startActivity(intent);
        }else {
            extraResult.setText(correct + " out of 10, please do corrections!");
        }
    }
}
