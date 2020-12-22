import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Please  enter your Id");
		String Id = scan.nextLine();
		BankApplication bank = new BankApplication(name, Id);
		bank.menue();

	}
}
	class BankApplication{
		int balance =0;
		int oldTransaction =0;
		String customer_Id;
		String customer_name;
		
		BankApplication (String customerName , String customerId){
			customer_name= customerName;
			 customer_Id = customerId;

		}
		public void deposit(int amt){ //method to deposit money
			if(amt != 0){
				balance = balance + amt;          //increaments balance amt with the amt added
				oldTransaction = amt;              //Gives the old transaction details
				
			   }
		}
		
		public void withdrawal(int amt){ // method to withdraw money
			if(amt != 0){
				balance = balance-amt;                // gives the actual balance after deducting the money withdrawn
				oldTransaction = -amt;                // indicates money withdrawal
			  }
		}
		
		public void getoldTransaction(){
			if (oldTransaction > 0){
				System.out.println("Amt deposited: "+oldTransaction);
			}
			else if(oldTransaction < 0){
				System.out.println("Amt withdrawn:  "+Math.abs(oldTransaction));   // gives the positive value of money withdrawn
				
			}
			else{
				System.out.println("No transaction is done!");
			     }
		}
		
		public void menue(){
			int option=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome "+customer_name);                           //welcome message
			System.out.println("Your Id is "+customer_Id);
			System.out.println("\n");
			System.out.println("1. balance");
			System.out.println("2. Deposit");
			System.out.println("3. withdraw");
			System.out.println("4. oldTransaction");
			System.out.println("5. Exit");
			
			do{
				System.out.println(" Please enter the option");          //enter option
				option = scan.nextInt();
				System.out.println("\n");
				
				switch(option){ //option to display
				case 1:
					System.out.println("balance:"+balance);
					System.out.println("\n");
					break;
					
				case 2:
					System.out.println("Please enter amt to deposit ");
					int amt =scan.nextInt();
					deposit(amt);
					System.out.println("\n");
				    break;
				    
				case 3:
					System.out.println("Please enter amt to withdraw ");
					int amt2 =scan.nextInt();
					withdrawal(amt2);
					System.out.println("\n");
				    break;
				    
				case 4:
					System.out.println("--------------------------------------------------------");
					getoldTransaction();
					System.out.println("\n");
				    break;
				    
				case 5:
					System.out.println("---------------exit--------------");
					break;
					
				    
				    default: System.out.println("Invalid option!!! Please try again");

				}
			}while(option != 5);
				System.out.println("Thankyou for using our services..............Visit again!");	
		}
		
	}


