package main;

import java.util.Random;
import java.util.Scanner;

import sub.Status;
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

Status status = new Status(name,hp,mp,atk,agi,def);

		sc.close();
	}
}
