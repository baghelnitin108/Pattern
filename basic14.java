import java.util.Scanner;

public class basic14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1; 
        int nsp=n/2;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<(n+1)/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
            
        }
    }
    
}
