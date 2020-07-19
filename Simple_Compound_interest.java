package com.codebin;
import java.io.File;
import java.util.AbstractList;
import java.util.logging.Logger;
import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

class Simple_Compound_interest {
	
	public static  org.apache.log4j.Logger log1=LogManager.getLogger(Simple_Compound_interest.class);
	static float power(float a,int b) {
		int i;
		float answer=1;
		for(i=1;i<=b;i++) {
			answer=answer*a;
		}return answer;
	}
	static void find_simple_interest(float principle,float interest_per_annum,int no_of_months) {
		try{
		float simple_interest=principle*interest_per_annum*no_of_months/12;
		log1.info("Simple Interest is "+simple_interest);
		}
		catch(Exception e) {
			log1.error("An unexpected Error occured");
		}
	}
	static void find_compound_interest(float principle,float interest_per_annum,int no_of_months,int review_period_in_months) {
		try {
		float compound_interest=principle*(power(1+(interest_per_annum*12/(review_period_in_months)),(no_of_months/review_period_in_months)))-principle;
		log1.info("Compound Interest is "+compound_interest);
	}
		catch(Exception e) {
			log1.error("An unexpected Error occured");
		}}
}
