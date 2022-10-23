import java.util.Scanner;

public class Gravity {
	final static int EMPTY = 0;
	final static int BOX = 1;
	public static void main(String[] args) {
		
		
		int i, j, k;
		int testCase;
		int T;
		int room[][] = new int[100][100];
		int roomWidth, roomHeight;
		int boxHeight;
		int maxFallen = 0;
		int countEmptySpace;
		
		Scanner sc = new Scanner(System.in);
		testCase = sc.nextInt();
		for (T = 0; T<testCase; T++) {
			roomWidth = sc.nextInt();
			roomHeight = sc.nextInt();
			for (i = 0; i<roomWidth; i++) {
				for (j = 0; j<roomHeight; j++) {
					room[i][j] = EMPTY;
				}
				maxFallen = 0;
			}
			for (i = 0; i<roomWidth; i++) {
				boxHeight = sc.nextInt();
				for (j = 0; j<boxHeight; j++) {
					room[i][j] = BOX;
				}
			}
			
			for (i = 0; i<roomWidth; i++) {
				for(j = 0; j<roomHeight; j++) {
					if (room[i][j] == BOX) {
						countEmptySpace = 0;
						for (k = i+1; k<roomWidth; k++) {
							if (room[k][j] == EMPTY) {
								countEmptySpace += 1;
							}
							if (countEmptySpace > maxFallen) {
								maxFallen = countEmptySpace;
							}
						}
					}
					
				}
				
			}
			System.out.printf("%d\n", maxFallen);
		}
		
		
		// TODO Auto-generated method stub

	}

}
