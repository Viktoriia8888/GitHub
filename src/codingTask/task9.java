package codingTask;

public class task9 {
    public static void main(String[] args) {
        int [] number={1,20,13,15,17};
        int max=0;
        int secondMax=0;
        for(int num:number){
            if (num > max) {
                secondMax=max;
                max=num;
            } else if (num>secondMax) {
                secondMax=num;

            }
        }
        System.out.println("The second largest number is  "+ secondMax);
    }
}
