import java.util.Scanner;

public class Backtracking {
	int testCase;
	int w, h;
	
	static int[][] maze = new int[100][100];
	static int[][] visited = new int[100][100];
	
	static int i, j;
	static char input[] = new char[100];
	
	static int finePath(int x, int y) {
		int tempResult = 0;
		
		if (maze[x][y] == 1 || visited[x][y] == 1) return 0;
		else if (maze[x][y] == 3) return 1;
		else {
			visited[x][y] = 1;
			
			tempResult += finePath(x - 1, y);
			tempResult += finePath(x + 1, y);
			tempResult += finePath(x, y - 1);
			tempResult += finePath(x, y + 1);
			
			visited[x][y] = 0;
			
			return tempResult;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		while(testCase-- == 1) {
			
			for (i = 0; i<100; i++) {
				for (j = 0; j<100; j++) {
					maze[i][j] = 1;
					visited[i][j] = 0;
				}
			}
			
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			for(i = 0; i<h; i++) {
				input[i] = sc.next().charAt(0);
				for(j = 0; j<w; j++) {
					maze[i][j] = input[j] - '0';
				}
			}
			
			if (finePath(1, 1)> 0) System.out.println("1\n");
			else System.out.println("0\n");
		}
		
		
		// TODO Auto-generated method stub

	}

}
