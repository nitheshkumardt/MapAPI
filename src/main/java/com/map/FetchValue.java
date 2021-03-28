package com.map;

public class FetchValue {
	public static int i=0,j=0,s1=0,s2=0;
	public static double[] x =new double[3];
	public static double[] y =new double[3];
	public static double getXvalue() {
		double x2=x[i];
		i=i+1;
		System.out.println(i+" "+x2);
		return x2;
	}
	public static double getYvalue() {
		double x2=y[j];
		j=j+1;
		System.out.println(i+" "+x2);
		return x2;
	}
	public static void setXvalue(double val) {
		x[s1++]=val;
	}
	public static void setYvalue(double val) {
		y[s2++]=val;
	}
}
