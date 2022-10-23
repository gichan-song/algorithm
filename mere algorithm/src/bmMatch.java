import java.util.Scanner;
public class bmMatch {
	
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtlen = txt.length();
		int patlen = pat.length();
		int[] skip = new int[Character.MAX_VALUE + 1];
		
		for(pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patlen;
		}
		for(pt = 0; pt <= patlen - 1; pt++) {
			skip[pat.charAt(pt)] = patlen - pt - 1;
		}
		int count = 0;
		while(pt < txtlen) {
			pp = patlen -1;
			
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp == 0) {
					count++;
					break;
				}
				pp--;
				pt--;
			}
			
			pt += (skip[txt.charAt(pt)] > patlen - pp) ? skip[txt.charAt(pt)] : patlen - pp;
		}
		System.out.println(count);
		return -1;
	}

	public static void main(String[] args) {
	
//		int[] skip = new int[Character.MAX_VALUE + 1];
//		System.out.println(Character.MAX_VALUE+0);
		Scanner sc = new Scanner(System.in);
		
		String pat = sc.next();
		sc.nextLine();
		String txt = sc.nextLine();
		
//		String pat = "ti";
//		String txt = "Start eating well with these eight tips for healthy eating, which cover the basics of a healthy diet and good nutrition";
		
		bmMatch(txt, pat);
		
		// TODO Auto-generated method stub

	}

}
