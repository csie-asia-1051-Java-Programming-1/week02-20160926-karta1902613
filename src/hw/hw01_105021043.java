package hw;
/*
 * Topic: ���]�ɪO��1���B5���B50���@�T�ءA�����Фp���h�楫���R���G�A���F�p��N���A�B������ݡA�n�����p�����s�����ƥحn�̤֡A
 * �Ӥp����F���G�u�R�Fa1��ī�G�Aa2���h�B�A��a3����l�A1��ī�G15���A1���h�B20���A1����l30���A�аݦѰݻݧ�h�֭�1���B5���B50���A
 * ��ɪO�ƥس̤֡C(����J�������p���h�ֿ��AN�A���ۿ�Ja1, a2, a3 �A �b��n, a1, a2, a3����ơA
 * �Ba115+ a220+ a3*30�p��ε���N�C�C�X�@��p���h�֭�1���A5����50���A�Y�a���������R���G�A�h��ܡ�0��)
 * Date: 2016/09/26
 * Author: 105021043 �B�ͤ�
 */
import java.util.Scanner;
public class hw01_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 System.out.print("�����G");
		 int m = scn.nextInt();
		 System.out.print("ī�G�ƶq���G");
		 int a = scn.nextInt();
		 System.out.print("�h�B�ƶq���G");
		 int o = scn.nextInt();
		 System.out.print("��l�ƶq���G");
		 int p = scn.nextInt();
	     int fsum = a*15+o*20+p*30;
	     int urm  = m-fsum;
	     if (urm>=0){
	     System.out.println(urm/50+"��50��");
	     System.out.println((urm-(urm/50)*50)/5+"��5��");
	     System.out.println((urm-(urm/50)*50)-(urm-(urm/50)*50)/5*5+"��1��");}
	     else if(urm<0){
	    	  System.out.println(0);
	     }
	}
}

