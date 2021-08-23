import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 10'den kucuk bir sayi isteyin ve girilen
		// sayinin faktoryelini bulun. (5!=5*4*3*2*1)
		
		Scanner scan =new Scanner (System.in);
		System.out.print("lütfen 10'dan küçükk 1 tam sayı giriniz:");
		int num = scan.nextInt();
		int faktoryel=1;
		
		System.out.print(num+ "!=");
		for (int i = num; i>=2; i--) {
			faktoryel= faktoryel*i;
			System.out.print(i);
			if (i!=num+1) {
				System.out.print("*");
			}
		}System.out.println("1="+faktoryel);
		

	}

}
