import java.util.*;
public class stack_3986 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int result=-1;

        int N = sc.nextInt();

        for(int i=0;i<N+1;i++){
            String input = sc.nextLine();
            Stack <Character> letter = new Stack<>();
            
            for(int j=0;j<input.length();j++){
                if(!letter.isEmpty()&&input.charAt(j)==letter.peek()){
                    letter.pop();
                }
                else{
                    letter.push(input.charAt(j));
                }
            }
            if(letter.isEmpty()){
                result=result+1;
                // System.out.println(result);

            }

        }
        System.out.println(result);
        

        
    }
}

/*
Stack 사용
문자열을 쪼개서 하나씩 stack에 넣고 peek값과 같은지 확인
마지막 stack에 문자열이 없으면 
좋은 단어 */