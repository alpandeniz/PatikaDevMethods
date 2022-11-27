import java.util.Scanner;

public class PalindromSayi {
	
	
	/*static boolean isPalindrome(int number) {
		int temp = number , reversNumber = 0 , lastNumber;
		while(temp!=0) {
			lastNumber = temp%10;
			reversNumber = (reversNumber*10) + lastNumber;
			temp/=10;
		}
		
		if(number == reversNumber) {
			System.out.println(number + " bir palindrom sayıdır.");
			return true;
		}else {System.out.println(number + " bir palindrom sayı değildir.");
		return false;
		}
	}*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//	System.out.print("Bir sayı giriniz: ");
	//	int n = scanner.nextInt();
	//	isPalindrome(n);
	//	scanner.close();
		
		//Üst satırlarda bulunan yöntem çok daha doğru bir yol ancak yinede alternatif bir şekilde yazacak olsak şunu deneyebilirdik;
		//Alternatif yol: 
		//---------------------------------- Sadece 3 haneli sayılar için yazdım, birazcık üstünde oynayarak iki ya da 4 haneli sayılar içinde benzer bir şey yazmak mümkün.
		System.out.print("Sayı giriniz: ");
		int number = scanner.nextInt();
		int temp = number;
		int a = temp%10;
		temp /=10;
		int b = temp%10;
		temp /=10;
		int c = temp;
		if(a==c) {
			System.out.println("Doğru");
			
		}else {
			System.out.println("Yanlış");
			
		}
		
		
	}

}
