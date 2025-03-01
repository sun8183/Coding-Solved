import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		String[] arr = null;
		String tmp = sc.nextLine();
		StringBuilder result = new StringBuilder("");
		
		if(t == 1) System.out.println(tmp);
		
		else {
			arr = new String[t];
			arr[0] = tmp;
			
			for(int i=1; i<=t-1; i++) {
				arr[i] = sc.nextLine();
			}
			
			for(int i=1; i<arr.length; i++) {
				result.setLength(0);
				for(int j=0; j<arr[0].length(); j++) {
					if(arr[i-1].charAt(j) != arr[i].charAt(j)) {
						result.append("?");
					} else result.append(arr[i].charAt(j));
					
				}
				arr[i] = result.toString();
			}
		}
		
		System.out.println(result);
		sc.close();
	
	}

}

