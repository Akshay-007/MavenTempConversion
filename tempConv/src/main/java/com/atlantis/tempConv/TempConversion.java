package com.atlantis.tempConv;

public class TempConversion {
public static double fahrenheitToCelcius(double fah)
{
	return (fah-32)*5/9;
}
public static double celciusToFahrenheit(double cel)
{
	return (cel*9/5)+32;
}
}
