package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String productName = null;

		productName = sc.nextLine();

		String[] products = productName.split("、");

		boolean flag = false;

		sc.close();
		int num2 = 0;
		for(String product: products) {

			Random rnd = new Random();
			int num = rnd.nextInt(12);
			switch(product) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + num + "台です\n");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + num + "台です\n");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + num + "台です\n");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + num + "台です\n");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + num + "台です\n");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(flag  ? product + "の残り台数は" + (11 - num2) + "台です\n" : product + "の残り台数は" + num + "台です\n");
				flag = true;
				num2 = num;
				break;
			default:
				System.out.println("『" + product +"』は指定の商品ではありません\n");
				break;
			}

		}

	}
}