public class M {
 public static void main(String[] args) {
     int n=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){

            if(i==(n+1)/2 || j==(n+1)/2 || j==n-1 && i%2==0){
                System.out.print("*\t");
            }else{
                System.out.println("\t");
            }
        }System.out.println();
      }
 }   
}
