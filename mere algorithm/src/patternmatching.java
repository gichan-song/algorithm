import java.util.Scanner;
public class patternmatching {

	public static void main(String[] args) {
		
		int i, j;
		int flag;
		int count;
		String strstring, tcstring = "";
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		strstring = sc.next();
		sc.nextLine();
		tcstring = sc.nextLine();
		
		char[] str = new char[strstring.length()];
		char[] tc = new char[tcstring.length()];
		
		for(i = 0; i<str.length; i++) {
			str[i] = strstring.charAt(i);
		}
		for(i = 0; i<tc.length; i++) {
			tc[i] = tcstring.charAt(i);
		}
		
//		sc.close();
//		System.out.println(tc.length);
//		System.out.println(str.length);
		for(int t = 0; t<testcase; t++) {
			count = 0;
			i = 0;
			while(i<tc.length-str.length+1) {
					if(tc[i+str.length-1] != str[str.length-1]) {
						for(j=1; j<str.length; j++) {
							
							if(tc[i+str.length-1-j] == str[str.length-1]){
								i += j;
								flag = 1;
								break;
							}else {
								flag = 0;
							}
							if(flag == 0) {
								i += str.length;
							}
						}
					}else{
						flag = 1;
						for(j = 0; j<str.length; j++) {
							if(tc[i+str.length-j-1] != str[str.length-j-1]) {
								flag = 0;
							}
						}
						if(flag == 1) {
							count++;
						}
						i += str.length;
					}
				
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub

	}

}
