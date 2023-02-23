import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        printMenu();
        StepTracker stepTracker= new StepTracker();
        for (int i =0; i<30;i++){
            stepTracker.monthToData.get(0)[i]=i+9990;
        }
        int userInput= in.nextInt();
        while(userInput!=0){
            if (userInput==1 || userInput==2 || userInput==3 ) {
                if (userInput == 1) {
                    System.out.println("Введите количество шагов");
                    int steps = in.nextInt();
                    System.out.println("Введите месяц");
                    String month = in.next();
                    System.out.println("Введите день");
                    int day = in.nextInt();
                    stepTracker.inputSteps(steps, month, day);
                    printMenu();
                    userInput = in.nextInt();
                }
                if (userInput == 2) {
                    stepTracker.printStatMenu();
                    int userIn = in.nextInt();
                    while (userIn != 0) {
                        if (userIn >= 1 && userIn <= 7 && (userIn % 1 == 0)) {
                            System.out.println("Введите месяц");
                            String month = in.next();
                            stepTracker.showStat(month, userIn);
                            userIn = in.nextInt();
                        }
                        else {
                            System.out.println("Номер введен неверно");
                            stepTracker.printStatMenu();
                            userIn = in.nextInt();
                        }

                    }
                    printMenu();
                    userInput = in.nextInt();
                }
                if (userInput == 3) {
                    System.out.println("Введите цель");
                    int goal = in.nextInt();
                    stepTracker.changeGoal(goal);
                    printMenu();
                    userInput = in.nextInt();
                }
            }
            else{
                System.out.println("Номер введен неверно");
                printMenu();
                userInput = in.nextInt();
            }

        }
    }
    public static void printMenu(){
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Напечатать статистику за опредделенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов");
        System.out.println("0 - Выйти из приложения");
    }
}