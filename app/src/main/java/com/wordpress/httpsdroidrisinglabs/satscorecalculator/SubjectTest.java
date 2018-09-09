package com.wordpress.httpsdroidrisinglabs.satscorecalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SubjectTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_test);
        Intent intent = getIntent();
        final String test = intent.getExtras().getString("p");
        TextView testName = (TextView)findViewById(R.id.test);
        testName.setText(test);

        final TextView score = (TextView)findViewById(R.id.subjectScoreText);
        Button calcSubject = (Button)findViewById(R.id.calcSubject);
        final EditText bblank = (EditText)findViewById(R.id.numBlank);
        final EditText bwrong = (EditText)findViewById(R.id.numWrong);
        bblank.setHint("0-"+range(test));
        bwrong.setHint("0-"+range(test));

        calcSubject.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(bblank.getText().toString().trim().length()<=0 || bwrong.getText().toString().trim().length()<=0 ){
                    Toast.makeText(SubjectTest.this, "Fields are empty.", Toast.LENGTH_SHORT).show();
                }
                else{
                    InputMethodManager inputManager = (InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE);

                    inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);
                    final int blank = Integer.parseInt(bblank.getText().toString());
                    final int wrong = Integer.parseInt(bwrong.getText().toString());
                    if (test.equals("Physics")) {
                        score.setText("Your score is: " + physics(blank, wrong));
                    }
                    if (test.equals("Math 2")) {
                        score.setText("Your score is: " + math2(blank, wrong));
                    }
                    if (test.equals("Chem")) {
                        score.setText("Your score is: " + chem(blank, wrong));
                    }
                    if (test.equals("Math 1")) {
                        score.setText("Your score is: " + math1(blank, wrong));
                    }
                    if (test.equals("US History")) {
                        score.setText("Your score is: " + ush(blank, wrong));
                    }
                    if (test.equals("Bio E/M")) {
                        score.setText("Your score is: " + bio(blank, wrong));
                    }
                    if(test.equals("Literature")){
                        score.setText("Your score is: "+lit(blank, wrong));
                    }
                    if(test.equals("World History")){
                        score.setText("Your score is: "+wh(blank, wrong));
                    }
                }
            }
        });
    }
    public int range (String v){
        if (v.equals("Physics"))
                return 75;
        if(v.equals("Math 2"))
            return 50;
        if(v.equals("Chem"))
                return 85;
        if(v.equals("Math 1"))
            return 50;
        if(v.equals("US History"))
            return 90;
        if(v.equals("Bio E/M"))
            return 80;
        if(v.equals("Literature"))
            return 60;
        if(v.equals("World History"))
            return 95;
        return 0;
    }
    public String lit(int b, int w){
        double scaledd = 61-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);
        if(scaled==61||scaled==60||scaled==59) return "800";
        if(scaled==58||scaled==57) return "790";
        if(scaled==56) return "780";
        if(scaled==55) return "770";
        if(scaled==54) return "760";
        if(scaled==53||scaled==52) return "750";
        if(scaled==51) return "740";
        if(scaled==50) return "730";
        if(scaled==49) return "720";
        if(scaled==48||scaled==47) return "710";
        if(scaled==46) return "700";
        if(scaled==45) return "690";
        if(scaled==44||scaled==43) return "680";
        if(scaled==42) return "670";
        if(scaled==41) return "660";
        if(scaled==40) return "650";
        if(scaled==39||scaled==38) return "640" ;
        if(scaled==37) return "630";
        if(scaled==36) return "620";
        if(scaled==35) return "610";
        if(scaled==34) return "600";
        if(scaled <34 && scaled >=-15) return "<600";

        return "Error";
    }
    public String wh(int b, int w){
        double scaledd = 95-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);

        if(scaled<=95 && scaled >=78) return "800";
        if(scaled==77||scaled==76) return "790";
        if(scaled==75) return "780";
        if(scaled==74||scaled==73) return "770";
        if(scaled==72 || scaled==71) return "760";
        if(scaled==70 || scaled==69) return "750";
        if(scaled==68 || scaled==67) return "740";
        if(scaled==66) return "730";
        if(scaled==65||scaled==64) return "720";
        if(scaled==63||scaled==62) return "710";
        if(scaled==60) return "700";
        if(scaled==59) return "690";
        if(scaled==58||scaled==57) return "680";
        if(scaled==56||scaled==55) return "670";
        if(scaled==54||scaled==53) return "660";
        if(scaled==52) return "650";
        if(scaled==51||scaled==50) return "640";
        if(scaled==49||scaled==48) return "630";
        if(scaled==47||scaled==46) return "620";
        if(scaled==45||scaled==44) return "610";
        if(scaled==43) return "600";
        if(scaled<43 && scaled >=-24) return "<600";

        return "Error";
    }
    public String bio (int b, int w){
        double scaledd = 80-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);

        if(scaled<=80 && scaled >=77) return "800";
        if(scaled==76||scaled==75) return "790";
        if(scaled==74||scaled==73) return "780";
        if(scaled==72) return "770";
        if(scaled==71||scaled==70) return "760";
        if(scaled==70||scaled==69) return "750";
        if(scaled==68) return "740";
        if(scaled==67||scaled==66||scaled==65) return "730";
        if(scaled==64) return "720";
        if(scaled==63||scaled==62) return "710";
        if(scaled==61||scaled==60) return "700";
        if(scaled==59) return "690";
        if(scaled==58||scaled==57) return "680";
        if(scaled==56||scaled==55||scaled==54) return "670";
        if(scaled==53) return "660";
        if(scaled==52||scaled==51) return "650";
        if(scaled==50) return "640";
        if(scaled==49||scaled==48) return "630";
        if(scaled==47) return "620";
        if(scaled==46||scaled==45||scaled==44) return "610";
        if(scaled==43||scaled==42) return "600";
        if(scaled <42||scaled >-20) return "<600";

        return "Error";
    }
    public String ush (int b, int w){
        double scaledd = 90-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);

        if(scaled<=90 && scaled >=82) return "800";
        if(scaled==81 || scaled==80||scaled==79) return "790";
        if(scaled==78||scaled==77) return "780";
        if(scaled==76||scaled==75) return "770";
        if(scaled==74||scaled==73) return "760";
        if(scaled==72) return "750";
        if(scaled==71 || scaled==70) return "740";
        if(scaled==69) return "730";
        if(scaled==68||scaled==67) return "720";
        if(scaled==66) return "710";
        if(scaled==65||scaled==54) return "700";
        if(scaled==63||scaled==62) return "690";
        if(scaled==61||scaled==60||scaled==59||scaled==58) return "670";
        if(scaled==57||scaled==56) return "660";
        if(scaled==55) return "650";
        if(scaled==54||scaled==53) return "640";
        if(scaled==52||scaled==51) return "630";
        if(scaled==50) return "620";
        if(scaled==49) return "610";
        if(scaled==48||scaled==47) return "600";
        if(scaled <47 && scaled >-10) return "<600";

        return "Error";
    }
    public String math1 (int b, int w){
        double scaledd = 50-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);
        if(scaled==50) return "800";
        if(scaled==49) return "790";
        if(scaled==48)
            return "780";
        if (scaled==47) return "760";
        if(scaled==46) return "750";
        if(scaled==45) return "740";
        if(scaled==44) return "730";
        if (scaled==43) return "720";
        if(scaled==42) return "710";
        if(scaled==41) return "700";
        if(scaled==40) return "690";
        if (scaled==39) return "680";
        if(scaled==38) return "670";
        if(scaled==37) return "650";
        if(scaled==36) return "640";
        if (scaled==35) return "630";
        if(scaled==34) return "620";
        if(scaled==33) return "610";
        if(scaled==32||scaled==31) return "600";
        if(scaled <30 && scaled >=-12)
            return "<600";
        return "Error";
    }
    public String chem( int b, int w){
        double scaledd = 85-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);

        if(scaled <=85 && scaled >=80)
            return "800";
        if(scaled>=77 && scaled <=79)
            return "790";
        if(scaled==76||scaled==75) return "780";
        if(scaled==74) return "770";
        if(scaled==73||scaled==72) return "760";
        if(scaled==71) return "750";
        if(scaled==70 || scaled==69) return "740";
        if(scaled==68 || scaled==67) return "730";
        if(scaled==66||scaled==65) return "720";
        if(scaled==64||scaled==63) return "710";
        if(scaled==62||scaled==61) return "700";
        if(scaled==60) return "690";
        if(scaled==59) return "680";
        if(scaled==58||scaled==57) return "670";
        if(scaled==56) return "660";
        if(scaled==55) return "650";
        if(scaled==54||scaled==53) return "640";
        if(scaled==52||scaled==51) return "630";
        if(scaled==50) return "620";
        if (scaled==49|scaled==48) return "610";
        if(scaled==47||scaled==46) return "600";
        if(scaled<46 && scaled >=-10) return "<600";

        return "Error";
    }

    public String math2(int b, int w){
        double scaledd = 50-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);
        if(scaled<=50 && scaled >=43)
            return "800";
        if(scaled==42)
            return "790";
        if (scaled==41) return "780";
        if(scaled==40) return "770";
        if(scaled==39) return "760";
        if(scaled==38) return "750";
        if (scaled==37) return "740";
        if(scaled==36) return "730";
        if(scaled==35) return "720";
        if(scaled==34) return "710";
        if (scaled==33) return "700";
        if(scaled==32) return "690";
        if(scaled==31 || scaled==30) return "680";
        if(scaled==29) return "670";
        if (scaled==28) return "660";
        if(scaled==27) return "650";
        if(scaled==26) return "640";
        if(scaled==25) return "630";
        if(scaled==24) return "630";
        if(scaled==23) return "620";
        if(scaled==22) return "610";
        if(scaled==21) return "600";
        if(scaled <21 && scaled >=-13)
            return "<600";

        return "Error";
    }

    public String physics(int b, int w){
        double scaledd = 75-(b+w)-(w*0.25);
        int scaled = (int)Math.round(scaledd);

        if(scaled>=66 && scaled <=75)
            return "800";
        if(scaled >=63 && scaled<=65)
            return "790";
        if(scaled >=60 && scaled <=62)
            return "780";
        if(scaled ==58 || scaled == 59)
            return "770";
        if(scaled == 56 || scaled==57)
            return "760";
        if(scaled== 55)
            return "750";
        if(scaled == 53|| scaled == 54)
            return "740";
        if(scaled==52)
            return "730";
        if(scaled==51||scaled==50)
            return "720";
        if(scaled==49)
            return "710";
        if(scaled==48)
            return "700";
        if(scaled==47||scaled==46)
            return "690";
        if(scaled<=45 && scaled>=43)
            return "680";
        if (scaled==42 || scaled==41)
            return "670";
        if(scaled==40)
            return "660";
        if(scaled==39)
            return "650";
        if(scaled ==38||scaled==37)
            return "640";
        if(scaled==36)
            return "630";
        if(scaled==35)
            return "620";
        if(scaled==33||scaled==34)
            return "610";
        if(scaled==32 || scaled==31)
            return "600";
        if(scaled<31&&scaled >=-19)
            return "<600";
        return "Error";
    }

}
