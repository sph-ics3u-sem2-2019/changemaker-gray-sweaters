import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
		double change=(payment-cost);
		int num100s;
		int num50s;
		int num20s;
		int num10s;
		int num5s;
		int numtwoonies;
		int numloonies;
		int numquarters;
		int numdimes;
		int numnickels;
		
		
		
		System.out.println("your change is "+change);
		num100s=(int)(change/100);
		change=change%100;
		System.out.println(num100s+" x $100");
		num50s=(int)(change/50);
		change=change%50;
		System.out.println(num50s+" x $50");
		num20s=(int)(change/20);
		change=change%20;
		System.out.println(num20s+"x $20");
		num10s=(int)(change/10);
		System.out.println(num10s+" x $10");
		num5s=(int)(change/5);
		System.out.println(num5s+"x $5");
		numtwoonies=(int)(change/2);
		System.out.println(numtwoonies+" x $2");
		numloonies=(int)(change/1);
		System.out.println(numloonies+"x $1");
		numquarters=(int)(change/0.25);
		System.out.println(numquarters+"x $0.25");
		numdimes=(int)(change/0.10);
		System.out.println(numdimes+" x $0.10");
		numnickels=(int)(change/0.05);
		System.out.println(numnickels+"x $0.05");
		
		
		
				

	}

}
