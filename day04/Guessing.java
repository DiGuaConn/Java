package day04;
import java.util.Scanner;
//猜数字小游戏
public class Guessing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1); //1到1000
		System.out.println(num); //作弊
		
		//1)do.while语法 2)三要素 3)改错 4)退出/大小 5)恭喜/下次     
		int guess;
		do {
			System.out.println("猜吧!");
			guess = scan.nextInt(); //1+3
			if(guess==0) {
				break;
			}
			if(guess>num) {
				System.out.println("太大了");
			}else if(guess<num){
				System.out.println("太小了");
			}
		}while(guess!=num); //2
		if(guess==num) {
			System.out.println("恭喜你，猜对了!");
		}else {
			System.out.println("下次再来吧!");
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("猜吧!");
		int guess = scan.nextInt(); //1.
		while(guess!=num) { //2.
			if(guess==0) {
				break;
			}
			if(guess>num) {
				System.out.println("太大了");
			}else {
				System.out.println("太小了");
			}
			System.out.println("猜吧!");
			guess = scan.nextInt(); //3.
		}
		if(guess==num) {
			System.out.println("恭喜你，猜对了!");
		}else {
			System.out.println("下次再来吧!");
		}
		*/
	}
}


















