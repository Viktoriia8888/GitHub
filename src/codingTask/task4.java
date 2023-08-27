package codingTask;

public class task4 {
    public static void main(String[] args) {
        int [][] num={
                {10,20,30,50},
                {15,25,35,80}};
        int sum=0;
        for ( int row=0;row< num.length;row++){
            for(int col=0;col<num[row].length;col++){
                sum=sum+num[row][col];
            }
            System.out.println(sum);
        }
    }
}
