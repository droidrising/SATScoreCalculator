
package com.wordpress.httpsdroidrisinglabs.satscorecalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;



public class SATScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satscreen);
       final TextView score= (TextView)(findViewById(R.id.scoreText));
        Button calculate = (Button)findViewById(R.id.calc);
        final EditText readingRight = (EditText)findViewById(R.id.readingWrong);
        final EditText writingRight = (EditText)findViewById(R.id.writingwrong);
        final EditText mathRight = (EditText)findViewById(R.id.mathscore);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(readingRight.getText().toString().trim().length()<=0 || mathRight.getText().toString().trim().length()<=0 || writingRight.getText().toString().trim().length()<=0){
                    Toast.makeText(SATScreen.this, "Fields are empty.", Toast.LENGTH_SHORT).show();
                }

                else {
                    InputMethodManager inputManager = (InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE);

                    inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);
                    int rread = Integer.parseInt(readingRight.getText().toString());
                    int wright = Integer.parseInt(writingRight.getText().toString());
                    int mright = Integer.parseInt(mathRight.getText().toString());
                    int tots = compositeMath(mright) + compositeRW(rread, wright);
                    score.setText("" + tots + "\n Reading+Writing: " + compositeRW(rread, wright) + "\n Math: " + compositeMath(mright));
                }
            }
        });

    }


    public int compositeMath(int mathRight){
        int mathScaled=0;
        switch(mathRight){
            case 58:
                mathScaled=800; break;
            case 57:
            mathScaled=790; break;
            case 56:
                mathScaled=780; break;
            case 55:
                mathScaled=760; break;
            case 54:
                mathScaled=750; break;
            case 53:
                mathScaled=740; break;
            case 52:
                mathScaled=730; break;

            case 51:
                mathScaled=710;break;
            case 50: mathScaled=700;break;
            case 49: mathScaled=690;break;
            case 48: mathScaled=680;break;
            case 47: mathScaled= 670;break;
            case   46: mathScaled=670;break;

            case 45: mathScaled=660;break;
            case 44: mathScaled=650;break;
            case    43: mathScaled=640;break;
            case 42: mathScaled=630;break;
            case 41: mathScaled=620;break;
            case 40: mathScaled=610;break;
            case 39: mathScaled= 600;break;
            case 38: mathScaled=600;break;
            case 37: mathScaled=590;break;
            case 36: mathScaled=580;break;
            case 35: mathScaled=570;break;
            case 34: mathScaled=560;break;
            case 33: mathScaled =560;break;
            case 32: mathScaled=550;break;
            case 31: mathScaled=540;break;
            case 30: mathScaled=530;break;
            case 29: mathScaled=520;break;
            case 28: mathScaled=520; break;

            case 27: mathScaled=510;break;
            case 26: mathScaled=500;break;
            case 25: mathScaled=490;break;
            case 24: mathScaled=480;break;
            case 23: mathScaled=480;break;
            case 22: mathScaled=470;break;
            case 21: mathScaled=460;break;
            case 20: mathScaled=450;break;
            case 19: mathScaled=440;break;
            case 18: mathScaled=430;break;
            case 17: mathScaled=420;break;
            case 16: mathScaled=410;break;
            case 15: mathScaled=390; break;
            case 14: mathScaled=380;break;
            case 13: mathScaled=370;break;
            case 12: mathScaled=360;break;
            case 11: mathScaled=340;break;
            case 10: mathScaled=330;break;
            case 9: mathScaled=320;break;
            case 8: mathScaled=310;break;
            case 7: mathScaled=290;break;
            case 6: mathScaled=280;break;
            case 5: mathScaled=260;break;
            case 4: mathScaled=240;break;
            case 3: mathScaled=230;break;
            case 2: mathScaled=210;break;
            case 1: mathScaled=200;break;
            case 0: mathScaled=200;break;
        }
        return mathScaled;
    }
   public int compositeRW(int readingRight, int writingRight){

        int scaledReading=0, scaledWriting=0;
        switch(readingRight){
            case 52:
                scaledReading=40;break;
            case 51:
                scaledReading=40;break;
            case 50: scaledReading=39;break;
            case 49: scaledReading=38;break;
            case 48: scaledReading=38;break;
            case 47: scaledReading= 37;break;
            case   46: scaledReading=37;break;
            case 45: scaledReading=35;break;
            case 44: scaledReading=35;break;
            case    43: scaledReading=35;break;
            case 42: scaledReading=34;break;
            case 41: scaledReading=33;break;
            case 40: scaledReading=33;break;
            case 39: scaledReading= 32;break;
            case 38: scaledReading=32;break;
            case 37: scaledReading=31;break;
            case 36: scaledReading=31;break;
            case 35: scaledReading=30;break;
            case 34: scaledReading=30;break;
            case 33: scaledReading =29;break;
            case 32: scaledReading=29;break;
            case 31: scaledReading=28;break;
            case 30: scaledReading=28;break;
            case 29: scaledReading=27;break;
            case 28: scaledReading=26; break;
            case 27: scaledReading=26;break;
            case 26: scaledReading=25;break;
            case 25: scaledReading=25;break;
            case 24: scaledReading=24;break;
            case 23: scaledReading=24;break;
            case 22: scaledReading=23;break;
            case 21: scaledReading=23;break;
            case 20: scaledReading=22;break;
            case 19: scaledReading=22;break;
            case 18: scaledReading=21;break;
            case 17: scaledReading=21;break;
            case 16: scaledReading=20;break;
            case 15: scaledReading=20;break;
            case 14: scaledReading=19;break;
            case 13: scaledReading=19;break;
            case 12: scaledReading=19;break;
            case 11: scaledReading=17;break;
            case 10: scaledReading=17;break;
            case 9: scaledReading=16;break;
            case 8: scaledReading=15;break;
            case 7: scaledReading=14;break;
            case 6: scaledReading=14;break;
            case 5: scaledReading=13;break;
            case 4: scaledReading=12;break;
            case 3: scaledReading=11;break;
            case 2: scaledReading=10;break;
            case 1: scaledReading=10;break;
            case 0: scaledReading=10;break;
        }
        switch (writingRight){
            case 44: scaledWriting=40; break;
            case    43: scaledWriting=39;break;
            case 42: scaledWriting=38;break;
            case 41: scaledWriting=37;break;
            case 40: scaledWriting=36;break;
            case 39: scaledWriting= 35;break;
            case 38: scaledWriting=34;break;
            case 37: scaledWriting=34;break;
            case 36: scaledWriting=33;break;
            case 35: scaledWriting=32;break;
            case 34: scaledWriting=32;break;
            case 33: scaledWriting =31;break;

            case 32: scaledWriting=30;break;
            case 31: scaledWriting=30;break;
            case 30: scaledWriting=29;break;
            case 29: scaledWriting=28;break;
            case 28: scaledWriting=28; ;break;
            case 27: scaledWriting=27;break;
            case 26: scaledWriting=25;break;
            case 25: scaledWriting=26;break;
            case 24: scaledWriting=25;break;
            case 23: scaledWriting=25;break;

            case 22: scaledWriting=24;break;
            case 21: scaledWriting=23;break;
            case 20: scaledWriting=23;break;
            case 19: scaledWriting=22;break;
            case 18: scaledWriting=21;break;
            case 17: scaledWriting=21;break;
            case 16: scaledWriting=20;break;
            case 15: scaledWriting=19;break;
            case 14: scaledWriting=19;break;
            case 13: scaledWriting=18;break;
            case 12: scaledWriting=17;break;
            case 11: scaledWriting=16;break;
            case 10: scaledWriting=16;break;
            case 9: scaledWriting=15;break;
            case 8: scaledWriting=14;break;
            case 7: scaledWriting=13;break;
            case 6: scaledWriting=13;break;
            case 5: scaledWriting=12;break;
            case 4: scaledWriting=11;break;
            case 3: scaledWriting=10;break;
            case 2: scaledWriting=10;break;
            case 1: scaledWriting=10;break;
            case 0: scaledWriting=10;break;
        }

        return (scaledReading+scaledWriting)*10;
    }

}

