package codingTask;

public class task8 {
    public static void main(String[] args) {
        int [][]num={
                {10,20,70,90},
                {70,80,15,13}};
        int max=num[0][0];
        int min=num[0][0];
        for (int []a:num){
            for(int i:a){
                if(i>max){
                    max=i;
                }
                else if (i<min){
                    min=i;
                }
            }
        }
        System.out.println("The max number is " + max + " and the minimum number is "+min);
    }
}
