import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[8][8];
		
		int testcase = sc.nextInt();
		
		boolean flag;
		int count;
		int i, j, t, k, m;
		
		for (t=0; t<testcase; t++) {
			int length = sc.nextInt();
			String chars = sc.next();
			for(i = 0; i<8; i++) {
				for(j = 0; j<8; j++) {
					arr[i][j] = chars.charAt(8*i+j); 
				}
			}
			count = 0;
			for(i = 0; i<8; i++) {
					for(k = 0; k<8-length+1; k++) {
						flag = true;
						for(m = 0; m<length/2; m++) {
							if(arr[i][k+m] != arr[i][k+length-m-1]) {
								flag = false;
							}
						}
						if(flag) {
							count++;
						}
					}
			}
			
			for(j = 0; j<8; j++) {
				for(k = 0; k<8-length+1; k++) {
					flag = true;
					for(m = 0; m<length/2; m++) {
						if(arr[k+m][j] != arr[k+length-m-1][j]) {
							flag = false;
						}
					}
					if(flag) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
				
		// TODO Auto-generated method stub

	}

}
