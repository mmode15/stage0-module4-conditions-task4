package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
      int greatestFromTwo = first > second ?  first :  second;
      int greatest = third > greatestFromTwo ? third : greatestFromTwo;
      System.out.println(greatest);
    }
}
