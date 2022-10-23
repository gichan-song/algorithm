import java.util.Scanner;

public class Josephus_array {

	public static void main(String[] args) {
		
		int[] player = new int[100000];
		int n, k, move_count, target = 0;
		int i, j;
		
		Scanner sc = new Scnanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		for (i = 0; i<n; i++) {
			player[i] = i + 1;
		}
		
		for (j = 0; j<n-1; j++) {
			move_count = 0;
			while(move_count < k) {
				target = (target + 1) % n;
				if (player[target] != -1) {
					move_count++;
				}
			}
			
			player[target] = -1;
			
			while (player[target] != -1) {
				target = (target + 1) % n;
			}
		}
		// TODO Auto-generated method stub

	}

}
