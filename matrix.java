public class matrix
{
	public static void main(String[] args) {
		int n =5;
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        
		        if(j==i){
		            System.out.print("*\t");
		        }else if(j+i==n+1){
		            System.out.print("*\t");
		        }else if(i==1||i==n){
		            System.out.print("*\t");
		        }else if(j==1||j==n){
		            System.out.print("*\t");
		        }
		        else{
		            System.out.print("\t");
		        }
		        
		      
		    }System.out.println();
		}
	}
}