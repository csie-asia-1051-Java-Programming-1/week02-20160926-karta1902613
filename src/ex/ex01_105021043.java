package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex01_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scn=new Scanner(System.in);
   int m = scn.nextInt();
  if(m<600){
	   System.out.print(m*0.5);}
  else if(m>=600 && m<1200){
	  System.out.print(m*0.5*0.9);}
  else if(m>=1200){
	   System.out.print(m*0.5*0.79);}}}
