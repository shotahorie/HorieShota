package main;

import java.util.Random;
import java.util.Scanner;

import sub.Sub;


public class Main {
	public static void main(String[] args) {

		String name = null;
		int hp;
		int mp;
		int atk;
		int agi;
		int def;

		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);  //Scannerで初期化
		name = sc.next();  //文字列の入力の受け取り
		//		System.out.println(name);

		Sub sub = new Sub();

		//		sub.setName(name,rnd.nextInt(1000),rnd.nextInt(1000),rnd.nextInt(1000),rnd.nextInt(1000),rnd.nextInt(1000));
		
		sub.setName(name);
		sub.setHp(rnd.nextInt(1000));
		sub.setMp(rnd.nextInt(1000));
		sub.setAtk(rnd.nextInt(1000));
		sub.setAgi(rnd.nextInt(1000));
		sub.setDef(rnd.nextInt(1000));


		name = sub.getName();
		hp = sub.getHp();
		mp = sub.getMp();
		atk = sub.getAtk();
		agi = sub.getAgi();
		def = sub.getDef();



		System.out.println("こんにちは 「 " + name + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + atk);
		System.out.println("素早さ：" + agi);
		System.out.println("防御力：" + def);
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");


		sc.close();
	}
}
//名前を入力したら下記がコンソールに出力されるように作ってください
//	条件：数値は毎回変わるように作ってください
//	 	 サブクラスを使用してください
//		 スーパークラスを使用してください
//		 getterとsetterを使用してください
//		 packageを2つ作ってメインと処理を分けてください
//		 命名する場合は規則にのっとってください
//		 コンストラクタを使用してください
//
//	こんにちは 「 名前 」 さん
//	ステータス
//	HP：849
//	MP：862
//	攻撃力：375
//	素早さ：937
//	防御力：24
//
//	さあ冒険に出かけよう！