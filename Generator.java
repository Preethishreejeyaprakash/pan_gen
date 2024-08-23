package PAN_CARD_GENERATION;
import java.util.Scanner;
import java.util.Random;
public class Generator {
			public static void main(String[] args) {
		     Scanner scan=new Scanner(System.in);
			System.out.println("Enter your First Name :");
			String name=scan.nextLine();
			System.out.println("Enter your Last Name :");
			String lastname=scan.nextLine();
			System.out.println("Enter the Registered Purpose:");
			String purpose=scan.nextLine();
			String pan_no="";
			String pan="";
			String last="";
			Random random=new Random();
			char[] alphabet= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			for(int i=0;i<3;i++) {
				pan_no=pan_no+alphabet[(int)(Math.random()*100%26)];
			}
			if(purpose.equals("INDIVIDUAL"))
			purpose="Personal";
		    pan_no=pan_no+purpose.charAt(0);
	     	pan_no=pan_no+name.charAt(0);
			for(int i=0;i<4;i++) {
			int random_no=random.nextInt(10);
			 pan+=Integer.toString(random_no);
			}
			last=last+alphabet[(int)(Math.random()*100%26)];
			
			System.out.println("\n");
			System.out.println("----------------------------------------");
			System.out.println("First Name :"+name);
			System.out.println("Last Name :"+lastname);
			System.out.println("Category :"+purpose);
			System.out.println("----------------------------------------");
			System.out.println("Generated Pan Number :"+"\""+pan_no+pan+last+"\"");
			System.out.println("----------------------------------------");
			scan.close();
}
		}
