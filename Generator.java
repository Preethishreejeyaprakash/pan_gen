package PAN_CARD_GENERATION;
import java.util.*;
public class Generator {
			public static void main(String[] args) {
		        Scanner input=new Scanner(System.in);
			String name=input.nextLine();
		        String last_name=input.nextLine();
			String purpose=input.nextLine();
			String seq1="";
			String seq2="";
			String seq3="";
			Random random=new Random();
			char[] alphabet= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			for(int i=0;i<3;i++) {
				seq1+=seq1+alphabet[(int)(Math.random()*100%26)];
			}
			if(purpose.equals("INDIVIDUAL"))
			purpose="Personal";
		        seq2=seq2+purpose.charAt(0);
	     	        seq2+=seq2+name.charAt(0);
			for(int i=0;i<4;i++) {
			int random_no=random.nextInt(10);
			 seq2+=Integer.toString(random_no);
			}
			seq3+=seq3+alphabet[(int)(Math.random()*100%26)]; //10  unique characters
			System.out.println(seq1+seq2+seq3);
			}
		}
