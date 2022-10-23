import java.util.Scanner;

public class Baby_Gin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[10];
		int tri = 0;
		int run = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int t = 0; t<testCase; t++) {
			String input = sc.next();
			if(input.charAt(0) == '0') {
				input = '1' + input.substring(1);
				int input0 = Integer.parseInt(input);
				for(int i = 0; i<6; i++) {
					c[input0 % 10]++;
					input0 /= 10;
				}
				c[0]++;
				c[1]--;
			}else {
				int input1 = Integer.parseInt(input);
				for(int i = 0; i<6; i++) {
					c[input1 % 10]++;
					input1 /= 10;
				}
			}
				
			
			for(int i = 0; i<10; i++) {
				if (c[i]>=3) {
					c[i] -=3;
					tri += 1;
					if(i != 0) {
						i--;
					}
					
				}
				if(i<8) {
					if((c[i]>=1) && (c[i+1]>=1) && (c[i+2] >=1)) {
						c[i] -= 1;
						c[i+1] -= 1;
						c[i+2] -= 1;
						run += 1;
						if(i != 0) {
							i--;
						}
						
					}
				}
				
			}
			if(run + tri == 2) {
				System.out.println("Baby Gin");
			}else {
				System.out.println("Lose");
			}
			for(int i = 0; i<10; i++) {
				c[i] = 0;
			}
			tri = 0;
			run = 0;
		}
		
	}

}
