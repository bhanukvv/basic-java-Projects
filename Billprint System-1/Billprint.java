import java.util.Scanner;
class Billprint{
//bill header

	public static void main(String args[]){
		System.out.println("===============================================================================================");
		System.out.println(" _          _   _                            _           _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /_ | | __ ___  _ __  ___  ___   | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ _/ _ \\| '_ \\/_  \\/ _ \\  | __/   \\   | | |\\/| |/  ' | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_|( )|| | | | | |  __/  | |_| O |   | | |  | |  O  | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\__\\___/|_| |_| |_|\\___|  \\___\\___/   |_|_|  |_|\\__,_|_|  \\___|");
		System.out.println("");
		System.out.println("===============================================================================================");
		System.out.println("");
        Scanner scanner = new Scanner(System.in);


// Input phone number and name
                System.out.print("Enter customer Phone Number: ");
        String phoneNumber = scanner.next();
	scanner.nextLine();
 
                System.out.print("Enter customer Name: ");
	String name = scanner.nextLine();
       		System.out.println("");
		System.out.println("================================================================================================");
		System.out.println(" ");
	
//product prices
	Double Basmathiprice=250.00;
	Double Dhalprice=180.00;
	Double Sugarprice=150.00;
	Double Highlandprice=1200.00;
	Double Yoghurtprice=50.00;
	Double Flourprice=120.00;
	Double Soapprice=160.00;


// Getting info 
		System.out.print("Basmathi Qty(Kg)         - " );
	Double BasmathiQty=scanner.nextDouble();

		System.out.print("\nDhal Qty(Kg)             - " );
	Double DhalQty=scanner.nextDouble();

		System.out.print("\nsugar Qty(Kg)            - " );
	Double SugarQty=scanner.nextDouble();

		System.out.print("\nHighland Qty(Kg)         - " );
	Double HighlandQty=scanner.nextDouble();

		System.out.print("\nYoghurt Qty(Kg)          - " );
	Double YoghurtQty=scanner.nextDouble();

		System.out.print("\nFlour Qty(Kg)            - " );
	Double FlourQty=scanner.nextDouble();

		System.out.print("\nSoap Qty                 - " );
	Double SoapQty=scanner.nextDouble();


// Calculate total
        Double Basmathip=(Basmathiprice*BasmathiQty);
	Double Dhalp=(Dhalprice*DhalQty);
	Double Sugarp=(Sugarprice*SugarQty);
	Double Highlandp=(Highlandprice*HighlandQty);
	Double Yoghurtp=(Yoghurtprice*YoghurtQty);
        Double Flourp=(Flourprice*FlourQty);
	Double Soapp=(Soapprice*SoapQty);
	Double Total=(Basmathiprice*BasmathiQty)+(Dhalprice*DhalQty)+(Sugarprice*SugarQty)+(Highlandprice*HighlandQty)+(Yoghurtprice*YoghurtQty)+(Flourprice*FlourQty)+(Soapprice*SoapQty);
	Double Discount= (Total*10)/100;
	Double Price = (Total-Discount);


// Print the bill
		System.out.println();
		System.out.println("+---------------------------------------------------------------------------------------------+");
		System.out.println("|											      |");
		System.out.println("|                                                                                             |");
		System.out.println("|                              __  __                _______   __________                     |");
		System.out.println("|                         _   |  \\/  |      /\\      |       \\ |___    ___|		      |");
		System.out.println("|                        (_)  |      |     /  \\     |   __   |    |  |                        |");
		System.out.println("|                         _   | \\  / |    /    \\    |  |__)  |    |  |                        |");
		System.out.println("|                        | |  | |\\/| |   /  /\\  \\   |   __   /    |  |                        |");
		System.out.println("|			 | |  | |  | |  /  ____  \\  |  |  \\  \\    |  |                        |");
		System.out.println("|			 |_|  |_|  |_| /__/    \\__\\ |__|   \\__\\   |__|                        |");
		System.out.println("|			  	                                                              |");
		System.out.println("|                                 90/5 Sumudu Avanue Kaluthara                                |");
		System.out.println("|                                                                                             |");
		System.out.println("|                                                                                             |");
		System.out.println("+---------------------------------------------------------------------------------------------+");
        
                System.out.printf("|%11s%-8s : %-40s%31s|\n", "", "#Tel", phoneNumber, "");
                System.out.printf("|%11s%-8s : %-40s%31s|\n", "", "#Name", name, "");
		System.out.println("+--------------------------+---------------+-----------------------+--------------------------+");
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("%s %26s %6s %8s %15s %7s %8s %17s\n","|","|","Qty","|","Unit price","|","Price","|");
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.println("+--------------------------+---------------+-----------------------+--------------------------+");
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Basmathi", BasmathiQty, Basmathiprice, Basmathip);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Dhal", DhalQty, Dhalprice, Dhalp);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Sugar", SugarQty, Sugarprice, Sugarp);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Highland", HighlandQty, Highlandprice, Highlandp);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Yoghurt", YoghurtQty, Yoghurtprice, Yoghurtp);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Flour", FlourQty, Flourprice, Flourp);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.printf("| %-24s | %9.0f     | %15.2f       | %20.2f     |\n", "Soap", SoapQty, Soapprice, Soapp);
		System.out.printf("%s %26s %15s %23S %26s\n", "|","|","|","|","|");
		System.out.println("+--------------------------+---------------+-----------------------+--------------------------+");
		System.out.printf("%s %42s %23S %26s\n", "|","|","|","|");
		System.out.printf("| %-40s | %15s       | %24.2f |\n", "", "Total", Total);	
		System.out.printf("%s %42s %23S %26s\n", "|","|","|","|");
		System.out.printf("| %93s\n","+-----------------------+--------------------------+");
		System.out.printf("%s %42s %23S %26s\n", "|","|","|","|");
		System.out.printf("| %-40s | %15s       | %24.2f |\n", "", "Discount(10%)",Discount );
		System.out.printf("%s %42s %23S %26s\n", "|","|","|","|");
		System.out.printf("| %93s\n","+-----------------------+--------------------------+");
		System.out.printf("%s %42s %23S %26s\n", "|","|","|","|");
		System.out.printf("| %-40s | %15s       | %24.2f |\n", "", "Price", Total-Discount );
		System.out.printf("%s %42s %23S %26s\n", "|","|","|","|");
		System.out.println("+------------------------------------------+-----------------------+--------------------------+");

//Calculates change
		int cash;
		System.out.print("Enter custemor given amount : ");
		cash=scanner.nextInt();
		int change;
		change=(int)(cash - (Total - Discount));
		System.out.println();

//summary table net amount,cash,change

		System.out.println("+---------------------+---------------+");
		System.out.printf("| %-20s | %-13s |\n", "net amount", Total-Discount);
		System.out.println("+---------------------+---------------+");
		System.out.printf("| %-20s | %-13.2f |\n", "cash", (double)cash);
		System.out.println("+---------------------+---------------+");
		System.out.printf("| %-20s | %-13.2f |\n", "change", (double)change);
		System.out.println("+---------------------+---------------+");
		System.out.println();

//notes and coins

		int notes5000, notes2000, notes1000, notes500, notes100, notes50, notes20;
		int coins10, coins5, coins2, coins1;
	        int remainingbalance;		
		notes5000 = change / 5000;
		remainingbalance = change % 5000;
        	notes2000 = remainingbalance / 2000;
        	remainingbalance = remainingbalance % 2000;
        	notes1000 = remainingbalance / 1000;
        	remainingbalance = remainingbalance % 1000;
        	notes500 = remainingbalance / 500;
        	remainingbalance = remainingbalance % 500;
        	notes100 = remainingbalance / 100;
        	remainingbalance = remainingbalance % 100;
        	notes50 = remainingbalance / 50;
        	remainingbalance = remainingbalance % 50;
        	notes20 = remainingbalance / 20;
        	remainingbalance = remainingbalance % 20;
        	coins10 = remainingbalance / 10;
        	remainingbalance = remainingbalance % 10;
        	coins5 = remainingbalance / 5;
        	remainingbalance = remainingbalance % 5;
        	coins2 = remainingbalance / 2;
        	remainingbalance = remainingbalance % 2;
		coins1 = remainingbalance / 1;
        	remainingbalance = remainingbalance % 1;
		int totalNotes = notes5000 + notes2000 + notes1000 + notes500 + notes100 + notes50 + notes20;
        	int totalCoins = coins10 + coins5 + coins2 + coins1;

//notes and coins table
		
		 System.out.println("+---------------------+---------------+");
                 System.out.printf("| %-20s| %-14s|\n", "value", "No");
       		 System.out.println("+---------------------+---------------+");
      		  System.out.printf("| %-20s| %-14d|\n", "Rs.5000", notes5000);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.2000", notes2000);
       		 System.out.println("|---------------------|---------------|");
        	System.out.printf("| %-20s| %-14d|\n", "Rs.1000", notes1000);
       		 System.out.println("|---------------------|---------------|");
      		 System.out.printf("| %-20s| %-14d|\n", "Rs.500", notes500);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.100", notes100);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.50", notes50);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.20", notes20);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.10", coins10);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.5", coins5);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.2", coins2);
       		 System.out.println("|---------------------|---------------|");
       		 System.out.printf("| %-20s| %-14d|\n", "Rs.1", coins1);
       		 System.out.println("+---------------------+---------------+");
       		 System.out.printf("| %-20s| %-14d|\n", "No of Notes", totalNotes);
       		 System.out.println("+---------------------+---------------+");
        	System.out.printf("| %-20s| %-14d|\n", "No of Coins", totalCoins);
      		  System.out.println("+---------------------+---------------+");
//thank you msg
		System.out.println("\n\n---------------------------------------");
		System.out.println("  THANK YOU FOR SHOPPING WITH US !!!");
		System.out.println("---------------------------------------");


		}
}

		

