import java.util.Scanner;

	public class Main{
		public static void main (String []args){
			Scanner sc = new Scanner(System.in);
			double money = sc.nextDouble();
			int note100 = ((int)money/100);
			int note50 = (((int)money -(note100 * 100)) /50);
			int note20 = (((int)money - (note100 * 100) - (note50 * 50)) /20);
			int note10 = (((int)money - (note100 * 100) - (note50 * 50) - (note20 * 20)) /10);
			int note5 = (((int)money -(note100 * 100) - (note50 * 50) - (note20 * 20) - (note10 * 10)) /5);
			int note2 = (((int)money -(note100 * 100) - (note50 * 50) - (note20 * 20) - (note10 * 10) -(note5 * 5)) /2);
			int note1 = ((int)money -(note100 * 100) - (note50 * 50) - (note10 * 10) - (note20 * 20) - (note5 * 5) - (note2 * 2));
			System.out.println(+money);
			System.out.println(+note100 +" nota(s) de R$ 100,00");
			System.out.println(+note50 +" nota(s) de R$ 50,00");
			System.out.println(+note20 +" nota(s) de R$ 20,00");
			System.out.println(+note10 +" nota(s) de R$ 10,00");
			System.out.println(+note5 +" nota(s) de R$ 5,00");
			System.out.println(+note2 +" nota(s) de R$ 2,00");
			System.out.println(+note1 +" nota(s) de R$ 1,00");

		}
	}