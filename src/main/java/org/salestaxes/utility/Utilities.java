package org.salestaxes.utility;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Utilities {

	private Utilities() {

	}

	public static DecimalFormat getDecimalFormatter() {
		DecimalFormat df = new DecimalFormat("#0.00");
		DecimalFormatSymbols decimalSeparator = new DecimalFormatSymbols(Locale.US);
		df.setDecimalFormatSymbols(decimalSeparator);
		df.setRoundingMode(RoundingMode.HALF_UP);
		return df;
	}

}
