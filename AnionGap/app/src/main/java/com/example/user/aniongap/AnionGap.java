package com.example.user.aniongap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static java.lang.String.*;


public class AnionGap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anion_gap);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_anion_gap, menu);
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

    public void buttonOnClick(View v)
    {
        // do something when the button is clicked
        boolean ismale = true;
        double height = 0;
        double weight = 0;
        double[] BMI_Values = new double[4];
        Button button=(Button) v;

        TextView tWeight = (TextView) findViewById(R.id.Weight_Text);
        TextView tHeight = (TextView) findViewById(R.id.Height_Text);
        TextView lbWeight = (TextView) findViewById(R.id.lbwText);
        TextView ibWeight = (TextView) findViewById(R.id.ibwText);
        TextView bmiWeight = (TextView) findViewById(R.id.bmiText);

        RadioGroup radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);

                // get selected radio button from radioGroup
                int selectedId = radioSexGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioSexButton = (RadioButton) findViewById(selectedId);

        if (radioSexButton.getText().equals("Male")) ismale = true;
        else ismale = false;


        General_Medcalc General = new General_Medcalc();




        //GetWeight

        weight = Double.parseDouble(tWeight.getText().toString());

        //Get Height

        height = Double.parseDouble(tHeight.getText().toString());


        BMI_Values = General.BMI(height,weight,ismale);



        double roundOff = Math.round(BMI_Values[1] * 100.0) / 100.0;
        lbWeight.setText(valueOf(Math.round(BMI_Values[1] * 100.0) / 100.0));
        ibWeight.setText(valueOf(Math.round(BMI_Values[3] * 100.0) / 100.0));
        bmiWeight.setText(valueOf(Math.round(BMI_Values[3] * 100.0) / 100.0));




    }

}


