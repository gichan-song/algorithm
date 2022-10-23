import java.util.Scanner;

public class subset {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] set = new int[sc.nextInt()];
		int i, j, t;
		int n = set.length;
		int sum;
		int ret = 0;
		
		for(t = 0; t<testcase; t++) {
			for(i = 0; i<n; i++) {
				set[i] = sc.nextInt();
			}
		}
		
		for (i = 1; i<(1<<n); i++) {
			sum = 0;
			for(j = 0; j<n; j++) {
				if((i & (1<<j)) == 1) {
					sum += set[j]; 
				}
			}
			if (sum == 0) {
				ret = 1;
				break;
			}
		}
		
		System.out.printf("%s\n", ret == 1 ? "True" : "False");
		// TODO Auto-generated method stub

	}

}
