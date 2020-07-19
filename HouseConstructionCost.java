package com.codebin;
import java.io.File;

import java.util.logging.Logger;
import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

import jdk.internal.jline.internal.Log;
public class HouseConstructionCost {

	public static  org.apache.log4j.Logger log1=LogManager.getLogger(HouseConstructionCost.class);


	
	public static void CalculateCostForConstruction(int choice,float area_of_construction) {
		int flag=0;
		int cost_per_sqfeet=0;
		try {
		switch(choice) {
		case 1:cost_per_sqfeet=1200;
			break;
		case 2:cost_per_sqfeet=1500;
		break;
		case 3:cost_per_sqfeet=1800;
		break;
		case 4:cost_per_sqfeet=2500;
		break;
		default:flag=1;
		break;
	
}
		if(flag==1) {
			log1.error("Please enter a value from 1 to 4");
		}
		float total_cost_of_construction=cost_per_sqfeet*area_of_construction;
		log1.info("Total construction cost is "+total_cost_of_construction);
		
	}
		catch(Exception e) {
			log1.error("Unexpected error occured");
		}
	}
	}