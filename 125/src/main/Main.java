package main;

import java.util.Random;
import java.util.Scanner;

import sub.Status;
import sub.Sub;

public class Main {
	public static void main(String[] args) {
		//変数を宣言、初期化
		String name = null;
		int hp = 0;
		int mp = 0;
		int atk = 0;
		int agi = 0;
		int def = 0;
		
		//ランダムで数字を生成
		Random rnd = new Random();
		
		//Scannerで名前を入力
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		//インスタンスの生成
		Sub sub = new Sub();
		
		//セッターに引数を渡す
		sub.setName(name);
		sub.setHp(rnd.nextInt(1000));
		sub.setMp(rnd.nextInt(1000));
		sub.setAtk(rnd.nextInt(1000));
		sub.setAgi(rnd.nextInt(1000));
		sub.setDef(rnd.nextInt(1000));
		
		//変数にゲッターから代入
		name = sub.getName();
		hp = sub.getHp();
		mp = sub.getMp();
		atk = sub.getAtk();
		agi = sub.getAgi();
		def = sub.getDef();
		
		//インスタンスの生成
		Status status = new Status(name,hp,mp,atk,agi,def);
		
		//scannerを閉じる
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