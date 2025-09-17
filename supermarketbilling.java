package mysupermarket;
import java.util.Scanner;

public class supermarketbilling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of items purchase:");
		int n=sc.nextInt();
		//array to store details
		String[]itemname=new String[n];
		double[] price=new double[n];
		int[] qty= new int[n];
		double[]subtotal =new double[n];
		double total =0;
		//input details for each
		for (int i=0;i<n;i++) {
			System.out.println("Enter detail for item"+(i+1)+":");
			System.out.print("item name:");
			itemname[i]=sc.next();
			System.out.print("price per unit:");
			price[i]=sc.nextDouble();
			System.out.print("quantity:");
			qty[i]=sc.nextInt();
			subtotal[i]=price[i]*qty[i];
			total+=subtotal[i];
			//apply discount if total>50000
			double discount=0;
			if (total>50000){
				discount=total*0.05;
			}
		
			double amount=total-discount;
		
			System.out.println("\n=======supermarket receipt========");
			System.out.printf("%-15s %-10s %-12s %-12s%n", "Item", "Qty", "Price", "Subtotal");
			System.out.println("------------------------------------");
			for ( i=0; i<n; i++){
			System.out.printf("%-15s %-10d %-12.2f %-12.2f%n",itemname[i],qty[i],price[i],subtotal[i]);
			}
			 System.out.println("------------------------------------------");
		        System.out.printf("%-25s %.2f%n", "Grand Total:", total);
		        System.out.printf("%-25s %.2f%n", "Discount:", discount);
		        System.out.printf("%-25s %.2f%n", "Final Amount Payable:", amount);
		        System.out.println("==========================================");
		        sc.close();
		}
			
		

	}

}
