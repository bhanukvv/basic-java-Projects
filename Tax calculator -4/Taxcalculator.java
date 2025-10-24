import java.util.*;
class Taxcalculator{

//input things
    static Scanner input=new Scanner(System.in);
    
//Clear console method    
    public final static void clearConsole() { 
        try { 
            final String os = System.getProperty("os.name"); 
            if (os.contains("Windows")) { 
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            } else { 
                System.out.print("\033[H\033[2J"); 
                System.out.flush(); 
            } 
        } catch (final Exception e) { 
            e.printStackTrace();  
        } 
    }

//Withholding Tax Method 
    public static void WithholdingTax(){
        clearConsole();
        boolean stay=true;
        while (stay){
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("|												     |");
            System.out.println("|				       WITHHOLDING TAX						     |");
            System.out.println("|												     |");
            System.out.println("------------------------------------------------------------------------------------------------------\n");

            System.out.println("\t\t [1] Rent Tax\n");
            System.out.println("\t\t [2] Bank Interest Tax\n ");    
            System.out.println("\t\t [3] Dividend Tax\n");
            System.out.println("\t\t [4] Exit\n");

            System.out.print("\nEnter an Option to Continue --> ");
            int optionTax;
            while(true){
                try{
                    optionTax=Integer.parseInt(input.nextLine());
                    break;
                }catch(Exception e){
                    System.out.print("Invalid input! Enter again: ");
                }
            }

//Rent tax    
            if(optionTax==1){
                boolean stayRent=true;
                while(stayRent){
                    clearConsole();
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("|												     |");
                    System.out.println("|			              RENT  TAX         					     |");
                    System.out.println("|												     |");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                
                    int rentamount;
                    double tax;
                    String stayhere;
                
                    System.out.print("\nEnter your Rent : " );
                    while(true){
                        try{
                            rentamount=Integer.parseInt(input.nextLine());
                            break;
                        }catch(Exception e){
                            System.out.print("Invalid input! Enter a number: ");
                        }
                    }

                    if(rentamount<0){
                        System.out.println("\nInvalid Input..");
                    }else if(rentamount<100000){
                        System.out.println(" \nYou Don't have to pay rent ");
                    }else{
                        tax=(double)(rentamount*10)/100.0;
                        System.out.printf("\n\nYou have to pay Rent tax : %.2f \n\n", tax);
                    }

                    System.out.print("Do you want to calculate another Rent tax(y/n) : ");
                    stayhere=input.nextLine();
                    if(stayhere.equalsIgnoreCase("N")){
						clearConsole();
                        stayRent=false;
                    }
                }
            }

//Bank Interest tax
            if(optionTax==2){
                boolean staybanktax=true;
                while(staybanktax){
                    clearConsole();
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("|			              BANK INTEREST TAX        					     |");
                    System.out.println("|												     |");
                    System.out.println("------------------------------------------------------------------------------------------------------\n");
                    
                    double BankInterest=0;
                    while(true){
                        System.out.print("Enter your Bank Interest per Year : ");
                        String bankinterest=input.nextLine();
                        try{
                            BankInterest=Double.parseDouble(bankinterest);
                            if(BankInterest<=0){
                                System.out.println("Invalid Amount! Enter again.");
                                continue;
                            }
                            break;
                        }catch(Exception e){
                            System.out.println("Invalid input! Please enter numbers only.");
                        }
                    }

                    double bankinteresttax=(BankInterest*5)/100.0;
                    System.out.printf("\nYou have to pay Bank Interest tax per year: %.2f\n", bankinteresttax);

                    System.out.print("Do you want to calculate another Bank Interest tax(y/n) : ");
                    String again = input.nextLine();
                    if(again.equalsIgnoreCase("N")){
						clearConsole();
                        staybanktax = false;
                    }
                }
            }
            
//Dividend Tax
            if(optionTax == 3){
                boolean Dividenttax = true;

                while(Dividenttax){
                    clearConsole();
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("|                         DIVIDEND TAX                                  |");
                    System.out.println("------------------------------------------------------------------------------------------------------\n");

                    int Smdividends=0;
                    while(true){
                        System.out.print("Enter your total Dividend for Year: ");
                        String dividendInput = input.nextLine();
                        try{
                            Smdividends=Integer.parseInt(dividendInput);
                            if(Smdividends<0){
                                System.out.println("Invalid Input! Enter again.");
                                continue;
                            }
                            break;
                        }catch(Exception e){
                            System.out.println("Invalid input! Please enter a valid number.");
                        }
                    }

                    if(Smdividends > 100000){
                        double SmdividendsTax = (Smdividends - 100000) * 0.14;
                        System.out.println("You have to pay dividend tax per year: Rs." + SmdividendsTax);
                    } else {
                        System.out.println("You don’t have to pay Dividend Tax….");
                    }

                    System.out.print("\nDo you want to calculate Dividend Tax again? (Y/N): ");
                    String choice = input.nextLine();
                    if(choice.equalsIgnoreCase("N")){
						clearConsole();
                        Dividenttax = false;
                    }
                }
            }    

//Exit option
            if(optionTax==4){
                stay=false;
            }
        }    
    }

//Payable Tax
    public static void PaybleTax(){
        boolean stay = true;
        while(stay) {
            clearConsole();
            System.out.println("---------------------------------------------------------");
            System.out.println("|                     PAYABLE TAX                        |");
            System.out.println("---------------------------------------------------------");
            double salary=0;
            while(true){
                System.out.print("Enter Monthly Salary: ");
                String salaryStr=input.nextLine();
                try{
                    salary=Double.parseDouble(salaryStr);
                    if(salary<=0){
                        System.out.println("Salary must be positive! Enter again.");
                        continue;
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Invalid input! Please enter numbers only.");
                }
            }

            double tax = 0;
            double[] limits = {41667, 41667, 41667, 41667, 41667};
            double[] rates = {0.06, 0.12, 0.18, 0.24, 0.30, 0.36};
            double remaining = salary - 100000;

            if(remaining > 0){
                for(int i=0;i<limits.length;i++) {
                    double apply = Math.min(remaining, limits[i]);
                    tax += apply * rates[i];
                    remaining -= apply;
                    if(remaining <= 0) break;
                }
                if(remaining > 0) tax += remaining * rates[5];
            }

            System.out.printf("Payable Tax: Rs. %.2f\n", tax);
            System.out.print("Do you want to calculate another Payable Tax (y/n): ");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("N")) stay = false;
        }
    }

//Income Tax
    public static void IncomeTax() {
        boolean stay = true;
        while(stay) {
            clearConsole();
            System.out.println("---------------------------------------------------------");
            System.out.println("|                     INCOME TAX                         |");
            System.out.println("---------------------------------------------------------");

            double income=0;
            while(true){
                System.out.print("Enter Annual Income: ");
                String incomeStr=input.nextLine();
                try{
                    income=Double.parseDouble(incomeStr);
                    if(income<0){
                        System.out.println("Income must be positive! Enter again.");
                        continue;
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Invalid input! Numbers only.");
                }
            }

            double tax = 0;
            double[] limits = {500000, 500000, 500000, 500000, 500000};
            double[] rates = {0.06, 0.12, 0.18, 0.24, 0.30, 0.36};
            double remaining = income - 1200000;

            if(remaining > 0){
                for(int i=0;i<limits.length;i++) {
                    double apply = Math.min(remaining, limits[i]);
                    tax += apply * rates[i];
                    remaining -= apply;
                    if(remaining <= 0) break;
                }
                if(remaining > 0) tax += remaining * rates[5];
            }

            if(tax==0) System.out.println("No Income Tax.");
            else System.out.printf("Income Tax: Rs. %.2f\n", tax);
            System.out.print("Do you want to calculate another Income Tax (y/n): ");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("N")) stay = false;
        }
    }

//SSCL Tax
    public static void Sscl() {
        boolean stay = true;
        while(stay) {
            clearConsole();
            System.out.println("---------------------------------------------------------");
            System.out.println("|                      SSCL TAX                           |");
            System.out.println("---------------------------------------------------------");

            double value=0;
            while(true){
                System.out.print("Enter Value of Goods: ");
                String valueStr=input.nextLine();
                try{
                    value=Double.parseDouble(valueStr);
                    if(value<=0){
                        System.out.println("Value must be positive! Enter again.");
                        continue;
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Invalid input! Numbers only.");
                }
            }

            double saleTax = value * 0.025;
            double afterSale = value + saleTax;
            double vat = afterSale * 0.15;
            double total = saleTax + vat;
            System.out.printf("Total SSCL Tax: Rs. %.2f\n", total);
            System.out.print("Do you want to calculate another SSCL Tax (y/n): ");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("N")) stay = false;
        }
    }

//Leasing Payment
    public static void LeasingPayment() {
        boolean stay = true;
        while(stay) {
            clearConsole();
            System.out.println("---------------------------------------------------------");
            System.out.println("|                    LEASING PAYMENT                     |");
            System.out.println("---------------------------------------------------------");

            double A=0, rate=0;
            int nYears=0;
            while(true){
                try{
                    System.out.print("Enter Lease Amount: ");
                    A=input.nextDouble();
                    System.out.print("Enter Annual Interest Rate (%): ");
                    rate=input.nextDouble();
                    System.out.print("Enter Number of Years (max 5): ");
                    nYears=input.nextInt();
                    input.nextLine();
                    if(A<=0 || rate<=0 || nYears<=0 || nYears>5){
                        System.out.println("Invalid input! Enter again.");
                        continue;
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Invalid input! Enter again.");
                    input.nextLine();
                }
            }

            double i = rate / 100 / 12;
            int n = nYears * 12;
            double monthly = A * i / (1 - Math.pow(1 + i, -n));
            System.out.printf("Monthly Installment: Rs. %.2f\n", monthly);
            System.out.print("Do you want to calculate another Leasing Payment (y/n): ");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("N")) stay = false;
        }
    }

//Main Method
    public static void main(String args[]){
        while(true){
            clearConsole();
            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("                                                              __  ______  _________ ________");
            System.out.println("                                                             |  \\/      \\|         |        \\");
            System.out.println("                                                              \\$|  $$$$$$| $$$$$$$$ \\$$$$$$$$");
            System.out.println("                                                             |  | $$   \\$| $$__       | $$");
            System.out.println("                                                             | $| $$     | $$  \\      | $$");
            System.out.println("                                                             | $| $$    _| $$$$$      | $$");
            System.out.println("                                                             | $| $$___/ | $$_____    | $$");
            System.out.println("                                                             | $$\\$$    $| $$     \\   | $$");
            System.out.println("                                                              \\$$ \\$$$$$$ \\$$$$$$$$    \\$$");

            System.out.println();
            
            System.out.println(" _________              __    __     _____                    _           ______     _     _     _                    ___________       ______       ______");
            System.out.println("|___   ___|     /\\      \\ \\  / /    / ____|        /\\        | |         / _____|   | |   | |   | |           /\\     |____   ____|     /  ___ \\     |  __   \\");
            System.out.println("    | |        /  \\      \\ \\/ /    | |            /  \\       | |        | |         | |   | |   | |          /  \\         | |          | |   | |    | |__)   |");
            System.out.println("    | |       / /\\ \\      >  <     | |           / /\\ \\      | |        | |         | |   | |   | |         / /\\ \\        | |          | |   | |    |  __   /");
            System.out.println("    | |      / ____ \\    /  . \\    | |____      / ____ \\     | |____    | |_____    | |___| |   | |____    / ____ \\       | |          | |___| |    | |  \\  \\");
            System.out.println("    |_|     /_/    \\_\\  /_/ \\ _\\    \\_____|    /_/    \\_\\    |______|    \\______|    \\_____/    |______|  /_/    \\_\\      |_|           \\_____/     |_|   \\_\\");
            System.out.println("==============================================================================================================================================================");
            System.out.println("\n\n\n");
            
            System.out.println("\n        [1] Withholding Tax " );
            System.out.println("\n        [2] Payable Tax " );
            System.out.println("\n        [3] Income Tax " );
            System.out.println("\n        [4] Social Security Contribution levy (SSCL) Tax " );
            System.out.println("\n        [5] Leasing Payment " );
            System.out.println("\n        [6] Exit " );
            
            int option=0;
            while(true){
                System.out.print("\n\nEnter an Option to Continue --> ");
                try{
                    option=Integer.parseInt(input.nextLine());
                    break;
                }catch(Exception e){
                    System.out.println("Invalid input! Enter a number between 1-6.");
                }
            }
            
            switch(option){
                case 1:
                    clearConsole();
                    WithholdingTax();
                    break;
                case 2:
                    PaybleTax();
                    break;
                case 3:
                    IncomeTax();
                    break;
                case 4:
                    Sscl();
                    break;
                case 5:
                    LeasingPayment();
                    break;
                case 6:
                    System.out.println("System Off");
                    return;
                default:
                    System.out.println("Invalid option! Please try again....");
            } 
        }  
    }
} 
