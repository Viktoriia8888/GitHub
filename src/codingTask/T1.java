package codingTask;

public class T1 {
    public static void main(String[] args) {
        int [] temp={10,20,30,-11,-35};
        int high=temp[0];
        int low=temp[0];
        for (int i=0;i<temp.length;i++){
            if(temp[i]>high){
                high=temp[i];
            }
            if(temp[i]<low){
                low=temp[i];
            }
        }
        System.out.println("The high temperature for the week is "+ high);
        System.out.println("The lowest temperature for the week is "+ low);
    }
}
