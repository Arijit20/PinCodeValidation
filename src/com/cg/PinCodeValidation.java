package com.cg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PinCodeValidation {
	
	Scanner in = new Scanner(System.in);
	public void pinCodeValidator() {
		System.out.println("Enter your Pin Code :");
		String pinCode = in.next();
		Pattern pattern = Pattern.compile("^([1-9])(\\S){4}[0-9]$");
		Matcher matcher = pattern.matcher(pinCode);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Pin Code is Validated");
		else
			System.out.println("Please enter the correct Pin Code");
	}

	public static void main(String[] args) {
    System.out.println("Pin Code Validation Program");
    PinCodeValidation pinCodeValidation = new PinCodeValidation();
    pinCodeValidation.pinCodeValidator();
    
	}

}
