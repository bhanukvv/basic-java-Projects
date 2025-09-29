 import java.util.*;

class numberconverter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
//Main menu
        while (run) { 
            System.out.printf("                                           __\n");
            System.out.printf("                                          |  \\  ______              __\n");
            System.out.printf("                                           \\$$ /      \\            |  \\\n");
            System.out.printf("                                              |  $$$$$$\\   ______  | $$  _______\n");
            System.out.printf("                                          |  \\| $$    \\$$ |      \\ | $$ /       \\\n");
            System.out.printf("                                          | $$| $$         \\$$$$$$\\| $$|  $$$$$$$\n");
            System.out.printf("                                          | $$| $$   __  /       $$| $$| $$\n");
            System.out.printf("                                          | $$| $$__/  \\|  $$$$$$$$| $$| $$_____\n");
            System.out.printf("                                          | $$ \\$$    $$ \\$$     $$| $$\\$$     \\\n");
            System.out.printf("                                           \\$$  \\$$$$$$   \\$$$$$$$$ \\$$  \\$$$$$$$\n\n");
            System.out.print(" ");

            System.out.println("_   _                       _                            _____                                            _");
            System.out.println("| \\ | |                     | |                          / ____|                                          | |");
            System.out.println("|  \\| |  _   _   _ __ ___   | |__      ___    _ __      | |        ___    _ __    __    __   ___    _ __  | |_    ___    _ __");
            System.out.println("| . ' | | | | | | '_ ' _ \\  | '_ \\   / _  \\  | '__|     | |       / _ \\  | '_ \\   \\ \\  / /  /  _ \\ | '__| | __| /  _  \\ | '__|");
            System.out.println("| |\\  | | |_| | | | | | | | | |_) | |   __/  | |        | |____  | (_) | | | | |   \\ \\/ /  |  __/  | |    | |_  |  __/  | |   ");
            System.out.println("|_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___|   |_|         \\_____|  \\___/  |_| |_|    \\__/   \\___|   |_|    \\__|  \\___|   |_|   ");
            System.out.println("===============================================================================================================================");

            System.out.println("\n \n \n");
            System.out.println("                     [01] Decimal converter \n ");
            System.out.println("                     [02] Binary converter \n  ");
            System.out.println("                     [03] Octal converter \n   ");
            System.out.println("                     [04] Hexadecimal converter \n");
            

            System.out.print("Enter Option : ");
            int option = input.nextInt();
            input.nextLine();
 // Decimal converter
            if (option == 1) {
               
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("|                             DECIMAL CONVERTER                                  |");
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("\n\n\n");

                while (true) {
                    System.out.print("Enter a Decimal Number : ");
                    String number = input.nextLine();

                    boolean work = true;
                    for (int i = 0; i < number.length(); i++) {
                        char c = number.charAt(i);
                        if (c < '0' || c > '9') {
                            work = false;
                            break;
                        }
                    }
                    if (!work) {
                        System.out.println("Invalid input....");
                        System.out.print("Do you want to input number again? (Y/N): ");
                        char again = input.next().charAt(0);
                        input.nextLine();
                        if (again == 'Y' || again == 'y') {
                            continue;
                        } else {
                            break;
                        }
                    }

                    int num = Integer.parseInt(number);
                    String binary = "";
                    int temp = num;
                    if (temp == 0) binary = "0";
                    while (temp > 0) {
                        binary = (temp % 2) + binary;
                        temp /= 2;
                    }
                    String octal = "";
                    temp = num;
                    if (temp == 0) octal = "0";
                    while (temp > 0) {
                        octal = (temp % 8) + octal;
                        temp /= 8;
                    }
                    String hex = "";
                    temp = num;
                    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    if (temp == 0) hex = "0";
                    while (temp > 0) {
                        hex = hexChars[temp % 16] + hex;
                        temp /= 16;
                    }
                    System.out.println("Binary      : " + binary);
                    System.out.println("Octal       : " + octal);
                    System.out.println("Hexadecimal : " + hex);

                    System.out.print("Go back to Home? (Y/N): ");
                    char home = input.next().charAt(0);
                    input.nextLine();

                    if (home == 'Y' || home == 'y') {
                        System.out.println("Returning to Home...");
                        break;  
                    }
                }
             // Binary converter
            } else if (option == 2) {
                
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("|                             BINARY CONVERTER                                  |");
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("\n\n\n");

                while (true) {
                    System.out.print("Enter a binary number: ");
                    String number = input.nextLine();

                    boolean work = true;
                    for (int i = 0; i < number.length(); i++) {
                        char c = number.charAt(i);
                        if (c != '0' && c != '1') {
                            work = false;
                            break;
                        }
                    }

                    if (!work) {
                        System.out.println("Invalid input....");
                        System.out.print("Do you want to input number again? (Y/N): ");
                        char again = input.next().charAt(0);
                        input.nextLine();
                        if (again == 'Y' || again == 'y') {
                            continue;
                        } else {
                            break;
                        }
                    }

                    int decimal = Integer.parseInt(number, 2);

                    String octal = "";
                    int temp = decimal;
                    if (temp == 0)
                        octal = "0";
                    while (temp > 0) {
                        octal = (temp % 8) + octal;
                        temp /= 8;
                    }

                    String hex = "";
                    temp = decimal;
                    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    if (temp == 0)
                        hex = "0";
                    while (temp > 0) {
                        hex = hexChars[temp % 16] + hex;
                        temp /= 16;
                    }

                    System.out.println("Decimal     : " + decimal);
                    System.out.println("Octal       : " + octal);
                    System.out.println("Hexadecimal : " + hex);

                    System.out.print("Go back to Home? (Y/N): ");
                    char home = input.next().charAt(0);
                    input.nextLine();

                    if (home == 'Y' || home == 'y') {
                        System.out.println("Returning to Home...");
                        break;  
                    }
                } 
          // Octal 
            } else if (option == 3) {
                
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("|                             OCTAL CONVERTER                                   |");
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("\n\n\n");

                while (true) {
                    System.out.print("Enter an octal number: ");
                    String number = input.nextLine();

                    boolean isValid = true;
                    for (int i = 0; i < number.length(); i++) {
                        char c = number.charAt(i);
                        if (c < '0' || c > '7') {
                            isValid = false;
                            break;
                        }
                    }

                    if (!isValid) {
                        System.out.println("Invalid input..");
                        System.out.print("Do you want to input number again? (Y/N): ");
                        char again = input.next().charAt(0);
                        input.nextLine();
                        if (again == 'Y' || again == 'y') {
                            continue;
                        } else {
                            break;
                        }
                    }

                    
                    int num = 0;
                    for (int i = 0; i < number.length(); i++) {
                        num = num * 8 + (number.charAt(i) - '0');
                    }

                    
                    int temp = num;
                    String binary = "";
                    if (temp == 0) binary = "0";
                    while (temp > 0) {
                        binary = (temp % 2) + binary;
                        temp /= 2;
                    }

                    
                    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    temp = num;
                    String hex = "";
                    if (temp == 0) hex = "0";
                    while (temp > 0) {
                        hex = hexChars[temp % 16] + hex;
                        temp /= 16;
                    }

                    System.out.println("Decimal     : " + num);
                    System.out.println("Binary      : " + binary);
                    System.out.println("Hexadecimal : " + hex);

                    System.out.print("Go back to Home? (Y/N): ");
                    char home = input.next().charAt(0);
                    input.nextLine();

                    if (home == 'Y' || home == 'y') {
                        break;  
                    }
                }
            } else if (option == 4) {
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("|                            HEXADECIMAL CONVERTER                              |");
                System.out.println("+--------------------------------------------------------------------------------+");
                System.out.println("\n\n\n");

                while (true) {
                    System.out.print("Enter a hexadecimal number: ");
                    String number = input.nextLine().toUpperCase();

                    boolean Work = true;
                    for (int i = 0; i < number.length(); i++) {
                        char c = number.charAt(i);
                        if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                            Work = false;
                            break;
                        }
                    }

                    if (!Work) {
                        System.out.println("Invalid input...");
                        System.out.print("Do you want to input number again? (Y/N): ");
                        char again = input.next().charAt(0);
                        input.nextLine();
                        if (again == 'Y' || again == 'y') {
                            continue;
                        } else {
                            break;
                        }
                    }

                    
                    int decimal = 0;
                    int power = 1;
                    for (int i = number.length() - 1; i >= 0; i--) {
                        char c = number.charAt(i);
                        int digit;
                        if (c >= '0' && c <= '9') {
                            digit = c - '0';
                        } else {
                            digit = c - 'A' + 10;
                        }
                        decimal += digit * power;
                        power *= 16;
                    }

                    
                    int temp = decimal;
                    String binary = "";
                    if (temp == 0) binary = "0";
                    while (temp > 0) {
                        binary = (temp % 2) + binary;
                        temp /= 2;
                    }

                    
                    temp = decimal;
                    String octal = "";
                    if (temp == 0) octal = "0";
                    while (temp > 0) {
                        octal = (temp % 8) + octal;
                        temp /= 8;
                    }

                    System.out.println("Decimal     : " + decimal);
                    System.out.println("Binary      : " + binary);
                    System.out.println("Octal       : " + octal);

                    System.out.print("Go back to Home? (Y/N): ");
                    char home = input.next().charAt(0);
                    input.nextLine();

                    if (home == 'Y' || home == 'y') {
                       
                        break;  
                    }
                }
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }

       
    }
}
