package codingTask;

public class task3 {
    public static void main(String[] args) {
        int [][] num={{10,20,11,12},
                {14,13,16,5}};
        for(int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                if (num[i][j]%2==0){
                    System.out.println(num[i][j]+" ");
                }
            }
        }

    }
}
