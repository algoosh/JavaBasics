package reviewingRipl;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		 if (browser.equals("ChRoME")) {
				
					System.out.println("Proceed with chrome Browser");
					
				}else if(browser.equals("FireFOX")) {
					System.out.println("Proceed with firefox Browser");
					
				}else if	(browser.equals( "Ie")) {
						System.out.println("Proceed with ie Browser");
						
						}else {
							System.out.println("Invalid Browser");
						
					
						}
			}

		
	}


