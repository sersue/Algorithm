import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] input = new int[11][11];
  
        //미로상자 구조
        for(int k=1;k<=10;k++){
            for(int l=1;l<=10;l++){
                input[k][l]=sc.nextInt();
            }}

        int flag=2; //global변수 - 공유
        int End=0;
        
        for(int i=2;i<=10;i++){
            if(End!=1){
                for(int j=flag;j<=10;j++){
                    if(input[i][j]==1){
                      
                        flag=j-1;
                        break;
                    }
                    else if(input[i][j]==2){
                        input[i][j]=9;
                        End=1;
                        break;
                   
                        }
                    else{
                        input[i][j]=9;
                    
                                     
                        }
                    
                            }
            }
            else{
                break;
            }
            
      
                    }

                
    
       
        

        for(int k=1;k<=10;k++){
            for(int l=1;l<=10;l++){
                System.out.printf("%d ",input[k][l]);
            }
            System.out.print("\n");
        }



}
}
