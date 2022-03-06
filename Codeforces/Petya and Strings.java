import java.util.Scanner;

public class Petya_and_Strings {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
	        String s1 =s.next();
	        String s2 = s.next();
	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();
	        int result = s1.compareTo(s2);
	        if(result > 0){
	            result = 1;
	        }else if(result < 0){
	            result = -1;
	        }
	        System.out.println(result);
	}

}
