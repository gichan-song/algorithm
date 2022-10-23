import java.util.Scanner;

public class DFS {
	static int[] stack = new int[8];
	static int top = -1;
	static int[] visited = new int[8];
	static int[][] arr = new int[8][8];
	
	public static void main(String[] args) {
		for (int i = 0; i<7; i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
//			sc.close();
		}
		dfs(1);
	}
	
	static void push(int v) {
		System.out.println(v);
		stack[++top] = v;
		visited[v] = 1;
	}
	
	static void pop() {
		top--;
	}
	
	static void dfs(int v) {
		push(v);
		
		while(top>=0) {
			for (int i = 1; i<=7; i++) {
				if (visited[i] == 0 && arr[stack[top]][i] == 1) {
					push(i);
					i = 1;
				}
			}
			pop();
		}
	}
	
	

}
