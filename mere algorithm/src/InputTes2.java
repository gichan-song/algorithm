import java.util.Scanner;

public class InputTes2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x,y = "";
		
		// next() 와 nextLine()의 차이점
		System.out.print("문자열 입력 : ");
		x = sc.next();		
		System.out.println(x);
		
		sc.nextLine(); // 이 부분을 넣어 준 이유!! -----------(1)
        // 위에서 "자바 이클립스" 입력시 "자바"라는 값만 입력받고 "이클립스" 부분은
        // 행사상품이 이월되듯이 없어지지않고 다음으로 넘어가서 y값에 영향을 주게됩니다.
        // 따라서 나머지값을 없애주기 위해 적었습니다.
		
		System.out.print("문자열 입력 : ");
		y = sc.nextLine(); 
		System.out.println(y);
	}

}