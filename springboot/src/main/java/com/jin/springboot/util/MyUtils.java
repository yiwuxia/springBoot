package com.jin.springboot.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MyUtils {

	
	private static Map<String,Object> map=new HashMap<String, Object>();
	public static Map<String,Object> getCacheMap(){return map;}
	//一个基数
	//一个变化浮动值
	//产生的浮动数组
	//int
	public static String  [] getRandomArrIntByNum(int num,int via,int count){
			String [] arr=new String[count];
			int max=num+via;
	        int min=num-via;
	      for (int i = 0; i < count; i++) {
	    	  arr[i]=generatingIntBounded(max,min);
	      }
			return arr;
	        
	}
	public static String  [] getRandomDoubleByNum(Double num,Double via,int count){
		String [] arr=new String[count];
		double max=num+via;
		double min=num-via;
      for (int i = 0; i < count; i++) {
    	  arr[i]=generatingDoubleBounded(max,min);
      }
		return arr;
        
}
	
	
	public static String generatingIntBounded(int max,int min){
	    Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return String.valueOf(s);
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRandomDoubleByNum(10.0,1.0,5)));
	}
	
	public static String  generatingDoubleBounded(double max,double min)  {
		
		return "";
	}

}
