package com.example.user.aniongap;

/**
 * Created by Javaboy on 7/24/2015.
 */
public class Pharm_Medcalc
{
    private boolean male;
    private boolean female;
    private boolean gender;
/*
    public com.example.user.aniongap.Fluid_Medcalc(){}

    public static double Anion_Gap(double SodiumLvl,double PotassiumLvl,double ChlorideLvl, double BicarbonateLvl )
    {
        double Na = SodiumLvl;
        double K  = PotassiumLvl;
        double Cl = ChlorideLvl;
        double HCO3= BicarbonateLvl;
        double aniongp =  (Na + K) - (Cl + HCO3);

        return aniongp;
    }

    public static double Anion_Gap_alt(double SodiumLvl,double PotassiumLvl,double ChlorideLvl, double BicarbonateLvl )
    {
        double Na = SodiumLvl;
        double K  = PotassiumLvl;
        double Cl = ChlorideLvl;
        double HCO3= BicarbonateLvl;
        double aniongp =  Na  - (Cl + HCO3);

        return aniongp;
    }


    public static double Serum_Osmolality(double SodiumLvl,double PotassiumLvl,double BUN, double glucose )
    {
        double Na = SodiumLvl;
        double K  = PotassiumLvl;
        double Osmolality =  (2 * (Na + K)) + (BUN / 2.8) + (glucose / 18);

        return Osmolality;
    }


    public static double TBody_water(double Height, double Weight, int Age, boolean Diabetes, boolean Gender, String Method)
    {

        boolean f = female;
        boolean m = male;
        double TBW = 0 ;
        // Total Body Water / Urea Volume of Distribution

        if (Method = "Watson")
        {
            if (gender = f)
            {
                TBW = -2.097 + (0.1069 * Height)+(0.2466 * Weight);
            }

            else if (gender = m)
            {
                TBW = 2.447 - (0.09156 * Age)+(0.1074 * Height)+(0.3362 * Weight);
            }

        }
        else if (Method = "Hume - Weyers")
        {
            if (gender = f)
            {
                TBW = (0.34454 * Height)+(0.183809 * Weight)-35.270121;
            }

            else if (gender = m)
            {
                TBW = (0.194786 * Height)+(0.296785 * Weight)-14.012934;
            }
        }
        else if (Method = "Chertow")
        {
          Chertow 's Bioelectrical Impedance:
        TBW = Height x(0.0186104x Weight + 0.12703384) + Weight
        x(0.11262857x male + 0.00104135x age - 0.00067247x Weight - 0.04012056) - age
        x(0.03486146x male + 0.07493713) - male x 1.01767992 + diabetes x 0.57894981

        }
        else if (Method = "Mellits")
        {
            if (gender = f)
            {
                if (Height <= 110.8)
                {
                    TBW =  0.076 + 0.507 * Weight +0.013 * Height;
                }

                else if (Height > 110.8)
                {
                    TBW = -10.313 + 0.252 * Weight +0.154 * Height;
                }
            }

            else if (gender = m)
            {
                if (height <= 132.7)
                {
                    TBW = -1.927 + (0.465 * Weight) + (0.045 * Height);
                }
                else if (height > 132.7)
                {
                    TBW = -21.993 + (0.406 * Weight) + (0.209 * Height);
                }

            }
        }
        return TBW;
    }**/
}
