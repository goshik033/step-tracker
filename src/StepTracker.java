import java.util.HashMap;

public class StepTracker {
    HashMap<Integer,int[]> monthToData=new HashMap<Integer,int[]>();
    int norm=10000;
    public StepTracker(){
        for (int i=0;i<12;i++){
            monthToData.put(i,createMassive());
        }
    }
    public int[] createMassive(){
        int[] days = new int[30];
        return days;
    }
    public void inputSteps(int steps, String month, int day){
        int monthInt=monthConverter(month);
        monthToData.get(monthInt)[day]=steps;
        System.out.println("nice");

    }
    public void printMas(){
        for (int i=0; i<30;i++){
            System.out.println(monthToData.get(1)[i]);

        }

    }
    public void changeGoal(int count){
        norm=count;
        System.out.println("Теперь цель "+norm);

    }
    public void showStat(String month, int userIn){
        int monthInt=monthConverter(month);
        switch(userIn){
            case 1:
                System.out.println(stepsSum(monthInt));
                printStatMenu();
                break;
            case 2:
                System.out.println(maxStepCount(monthInt));
                printStatMenu();
                break;
            case 3:
                System.out.println((float) stepsSum(monthInt)/30);
                printStatMenu();
                break;
            case 5:
                everyDaySteps(monthInt);
                printStatMenu();
                break;
            case 4:
                System.out.println((float) stepsSum(monthInt)/1200);
                printStatMenu();
                break;
            case 6:
                System.out.println((float) stepsSum(monthInt)/1200*50+" ккал");
                printStatMenu();
                break;
            case 7:
                System.out.println(bestSeri(monthInt));
                printStatMenu();
                break;
            case 0:
                break;

        }


    }
    public void everyDaySteps(int month){
        for (int i =0; i<30;i++) {
            System.out.print(i+1+" день: "+monthToData.get(month)[i]+", ");
        }
    }
    public int stepsSum(int month){
        int summ=0;
        for (int i =0; i<30;i++) {
            summ+= monthToData.get(month)[i];
        }
        return summ;
    }
    public int maxStepCount(int month){
        int maxx=0;
        for (int i =0; i<30;i++) {
            if (maxx< monthToData.get(month)[i])
                maxx= monthToData.get(month)[i];
        }
        return maxx;
    }
    public int bestSeri(int month){
        int count=0;
        int maxxcount=0;
        for (int i =0; i<30;i++) {
            if (norm< monthToData.get(month)[i]){
                count+=1;
                if (count>=maxxcount)
                    maxxcount=count;
            }
            else
                count=0;
        }
        return count;


    }
    public void printStatMenu(){
        System.out.println("1 - Общее количесвто шагов за месяц");
        System.out.println("2 - Максимальное количество шагов за месяц");
        System.out.println("3 - Среднее количество шагов за месяц");
        System.out.println("4 - Пройденная дистанция в километрах");
        System.out.println("5 - Количество пройденных шагов по дням");
        System.out.println("6 - Количество сожженных калорий");
        System.out.println("7 - Лучшая серия");
        System.out.println("0 - Выход");
    }

    public int monthConverter(String month){
        int value;
        switch (month) {
            case "Январь":
                value = 0;
                break;
            case "Февраль":
                value =  1;
                break;
            case "Март":
                value =  2;
                break;
            case "Апрель":
                value =  3;
                break;
            case "Май":
                value =  4;
                break;
            case "Июнь":
                value =  5;
                break;
            case "Июль":
                value =  6;
                break;
            case "Август":
                value =  7;
                break;
            case "Сентябрь":
                value =  8;
                break;
            case "Октябрь":
                value =  9;
                break;
            case "Ноябрь":
                value =  10;
                break;
            default:
                value =  11;
        }
        return value;
    }
}
