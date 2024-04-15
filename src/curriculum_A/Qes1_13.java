package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		//ローカル変数の宣言と初期値を設定
		byte byte_type = 0;
		short short_integral_type = 0;
		int integral_type = 0;
		long long_integral_type = 0L;
		float single_count_type = 0.0f;
		double double_count_type = 0.0;
		char character_type = '\u0000';
		String string_type = null;
		boolean boolean_data_type = false;


		//それぞれの変数に値を代入
		byte_type = 10;
		short_integral_type = 100;
		integral_type = 1000;
		long_integral_type = 10000;
		single_count_type = 9.5f;
		double_count_type = 10.5;
		character_type = 'a';
		string_type = "ハロー";
		boolean_data_type = true;


		//変数を利用してコンソールに出力
		System.out.println(byte_type + short_integral_type + integral_type + long_integral_type);
		System.out.println(byte_type + byte_type);
		System.out.println(character_type +" "+ string_type +" "+ boolean_data_type);
		System.out.println(byte_type + short_integral_type + integral_type + long_integral_type + single_count_type + double_count_type);
		System.out.println(double_count_type / short_integral_type);
		System.out.println(byte_type - short_integral_type + "\n");


		/*
		 * 変数の宣言と代入
		 * 変数numをint型に変更してnum2に代入する
		 * コンソールに出力する
		 */
		String num="20";
		int num1=23;
		int num2 = Integer.parseInt(num);
		System.out.println("ハローJAVA"+(num2+num1) + "\n");


		//変数の宣言と代入
		String name = "山田太郎";
		byte old = 18;
		double height = 170.5;
		double weight= 62.2;
		String food = "寿司";


		//変数を利用してコンソールに出力
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + old + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」" + "\n");

		/*		
		 * BMI＝体重（kg）÷（身長（m）)²
		 * 式に合うように身長をcmからmに変換するために100で割る
		 * 小数点第一位まで表示させる
		 */		
		System.out.println("「BMIは" + String.format("%.1f", (weight / (height / short_integral_type * height / short_integral_type))) + "です」" + "\n");


		//変数の宣言と代入
		name = "鈴木一郎";
		old = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";


		//変数を利用してコンソールに出力
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + old + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		System.out.println("「BMIは" + String.format("%.1f", (weight / (height / short_integral_type * height / short_integral_type))) + "です」" + "\n");


		//2倍の値になるように自己代入
		old += old;
		height += height;
		weight += weight;


		//変数を利用してコンソールに出力
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + old + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		System.out.println("「BMIは" + String.format("%.2f", (weight / (height / short_integral_type * height / short_integral_type))) + "です」" + "\n");

		
		//24歳が25歳以上かどうか判定してコンソールに結果を出力
		old = 24;
		boolean_data_type = old >= 25 ? true : false;
		System.out.println(boolean_data_type + "\n");


		//8問目で使用した体重・身長を代入し直す
		height = 168.5;
		weight = 64.2;


		//年齢・身長・体重を文字列に変換
		String old2 = String.valueOf(old);
		String height2 = String.valueOf(height);
		String weight2 = String.valueOf(weight);


		//コンソールに出力
		System.out.println(old2 + height2 + weight2 + "\n");


		/*
		 * 年齢・身長をint型に変換
		 * 身長は整数ではないためdouble型に変換してからint型に変換する
		 */	
		int old3 = Integer.parseInt(old2);
		double height3 = Double.parseDouble(height2);
		int height4 = (int)height3;


		//コンソールに出力
		System.out.println(old3);
		System.out.println(height4 + "\n");


		//年齢が25もしくは身長が160以上であればtrueを出力する
		boolean_data_type = old3 >= 25 || height4 >= 160 ? true : false;
		System.out.println(boolean_data_type);
	}

}
