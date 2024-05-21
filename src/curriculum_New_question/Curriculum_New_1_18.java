package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		public static void hello(String cal,int num) {
			String greeting = null;
			String num2 = String.valueOf(num);
			greeting = cal + num2;
			System.out.println(greeting);
		}
		
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void multiplication(int num1,int num2) {
			int result = num1 * num2;
			System.out.println(result);
		}
		
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void array(int arr[]) {
			for(int number:arr) {
				System.out.print(number + " ");
			}
			System.out.println("");
		}
		
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void multiplication(double num1,double num2) {
			double result = num1 + num2;
			System.out.println(result);
		}
		
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		public static int[] random(int count) {
			Random rnd = new Random();
			int [] countNum = new int[count];
			for(int i = 0;i < countNum.length;i++) {
				countNum[i] = rnd.nextInt(100) + 1;
			}
			for(int allNum:countNum) {
				System.out.print(allNum + " ");
			}
			System.out.println("");
			return countNum;
		}
		
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		public static int avgNum(int countNum[]) {
			int j = 0;
			for(int allNum:countNum) {
				j += allNum;
			}
			int k = j / countNum.length;
			return k;
		}
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static boolean judge(int k) {
			if(k >= 50) {
				return true;
			} else {
				return false;
			}
		}



		public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
		hello("Hello JavaSE ",11);
		multiplication(100,200);
		int [] arr = {32,43,54,21};
		array(arr);
		multiplication(10.0,20.0);
		int [] countNum = random(2);
		int k = avgNum(countNum);
		boolean result = judge(k);
		System.out.println(result);
		}

}
