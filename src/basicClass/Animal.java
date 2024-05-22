package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
		System.out.println(dog1.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3);
		System.out.println(dog2.num);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowDate = LocalDateTime.now();	//現在時刻を取得
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");	//表示形式を指定
        String formatNowDate = dtf.format(nowDate);		//現在時刻を指定の表示形式に変換して変数に代入
		System.out.println(formatNowDate);	//コンソールに出力
	}
}

