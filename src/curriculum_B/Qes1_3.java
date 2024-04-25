package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
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
=======
		Scanner sc1 = new Scanner(System.in);
		String name = null;
		boolean flag1 = true;
		while(flag1) {
			name = sc1.nextLine();
			int nameLen = name.length();
			boolean halfwidthAlphanumeric = false;
			halfwidthAlphanumeric = name.matches("^[A-Za-z0-9]+$");

			if(nameLen >= 10) {
				System.out.println("「名前を10文字以内にしてください」\n");
			} else if(name.isEmpty()) {
				System.out.println("「名前を入力してください」\n");
			} else if(halfwidthAlphanumeric == false){
				System.out.println("「半角英数字のみで名前を入力してください」");
			} else if(nameLen >= 1 && nameLen <= 9){
				System.out.println("ユーザー名「" + name + "」を登録しました");
				sc1.close();
				flag1 = false;
			}
		}
		
		
		
//		Scanner sc2 = new Scanner(System.in);
//		boolean flag2 = false;
//		while(flag2) {
			
//			自分の手を入力
			
//			String x = null;
//			x = sc2.nextLine();
//			
//			switch(x) {
//	case "グー":
//		System.out.println(name + "の手は「グー」");
//		break;
//	case "チョキ":
//		System.out.println(name + "の手は「チョキ」");
//		break;
//	case "パー":
//		System.out.println(name + "の手は「パー」");
//		break;
//	}
//			sc2.close();
			
			
			
//			相手の手
			
			
			
			
			
			
			
			
//			回数+=1
//			結果によって、文章が変わる
			
			
			
//			flag2がtrueになるまで
			
			
			
			
//			終了
			
			
//					}
			
			
		int times = 0;
			
		boolean flag2 = true;
		while(flag2) {

			int x = 0;
			int y = 0;

			
//			回数を数える

			times += 1;
//			System.out.println(times + "回目");
			
			//			ランダムで数字を設定
			//			自分の手

			Random rnd1 = new Random();
			x = rnd1.nextInt(3);
//			System.out.println(x);

			switch(x) {
			case 0:
				System.out.println(name + "の手は「グー」");
				break;
			case 1:
				System.out.println(name + "の手は「チョキ」");
				break;
			case 2:
				System.out.println(name + "の手は「パー」");
				break;
			}

			//			相手の手

			Random rnd2 = new Random();
			y = rnd2.nextInt(3);
//			System.out.println(y);

			switch(y) {
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
			
			
//			結果に応じてコメント
//			勝ったら終了
			
			if(x == 0 && y == 1 || x == 1 && y == 2 || x == 2 && y == 0) {
			System.out.println("やるやん。");
			System.out.println("次は俺にリベンジさせて\n");
			flag2 = false;
		} else if (x == 1 && y == 0) {
			System.out.println("俺の勝ち！");
			System.out.println("負けは次につながるチャンスです！");
			System.out.println("ネバーギブアップ！\n");
		} else if (x == 2 && y == 1) {
			System.out.println("俺の勝ち！");
			System.out.println("たかがじゃんけん、そう思ってないですか？");
			System.out.println("それやったら次も、俺が勝ちますよ\n");
		} else if (x == 0 && y == 2) {
			System.out.println("俺の勝ち！");
			System.out.println("なんで負けたか、明日まで考えといてください。");
			System.out.println("そしたら何かが見えてくるはずです\n");
		} else if (x == y) {
			System.out.println("DRAW あいこ もう一回しましょう！\n");
		}
			
			

//			System.out.println("勝つまでにかかった合計回数は" + times + "回です");
			
			
		}
		System.out.println("勝つまでにかかった合計回数は" + times + "回です");


		
//		
////		じゃんけんシステム
//		
//		int x = 0;
//		int y = 0;
//		
////		ランダムで数字を設定
//		
//		Random rnd1 = new Random();
//		x = rnd1.nextInt(3);
//		
////	自分は入力
//				switch(x) {
//		case 0:
//			System.out.println(name + "の手は「グー」");
//			break;
//		case 1:
//			System.out.println(name + "の手は「チョキ」");
//			break;
//		case 2:
//			System.out.println(name + "の手は「パー」");
//			break;
//		}
//		
//		System.out.println(x);
//		
//		Random rnd2 = new Random();
//		y = rnd2.nextInt(3);
////		System.out.println(y);
//		
//
//		
//		switch(y) {
//		case 0:
//			System.out.println("相手の手は「グー」\n");
//			break;
//		case 1:
//			System.out.println("相手の手は「チョキ」\n");
//			break;
//		case 2:
//			System.out.println("相手の手は「パー」\n");
//			break;
//		}
//		
//		
//		if(x == 0 && y == 1 || x == 1 && y == 2 || x == 2 && y == 0) {
//			System.out.println("やるやん。");
//			System.out.println("次は俺にリベンジさせて\n");
//		} else if (x == 1 && y == 0) {
//			System.out.println("俺の勝ち！");
//			System.out.println("負けは次につながるチャンスです！");
//			System.out.println("ネバーギブアップ！\n");
//		} else if (x == 2 && y == 1) {
//			System.out.println("俺の勝ち！");
//			System.out.println("たかがじゃんけん、そう思ってないですか？");
//			System.out.println("それやったら次も、俺が勝ちますよ\n");
//		} else if (x == 0 && y == 2) {
//			System.out.println("俺の勝ち！");
//			System.out.println("なんで負けたか、明日まで考えといてください。");
//			System.out.println("そしたら何かが見えてくるはずです\n");
//		} else if (x == y) {
//			System.out.println("DRAW あいこ もう一回しましょう！\n");
//		}
//		
//		
		
//		int times = 0;
//		times += 1;
//		System.out.println("勝つまでにかかった合計回数は" + times + "回です");
		
		
		
//		do {
//			
//		} while ();
		
		
		
		
		
		
		

	}

}
>>>>>>> branch 'master' of https://github.com/shotahorie/HorieShota.git
