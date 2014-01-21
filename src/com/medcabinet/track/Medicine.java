package com.medcabinet.track;

public class Medicine {
	public static String name, addInfo;
	public static int dose, total;
	
	public static String getName () {
		return name;
	}
	
	public static String getAddInfo(){
		return addInfo;
	}
	
	public static int getDose(){
		return dose;
	}
	
	public static int getTotal (){
		return total;
	}
	
	public static void setName (String givenName){
		name = givenName;
	}
	
	public static void setAddInfo (String givenAddInfo){
		addInfo = givenAddInfo;
	}
	
	public static void setDose (int givenDose){
		dose = givenDose;
	}
	
	public static void setTotal (int givenTotal) {
		total = givenTotal;
	}
}
