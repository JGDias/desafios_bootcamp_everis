import java.util.Scanner;


public class desafio_1 {
	
    public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
      
      int N = ler.nextInt();
      
    	for (int i = 1 ; i <= N; i++) {
    		if (i % 2 ==0 ){
    		  System.out.println(i);
    	}
    }
	
}
}