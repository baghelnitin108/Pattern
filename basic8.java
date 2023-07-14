import java.util.*;

public class basic8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int p=i;
            int d=n;
            for(int j=1;j<=i;j++){
                System.out.print(p+"\t");
                d--;
                p=p+d;
            }
            System.out.println();
            
            
        }

    }
    
}