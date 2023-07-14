import java.util.*;

public class basic9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        int s=1;

        for(int i=1;i<=(2*n-1);i++){
            for(int j=1;j<=s;j++){
                System.out.print(ch + "\t");
              

            }
            if(i<n){
                s++;
            }else{
                s--;
            }
           
            System.out.println();
            
        }

    }
    
}
