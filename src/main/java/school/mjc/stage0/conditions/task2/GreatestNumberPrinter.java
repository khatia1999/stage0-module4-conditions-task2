package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {

        if(first > second){
            System.out.println("The greatest number is:" + first);
        } else if (second > first) {
            System.out.println("The greatest number is:" + second);
        }  else if (second == first) {
            System.out.println(first + "" + "is equal to" + "" + second);
        }
    }
}
