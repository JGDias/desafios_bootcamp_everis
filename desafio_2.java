import java.util.Scanner;
import java.util.Locale;

public class desafio_2{
	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);
		
		String[] cpf = new String[4]; 

                //continue a solucao
        String cpf2 = sc.next();
        cpf2 = cpf2.replace('.', '-');
        cpf = cpf2.split("-");

        for(int i = 0; i <= 3; i++)
        {
            System.out.printf("\n" + cpf[i]);
    }

		sc.close();
	}
}