import java.util.Scanner;

public class CapitalizeString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 String name="";
		String str = "";
	        name+=s.nextLine();
	        if(name.length()==1)
	        {
	        	if(name.charAt(0)>=65 &&name.charAt(0)<=91)
	        	{
	        		 str+=Character.toLowerCase(name.charAt(0));
	        	}
	        	
	        	System.out.println(str);
	        }
	        else if(name.length()==2)
	        {
	        	if(name.charAt(0)>=65 &&name.charAt(0)<=91)
	        	{
	        		 str+=Character.toLowerCase(name.charAt(0));
	        	}
	        	if(name.charAt(1)>=65 &&name.charAt(1)<=91)
	        	{
	        		 str+=Character.toLowerCase(name.charAt(1));
	        	}
	        	System.out.println(str);
	        }
	        else
	        {
	        for(int i=1;i<name.length();i++)
	        {
	        	
	        	str+=Character.toUpperCase(name.charAt(0));
	        	if(name.charAt(i)==' ')
	        	{
	        		str+=' ';
	        		str+=Character.toUpperCase(name.charAt(i+1));
	        		i++;
	        	}
	        	else if(name.charAt(i)>=65 &&name.charAt(i)<=91)
	        	{
	        		 str+=Character.toLowerCase(name.charAt(0));
	        	}
	        }
	        }
	        System.out.println(str);
	}

}
