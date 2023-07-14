public class N {
    public static void main(String[] args) {
        int n=7;
    
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==i||j==n){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
