import java.util.HashMap;

public class StepTracker {
    HashMap<Integer,int[]> monthToData=new HashMap<Integer,int[]>();
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
