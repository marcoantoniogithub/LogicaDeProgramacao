import java.util.Scanner;
import java.util.Locale;

public class ex1048 {

	public static void main(String []args) {
			Locale.setDefault(Locale.US);;
			Scanner sc = new Scanner(System.in);
			double salary = sc.nextDouble();
			int reajust = 0;
			if (salary <= 400) {
				reajust = 15;
			}
			else if ( salary > 400 && salary <= 800) {
				reajust = 12;
			}
			else if (salary > 800 && salary <= 1200 ) {
				reajust = 10;
			}
			else if (salary > 1200 && salary <= 2000) {
				reajust = 7;
			}
			else if (salary > 2000){
				reajust = 4;
			}
			double salaryTax = (salary * reajust/100);
			double newSalary = (salaryTax + salary);
			System.out.printf("Novo salario: %.2f%n",newSalary);
			System.out.printf("Reajuste ganho: %.2f%n",salaryTax);
			System.out.println("Em percentual: "+reajust+" %");
			
			sc.close();
			
		}
}