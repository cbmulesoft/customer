package com.openshift.mule;
import java.text.NumberFormat;
import java.util.Locale;
 
/**
 * @author Mitali
 *
 */
public class AmountFormatter {
 
 public AmountFormatter() {
		super();
		// TODO Auto-generated constructor stub
	}

public static String amountFormatter (Integer amount, String locale) 
 {
 /* Format amount in US format which is the default */
 String localeArray[] = locale.split("_", 2);
 NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
 if (localeArray.length == 2)	
 	{ 
	 Locale france = new Locale(localeArray[0], localeArray[1]);
	 currencyFormat = NumberFormat.getCurrencyInstance(france); 
 	}
   return currencyFormat.format(amount.doubleValue());
 }
}
