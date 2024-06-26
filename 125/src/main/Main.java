package main;

import java.util.Random;
import java.util.Scanner;

import sub.Status;
import sub.Sub;

public class Main {
	public static void main(String[] args) {
		//変数の宣言
		String name = null;
		int hp;
		int mp;
		int atk;
		int agi;
		int def;

		//ランダムの追加
		Random rnd = new Random();
		
		//Scannerで名前入力
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
