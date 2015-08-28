package com.example.user.aniongap;

import java.lang.Math;

public  class General_Medcalc{

    public General_Medcalc() { }

    public static double[] BMI (double Height, double Weight, boolean isMale) //String Method part of parameters when body surface area added)
    {

        double BMI_Values[] = new double[4];
        double LBWeight = 0;
        double IBWeight = 0;
        double BodyMI = 0;


        if (!isMale)
        {
            LBWeight  = (1.07 * Weight) - (148 * (Math.pow((Math.pow(Weight, 2)/(100* Height)),2))); //(women)
            IBWeight  = 45.5 + (2.3* ((Height*39.3700787402) - 60) );}

        else
        {
            LBWeight  = (1.10 * Weight) - (128 * (Math.pow(Math.pow(Weight, 2) / (100 * Height), 2))); //(men)
            IBWeight  = 50 + (2.3 * ((Height*39.3700787402) - 60 )) ;
        }

        BodyMI = Weight /(Height * Height );

            BMI_Values[0] = 0;//BodySArea (Height, Weight, Method);
            BMI_Values[1] = LBWeight;
            BMI_Values[2] = IBWeight;
            BMI_Values[3] = BodyMI;


        return BMI_Values;

//*DISCLAIMER: All calculations must be confirmed before use. The authors make no claims of the accuracy of the information
// contained herein; and these suggested doses are not a substitute for clinical judgement. Neither MedSol nor any other
// party involved in the preparation or publication of this application shall be liable for any special, consequential, or exemplary
// damages resulting in whole or part from any user's use of or reliance upon this material.
    }


    public static double  BodySArea (double Height, double Weight, String Method)
    {


        double BSA = 0;
        double IBWeight = 0;
        double BodyMI = 0;



        if(Method.equals("Mosteller"))
        {
            //Mosteller
            BSA = java.lang.Math.sqrt((((Height * 100) * Weight) / 3600)) ;
        }
        else
        if(Method.equals("DuBois"))
        {
            //DuBois & DuBois
            BSA	= 0.20247 * (java.lang.Math.pow(Height, 0.725)) * (java.lang.Math.pow(Weight, 0.425));
        }
        else
        if(Method.equals("Haycock"))
        {
            //Haycock
            BSA = 0.024265 * (java.lang.Math.pow(Height, 0.3964)) * (java.lang.Math.pow(Weight, 0.5378));
        }
        else
        if(Method.equals("Gehan"))
        {
            //Gehan & George
            BSA = 0.0235 * (Math.pow(Height, 0.42246)) * (Math.pow(Weight, 0.51456));
        }
        else
        if(Method.equals("Boyd"))
        {
            //Boyd
            BSA = 0.0003207 * (Math.pow(Height, 0.3)) * Math.pow((Weight * 1000), 0.7285) - (0.0188 * Math.log(Weight));
        }

              return BSA;

        //*DISCLAIMER: All calculations must be confirmed before use. The authors make no claims of the accuracy of the information
        // contained herein; and these suggested doses are not a substitute for clinical judgement. Neither MedSol nor any other
        // party involved in the preparation or publication of this application shall be liable for any special, consequential, or exemplary
        // damages resulting in whole or part from any user's use of or reliance upon this material.
    }







}
