import java.util.Scanner;

public class Backtracking_stack {
	
	static class PAIR{
		int x, y;
	}
	
	
	
	

	public static void main(String[] args) {
		
		int[][] g_map = new int[100][100];
		char[][] g_resultmap = new char[100][100];
		PAIR[] g_stack = new PAIR[10000];
		int g_top;
		
		int T;
		int start_x, start_y, now_x, now_y;
		start_x = 0;
		start_y = 0;
		int is_findpath;
		int W, H, i, j;
		char[] str = new char[101];
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while(T-- != 0) {
			is_findpath = 0;
			g_top = 0;
			
			W = sc.nextInt();
			H = sc.nextInt();
			for (i = 0; i<H; i++) {
				str[i] = sc.next().charAt(0);
				for(j = 0; j<W; j++) {
					if (str[j] == '2') {
						start_x = j;
						start_y = i;
					}
					g_map[i][j] = str[j] - '0';
				}
			}
			
			g_stack[g_top].x = start_x;
			g_stack[g_top].y = start_y;
			g_top++;
			while (g_top != 0) {
				now_x = g_stack[g_top - 1].x;
				now_y = g_stack[g_top - 1].y;
				
				if (g_map[now_y][now_x] == 3) {
					is_findpath = 1;
					break;
				}
				g_map[now_y][now_x] = 1;
				
				if (now_x > 0 && g_map[now_y][now_x - 1] != 1) {
					g_stack[g_top].x = now_x - 1;
					g_stack[g_top].y = now_y;
					
					g_top++;
				}
				else if (now_x < W - 1 && g_map[now_y][now_x + 1] != 1) {
					g_stack[g_top].x = now_x + 1;
					g_stack[g_top].y = now_y;
					g_top++;
				}
				else if (now_y > 0 && g_map[now_y - 1][now_x] != 1) {
					g_stack[g_top].x = now_x;
					g_stack[g_top].y = now_y -1;
					g_top++;
				}
				else if(now_y <H -1&&g_map[now_y +1][now_x]!=1){
					g_stack[g_top].x =now_x;
					g_stack[g_top].y =now_y +1;
					g_top++;
				}
				else {
					g_top--;
				}
				
			}
			
		}
		// TODO Auto-generated method stub

	}

}
