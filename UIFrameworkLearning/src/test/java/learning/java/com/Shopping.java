package learning.java.com;


import java.util.Scanner;

import org.testng.annotations.Test;

public class Shopping {
	
	
@Test
	public void nestedIf() {
			
		    Scanner sc = new Scanner(System.in);
			System.out.println("purchasing total amount : ");
			int totalamount = sc.nextInt();
			//String name = a.next();
			System.out.println("enter your coupon code : ");
			int couponcode = sc.nextInt();
			
		if(totalamount >= 5000 && totalamount <= 10000) {
				if(couponcode == 1593) {
					System.out.println("you have 10% discount");
					
				}
				else if(couponcode == 2712) {
					System.out.println("you have 15% discount");

				}
				else if(couponcode == 719) {
					System.out.println("you have 20% discount");

				}
			}
			
			else if(totalamount >= 10000 && totalamount <= 20000) {
			if(couponcode == 1593) {
					System.out.println("you have 15% discount");
					
				}
				else if(couponcode == 2712) {
					System.out.println("you have 20% discount");

				}
				else if(couponcode == 719) {
					System.out.println("you have 25% discount");

				}
			
			}
			
			
			else if(totalamount == 500 && totalamount <= 300) {
				System.out.println("shoppingmore avail more offers");
			}
				 
			else
				
			{
				System.out.println("Thankyou For Shopping");
			}
			
				}
			
						
}

			


