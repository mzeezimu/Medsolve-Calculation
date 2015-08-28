package com.example.user.aniongap;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;


public class GenAnxDisActivity extends ActionBarActivity {

    public RadioGroup RadioGenAnxDis;
    public TextView Qtext;
    public int score = 0;
    public int count = 0;
    public String Questionz[]= new String[8];
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_anx_dis);
        RadioGenAnxDis = (RadioGroup) findViewById(R.id.RGroupGenAnxDisorder);
        Qtext = (TextView) findViewById(R.id.QuestionTextView);
        button = (Button)findViewById(R.id.button3);


            Questionz[0] = "Feeling nervous, anxious, or on edge ?";
            Questionz[1] = "Not being able to stop or control worrying?";
            Questionz[2] = "Worrying too much about different things?";
            Questionz[3] = "Trouble relaxing?";
            Questionz[4] = "Being so restless that it's hard to sit still?";
            Questionz[5] = "Becoming easily annoyed or irritable?";
            Questionz[6] = "Feeling afraid as if something awful might happen?";
            Questionz[7] = "If any of the above were scored more than 'Not at all':\n How difficult have these problems made it for you to do your work, take care of things at home, or get along with other people?";

        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_event_example);


        button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        while (count < 8)
                        {
                            Qtext.setText(Questionz[count]);

                            switch (RadioGenAnxDis.getCheckedRadioButtonId()) {
                                case 1:
                                    score += 0;
                                    break;
                                case 2:
                                    score += 1;
                                    break;
                                case 3:
                                    score += 2;
                                    break;
                                case 4:
                                    score += 3;
                                    break;
                            }
                        }
                    }
                } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gen_anx_dis, menu);
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

    public void buttonOnClick(View z) {


        Button button  = (Button) z;



            /*
            if (RadioGenAnxDis.getCheckedRadioButtonId()  == 0)
            {score+= 0;	}
            else if(RadioGenAnxDis.getCheckedRadioButtonId() == RbtnQue2)
            { score+= 1;}
            else if(RadioGenAnxDis.getCheckedRadioButtonId() == 2)
            { score += 2;}
            else if(RadioGenAnxDis.getCheckedRadioButtonId() == 3)
            {score += 3;}

            count ++;
        }*/

        }




    }

