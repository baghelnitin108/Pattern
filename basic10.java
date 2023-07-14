import java.util.*;

public class basic10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
     
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch + "\t");
            
            }
            System.out.println();
            
        }

    }
    
}
