package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		//変数を宣言、初期化
		int numberOfPeople = 0;
		int num = 1;
		int human = 0;

		double sumSubjects = 0;
		double sumEnglish = 0;
		double sumMath = 0;
		double sumScience = 0;
		double sumSociety = 0;

		double avgSubjects = 0;
		double avgEnglish = 0;
		double avgMath = 0;
		double avgScience = 0;
		double avgSociety = 0;
		double avgTotal = 0;

		//生徒数をScannerで入力
		Scanner sc = new Scanner(System.in);
		System.out.println("生徒の人数を入力してください（2以上）：");
		numberOfPeople = sc.nextInt();

		//配列に教科入れて、
		//多次元配列に[人数][教科数]
		String [] subjects = {"英語","数学","理科","社会"};
		int[][] students = new int[numberOfPeople][subjects.length];

		do {
			//4教科分、点数を入力できるようにfor文を回す
			for(int i = 0;i < subjects.length;i++) {
				System.out.println(num + "人目の"+subjects[i]+"の点数を入力してください：");
				students[human][i] = sc.nextInt();
			}
			//humanとnumを1ずつ増やす
			human++;
			num++;
		//最初に入力した人数に達するまで処理を続ける
		}while(num <= numberOfPeople);

		//1行開ける
		System.out.println("");

		//humanを初期化
		human = 0;

		//人数分for文を回す
		for(int j = 0;j < numberOfPeople;j++) {
			//n人目の合計点数を足して、平均を出す
			sumSubjects = students[human][0] + students[human][1] + students[human][2] + students[human][3];
			avgSubjects = (sumSubjects / 4);
			
			//humanを1増やす
			human++;
			
			//n人目の平均点をコンソールに出力
			System.out.println(human + "人目の平均点は" + String.format("%.2f", avgSubjects) + "点です。");
		}
		
		//1行開ける
		System.out.println("");
		
		//humanを初期化
		human = 0;

		//人数分for文を回す
		for(int k = 0;k < numberOfPeople;k++) {
			//教科ごとに合計点を出す
			sumEnglish += students[human][0];
			sumMath += students[human][1];
			sumScience += students[human][2];
			sumSociety += students[human][3];

			//humanを1増やす
			human++;
		}

		//教科ごとに平均点を出す
		avgEnglish = (sumEnglish / numberOfPeople);
		avgMath = (sumMath / numberOfPeople);
		avgScience = (sumScience / numberOfPeople);
		avgSociety = (sumSociety / numberOfPeople);
		avgTotal = ((avgEnglish + avgMath + avgScience + avgSociety) / 4);

		//教科の平均点をコンソールに出力
		System.out.println("英語の平均点は" + String.format("%.2f", avgEnglish) + "点です。");
		System.out.println("数学の平均点は" + String.format("%.2f", avgMath) + "点です。");
		System.out.println("理科の平均点は" + String.format("%.2f", avgScience) + "点です。");
		System.out.println("社会の平均点は" + String.format("%.2f", avgSociety) + "点です。");
		System.out.println("全体の平均点は" + String.format("%.2f", avgTotal) + "点です。");

		//Scannerを閉じる
		sc.close();
	}

}
