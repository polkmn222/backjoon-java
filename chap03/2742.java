
/*

자연수 N이 주어졌을 때,
N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */



import java.util.Scanner;

public class Main { 
	public static void main(String[] args)  { 
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=a; i>=1; i--) {
			System.out.println(i);
		}
		
	} 
}



	
	


