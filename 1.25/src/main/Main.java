package main;

import java.util.Random;
import java.util.Scanner;

import sub.Status;

public class Main {
	public static void main(String[] args) {
		//変数の宣言
		String name = null;

		//ランダムの追加
		Random rnd = new Random();
		
		//Scannerで名前入力
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		//インスタンスの生成
		Status status = new Status();
		
		//セッターに引数を渡す
		status.setName(name);
		status.setHp(rnd.nextInt(1000));
		status.setMp(rnd.nextInt(1000));
		status.setAtk(rnd.nextInt(1000));
		status.setAgi(rnd.nextInt(1000));
		status.setDef(rnd.nextInt(1000));

		//インスタンスの生成
		status.print();

		//scannerを閉じる
		sc.close();
	}
}
