package hw;
/*
 * Topic: 假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
 * 而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，請問老問需找多少個1元、5元、50元，
 * 其銅板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，
 * 且a115+ a220+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw01_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 System.out.print("金錢：");
		 int m = scn.nextInt();
		 System.out.print("蘋果數量為：");
		 int a = scn.nextInt();
		 System.out.print("柳丁數量為：");
		 int o = scn.nextInt();
		 System.out.print("桃子數量為：");
		 int p = scn.nextInt();
	     int fsum = a*15+o*20+p*30;
	     int urm  = m-fsum;
	     if (urm>=0){
	     System.out.println(urm/50+"個50元");
	     System.out.println((urm-(urm/50)*50)/5+"個5元");
	     System.out.println((urm-(urm/50)*50)-(urm-(urm/50)*50)/5*5+"個1元");}
	     else if(urm<0){
	    	  System.out.println(0);
	     }
	}
}

