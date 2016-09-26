package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */

public class ex03_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h =(15*60+20)-(10*60+23);
		int b =60*2;
		int a =60*4;
		System.out.print(b/30*30+b/30*40+(h-a)/30*60+"元");}}
