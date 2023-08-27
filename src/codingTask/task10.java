package codingTask;

public class task10 {
    public static void main(String[] args) {
        String[] country={"Canada","USA","Italy","Ukraine","Turkey"};
        for (int i=0;i<country.length;i++){
            for(int j=0;j<country[i].length();j++){
                if (country[i]==country[j]){
                    System.out.println("The duplicate country of this array is "+country[i]);
                    break;
                }
            }
        }
    }
}
