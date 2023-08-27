package codingTask;

public class task7 {
    public static void main(String[] args) {
        int n=10;
        int firsTerm=0;
        int secondTerm=1;
        for(int i=1;i<=n;++i){
            System.out.println(firsTerm);

            int nextTerm=firsTerm+secondTerm;
            firsTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
