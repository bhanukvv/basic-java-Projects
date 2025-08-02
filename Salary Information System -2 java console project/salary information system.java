import java.util.*;

class Assignment04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|                          SALARY INFORMATION SYSTEM !                    |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();

        System.out.printf("%29s\n", "[1] Calculate Income Tax");
        System.out.printf("%31s\n", "[2] Calculate Annual Bonus");
        System.out.printf("%30s\n", "[3] Calculate Loan Amount");

        System.out.println();
        int number;
        System.out.print("Enter an option to continue > ");
        number = input.nextInt();
        input.nextLine(); // clear buffer

        if (number == 1) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("|                          Calculate Income Tax !                         |");
            System.out.println("---------------------------------------------------------------------------");

            double salary;
            System.out.print("\nInput Employee name     - ");
            String name = input.nextLine();

            System.out.print("Input Employee Salary   -  ");
            salary = input.nextDouble();
            
            System.out.println();
            
            double incometax;
            if(salary>100000 && salary<=141667){
				incometax=(salary-100000)*0.06;
			}else if(salary>141667 && salary<=183333){
				incometax=41667*0.06+(salary-141667)*0.12;
			}else if(salary>183333 && salary<=225000){
				incometax=41667*0.06+41667*0.12+(salary-183333)*0.18;
			}else if(salary>225000 && salary<=266667){
				incometax=(41667*0.06+41667*0.12+41667*0.18)+(salary-225000)*0.24;
			}else{
				incometax=(41667*0.6+41667*0.12+41667*0.18+41667*0.24)+(salary-266667)*0.3;
			}
			System.out.printf("You have to pay Income Tax per Month : %.0f ",incometax);
		}
		if(number==2){
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("|                          Calculate Annual  Bonus !                      |");
			System.out.println("---------------------------------------------------------------------------");
			
			System.out.println();
			
			
			System.out.print("\nInput Employee name     - ");
            String name = input.nextLine();
            
			Double salary;
            System.out.print("Input Employee Salary   -  ");
            salary = input.nextDouble();
            
			Double annualbonus;
			if (salary<100000){
				annualbonus=5000.00;
			}else if(salary>100 && salary<=199999){
				annualbonus=salary*0.1;
			}else if(salary>=200000 && salary<=299999){
				annualbonus=salary*0.15;
			}else if(salary>=300000 && salary<=399999){
				annualbonus=salary*0.2;
			}else{
				annualbonus=salary*0.35;
			}
			System.out.printf("Annual Bonus  :%.2f",annualbonus);
		}
		if(number==3){
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("|                          Calculate Loan Amount  !                       |");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println();
			
			
			System.out.print("\nInput Employee name     - ");
            String name = input.nextLine();
            
			Double salary;
            System.out.print("Input Employee Salary   -  ");
            salary = input.nextDouble();
            int years;
            System.out.print("Number of the years for the loan(1,2,3,4,5) : ");
            years=input.nextInt();
            int n = years * 12;
        double monthlyinstallment = salary * 0.6;
        double monthlyinterestrate = 15 / 100.0 / 12;  

        double loanamount = 0;

        if (salary <= 50000) {
            System.out.println("You can not get a loan because your salary is less than Rs.50,000");
        } else if (years > 5) {
            System.out.println("You can only get a loan for up to 5 years");
        } else if (salary > 50000 && years <= 5) {
            if (n == 12) {
                loanamount = monthlyinstallment * (1 - (1 / (
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125))) / 0.0125;
            } else if (n == 24) {
                loanamount = monthlyinstallment * (1 - (1 / (
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125))) / 0.0125;
            } else if (n == 36) {
                loanamount = monthlyinstallment * (1 - (1 / (
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125))) / 0.0125;
            } else if (n == 48) {
                loanamount = monthlyinstallment * (1 - (1 / (
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125))) / 0.0125;
            } else if (n == 60) {
                loanamount = monthlyinstallment * (1 - (1 / (
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 *
                    1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125 * 1.0125))) / 0.0125;
            }

            
            int rloanamount = ((int)(loanamount + 500) / 1000) * 1000;
            System.out.println("You can get Loan Amount : " + rloanamount);
	     	}
        }
    }
}
