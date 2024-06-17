package sub;
import java.util.Random;
public class Sub {
	public String name;
	
	public int hp;
	public int mp;
	public int atk;
	public int agi;
	public int def;
	Random rnd = new Random();
//	int hp = rnd.nextInt(1000);
//	int mp = rnd.nextInt(1000);
//	int atk = rnd.nextInt(1000);
//	int agi = rnd.nextInt(1000);
//	int def = rnd.nextInt(1000);
	
	public void setHp(int n) {
		rnd.nextInt();
	}
	
	public void setName(String name, int hp, int mp, int atk, int agi, int def){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.agi = agi;
		this.def = def;
		
	}

	public String getName() {
		return name;
		return hp;
	}
	
	
	
	
	//System.out.println("こんにちは 「 " + name + " 」 さん");
	//System.out.println("ステータス");
	//System.out.println("HP：" + hp);
	//System.out.println("MP：" + mp);
	//System.out.println("攻撃力：" + atk);
	//System.out.println("素早さ：" + agi);
	//System.out.println("防御力：" + def);
	//System.out.println("");
	//System.out.println("さあ冒険に出かけよう！");

	
	
	
//System.out.println(hp);
}
//名前を入力したら下記がコンソールに出力されるように作ってください
//条件：数値は毎回変わるように作ってください
// 	 サブクラスを使用してください
//	 スーパークラスを使用してください
//	 getterとsetterを使用してください
//	 packageを2つ作ってメインと処理を分けてください
//	 命名する場合は規則にのっとってください
//	 コンストラクタを使用してください
//
//こんにちは 「 名前 」 さん
//ステータス
//HP：849
//MP：862
//攻撃力：375
//素早さ：937
//防御力：24
//
//さあ冒険に出かけよう！