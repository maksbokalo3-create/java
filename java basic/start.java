import java.util.Scanner;
import java.util.ArrayList;

public class start {
    static int withgraf(int balance1, int wigraf) {
        if (balance1 >= wigraf && wigraf > 0) {
            balance1 = balance1 - wigraf;
            System.out.println("операция успешна");

        } else {
            System.out.println("недостаточно средст для операцииб");
        }
        return balance1;

    }
    static int sum(int balance, int plus){
        if (plus > 0){
            balance = balance + plus;

        }else{
            System.out.println("невозможно добавить отрицательное число");

        }
        return balance;
    }
    static int choice3(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.println("введите целое число!");
            scanner.next();
        }
        int choice = scanner.nextInt();
        return choice;
    }

    static void main() {
        int balance = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("balance:" + balance);
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            System.out.println(" 1:пополнить\n 2:снять деньги\n 3:уйти\n 4:история");
            int choice = choice3(scanner);

            if (choice == 2) {
                System.out.println("введите сколько хотите снять");
                int wigraf = choice3(scanner);
                int curentbalance = balance;
                balance = withgraf(balance, wigraf);
                System.out.println("balance: " + balance);
                if (curentbalance != balance){
                history.add("снятие: " + wigraf + " баланс: " + balance + "$");}

            }if (choice == 1){
                System.out.println("введите сколько хотите добавить:");
                int plus = choice3(scanner);
                int curentbalance = balance;
                balance = sum(balance, plus);
                System.out.println("balance: " + balance);
                if (curentbalance != balance){
                history.add("пополнение: " + plus + " баланс: " + balance + "$");}
            } if (choice == 3){
                System.out.println("bye");
                break;
            }if (choice == 4){
                for (String histor : history){
                    System.out.println(histor);
                }
                
            }

            }

        }
    }


