import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        printMenu();
        StepTracker stepTracker= new StepTracker();
        int userInput= in.nextInt();
        while(userInput!=0){
            if (userInput==1){
                System.out.println("Введите количество шагов");
                int steps=in.nextInt();
                System.out.println("Введите месяц");
                String month=in.next();
                System.out.println("Введите день");
                int day =in.nextInt();
                stepTracker.inputSteps(steps,month,day);
                stepTracker.printMas();
            }

            printMenu();
            userInput=in.nextInt();
        }

    }
    public static void printMenu(){
        System.out.println("1 - Вывести количество шагов за определенный день");
        System.out.println("2 - Напечатать статистику за опредделенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов");
        System.out.println("0 - Выйти из приложения");

    }

}