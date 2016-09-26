package hw;
/*
 * Topic: 已知男生標準體重＝(身高－80 )0.7；女生標準體重＝(身高－70)0.6；試寫一個程式可以計算男生女生的標準體重。
 * 	(輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("輸入1為男性 2為女性");
		int s = scn.nextInt();
		System.out.print("身高：");
		int h = scn.nextInt();
        if(s==1){
        	System.out.print((h-80)*0.7);}
        	else if(s==2){
        		System.out.print((h-70)*0.6);}}}


