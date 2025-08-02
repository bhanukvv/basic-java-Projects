import java.util.*;

class salary information system {
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
}if(number==2){
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