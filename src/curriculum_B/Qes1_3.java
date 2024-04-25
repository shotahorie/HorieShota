package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		
		//変数を宣言、初期化
		String name = null;
		boolean flag1 = true;
		boolean halfwidthAlphanumeric = false;
		int times = 0;
		boolean flag2 = true;
		String me = null;
		int you = 0;

		
		//Scannerを追加
		Scanner sc = new Scanner(System.in);

		//引数がfalseになるまでwhile文を回す
		while(flag1) {
			
			//ユーザー名を入力
			name = sc.nextLine();
			
			//文字数を変数に入れる
			int nameLen = name.length();
			
			//ユーザー名が半角英数字か判定
			halfwidthAlphanumeric = name.matches("^[A-Za-z0-9]+$");

			//ユーザー名が10文字以内か調べる
			if(nameLen >= 10) {
				System.out.println("「名前を10文字以内にしてください」\n");
			
			//入力値が空か調べる
			} else if(name.isEmpty()) {
				System.out.println("「名前を入力してください」\n");
				
			//半角英数字か調べる
			} else if(halfwidthAlphanumeric == false){
				System.out.println("「半角英数字のみで名前を入力してください」");
				
			//ユーザー名が1文字から9文字の間なら次の処理に進む
			} else if(nameLen >= 1 && nameLen <= 9){
				System.out.println("ユーザー名「" + name + "」を登録しました");
				flag1 = false;
			}
		}

		//引数がfalseになるまでwhile文を回す
		while(flag2) {

			//meに自分の手を代入
			me = sc.nextLine();

			//1処理ごとに回数を1増やす
			times += 1;

			//自分の出した手に合わせて出力
			switch(me) {
			case "グー":
				System.out.println(name + "の手は「グー」");
				break;
			case "チョキ":
				System.out.println(name + "の手は「チョキ」");
				break;
			case "パー":
				System.out.println(name + "の手は「パー」");
				break;
			}

			//相手の手
			//youにランダムで数字を代入
			Random rnd2 = new Random();
			you = rnd2.nextInt(3);

			//相手の出した手に合わせて出力
			switch(you) {
			case 0:
				System.out.println("相手の手は「グー」\n");
				break;
			case 1:
				System.out.println("相手の手は「チョキ」\n");
				break;
			case 2:
				System.out.println("相手の手は「パー」\n");
				break;
			}

			//結果に応じてコメント
			//勝ったら終了
			if(me.equals("グー") && you == 1 || me.equals("チョキ") && you == 2 || me.equals("パー") && you == 0) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて\n");
				flag2 = false;
			} else if (me.equals("チョキ") && you == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！\n");
			} else if (me.equals("パー") && you == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ\n");
			} else if (me.equals("グー") && you == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです\n");
			} else if (me.equals("グー") && you == 0 || me.equals("チョキ") && you == 1 || me.equals("パー") && you == 2) {
				System.out.println("DRAW あいこ もう一回しましょう！\n");
			}

		}
		
		//処理の合計回数を出力
		System.out.println("勝つまでにかかった合計回数は" + times + "回です");

		//Scannerを閉じる
		sc.close();

	}

}