package PAN_CARD_GENERATION;
import java.util.*;
public class Generator {
			public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
			String name=scan.nextLine();
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
			System.out.println(pan_no+pan+last);}
		}
