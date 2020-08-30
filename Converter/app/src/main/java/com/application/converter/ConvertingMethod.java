package com.application.converter;

public class ConvertingMethod {
    //class to convert units of area
    static class Area{
        public double sqMilliToMeter(double milli)
        {
            return (milli/1000000);
        }

        public double sqMeterToMilli(double sqmeter)
        {
            return (sqmeter*1000000);
        }

        public double sqCentiToMeter(double sqCenti)
        {
            return (sqCenti/10000);
        }

        public double sqMeterToCenti(double Smeter)
        {
            return (Smeter*10000);
        }

        public double sqKiloToMeter(double Kilo)
        {
            return (Kilo*1000000);
        }

        public double sqMeterToKilo(double Sqmeter)
        {
            return (Sqmeter/1000000);
        }

        public double AcreToMeter(double acre)
        {
            return (acre*4046.86);
        }

        public double sqMeterToAcre(double sqMeter)
        {
            return (sqMeter/4046.86);
        }

        public double HectareToMeter(double Hectare)
        {
            return (Hectare*10000);
        }

        public double sqMeterToHectare(double SQmeter)
        {
            return (SQmeter/10000);
        }
    }

    //class to convert units of length
    static class Length{
        public double MilliToMeter(double milli)
        {
            return (milli/1000);
        }

        public double MeterToMilli(double meter)
        {
            return (meter*1000);
        }

        public double CentiToMeter(double Centi)
        {
            return (Centi/100);
        }

        public double MeterToCenti(double meter)
        {
            return (meter*100);
        }

        public double KiloToMeter(double Kilo)
        {
            return (Kilo*1000);
        }

        public double MeterToKilo(double meter)
        {
            return (meter/1000);
        }

        public double NanoToMeter(double milli)
        {
            return (milli/1000000000);
        }

        public double MeterToNano(double meter)
        {
            return (meter*1000000000);
        }
    }

    //class to convert units of weight
    static class Weight
    {
        public double GramToKilo(double Grams)
        {
            return (Grams/1000);
        }

        public double KiloToGram(double Kilograms)
        {
            return (Kilograms*1000);
        }

        public double PoundsToKilo(double Pounds)
        {
            return (Pounds/2.20462);
        }

        public double KiloToPounds(double Kilograms)
        {
            return (Kilograms*2.20462);
        }

        public double OuncesToKilo(double Ounces)
        {
            return (Ounces/35.274);
        }

        public double KiloToOunces(double Kilograms)
        {
            return (Kilograms*35.274);
        }
    }
}
