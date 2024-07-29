package main;

import java.util.Scanner;

public class Main127 {

	public static void main(String[] args) {
		//scannerで文字列入力
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();

		//文字列を「,」区切りで配列に格納
		String[] animals = input.split(",");

		//配列から変数に格納
		for(String animal:animals) {

			//文字列を「:」区切りで配列に格納
			String[] data = animal.split(":");
			String name = data[0];
			String bodyLength = data[1];
			String speed = data[2];
			String animalName = "不明";

			//switch文で学名に代入する
			switch(name) {
			case "ライオン":
				animalName = "パンテラ レオ";
				break;
			case "ゾウ":
				animalName = "ロキソドンタ・サイクロティス";
				break;
			case "パンダ":
				animalName = "アイルロポダ・メラノレウカ";
				break;
			case "チンパンジー":
				animalName = "パン・トゥログロディテス";
				break;
			case "シマウマ":
				animalName = "チャップマンシマウマ";
				break;
			case "インコ":
				animalName = "不明";
				break;
			}

			//コンソールに出力する
			System.out.println("動物名：" + name);
			System.out.println("体長：" + bodyLength +"m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + animalName);
			System.out.println("");

		}

		//scannerを閉じる
		scanner.close();
	}

}
