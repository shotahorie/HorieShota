package sub;

public class Status extends Sub{
	//引数を受け取ってコンソールに出力する
	public Status(String name,int hp,int mp,int atk,int agi,int def){
		System.out.println("こんにちは 「 " + name + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + atk);
		System.out.println("素早さ：" + agi);
		System.out.println("防御力：" + def);
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");

	}

}