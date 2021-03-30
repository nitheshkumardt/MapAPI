package com.map;

import java.util.ArrayList;

public class FetchValue {
	public static int i=0,j=0,size=0;
//	public static double[] x =new double[3];
//	public static double[] y =new double[3];
	public static ArrayList<String> x=new ArrayList<>();
	public static ArrayList<String> y=new ArrayList<>();
	public static int getSize() {
		System.out.println(size);
		return size;
	}
	public static void setSize(int size) {
		FetchValue.size = size;
	}
	
	public static double getXvalue() {
		double x2=Double.parseDouble(x.get(j));
		i=i+1;
		System.out.println(i+" "+x2);
		return x2;
	}
	public static double getYvalue() {
		double x2=Double.parseDouble(y.get(j));
		j=j+1;
		System.out.println(i+" "+x2);
		return x2;
	}
	public static void setXvalue(String val) {
		x.add(val);
	}
	public static void setYvalue(String val) {
		y.add(val);
	}
}
